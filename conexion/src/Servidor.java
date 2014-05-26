import java.net.*;


//ejercicio en el que el cliente, manda un mensaje al servidor el cual cuenta los espacios, las vocales y las consonantes de la cadena y lo impormie por pantalla

public class Servidor {
	public static void main(String[] args ) throws Exception{
		byte [] buf = new byte[1000];
		DatagramSocket dsocket = new DatagramSocket(9999);
		DatagramPacket msj = new DatagramPacket(buf, buf.length);
		
		System.out.println("Server start");
		
		while(true){
			dsocket.receive(msj);
			int espacios = 0;
			int vocales=0;
			int consonantes=0;
			
			// recoje el mensaje del cliente con el get Data y añade el mensaje en un String
			String mensaje= new String(msj.getData(),0,msj.getLength());
			// administra el mensaje contando los espacios las letras y las consonantes
			for( int i=0; i<mensaje.length(); i++){
				if(mensaje.charAt(i)== ' '){
					espacios++;
				}else
				if( mensaje.charAt(i)== 'a' ||mensaje.charAt(i)== 'e'|| mensaje.charAt(i)== 'i'|| mensaje.charAt(i)== 'o'||mensaje.charAt(i)== 'u'){
					vocales++;
				}else {
					consonantes++;
				}
			}
			
			
			System.out.println("Cliente dice:" + mensaje.toString()+" tiene "+ espacios+ " espacios"+ " tiene "+ vocales + " vocales"+ " tiene "+ consonantes +" consonantes");
		}
	}
}
