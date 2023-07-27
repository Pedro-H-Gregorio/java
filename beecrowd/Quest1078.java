import java.util.Scanner;

public class Quest1078 {
    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int divider = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d\n",i,divider,i*divider);
        }
    }
}
