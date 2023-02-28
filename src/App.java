import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        int number1;
        System.out.println("Ingrese un numero"); 
        number1 = lectura.nextInt();
        int number2;
        System.out.println("Ingrese otro numero"); 
        number2 = lectura.nextInt();
        int add = number1 + number2;
        System.out.println("El numero que ingresaste es, " + number1 + " El otro numero que ingresaste es " + number2 + " y la suma es " + add );

        lectura.nextLine();//limpieza de buffer

        String name;
        System.out.println("ingrese su nombre");
        name = lectura.nextLine();
        System.out.println("El nombre que se ingreso fue: "+ name ); 


        lectura.close();
    }
}