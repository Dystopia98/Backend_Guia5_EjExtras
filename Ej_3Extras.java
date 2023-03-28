/*
Crear una función que rellene un vector con números aleatorios, pasándole un arreglo por parámetro.
Después haremos otra función o procedimiento que imprima el vector.
 */
public class Ej_3Extras {

    public static void main(String[] args) {
        int[] V = new int[5];
        Relleno(V);
        Imprimir(V);
    }

    public static int[] Relleno(int[] A) {
        for (int i = 0; i < 5; i++) {
            A[i] = (int) (Math.random() * 10) + 1;
        }
        return A;
    }

    public static void Imprimir(int[] A) {
        for (int i = 0; i < 5; i++) {
            if ( i < 4){
                System.out.print(A[i]+"; ");
            } else
                System.out.print(A[i]+"");
        }
        System.out.println("");
    }
}
