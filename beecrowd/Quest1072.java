import java.util.Arrays;
import java.util.Scanner;

public class Quest1072 {

    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int repeat_turn = scanner.nextInt(), in = 0;

        for(int i = 1; i <= repeat_turn; i++){
            in += Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20).contains(scanner.nextInt()) ? 1 : 0;
        }
        System.out.printf("%d in\n%d out\n",in,repeat_turn - in);
    }
}
