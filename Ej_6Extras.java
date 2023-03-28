
import java.util.Scanner;

/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario
las va ingresando, construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres.
Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de
manera aleatoria.
Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con 
un número aleatorio del 0 al 9.
Finalmente imprima por pantalla la sopa de letras creada.
     Nota: Para resolver el ejercicio deberá investigar cómo se
utilizan las siguientes funciones de Java substring(), Length() y Math.random().
 */
public class Ej_6Extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][] sopa = new String[20][20];
        String palabra;
        Relleno(sopa);
        for (int i = 0; i < 5; i++) {
            do {
                palabra = leer.nextLine();
            } while (palabra.length() < 3 || palabra.length() > 5);
            ColocarPalabra(sopa, palabra);
        }
        RellenoFinal(sopa);
        for (int i = 0; i < 20; i++) {
            System.out.print("          ");
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j].toUpperCase() + " ");
            }
            System.out.println("");
        }
    }

    public static void ColocarPalabra(String[][] A, String B) {
        int Qui = (int) (Math.random() * 16);
        int Ds = (int) (Math.random() * 17);
        int Dst = (int) (Math.random() * 18);
        int filas = (int) (Math.random() * 22);
        int sub = 0;
        if (B.length() == 3) {
            for (int i = Dst; i < 20; i++) {
                A[filas][i] = B.substring(sub, sub+1).toUpperCase() + " ";
                sub = sub + 1;
                if (sub == 3) {
                    break;
                }
            }
        }
        if (B.length() == 4){
            for (int i = Ds; i < 20; i++) {
                A[filas][i] = B.substring(sub, sub+1).toUpperCase() + " ";
                sub = sub + 1;
                if (sub == 4) {
                    break;
                }
            }
        }
        if (B.length() == 5){
            for (int i = Qui; i < 20; i++) {
                A[filas][i] = B.substring(sub, sub+1).toUpperCase() +" ";
                sub = sub + 1 ;
                if (sub == 5){
                    break;
                }
            }
        }
    }

    public static void Relleno(String[][] A) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) { 
                    A[i][j] ="*";
            }
        }
    }
    public static void RellenoFinal(String[][] A){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (A[i][j].equals("*")){
                A[i][j] = Integer.toString((int)(Math.random()*10))+" ";
                }
            }
        }
    }
}
