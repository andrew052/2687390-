import java.util.Scanner;
public class Random {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        System.out.println("Elige entre cara y cruz, escribe 1 si eliges cara y dos si eliges cruz");
        System.out.println("elige por cual quieres elegir");
        int moneda;
        coin = reading.nextInt();
        int resulta = (int)(Math.random()*2+1);
        if(resulta==1){
            System.out.println("salio cara");
        }
        else{
            System.out.println("salio cruz");
        }
        if(moneda==resulta){
            System.out.println("Ganaste ya que sacaste" + resulta );
        }
        else{
            System.out.println("Perdiste ya que no acertaste el resultado, vuelve a intentarlo");
        }


        reading.close();
        

    }
}