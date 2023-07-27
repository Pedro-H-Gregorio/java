import java.util.Arrays;
import java.util.Scanner;

public class Quest1080_2 {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\n")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.stream(numbers).max().getAsInt());
        System.out.println(Arrays.binarySearch(numbers,Arrays.stream(numbers).max().getAsInt()) + 1);
    }
}
