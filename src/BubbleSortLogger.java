import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/* Реализуйте алгоритм сортировки пузырьком числового массива,
результат после каждой итерации запишите в лог-файл. */

public class BubbleSortLogger {
    private static final Logger logger = Logger.getLogger(BubbleSortLogger.class.getName());

    public static void main(String[] args) {
        int[] inputArray = new int[5];
        fillArrayInt(inputArray, 9);
        System.out.println(Arrays.toString(inputArray));
        System.out.println();

        FileHandler fh;
        try {
            fh = new FileHandler("log.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        bubbleSort(inputArray);
    }

    private static void fillArrayInt(int[] inArray, int max) {
        Random num = new Random();
        for (int i = 0; i < inArray.length; i++) {
            inArray[i] = num.nextInt(max) + 1;
        }
    }

    private static void bubbleSort(int[] inArray) {
        for (int i = inArray.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (inArray[j] > inArray[j + 1]) {
                    int temp = inArray[j + 1];
                    inArray[j + 1] = inArray[j];
                    inArray[j] = temp;
                }
            }
            logger.info(Arrays.toString(inArray));
        }
    }
}

