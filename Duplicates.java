import java.util.Random;
public class Duplicates {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[15];
        for (int i = 0; i < array1.length; i++) {
            Random rand = new Random();
            int num = rand.nextInt(100) + 1;
            array1[i] = num;
            System.out.print(num + ",");
        }
        System.out.println(" ");
        for (int i = 0; i < array2.length; i++) {
            Random rand = new Random();
            int num = rand.nextInt(50) + 1;
            array2[i] = num;
            System.out.print(num + ",");
        }
        System.out.println(" ");
        System.out.print("The duplicate values are:");
        for (int i = 1; i < array1.length; i++) {
            for (int j = 1; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i] + ",");

                }
            }
        }
    }
    }

