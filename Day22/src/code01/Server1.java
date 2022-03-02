package code01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class Server1 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();

        //获取输出流
        PrintStream printStream = new PrintStream(socket.getOutputStream());
        printStream.println("欢迎咨询尚硅谷");

        //获取输入流
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        System.out.println(socket.getInetAddress().getHostAddress()+" 留言: " + LocalDateTime.now());
        System.out.println(reader.readLine() + "\n");

        printStream.println("报满了,请报下一期吧");

        System.out.println(socket.getInetAddress().getHostAddress() + " 留言: " + LocalDateTime.now());
        System.out.println(reader.readLine());

        socket.close();
        serverSocket.close();

    }
}
