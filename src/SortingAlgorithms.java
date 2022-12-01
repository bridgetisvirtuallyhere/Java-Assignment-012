import java.util.Random;

/*
@author Bridget Acosta
@date 12/1/2022
 */
//This is as far as I got with the deck
public class SortingAlgorithms {


    //Implement in class **SortingAlgorithms** a method called **selectionSort**
    public static void shuffle(int card[], int n) {

        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            // Random for remaining positions.
            int r = i + rand.nextInt(52 - i);

            int temp = card[r];
            card[r] = card[i];
            card[i] = temp;
        }
    }

        /*public int findTheLowest ( int[] array, int idx){

            int min = idx;

            for (int i = idx + 1; i < array.length; i++) {
                if (array[min] > array[i]) {
                    min = i;
                }
            }
            return min;
        }

        public void selectionSort ( int[] array){
            for (int i = 0; i < array.length; i++) {
                int min = findTheLowest(array, i);
                swap(array, i, min);
            }
        }

        // swap the ith card and the lowest card found
        public void swap ( int[] array, int i, int min){
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        } */

        public static void main (String[]args){

            int a[] = {0, 1, 2, 3, 4, 5, 6, 7, 8,
                    9, 10, 11, 12, 13, 14, 15,
                    16, 17, 18, 19, 20, 21, 22,
                    23, 24, 25, 26, 27, 28, 29,
                    30, 31, 32, 33, 34, 35, 36,
                    37, 38, 39, 40, 41, 42, 43,
                    44, 45, 46, 47, 48, 49, 50,
                    51};

            shuffle(a, 52);

            for (int i = 0; i < 52; i ++)
                System.out.print(a[i]+" ");
        }
    }

