import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        System.out.println("Elige entre cara y cruz, escribe 1 si eliges cara y 2 si eliges cruz");
        System.out.println("elige por cual quieres apostar");

        int moneda;
        moneda = reading.nextInt();

        int result = (int)(Math.random()*2+1);

        if(result==1){
            System.out.println("salio cara");
        }
        else{
            System.out.println("salio cruz");
        }

        if(moneda==result){
            System.out.println("Ganaste ya que acertaste el resultado " + result);
        }
        else{
            System.out.println("Perdiste ya que no acertaste el resultado " + result + " vuelve a intentarlo " );
        }



        reading.close();

    }
}
