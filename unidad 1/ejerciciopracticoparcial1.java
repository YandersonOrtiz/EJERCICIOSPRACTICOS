import java.util.Scanner;
public class ejerciciopracticoparcial1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ingrese una palabra: ");
        String palabra=sc.nextLine().toLowerCase();

        int longitud=palabra.length();

        char [] palabras=palabra.toCharArray();

        for (int i=0;i<longitud;i++){
            if (palabras[i]=='a'|| palabras[i] =='e' || palabras[i]=='i' || palabras[i]=='o'|| palabras[i]=='u' ) {
                
                palabras[i]='*';
            }
        }

        for(int i=0; i<longitud; i++){
            System.out.print(palabras[i]);
        }
        sc.close();
    }
}