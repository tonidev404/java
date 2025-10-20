package algoritmos;

public class Burbuja {
    public static void main(String[] args) {
        // El algoritmo burbuja sirve para ordenar un array que podamos tener
        // En este caso nuestro array es el siguiente
        int[] arrayNumeros = {1,54,67,2,7,9,0,-1};
        
        //Primero tenemos que hacer un bucle que recorra el array entero, y el límite esté en su longitud
        for(int i = 0; i < arrayNumeros.length;i++){
            //Ahora haremos otro for que recorra el siguiente elemento al anterior
            for(int j = i+1; j < arrayNumeros.length; j++){
                // Por último comprobaremos si el valor de i es mayor que el de j
                if(arrayNumeros[i]>arrayNumeros[j]){
                    // en caso de que i sea mayor significa que el anterior elemento al actual
                    // es mayor que el actual

                    // almacenaremos el elemento mayor a una variable auxiliar
                    int aux = arrayNumeros[i];
                    // en la posición del menor almacenaremos el mayor
                    arrayNumeros[i] = arrayNumeros[j];
                    // y en la posición del mayor asignaremos el menor número
                    arrayNumeros[j] = aux;
                }
            }
        }
            
        System.out.println("------------------------");
        for(int i = 0; i < arrayNumeros.length; i++){
            System.out.println(arrayNumeros[i]);
        }
    }
}
