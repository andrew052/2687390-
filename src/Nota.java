import java.util.Scanner;


public class Nota {
    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String name = reading.nextLine();

        double nota1, nota2, nota3, assistance;
       
        System.out.println("Digite su primera nota");
        nota1 = reading.nextDouble();
        
        System.out.println("Digite su segunda nota");
        nota2 = reading.nextDouble();
        
        System.out.println("Digite su tercera nota");
        nota3 = reading.nextDouble();
       

        double promedio = (nota1+nota2+nota3) /3;
        

        System.out.println("Su promedio de las notas es: "+promedio);

        System.out.println("ingrese su porcentaje de asistencia");
        assistance = reading.nextDouble();
        if(promedio>=3.5 && assistance>=70 || name.equals("Santiago") ){
            System.out.println("Usted aprobó");
        }
        else{
            System.out.println("Usted no aprobó");
        }

        reading.close();
    }
    } 
