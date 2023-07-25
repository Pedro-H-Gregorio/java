import java.util.Scanner;

public class Quest1060 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        for(int i = 0; i<= 5; i++){
            Double number = scanner.nextDouble();

            if(number >= 0){
                count++;
            }
        }

        scanner.close();
        System.out.printf("%d valores positivos\n",count);
    }
}
