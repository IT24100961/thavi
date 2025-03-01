import java.util.Scanner;
public class insertion {
    public static void insertionsort(int[] arr) {
        int n = arr.length;

        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j - 1;


            while (i >= 0 && arr[i] < key) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }

            arr[i + 1] = key;
        }}
            public static void main (String[]args){

                Scanner input = new Scanner(System.in);
                System.out.println("Enter the number elements");
               int n = input.nextInt();

                int[] arr = new int[n];
                System.out.println("Enter the elements: ");
                for (int j = 0; j < n; j++) {
                    arr[j] = input.nextInt();
                }

                System.out.print("Original Array: ");
                for (int j = 0; j < n; j++) {
                    System.out.println(arr[j] + " ");
                }

                System.out.println();
                insertionsort(arr);
                System.out.println("sorted array in assending order: ");
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
                input.close();
            }

        }

