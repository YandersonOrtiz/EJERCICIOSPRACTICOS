import java.util.Scanner;

public class ejerciciopractico5 {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean conocidaFigura=true;
        do{
            System.out.print("ingrese el nombre del poligono que desea calcular área (Triangulo, Cuadrado, Rectángulo): ");
            String nombre=sc.nextLine().toLowerCase();

            switch (nombre) {
            case "triangulo":
                
                System.out.print("ingrese la altura: ");
                double altura=sc.nextDouble();
                System.out.print("ingrsea la base: ");
                double base=sc.nextDouble();    

                double area1=base*altura/2;

                System.out.print("El area del Triangulo es: "+area1);
                conocidaFigura=true;
                break;
            
            case "cuadrado":

                System.out.print("ingrese la longitud del lado: ");
                double lado=sc.nextDouble();

                double area2=lado*lado;

                System.out.print("El area del Cuadrado es: "+area2);
                conocidaFigura=true;
                break;

            case"rectangulo":

                System.out.print("ingrese la altura: ");
                double altura3=sc.nextDouble();
                System.out.print("ingrsea la base: ");
                double base3=sc.nextDouble();    

                double area3=base3*altura3;

                System.out.print("El area del Triangulo es: "+area3);
                conocidaFigura=true;
            break;
        
            default:
                
                System.out.println("El nombre ingresado es incorrecto, vuelve a escribirlo");
                conocidaFigura=false;
            }
        }while (conocidaFigura==true);
        sc.close();
    }
        
}
