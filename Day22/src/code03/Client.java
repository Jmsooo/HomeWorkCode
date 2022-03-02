package code03;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        //连接服务器
        Socket socket = new Socket("127.0.0.1", 8888);

        //选择要上传的文件
        Scanner input = new Scanner(System.in);
        System.out.println("请选择要上传的文件: ");
        String fileStr = input.nextLine();
        File file = new File(fileStr);
        if (!fileStr.endsWith(".jpg")){
            System.out.println("照片必须是 .jpg 格式!");
            input.close();
            socket.close();
            return;
        }
        if (file.length() > 1024*10.24*2){
            System.out.println("照片必须在 2M 以内!");
            input.close();
            socket.close();
            return;
        }

        DataOutputStream dataOutputStream = null;
        FileInputStream fileInputStream = null;

        try {
            //获取输出流
            dataOutputStream = new DataOutputStream(socket.getOutputStream());
            //先发送文件名
            dataOutputStream.writeUTF(file.getName().substring(0,file.getName().lastIndexOf(".")));
            //发送文件内容
            fileInputStream = new FileInputStream(file);
            byte[] data = new byte[1024];
            int len;
            while ((len = fileInputStream.read(data)) != -1){
                dataOutputStream.write(data,0,len);
            }
            //告诉服务器,我发送完毕
            socket.shutdownOutput();
        }catch (Exception e){
            System.out.println("上传失败!");
        }finally {
            fileInputStream.close();
            dataOutputStream.close();
        }

        //接收结构
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String result = reader.readLine();
        System.out.println(result);

        reader.close();
        socket.close();
        input.close();
    }
}
