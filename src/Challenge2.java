import java.util.Scanner;
public class Challenge2 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

    double dosisvacuna, pesobebe, mesesbebe;
    System.out.println("INDIQUE LA EDAD DEL NIÑO");
    mesesbebe = read.nextDouble();
    System.out.println("INDIQUE EL PESO DEL NIÑO");
    pesobebe = read.nextDouble();
    
    dosisvacuna = pesobebe + 10 / mesesbebe * 10 * 8;

    System.out.println("LA CANTIDAD PARA APLICARLE AL NIÑO ES DE:" + dosisvacuna + "ml");
    read.close();
 }
}
