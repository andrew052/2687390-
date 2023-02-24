import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        
    {
        Scanner read = new Scanner(System.in);

        double F, C;

        System.out.println("INGRESE LA CANTIDA DE GRADOS FAHRENHEIT A CONVERTIR");
         F = read.nextDouble(); 

         C = ( F - 32 )/1.8;

         System.out.println("LOS GRADOS GRADOS CELSIUS SON:" + C );
         read.close();

    }
    
}

}
