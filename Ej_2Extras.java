/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales 
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
 */
public class Ej_2Extras {
    public static void main(String[] args) {
        int N = (int)(Math.random()*4)+2;
        int[] V1 = new int[N];
        int[] V2 = new int[N];
        Relleno(V1,N);
        Relleno(V2,N);
        for (int i = 0; i < N; i++) {
            if(V1[i] == V2[i]){
                System.out.println("Vector 1["+ i +"] = Vector 2["+ i +"]");
            }
            if(V1[i] != V2[i]){
                System.out.println("Diferencia : Vector1["+i+"]/Vector2["+i+"]");
                break;
            }
        }
    }
    public static int[] Relleno(int[] A , int B){
        for (int i = 0; i < B; i++) {
            A[i] = (int)(Math.random()*10);
        }
        return A ;
    }
}
