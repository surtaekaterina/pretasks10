import java.lang.Math;

public class MainRevertedArray {
    public static void main(String[] args) {

        int[] mas = new int[10];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10);

        }

        printMas(mas);
        int[] reverted = revertedMas(mas);
        System.out.println();
        printMas(reverted);


    }

    public static void printMas(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static int[] revertedMas(int[] array) {
        int[] reverted = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverted[array.length - i - 1] = array[i];
        }
        return reverted;
    }


}
