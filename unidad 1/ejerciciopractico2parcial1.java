import java.util.Scanner;
public class ejerciciopractico2parcial1 {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int numero;
        
        do{       
        System.out.print("Ingrese el numero a evaluar debe ser positivo: ");
           numero=sc.nextInt();
            if (numero<0) {
                System.out.println("El numero debe ser positio.");
            }
        } while(numero<0);
        
        System.out.println("los numeros primos hasta ese numero son: ");
        for(int i= 0; i<numero;i++){
            if (i % 2 != 0) {
                System.out.print(i+", ");
                
            }

        }

        
        sc.close();

    }
}
