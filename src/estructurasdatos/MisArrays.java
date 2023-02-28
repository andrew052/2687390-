package estructurasdatos;
import java.util.Scanner;

public class MisArrays {
     public static void main(String[] args) {
        
        int [] vector1;
        vector1 = new int [10];
        
        int[] vector={30,50,25, 85, 12, 6, 32, 41, 23, 63};
        vector[6]=32;

        for(int p = 0; p <= vector.length;p++){
            System.out.print(vector[p]+" ");

        }
        Scanner read = new Scanner(System.in);
        for(int i : vector){
            System.out.println(i);
        }
        for(int p=0; p<vector.length;p++){
            vector1[p]=read.nextInt();
        }
        
    }
    
}
