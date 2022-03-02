package code01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建Socket 并指定IP地址和端口号
        Socket socket = new Socket("127.0.0.1", 8888);

        //获取输入流
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(reader.readLine());

        //获取输出流
        PrintStream printStream = new PrintStream(socket.getOutputStream());
        printStream.println("你好,我想报名就业班");

        System.out.println(reader.readLine());

        printStream.println("好吧,再见!");

        socket.close();
    }
}
