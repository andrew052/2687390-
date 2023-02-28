import java.util.Scanner;

public class Papel {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        System.out.println("Vamos a empezar un juego, será piedra, papel o tijera");
        System.out.println("Elige 1 para piedra, 2 para papel y 3 para tijera");

        int game = reading.nextInt();

        int result = (int)(Math.random()*3+1);

        if(game==1){
            System.out.println("Elegiste Piedra");
        }
        else if(game==2){
            System.out.println("Elegiste Papel");
        }
        else if(game==3){
            System.out.println("Elegiste Tijera");
        }
        else{
            System.out.println("No es valido");
        }


        if(result==1 && game==1){
            System.out.println("La maquina eligio Piedra y tu tambien, es empate");
        }
        else if(result==2 && game==2){
            System.out.println("La maquina eligio Papel y tu tambien, es empate");
        }
        else if(result==3 && game==3){
            System.out.println("La maquina eligio Tijera y tu tambien, es empate");
        }
        else if(result==1 && game==3){
            System.out.println("La maquina eligio Piedra y tu tijeras, perdiste");
        }
        else if(result==1 && game==2){
            System.out.println("La maquina eligio Piedra y tu Papel, Ganaste");
        }
        else if(result==2 && game==1){
            System.out.println("La maquina eligio Papel y tu Piedra, perdiste");
        }
        else if(result==2 && game==3){
            System.out.println("La maquina eligio Papel y tu Tijeras, Ganaste");
        }
        else if(result==3 && game==2){  
            System.out.println("La maquina eligio Tijeras y tu Papel, perdiste");
        }
        else{
            System.out.println("La maquina eligio Tijeras y tu Piedra, Ganaste");
        }




        reading.close();
    }
}