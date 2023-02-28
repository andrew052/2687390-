import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        int age;
        Scanner reading = new Scanner(System.in);

        System.out.println("Ingrese su edad, para entrar a la discote (recuerde que debe ser mayor de edad)");
        age = reading.nextInt();

        if(age>=18){
            System.out.println("Bienvenido, puede entrar.");
        }
        else{
            System.out.println("No puede entrar al disco, lo siento.");
        }


        reading.close();
    }
}