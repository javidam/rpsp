import java.net.*;
import java.util.Scanner;
import java.io.*;


public class Cliente {
	public static void main (String [] args) throws Exception{
		
		//el cliente recoje un mensaje por teclado  y se lo manda al servdor mediante las clases Datagram Socket y Packet.
		byte [] buf = new  byte[1000];
		InetAddress hostAddress = InetAddress.getByName("localhost");
		
		DatagramSocket dsocket= new DatagramSocket();
		DatagramPacket mensIn= new DatagramPacket(buf, buf.length);
		
		System.out.println("introduce el mensaje");
		Scanner teclado= new Scanner(System.in);
		String mensaje= teclado.nextLine();
		
		buf= mensaje.getBytes();
		DatagramPacket mensOut= new DatagramPacket(buf, buf.length, hostAddress, 9999);
		
		
		dsocket.send(mensOut);
	}
}
