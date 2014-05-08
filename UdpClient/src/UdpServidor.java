import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class UdpServidor {

public static void main(String[] args) {

ServerSocket s; 
Socket sc; 

PrintStream p;
BufferedReader b; 

String mensaje;

try {
s = new ServerSocket(8080);

sc = s.accept();

b = new BufferedReader( new InputStreamReader ( sc.getInputStream() ) );
p = new PrintStream ( sc.getOutputStream() );

while ( true ) {
mensaje = b.readLine();
System.out.println(mensaje);

p.println(mensaje);

if ( mensaje.equals("by")) {
break;
}
}

p.close();
b.close();

sc.close();
s.close();
} catch (IOException e) {
System.out.println("No puedo crear el socket");
}
}

}