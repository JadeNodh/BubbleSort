/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ugc0223015;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class UGC0223015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[8];
        System.out.println("Enter 8 numbers to sort in ascending order:");
        for (int i = 0; i < 8; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        bubbleSort(numbers);

        // Print the sorted array
        System.out.println("Sorted array in descending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
    
    public static void bubbleSort(int[] arr){
         int n = arr.length;    
         int temp = 0;    
         for(int i=0; i < n; i++){    
            for(int j=1; j < (n-i); j++){    
                if(arr[j-1] > arr[j]){    
                    //swap elements    
                    temp = arr[j-1];    
                    arr[j-1] = arr[j];    
                    arr[j] = temp;    
                }          
            }    
        }
    }
    
     public static void bubbleSortDescending(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // Swap if the current element is smaller than the next element
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

     
     
    
}


