package estructurasdatos;
import java.util.*;
public class ChallengeArrays1 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int numNotes, i;
        double suma = 0, media, reprobado, raspando, aprobado ;
        

        
        do {
            System.out.print("Número de notas de la clase: ");
            numNotes = read.nextInt();
        } while (numNotes<= 0);

       
        double[] notas = new double[numNotes]; 
        
       
        for (i = 0; i < notas.length; i++) {
            System.out.print("Alumno " + (i ) + " Nota final: ");
            notas[i] = read.nextDouble();
        }

        
        for (i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }

        
        media = suma / notas.length;

        
        System.out.printf("Nota media del estudiante es: %.2f %n", media);

        
      
        for (i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println("Alumno numero " + (i + 1)+ " Nota final: " + notas[i]);
            }
        }
    }
}