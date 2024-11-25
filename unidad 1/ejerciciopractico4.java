import java.util.*;
public class ejerciciopractico4 {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        System.out.print("ingrese el numero a evaluar si es primo o no: ");
        int numero=leer.nextInt();
        int divisores=0;
        for (int i=1; i<=numero;i++)
        if (numero%1==0) {
            divisores++;
            
        }
        if (divisores>2) {
            System.out.println("El numero no es primo");
            
        }
        if (divisores==2) {
            System.out.println("El numero es primo");
            
        }
        divisores=0;
        numero=0;
        for(int j=1;j<=100;j++){;
            if (numero%1==0) {
                divisores++;
                
            }
            if (numero%2==0 && numero!=2) {
                divisores++;
                
            }
            if (numero%3==0 && numero!=3) {
                divisores++;
                
            }
            if (numero%5==0 && numero!=5) {
                divisores++;
                
            }
            if (numero%7==0 && numero!=7) {
                divisores++;
                
            }
            if (divisores==1 && numero!=1) {
                divisores++;
                System.out.println(numero);
            }
            numero++;
        }
        leer.close();
    }
    
}
