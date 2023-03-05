import java.util.Scanner;
public class Challenge8 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);


        double price, products, buy, pay, changePay;
        buy=0;
        int op=0;
        products = 0;
        do {
            products = products+1;
            System.out.println("Ingresa el precio del producto");
            price=read.nextDouble();
            buy= buy+price;
            read.nextLine();//limpieza de buffer
            System.out.println("Deseas ingresar otro producto?, ingrese 1 si quiere y 2 si no quiere");
            op=read.nextInt();

        } while (op==1);
        double discount, total;
        total=0;
        if (buy>=50000) {
            int ball = (int)(Math.random()*4+1);
            System.out.println(ball);
            if (ball==1) {
                System.out.println("Saliste beneficiado, ya que tu compra es de 50000 o lo supero");
                System.out.println("Te salio la bola roja, tienes un 10% de descuento");
                discount = 0.1*buy;
                total = buy - discount;
                System.out.println("El valor de su compra era de: "+buy+" menos el descuento del 10% queda un total de: "+total);
                System.out.println("Ingrese el valor con el que pagará");
                pay=read.nextDouble();
                changePay=pay-total;
                System.out.println("Pagaste con: "+pay+" y tu cambio es: "+changePay);
            }
            else if (ball==2) {
                System.out.println("Saliste beneficiado, ya que tu compra es de 50000 o lo supero");
                System.out.println("Te salio la bola azul, tienes un 30% de descuento");
                discount = 0.3*buy;
                total = buy - discount;
                System.out.println("El valor de su compra era de: "+buy+" menos el descuento del 30% queda un total de: "+total);
                System.out.println("Ingrese el valor con el que pagará");
                pay=read.nextDouble();
                changePay=pay-total;
                System.out.println("Pagaste con: "+pay+" y tu cambio es: "+changePay);
            }
            else if (ball==3) {
                System.out.println("Saliste beneficiado, ya que tu compra es de 50000 o lo supero");
                System.out.println("Te salio la bola amarilla, tienes un 50% de descuento");
                discount = 0.5*buy;
                total = buy - discount;
                System.out.println("El valor de su compra era de: "+buy+" menos el descuento del 50% queda un total de: "+total);
                System.out.println("Ingrese el valor con el que pagará");
                pay=read.nextDouble();
                changePay=pay-total;
                System.out.println("Pagaste con: "+pay+" y tu cambio es: "+changePay);
            }
            else{
                System.out.println("Saliste beneficiado, ya que tu compra es de 50000 o lo supero");
                System.out.println("Te salio la bola blanca, te llevas tu compra gratis");
                discount = (100/100)*buy;
                total = buy - discount;
                System.out.println("El valor de su compra era de: "+buy+" pero sacaste la bola blanca, es decir, queda un total de: "+total);
                System.out.println("Ingrese el valor con el que pagará");
                pay=read.nextDouble();
                changePay=pay-total;
                System.out.println("Pagaste con: "+pay+" y tu cambio es: "+changePay);
            }
        }
        else{
            System.out.println("Tu compra no superó los 50.000, tu compra fue de: "+buy);
            System.out.println("Ingrese el valor con el que pagará");
            pay=read.nextDouble();
            changePay=pay-buy;
            System.out.println("Pagaste con: "+pay+" y tu cambio es: "+changePay);
        }
    
    }
 }    