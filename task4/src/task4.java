import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader(args[0]);
        Scanner scan = new Scanner(file);
        ArrayList<Integer> nums = new ArrayList<>();
        int moves = 0;

        while (scan.hasNextInt()) {
            nums.add(scan.nextInt());
        }
        Collections.sort(nums);
        int median = nums.get(nums.size()/2);
        for (int num : nums) {
            moves = moves + Math.abs(num - median);
        }
        System.out.println(moves);
        file.close();
    }
}