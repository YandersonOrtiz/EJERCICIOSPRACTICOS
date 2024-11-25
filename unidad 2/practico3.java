import java.util.Arrays;

public class practico3 {

    // Método que modifica el array recibido, multiplicando cada elemento por 2
    public static void modificarArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;  // Multiplica cada elemento por 2
        }
        System.out.println("Dentro del método: " + Arrays.toString(arr));  // Muestra el array dentro del método
    }

    // Método principal
    public static void main(String[] args) {
        // Creación de un array de enteros
        int[] numeros = {1, 2, 3, 4, 5};
        
        // Muestra el contenido del array antes de modificarlo
        System.out.println("Antes de modificar: " + Arrays.toString(numeros));
        
        // Llama al método que modifica el array
        modificarArray(numeros);
        
        // Muestra el contenido del array después de modificarlo
        System.out.println("Después de modificar: " + Arrays.toString(numeros));
    }
}
