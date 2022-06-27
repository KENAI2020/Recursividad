import java.util.Vector;

public class Ejercicios {
    public static int factorial(int n){
        int factorial;

        if(n == 1){
            factorial = n;

        } else {
            factorial = n * factorial(n - 1);
        }

        return factorial;
    }

   // maximo comun divisor (mcd), algoritmo de Euclides
    //  a = 412 y b = 184
    public static int mcd(int a, int b){
        int mcd;

        if ( a == b ){
         mcd = b;

        } else {
           if (a > b){
               a = a -b;
           } else {
               b = b -a;
           }

           mcd = mcd(a, b);
        }
        return mcd;
    }

    public static int sumaVector(int[] vector, int indice){
        int suma ;

       if(indice == vector.length - 1){
           suma = vector[indice];
       } else {
           suma = vector[indice] + sumaVector(vector, indice + 1);
        }
        return suma;
    }

    private static String invertirCadena(String cadena, int indice){
        String inversa;

        if (indice == 0){
            inversa = String.valueOf(cadena.charAt(indice));

        } else {
            inversa = String.valueOf(cadena.charAt(indice)) + invertirCadena(cadena, indice - 1);

        }
        return inversa;
    }


    public static String invertirCadena(String cadena){
        return invertirCadena(cadena, cadena.length() - 1);
    }
}


