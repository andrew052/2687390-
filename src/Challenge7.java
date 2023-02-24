import java.util.Scanner;
public class Challenge7 {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        double fac, billete, cuenta, prod1, prod2, prod3, descuento;
        
        System.out.println("Digite la el precio del producto 1");
        prod1 = reading.nextDouble();
        System.out.println("Digite la el precio del producto 1");
        prod2 = reading.nextDouble();
        System.out.println("Digite la el precio del producto 1");
        prod3 = reading.nextDouble();
        double total = prod1 + prod2 + prod3;
        int IA = (int)(Math.random() * 5) + 1;
        if (total>=50000){
            
            System.out.print("Digite 1 para empezar el juego ");
         }
         else if (IA==1){
            descuento = total * .10;
            System.out.println("Su descuento fue de el 10%:" + descuento);

            descuento = total * .30;
            System.out.println("Su descuento fue de el 30%:" + descuento);
            
            descuento = total * .50;
            System.out.println("Su descuento fue de el 50%:" + descuento);

            System.out.println("El valor de su compra es gratis"+ total);
         }
         
        else { 
            System.out.println( "Su factura es de: " + total + "gracias por su compra" );
        }


        
        
        

    


    }
}
