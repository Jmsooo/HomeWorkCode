package code03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //开启服务器
        ServerSocket server = new ServerSocket(8888);
        //接收一个客户端连接
        Socket socket = server.accept();
        //获取输入流
        //BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        //获取输出流
        PrintStream printStream = new PrintStream(socket.getOutputStream());

        //(1) 先读取文件名
        String fileName = dataInputStream.readUTF();
        //(2) 生成唯一的文件名
        String destFile = "photo" + "/" + fileName + System.currentTimeMillis() + ".jpg";
        //(3) 读取文件内容,并写入目标文件
        FileOutputStream fileOutputStream = new FileOutputStream(destFile);

        try {
            byte[] data = new byte[1024];
            int len;
            while ((len = dataInputStream.read(data)) != -1){
                fileOutputStream.write(data,0,len);
            }
            //返回结果给客户端
            printStream.println("接收成功!");
        }catch (Exception e){
            System.out.println("接收失败!");
        }finally {
            fileOutputStream.close();
        }

        server.close();
    }
}
