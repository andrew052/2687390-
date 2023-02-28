import java.util.Scanner;

public class Budget {

    public static void main(String[] args) throws Exception{
        double width;
        double lengthy;
        double budget;
        double area;

        Scanner reading = new Scanner(System.in);

        System.out.println("ingrese el ancho de su superficie");
        width = reading.nextDouble();

        System.out.println("ingrese el largo de su superficie");
        lengthy = reading.nextDouble();

        area = lengthy * width;

        budget = area*45000;

        System.out.println("La superficie a cubrir tiene "+width+" metros de ancho y "+lengthy+" de largo, con "+area+" metros cuadrados de area. El presupuesto del proyecto es "+budget);

        reading.close();





    }

}