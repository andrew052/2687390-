import java.util.Scanner;
public class Challenge5 {

    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        String nombre, apellido;

        System.out.println("Ingrese su nombre");
        nombre = reading.nextLine();

        System.out.println("Ingrese su apellido");
        apellido = reading.nextLine();
        
        String nombrecompleto = nombre.toUpperCase() + apellido.toLowerCase();
        int nom = nombre.length();
        int ape = apellido.length();
        int nombrecom= nombrecompleto.length();
        String nomd = nombre.toUpperCase();
        String apes = apellido.toLowerCase();
        String nombres = nombre; 
        String letter = nombre.substring(0, 2);
        
        char carac = nombres.charAt(1);
        char car = nombres.charAt(2 );
    
        System.err.println("su nombre es " + nombre.toUpperCase() + " y tiene " + nombre.length() + " letras y su apellido es " + apellido.toLowerCase() + " y tiene " + apellido.length() + " letras" );
        System.out.println("su nombre completo es " + nombrecompleto);
        
        System.out.println("Su apodo es " + nombre.substring(0, 2) + apellido.toLowerCase() );
        
        
        








        reading.close();
    }    
}
