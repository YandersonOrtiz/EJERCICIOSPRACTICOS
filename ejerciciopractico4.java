import java.util.*;
public class ejerciciopractico4 {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        System.out.print("ingrese el numero a evaluar si es primo o no: ");
        int numero=leer.nextInt();
        if(numero%2==0){
            System.out.println("El numero: "+numero+" no es primo");
        }
        else{
            System.out.println("El numero: "+numero+" es primo");
        }

        for (int i=0; i<=100; i++){
            if (i % 2!=0) {
                System.out.print(i+", ");
            }
        }

        leer.close();
    }
    
}
