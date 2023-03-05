import java.util.Scanner;

public class Compra {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        int spent, budget2, totals, op;

        op = 1;
        budget2 = 100000;
        totals = 0;

        while (op==1) {
            System.out.println("Ingrese el gasto de su producto (Recuerde que puede poner maximo)");
            spent = reading.nextInt();

            System.out.println("Desea resgistrar otro gasto, 1 para si y 2 para no");
            op = reading.nextInt();
            totals = totals+spent;
            budget2 = budget2-spent;

        }

        System.out.println("De presupuesto le queda un total de: "+budget2+" y el gasto total fue de: "+totals);


        reading.close();
    }
}