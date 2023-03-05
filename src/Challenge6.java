import java.util.Scanner;

public class Challenge6 {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        System.out.println("Jugaremos Craps, lanzaras dos dados, ganarás si obtienes");

        System.out.println("-Un par de unos en los dados.");

        System.out.println("-Un total de tres en los dados.");

        System.out.println("-Un total de once en los dados.");

        System.out.println("-Si se obtiene dos o doce en los dados.");

        System.out.println("-Un total de siete en los dados.");

        System.out.println("Ingresa 1 para lanzar");
        
        int start = reading.nextInt();
        if (start==1) {
            int dice1 = (int)(Math.random()*6+1);
            int dice2 = (int)(Math.random()*6+1);

            if (dice1==1 && dice2==1) {
                System.out.println("Ganaste, sacaste un par de 1, dado uno: "+dice1+" y dado dos: "+dice2);
            }
            else if (dice1==1 && dice2==2 || dice1==2 && dice2==1) {
                System.out.println("Ganaste, sacaste un total de 3, dado uno: "+dice1+" y dado dos: "+dice2);
            }
            else if (dice1==6 && dice2==5 || dice1==5 && dice2==6) {
                System.out.println("Ganaste, sacaste un total de 11, dado uno: "+dice1+" y dado dos: "+dice2);
            }
            else if (dice1==6 && dice2==6 || dice1==1 && dice2==1) {
                System.out.println("Ganaste, sacaste 2 o 12 en tus dados, dado uno: "+dice1+" y dado dos: "+dice2);
            }
            else if (dice1==1 && dice2==6 || dice1==6 && dice2==1 || dice1==5 && dice2==2 || dice1==2 && dice2==5 || dice1==3 && dice2==4 || dice1==4 && dice2==3 ) {
                System.out.println("Ganaste, sacaste un total de 7 en tus dados, dado uno: "+dice1+" y dado dos: "+dice2);
            }   
        }
        else{
            System.out.println("Entiendo, intentalo de nuevo cuando quieras");
        }








        reading.close();
    }
}