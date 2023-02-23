package Actividad4_5;

import java.util.Arrays;

public class Actividad4_5 {
    public static void main(String[] args) {
        /**
         * 1. Un método que recibe un array de enteros, un elemento entero y una posición. Devuelve otro array que será una
         * copia del array de entrada pero insertando un nuevo elemento (el indicado en los parámetros) en la posición
         * indicada. Ahora sobrecarga el método para que reciba en lugar de un elemento entero un elemento que sea otro
         * array de enteros. Habrá que insertar los elementos de este array empezando desde la posición.
         **/

        int[] a = new int[5];

        a[0] = 4;
        a[1] = 54;
        a[2] = 77;
        a[3] = 91;
        a[4] = 23;
        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.toString(insercionArray(a, 33, 4 )));

        int[] b = new int[5];

        b[0] = 0;
        b[1] = 84;
        b[2] = 25;
        b[3] = 75;
        b[4] = 82;
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(insertarArray(b, 33, 4 )));


        /**
         *Un método que recibe un array de enteros, un elemento entero y un booleano. Devuevle un nuevo array que será
         * una copia del array de entrada pero eliminado el elemento si existe. Para ello deberá de buscarlo
         * previamente. La eliminación podrá ser lógica o física, esto es, si el boleano es true, se hará el borrado
         * lógico, con lo que se pondrá el valor del elemento en el array a 0, mientras que si el boleano es false,
         * se hará borrado físico, eliminado el elemento del array quedando el array con una posición menos.
         */

        int[] c = new int[5];

        c[0] = 3;
        c[1] = 4;
        c[2] = 2;
        c[3] = 7;
        c[4] = 12;
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(eliminacionElemento(c,4,false)));
        System.out.println(Arrays.toString(eliminacionElemento(c,4,true)));

        /**
         *3. Un método que reciba un array de enteros como parámetro de entrada y salida, de modo que intercambie todas
         *  las posiciones pares por las impares.
         */

        int[] d = new int[5];

        d[0] = 3;
        d[1] = 1;
        d[2] = 15;
        d[3] = 34;
        d[4] = 99;
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(intercambioPosicionParImpar(d)));

    }

    private static int[] insercionArray(int[] a, int dato, int posicion) {
        int [] salida = new int[a.length+1];
        System.arraycopy(a, 0, salida, 0, posicion);
        salida[posicion]=dato;
        System.arraycopy(a, posicion, salida, posicion+1, a.length-posicion);
        return salida;
    }
    private static int[] insertarArray(int[] b, int dato, int posicion) {
        int [] salida = new int[b.length+1];
        System.arraycopy(b, 0, salida, 0, posicion);
        salida[posicion]=dato;
        System.arraycopy(b, posicion, salida, posicion+1, b.length-posicion);
        return salida;

    }

    static int[] eliminacionElemento(int[] c,int borrar, boolean borrado){
        if (borrado == true){
            for (int i = 0; i < c.length; i++){
                if (c[i] == borrar){
                    c[i] = 0;

                }
            }
            return c;
        } else if (borrado==false){
            int[]copiaArray=new int[c.length-1];
            int posicion=0;
            for (int i = 0; i < c.length; i++) {
                if(c[i]==borrar){
                    posicion=i;
                    break;
                }
            }
            System.arraycopy(c,0,copiaArray,0,posicion);
            System.arraycopy(c,posicion+1,copiaArray,posicion,(c.length-posicion-1));
            return copiaArray;
        }

        return c;
    }

    static int[] intercambioPosicionParImpar (int[] d){
        for (int i = 0; i < d.length; i++) {
            if(i%2==0 && i+1 < d.length){
                int aux=0;
                aux=d[i];
                d[i]=d[i+1];
                d[i+1]=aux;
            }
        }
        return d;
    }
}
