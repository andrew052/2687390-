import java.util.Scanner;

public class Precio {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        double price, quantity, subTotal, pay, payChange;

        double accountant = 0;
        double accumulator= 0;

        for (int x=1; x<6 ; x++) {

            System.out.println("Digite el precio del producto");
            price = reading.nextDouble();

            System.out.println("Digite la cantidad del producto");
            quantity = reading.nextDouble();

            System.out.println("x vale: "+x);

            accountant=accountant+1; 
            subTotal = price*quantity;
            accumulator= accumulator+subTotal;

        }
        System.out.println("Su total a pagar es: "+accumulator);
        System.out.println("Ingrese el valor del billete con el que va a pagar");
        pay = reading.nextDouble();
        payChange = pay - accumulator;

        System.out.println("Tu cambio es: "+payChange);

        System.out.println("Usted cuenta con telefonía móvil éxito?");
        reading.nextLine();
        String phone = reading.nextLine();

        if (phone.equals("si")) {
            System.out.println("Los minutos que obtuvo fueron: "+accountant);
        }
        else if(phone.equals("no")){
            System.out.println("Adquiere ya nuestra telefonía, no te arrepentiras");
        }
        else{
            System.out.println("Lo siento, no pudimos entender tu respuesta, responde con <si> o <no>");
        }

        reading.close();
    }
}
