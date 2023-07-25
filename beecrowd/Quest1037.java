import java.util.Scanner;

public class Quest1037 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Double position = scanner.nextDouble();
        scanner.close();

        if(position >= 0 && position <= 25){
            System.out.println("Intervalo [0,25]");
        } else if (position > 25 && position <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (position > 50 && position <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (position > 75 && position <= 100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
    }
}
