import java.util.Scanner;

public class Budget {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        int spent, budget2, totals, op;

        op = 1;
        
        budget2 = 100000;
        
        while (op==1) {
            System.out.println("Ingrese el gasto de su producto");
            spent = reading.nextInt();
            budget2 = budget2 - spent;
            System.out.println("Desea registrar otro gasto? 1=si, 2=no");
            op = reading.nextInt();
            totals = 
        }
        System.out.println("Su nuevo presupuesto es de:" );










        reading.close();
    }
}