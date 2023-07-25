import java.util.Scanner;

public class Quest1066 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        Double sum_num = (double) 0;

        for(int i = 0; i<= 5; i++){
            Double number = scanner.nextDouble();

            if(number >= 0){
                count++;
                sum_num += number;
            }
        }

        scanner.close();
        System.out.printf("%d valores positivos\n",count);
        System.out.printf("%.1f\n",sum_num/count);
    }
}
