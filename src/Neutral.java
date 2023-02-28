import java.util.Scanner;

public class Neutral {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        int num;
        System.out.println("Ingrese un numero para ver si es positivo, negativo o neutro");
        num = reading.nextInt();

        if(num>0){
            System.out.println("el numero: "+num+" es positivo");
        }
        else if(num==0){
            System.out.println("el numero: "+num+" es neutro");
        }
        else{
            System.out.println("el numero: "+num+" es negativo");
        }


        reading.close();
    }
}