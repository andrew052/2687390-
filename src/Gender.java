import java.util.Scanner;

public class Gender {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        int numM = 0;
        int numF = 0;

        for ( int x=1; x<=10; x++) {

            System.out.println("numero de persona: "+x);

            System.out.println("Eres hombre o mujer?");
            String gender = reading.nextLine();

            if (gender.equals("hombre")) {  
                numM = numM+1;
            }
            else if(gender.equals("mujer")){
                numF = numF+1;
            }
            else{
                System.out.println("Lo siento, no entendemos tu genero");
            }
        }

        System.out.println("Numero de hombres: "+numM+" y numero de mujeres: "+numF);


        reading.close();
    }
}