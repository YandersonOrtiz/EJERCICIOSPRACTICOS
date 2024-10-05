import java.util.Scanner;
public class ejerciciopractoc3 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.print("cuantos numeros desea general: ");
        int repeticiones= leer.nextInt();
        long primerNumero=0;
        long segundoNumero=1;
        long tercerNumero;

        for (int i=0 ;i<=repeticiones;i++){
            tercerNumero=primerNumero;
            primerNumero=segundoNumero+primerNumero;
            segundoNumero=tercerNumero;

            System.out.print(segundoNumero+", ");
        }
        leer.close();
    }
}