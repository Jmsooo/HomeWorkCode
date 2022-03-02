package code02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class Server {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("星期一", "Monday");
        dictionary.put("星期二", "Tuesday");
        dictionary.put("星期三", "Wednesday");
        dictionary.put("星期四", "Thursday");
        dictionary.put("星期五", "Friday");
        dictionary.put("星期六", "Saturday");
        dictionary.put("星期日", "Sunday");

        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();

        //获取输入流
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        //获取输出流
        PrintStream printStream = new PrintStream(socket.getOutputStream());

        //接受客户端的中文
        String key = reader.readLine();
        //查询对应的英文单词 并返回结果
        String words = dictionary.get(key);

        if (words != null){
            printStream.println(words);
        }else {
            printStream.println("o(╥﹏╥)o没有找到对应的单词！");
        }

        socket.close();
        serverSocket.close();
    }
}
