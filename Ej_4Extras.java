
import java.util.Scanner;

/*
Los profesores del curso de programación de Egg necesitan llevar un 
registro de las notas adquiridas por sus 10 alumnos para luego 
obtener una cantidad de aprobados y desaprobados.
Durante el período de cursado cada alumno obtiene 4 notas,
2 por trabajos prácticos evaluativos y 2 por parciales.
     Las ponderaciones de cada nota son:
 - Primer trabajo práctico evaluativo 10%
 - Segundo trabajo práctico evaluativo 15%
 - Primer Integrador 25%
 - Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del programa
los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados, teniendo en 
cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.
 */
public class Ej_4Extras {

    public static void main(String[] args) {
        int[][] A = new int[10][5];
        int Desaprobados = 0, Aprobados = 0;
        System.out.println("Notas de l@s alumn@s , en el siguiente orden.");
        System.out.println("-(10%)Primer trabajo práctico evaluativo.");
        System.out.println("-(15%)Segundo trabajo práctico evaluativo.");
        System.out.println("-(25%)Primer integrador.");
        System.out.println("-(50%)Segundo integrador.");
        Notas(A);
        for (int i = 0; i < 10; i++) {
            A[i][4] = (int)((A[i][0]*0.10) + (A[i][1]*0.15) + (A[i][2]*0.25) + (A[i][3]*0.50));
            if (A[i][4] >= 7) {
                Aprobados = Aprobados + 1;
            } else {
                Desaprobados = Desaprobados + 1;
            }
        }
        System.out.println("Total aprobados : " + Aprobados);
        System.out.println("Total desaprobados : " + Desaprobados);
        for (int i = 0; i < 10; i++) {
            System.out.println("Promedio alumn@ n°"+ i +" : "+ A[i][4]);
        }
    }

    public static int[][] Notas(int[][] A) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Notas de alumn@ n°" + (i + 1));
            for (int j = 0; j < 4; j++) {
                A[i][j] = leer.nextInt();
                if (A[i][j] < 0 || A[i][j] > 10) {
                    do {
                        A[i][j] = leer.nextInt();
                    } while (A[i][j] < 0 && A[i][j] > 10);
                }
            }
        }
        return A;
    }
}
