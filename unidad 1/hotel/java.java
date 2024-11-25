import java.util.Scanner;
public class java {

    public static final String util = null;

    public static void main(String[] args) {
        //ESTE PROGRAMA FUE HECHO POR: YANDERSON JESUS ORTIZ COVA 192333, SANTIAGO CASTILLA 192413, KEVIN STEIMAN SANCHEZ 192313
        int i=0;
        String[] estadoHabitaciones={"ALOJADA","DESALOJADA"};
        String estado_1=estadoHabitaciones[1];
        String estado_2=estadoHabitaciones[1];
        String estado_3=estadoHabitaciones[1];
        String estado_4=estadoHabitaciones[1];
        String estado_5=estadoHabitaciones[1];
        String estado_6=estadoHabitaciones[1];
    do { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Buenas, bienvenido a nuestro hotel. ");
        System.out.println("Donde cada momento sera una experiencia inigualable. ");
        System.out.println("A continuacion, Ingrese el nombre del alojador de la habitacion: ");

        //se lleva a cabo la inserción del nombre del alojador

        String nombre=sc.nextLine();
        System.out.println("¿Cuantas noches desea hospedar?");

        //el usuario ingresa el numero de noches

        int numeroNoches=sc.nextInt();

        System.out.println("---------------------------");
        System.out.println("1---------Agendar----------");
        System.out.println("2---------Cancelar---------");
        System.out.println("                           ");
        System.out.println("Marque en la parte inferior");
        System.out.println("-----la opción deseada-----");

        //se le da vida o numero mejor dicho a las habitaciones 

        int[] habitaciones={0,1,2,3,4,5};

        //por medio del arreglo que marca el estado de cada habitacion evaluo los dos casos posibles de la accion a ejecutar previamente descrita 

        int accionRealizar=sc.nextInt();

        switch (accionRealizar){
            case 1:
            String estado;
            int precioHabitacion;
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                                Nuestro catalogo variado de habitaciones es el siguiente.                                       ");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("0                            HBT 101           --------------------------------------->                   60.000 COP  "+""+estado_1);
            System.out.println("(Cama individual, Baño privado, Tv, Servicio al cuarto)                                                                         ");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("1                            HBT 201           --------------------------------------->                  130.000 COP  "+""+estado_2);
            System.out.println("(Cama dos cuerpos, Baño privado, Smart Tv, Servicio al cuarto, Refrigerador)                                                    ");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("2                            HBT 302           --------------------------------------->                  270.000 COP  "+""+estado_3);
            System.out.println("(Cama dos cuerpos, Cama individual, Baño privado, Smart Tv, Servicio al cuarto, Refirgeradaor)                                  ");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("3                            Jr. Suite         --------------------------------------->                  320.000 COP  "+""+estado_4);
            System.out.println("(Cama cuerpo y medio, Baño privado con Jacuzzi, Smart Tv, Servicio al cuarto 24/7, Refrigerador privado, Mini Bar Privado)      ");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("4                            Suite             --------------------------------------->                   430.000 COP  "+""+estado_5);
            System.out.println("(Cama dos cuerpos, Baño privado con Jacuzzi, Smart Tv, Servicio al cuarto 24/7, Refrigerador privado, Mini Bar Privado)         ");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("5                            President. Suite  --------------------------------------->                  850.000 COP  "+""+estado_6);
            System.out.println("(Cama dos cuerpos, Cama individual x2, Baño privado con Jacuzzi, Smart Tv, Mini billar con Bar, Refrigerador, Sabanas termicas) ");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("-----------------------Diguite el numero que cumpla con las espectativas de su habitacion ideal-------------------------------- ");
            
           // aca empezamos a almacenar y votar los datos de las reservaciones completas

            int numeroHabitacion=sc.nextInt();
            
            if (numeroHabitacion==0){
                precioHabitacion=60000*numeroNoches;
                estado= estadoHabitaciones[0];
                estado_1=estado;
                System.out.println("Señor:  "+nombre+" Para nosotros es un gusto tenerlo hospedado, su habitacion es la "+ habitaciones[numeroHabitacion]);
                System.out.println("Reservó una  habitacion por: "+numeroNoches+" noches");
                System.out.println("Y el costo a cancelar sin servicios adicionales es de: "+precioHabitacion);
                
            }else if (numeroHabitacion==1){
                precioHabitacion=130000*numeroNoches;
                estado= estadoHabitaciones[0];
                estado_2=estado;
                System.out.println("Señor:  "+nombre+" Para nosotros es un gusto tenerlo hospedado, su habitacion es la "+ habitaciones[numeroHabitacion]);
                System.out.println("Reservó una  habitacion por: "+numeroNoches+" noches");
                System.out.println("Y el costo a cancelar sin servicios adicionales es de: "+precioHabitacion);
    
            }else if (numeroHabitacion==2){
                precioHabitacion=270000*numeroNoches;
                estado= estadoHabitaciones[0];
                estado_3=estado;
                System.out.println("Señor:  "+nombre+" Para nosotros es un gusto tenerlo hospedado, su habitacion es la "+ habitaciones[numeroHabitacion]);
                System.out.println("Reservó una  habitacion por: "+numeroNoches+" noches");
                System.out.println("Y el costo a cancelar sin servicios adicionales es de: "+precioHabitacion);
    
            }else if (numeroHabitacion==3){
                precioHabitacion=320000*numeroNoches;
                estado= estadoHabitaciones[0];
                estado_4=estado;
                System.out.println("Señor:  "+nombre+" Para nosotros es un gusto tenerlo hospedado, su habitacion es la "+ habitaciones[numeroHabitacion]);
                System.out.println("Reservó una  habitacion por: "+numeroNoches+" noches");
                System.out.println("Y el costo a cancelar sin servicios adicionales es de: "+precioHabitacion);
    
            }else if (numeroHabitacion==4){
                precioHabitacion=430000*numeroNoches;
                estado= estadoHabitaciones[0];
                estado_5=estado;
                System.out.println("Señor:  "+nombre+" Para nosotros es un gusto tenerlo hospedado, su habitacion es la "+ habitaciones[numeroHabitacion]);
                System.out.println("Reservó una  habitacion por: "+numeroNoches+" noches");
                System.out.println("Y el costo a cancelar sin servicios adicionales es de: "+precioHabitacion);
    
            }else if (numeroHabitacion==5){
                precioHabitacion=850000*numeroNoches;
                estado_6= estadoHabitaciones[0];
                System.out.println("Señor:  "+nombre+" Para nosotros es un gusto tenerlo hospedado, su habitacion es la "+ habitaciones[numeroHabitacion]);
                System.out.println("Reservó una  habitacion por: "+numeroNoches+" noches");
                System.out.println("Y el costo a cancelar sin servicios adicionales es de: "+precioHabitacion);
                
            }
            break;
            
            default:
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                                 OH!, Decidiste cancelar una reservación. Esperamos verte de nuevo pronto.                      ");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("0                            HBT 101           --------------------------------------->                   60.000 COP  "+""+estado_1);
            System.out.println("(Cama individual, Baño privado, Tv, Servicio al cuarto)                                                                         ");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("1                            HBT 201           --------------------------------------->                  130.000 COP  "+""+estado_2);
            System.out.println("(Cama dos cuerpos, Baño privado, Smart Tv, Servicio al cuarto, Refrigerador)                                                    ");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("2                            HBT 302           --------------------------------------->                  270.000 COP  "+""+estado_3);
            System.out.println("(Cama dos cuerpos, Cama individual, Baño privado, Smart Tv, Servicio al cuarto, Refirgeradaor)                                  ");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("3                            Jr. Suite         --------------------------------------->                  320.000 COP  "+""+estado_4);
            System.out.println("(Cama cuerpo y medio, Baño privado con Jacuzzi, Smart Tv, Servicio al cuarto 24/7, Refrigerador privado, Mini Bar Privado)      ");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("4                            Suite             --------------------------------------->                  430.000 COP  "+""+estado_5);
            System.out.println("(Cama dos cuerpos, Baño privado con Jacuzzi, Smart Tv, Servicio al cuarto 24/7, Refrigerador privado, Mini Bar Privado)         ");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("5                            President. Suite  --------------------------------------->                  850.000 COP  "+""+estado_6);
            System.out.println("(Cama dos cuerpos, Cama individual x2, Baño privado con Jacuzzi, Smart Tv, Mini billar con Bar, Refrigerador, Sabanas termicas) ");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("-----------------------Diguite el numero con el cual este identificado la habitacion a cancelar---------------------------------");
            
            
            //Aca implementamos las cancelaciones de reservas utilizano if-else if 
            int cancelarReserva=sc.nextInt();
            if (cancelarReserva==0) {
                estado_1=estadoHabitaciones[1];
            }else if (cancelarReserva==1) {
                estado_2=estadoHabitaciones[1];
            }else if (cancelarReserva==2) {
                estado_3=estadoHabitaciones[1];
            }else if (cancelarReserva==3) {
                estado_4=estadoHabitaciones[1];
            }else if (cancelarReserva==4) {
                estado_5=estadoHabitaciones[1];
            }else if (cancelarReserva==5) {
                estado_6=estadoHabitaciones[1];
            }
            break;

        }
        //Aca mostramos el estado de nuestras habitaciones en caso de futuras reservas tener en cuenta eso
        System.out.println("En caso de que desee realizar otras reservaciones este es el estado de nuestras habitaciones en estos momentos: ");
        System.out.println("         HBT 101: "+estado_1);
        System.out.println("         HBT 201: "+estado_2);
        System.out.println("         HBT 302: "+estado_3);
        System.out.println("       Jr. Suite: "+estado_4);
        System.out.println("           Suite: "+estado_5);
        System.out.println("President. Suite: "+estado_6);
        

        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("Ingrese 1 si se va a realizar otra accion, en caso de haber terminado ponga cero");
        int numeroBandera=sc.nextInt();
        i=numeroBandera;
    } while (i==1);
    
    }
}