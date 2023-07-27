import java.util.Scanner;

public class Quest1113 {
    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number_1 = 1, number_2 = 0;
        while(number_1 != number_2){
            number_1 = scanner.nextInt();
            number_2 = scanner.nextInt();
            if (number_1 > number_2){
                System.out.println("Decrescente");
            } else if (number_2 > number_1) {
                System.out.println("Crescente");
            }
        }

    }
}
