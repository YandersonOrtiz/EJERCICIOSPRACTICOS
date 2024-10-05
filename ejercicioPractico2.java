import java.util.Scanner;
public class ejercicioPractico2 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ingrese la primera palabra: ");
        String palabra1=sc.nextLine().toLowerCase();
        System.out.print("ingrse la segunda palabra: ");
        String palabra2=sc.nextLine().toLowerCase();



        char [] caracteresPalabra1=palabra1.toCharArray();
        char [] caracteresPalabra2=palabra2.toCharArray();

        int longitud1=palabra1.length();
        int longitud2=palabra2.length();

        if (longitud1!=longitud2){
            System.out.println("Las palabras no son anagrama.");
        }
            int contador=0;
            for(int i=0;i<longitud1;i++){
                for(int j=0;j<longitud2;j++){

                    if (caracteresPalabra1[i]==caracteresPalabra2[j]) {
                        
                        contador++;
                        caracteresPalabra2[j]=' ';
                        break;
                    }
                }
            }
            if (contador==longitud1) {

                System.out.print("Las palabras son anagramas.");
            }
            else{
                System.out.print("las palabras no son anagramas.");
            }
        sc.close();

    }   
}