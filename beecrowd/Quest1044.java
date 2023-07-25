import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Quest1044 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] values = Arrays.stream(Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray()).sorted().toArray();

        scanner.close();
        System.out.println(values[1] % values[0] == 0 ? "Sao Multiplos" : "Nao sao Multiplos");

    }
}
