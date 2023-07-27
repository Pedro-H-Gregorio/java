import java.util.Scanner;

public class Quest1117 {

    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double sum_notes = 0;
        int total = 0;
        while(total != 2){
            double note = scanner.nextDouble();
            if (note >= 0.0 && note <= 10.0){
                sum_notes += note;
                total++;
            } else {
                System.out.println("nota invalida");
            }
        }
        System.out.println(String.format("media = %.2f", sum_notes/2).replace(",","."));

    }
}
