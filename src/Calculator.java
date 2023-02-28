import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        System.out.println("Ingresa el primer numero");
        double num1 = reading.nextDouble();
        System.out.println("ingresa segundo numero");
        double num2 = reading.nextDouble();

        System.out.println("Podras elegir entre 6 opciones de operaciones para hacer con estos dos numeros: 1 = Suma, 2 = resta, 3 = Multiplicación, 4 = División, 5 = Potencia y 6 = Raiz Cuadrada. Elige");
        int operation = reading.nextInt();

        System.out.println("Elegiste: "+ operation);

        switch (operation) {
            case 1:

            System.out.println("Elegiste suma");

            double result = num1 + num2;
            System.out.println("El resultado es "+result);

            break;

            case 2:

            System.out.println("Elegiste resta");

            double result2 = num1 - num2;
            System.out.println("El resultado es "+result2);

            break;

            case 3:

            System.out.println("Elegiste Multiplicación");

            double result3 = num1 * num2;
            System.out.println("El resultado es "+result3);

            break;

            case 4:

            System.out.println("Elegiste División");

            double result4 = num1 / num2;
            System.out.println("El resultado es "+result4);

            break;

            case 5:

            System.out.println("Elegiste Potencia");

            double result5 = (Math.pow(num1, num2));
            System.out.println("El resultado es "+result5);

            break;

            case 6:

            System.out.println("Elegiste Raiz Cuadrada");

            double result6 = (Math.sqrt(num1)) ;
            double result7 = (Math.sqrt(num2)) ;
            System.out.println("El resultado del numero 1 es: "+result6+" y el del numero 2 es: "+result7);

            break;

            default:
            System.out.println("La opción no es valida");
            break;
        }


        reading.close();

    }
}