import java.util.Scanner;

public class Quest1075 {
    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int divider = scanner.nextInt();

        for(int i = 1; i <= 10000; i++){
            if(i%divider == 2){
                System.out.println(i);
            }
        }
    }
}
