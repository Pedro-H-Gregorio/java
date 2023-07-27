import java.util.Scanner;

public class Quest1073 {

    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int range_fin = scanner.nextInt();

        for(int i = 2; i<= range_fin; i+=2){
            System.out.printf("%d^2 = %d\n",i,i*i);
        }
    }
}
