import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        System.out.println("Juego piedra-papel-tijera");
        
 
        int IA = (int)(Math.random() * 3) + 1;
        System.out.println("La computadora ya escogio...");
 
        System.out.print("Escoga 1=Piedra, 2=Papel, 3=Tijera: ");
        int usted = reading.nextInt();
 
        System.out.print("La maquina escogio: ");
        switch ( IA )
        {
            case 1:
                System.out.println("Piedra");
                switch ( usted )
                {
                   case 1: System.out.println("Empate!"); break;
                   case 2: System.out.println("Usted gana!"); break;
                   case 3: System.out.println("La maquina gana!"); break;
                }
                break;
 
            case 2:
                System.out.println("Papel");
                switch ( usted )
                {
                   case 1: System.out.println("La maquina gana!"); break;
                   case 2: System.out.println("Empate!"); break;
                   case 3: System.out.println("Usted gana!"); break;
                }
                break;
 
            case 3:
                System.out.println("Tijera");
                switch ( usted )
                {
                   case 1: System.out.println("Usted gana!"); break;
                   case 2: System.out.println("La maquina gana!"); break;
                   case 3: System.out.println("Empate!"); break;
                }
                break;
            }    



        reading.close();
    } 
}
