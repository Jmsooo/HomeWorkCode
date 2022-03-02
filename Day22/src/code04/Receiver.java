package code04;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8888);

        byte[] data = new byte[1024*6];
        DatagramPacket packet = new DatagramPacket(data, data.length);

        socket.receive(packet);

        byte[] result = packet.getData();
        int len = packet.getLength();
        System.out.println(new String(result,0,len));

        socket.close();
    }
}
