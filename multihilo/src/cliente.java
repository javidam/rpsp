import java.net.*;
import java.util.Scanner;

public class cliente {
	 
	private static Socket socket;
	final String IP = "66.249.64.197";
	final int PUERTO=80;
	private static Scanner teclado = new Scanner(System.in);
	

 public static void main(String[] args) {
    int Hilos = 1;

        try{

            ServerSocket  socket = new ServerSocket(5432);
     
            System.out.println(" Probando conexion servidor ") ;
            System.out.println("conexion a la IP 66.249.64.197") ;
        
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}