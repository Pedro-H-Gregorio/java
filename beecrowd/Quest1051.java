import java.util.Scanner;

public class Quest1051 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Double income = scanner.nextDouble();
        Integer[] variation = new Integer[]{2000, 1000, 1500,0};
        Integer[] tax = new Integer[]{0,8,18,28};
        Double income_tax = (double) 0;

        for(int i = 0; i<4 ; i++){
            if(income <= 0){
                break;
            }

            income_tax += ((income > variation[i] && variation[i] != 0 ? variation[i] : income) * ((double) tax[i] /100));
            income -= variation[i];
        }

        System.out.printf(income_tax == 0? "Isento\n": "R$ %.2f\n",income_tax);
    }
}
