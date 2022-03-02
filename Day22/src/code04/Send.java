package code04;

import java.io.IOException;
import java.net.*;

public class Send {
    public static void main(String[] args) throws SocketException, UnknownHostException {
        //1. 先建立 DatagramSocket
        DatagramSocket socket = new DatagramSocket();

        //2. 准备发送数据
        String str = "欢迎来到尚硅谷!";
        byte[] data = str.getBytes();

        for (int i = 1; i <= 255; i++) {
            InetAddress ip = InetAddress.getByName("192.168.11." + i);
            int port = 8888;
            DatagramPacket datagramPacket = new DatagramPacket(data, data.length, ip, port);

            try {
                socket.send(datagramPacket);
            } catch (IOException e) {
                e.printStackTrace();
            }

            socket.close();
        }
    }
}
