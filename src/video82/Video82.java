/*
    Insertar un numero en un arreglo ordenado
    */
package video82;

import java.util.Scanner;

/**
 *
 * @author Carolina EM
 */
public class Video82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente=true;
        int numero,sitio_num = 0,j=0;
        
        System.out.println("Llenar el arreglo");
        do {
            //Llenando el arreglo
            for (int i=0;i<5;i++){
                System.out.print((i+1)+". Digite un numero");
                arreglo[i]= teclado.nextInt();
            }
            
            // Comprobar si el arreglo está ordenado en forma creciente
            for (int i=0;i<4;i++){
                if(arreglo[i] < arreglo[i+1]){
                    creciente=true;
                }
                if (arreglo[i]> arreglo[i+1]){
                    creciente=false;
                    break;
                }
            }
            
            if (creciente==false){
                System.out.println("\nEl arreglo no está ordenado en forma creciente, vuelva a digitar\n");
            }
        
        }
        while(creciente == false);
        
        System.out.print("\nDigite un numero a insertar: ");
        numero = teclado.nextInt();
        
        // Esto es para darnos cuenta en que posicion va el numero
        while(arreglo[j]<numero && j<5){
            sitio_num++;
            j++;
        }
        
        // Trasladamos una posicion en el arreglo a los elementos que van detras de numero
        for (int i=4;i>sitio_num;i--){
            arreglo[i+1]=arreglo[i];
        }
        
        // Insertamos el numero que el usuario puso
        arreglo[sitio_num] = numero;
        
        System.out.print("\nEl arreglo queda");
        for (int i=0;i<6;i++){
            System.out.print(arreglo[i]+" - ");
            
        }
        System.out.println();
        
        
    }
        
    }
    

