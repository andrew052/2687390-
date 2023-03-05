import java.util.Scanner;

public class Challenge9 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double bet, op, amountBet, numGame;
        numGame=0;
        System.out.println("Jugaremos el carisellazo, ingrese el monto que usará para apostar. Advertecia: Este valor podra aumentar y disminuir");
        bet=read.nextDouble();
        System.out.println("Iniciaras con un monto de: "+bet);
        do {
            op=0;
            System.out.println("Elija el dinero con el que empezará el juego");
            amountBet=read.nextDouble();
            if (amountBet>bet) {
                System.out.println("Debe apostar un valor que este dentro de su monto global");
            }
            else {
                bet=bet-amountBet;
                System.out.println("Elige 1 si apuestas por cara o 2 si apuestas por sello");
                int decision = read.nextInt();
                int coin = (int)(Math.random()*2+1);

                if (decision==1 && coin==1) {
                    System.out.println("Elegiste cara y salió cara, !Ganaste¡, el valor que apostaste se duplicará");
                    amountBet=amountBet*2;
                    bet=bet+amountBet;
                    System.out.println("Ahora, tu monto es de: "+bet);
                    numGame=numGame+1;
                }

                else if (decision==2 && coin==2) {
                    System.out.println("Elegiste sello y salió sello, !Ganaste¡, el valor que apostaste se duplicará");
                    amountBet=amountBet*2;
                    bet=bet+amountBet;
                    System.out.println("Ahora, tu monto es de: "+bet);
                    numGame=numGame+1;
                }

                else if (decision==1 && coin==2) {
                    System.out.println("Elegiste cara y salió sello, Perdiste, el valor que apostaste lo perderás");
                    System.out.println("Ahora, tu monto es de: "+bet);
                    numGame=numGame+1;
                }

                else {
                    System.out.println("Elegiste sello y salió cara, Perdiste, el valor que apostaste lo perderás");
                    System.out.println("Ahora, tu monto es de: "+bet);
                    numGame=numGame+1;
                }

            }

            numGame=numGame+1;
            System.out.println("Numero de partidas jugadas: "+numGame);
            System.out.println("Si desea jugar de nuevo ingrese 1, en caso de que no ingrese 2");
            op=read.nextDouble();

        } while (op==1);
        
        System.out.println("Las veces que jugo en total fueron: "+numGame+" y el monto que le quedo fue de: "+bet);
        read.close();
    }
}