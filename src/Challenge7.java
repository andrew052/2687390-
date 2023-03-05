import java.util.Scanner;

public class Challenge7 {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        System.out.println("Si tu compra supera los 50.000 podras participar en los obsequios de descuentos dependiendo de tu suerte");

        System.out.println("-Si sacas la bolita roja obtienes 10% en el valor de tu compra");

        System.out.println("-Si sacas la bolita azul obtienes un 30% en el valor de tu compra");

        System.out.println("-Si sacas la bolita amarilla obtienes un 50% en el valor de tu compra");

        System.out.println("-Si sacas la bolita blanca te llevas tu compra gratis");

        System.out.println("-Ingresa el valor de tu compra");

        double buy = reading.nextDouble();
        double discount, total;
        if (buy>=50000) {
            int ball = (int)(Math.random()*4+1);
            if (ball==1) {
                System.out.println("Te salio la bola roja, tienes un 10% de descuento");

                discount = 0.1*buy;
                total = buy - discount;
                System.out.println("El valor de su compra era de: "+buy+" menos el descuento del 10% queda un total de: "+total);

            }
            else if (ball==2) {
                System.out.println("Te salio la bola azul, tienes un 30% de descuento");

                discount = 0.3*buy;
                total = buy - discount;
                System.out.println("El valor de su compra era de: "+buy+" menos el descuento del 30% queda un total de: "+total);

            }
            else if (ball==3) {
                System.out.println("Te salio la bola amarilla, tienes un 50% de descuento");

                discount = 0.5*buy;
                total = buy - discount;
                System.out.println("El valor de su compra era de: "+buy+" menos el descuento del 50% queda un total de: "+total);

            }
            else{
                System.out.println("Te salio la bola blanca, te llevas tu compra gratis");

                discount = (100/100)*buy;
                total = buy - discount;
                System.out.println("El valor de su compra era de: "+buy+" pero sacaste la bola blanca, es decir, queda un total de: "+total);
            }
        }
        else{
            System.out.println("Tu compra no superó los 50.000, tu compra fue de: "+buy);

        }




        reading.close();
    }
}
        

    


    
