/*
Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
 */
public class Ej_5Extras {

    public static void main(String[] args) {
        int suma = 0 , N = (int)(Math.random()*5)+2 , M = (int) (Math.random()*5)+2 ;
        int[][]Matriz = new int[N][M];
        Relleno(Matriz, N, M);
        System.out.println("La suma total de los elementos es : "+ Suma(Matriz, N, M));
    }
    public static void Relleno(int[][] A , int B , int C){
        for (int i = 0; i < B; i++) {
            for (int j = 0; j < C; j++) {
                A[i][j] = (int)(Math.random()*10);
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static int Suma(int[][] A, int B, int C){
        int S = 0 ;
        for (int i = 0; i < B; i++) {
            for (int j = 0; j < C; j++) {
                S = S + A[i][j];
            }
        }
        return S ;
    }
}
