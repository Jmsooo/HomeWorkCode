package code02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8888);

        Scanner input = new Scanner(System.in);
        System.out.println("请输入要查询的词语: ");
        String content = input.nextLine();

        //获取输出流
        PrintStream printStream = new PrintStream(socket.getOutputStream());
        printStream.println(content);

        //获取输入流
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println("查询结果: " + reader.readLine());

        socket.close();
        input.close();
    }
}
