public class Task1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int i = 0;

        if ((n > 0) & (m > 0)) {
            do {
                System.out.print((i % n) + 1);
                i = i + (m - 1);
            } while ((i % n) != 0);
        }
    }
}
