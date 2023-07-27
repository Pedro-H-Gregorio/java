import java.util.Scanner;

public class Quest1071 {

    static public void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int value_max = scanner.nextInt(), value_min = scanner.nextInt(), count = 0;

        for(int i = value_min%2 == 0? value_min + 1 : value_min + 2; i < value_max; i += 2){
            count+=i;
        }
        System.out.println(count);
    }
}
