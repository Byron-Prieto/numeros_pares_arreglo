package co.edu.uniquindio.poo;

// Ejercicio #3: Contar números pares en un arreglo usando divide y vencerás

public class Arreglo {

     public static int contarPares(int[] arreglo) {
        return contarParesRecursivo(arreglo, 0, arreglo.length - 1);
    }

    // Método recursivo usando divide y vencerás
    private static int contarParesRecursivo(int[] arreglo, int inicio, int fin) {
        if (inicio > fin) {
            return 0;
        }
        if (inicio == fin) {
            return arreglo[inicio] % 2 == 0 ? 1 : 0;
        }
        int medio = (inicio + fin) / 2;
        int izquierda = contarParesRecursivo(arreglo, inicio, medio);
        int derecha = contarParesRecursivo(arreglo, medio + 1, fin);
        return izquierda + derecha;
    }
    
}
