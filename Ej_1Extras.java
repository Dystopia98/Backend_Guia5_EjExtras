
import java.util.Scanner;

/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, con
los valores ingresados por el usuario.
*/
public class Ej_1Extras {
    public static void main(String[] args) {
        int S = 0 , N = (int)(Math.random()*5)+2;
        int[] V = new int[N];
        for (int i = 0; i < N; i++) {
            Relleno(V,i);
        }
        for (int i = 0; i < N; i++) {
            S = S + V[i];
        }
        System.out.println("La suma total es :");
        System.out.println(S);
    }
    public static int[] Relleno(int[] A , int B){
        Scanner leer = new Scanner(System.in);
        A[B] = leer.nextInt();
        return A ;
    }
}
