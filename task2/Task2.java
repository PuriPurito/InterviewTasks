import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        FileReader file1 = new FileReader(args[0]);
        FileReader file2 = new FileReader(args[1]);
        Scanner scan1 = new Scanner(file1);
        Scanner scan2 = new Scanner(file2);
        float point_x;
        float point_y;
        float result;

        float x = scan1.nextFloat();
        float y = scan1.nextFloat();
        int r = scan1.nextInt();
        file1.close();

        while (scan2.hasNextLine()) {
            try {
                point_x = scan2.nextFloat();
                point_y = scan2.nextFloat();
                result = (point_x - x) * (point_x - x) + (point_y - y) * (point_y - y);
                if (result == r * r)
                    System.out.println(0);
                else if (result < r * r)
                    System.out.println(1);
                else
                    System.out.println(2);
            } catch (InputMismatchException e) {
                // проверка на правильный float
            }
        }
        file2.close();
    }
}
