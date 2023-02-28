import java.util.Scanner;

public class Number {
    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);

        int num1, num2, result;
        System.out.println("Ingrese el primer numero");
        num1 = reading.nextInt();

        System.out.println("Ingrese el segundo numero");
        num2 = reading.nextInt();

        if(num1>num2){
            result = num1+num2;
            System.out.println("Los números se sumaron por que el primer numero es mayor que el segundo y su resultado es: "+result);
        }
        else{
            result = num1-num2;
            System.out.println("los números se restaron por que el primer numero es menor que el segundo y su resultado es: "+result);
        }


        reading.close();
    }
}