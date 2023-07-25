import java.io.IOException;
import java.util.Scanner;

public class Quest1018 {

    public static void main (String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        Integer value_notes = scanner.nextInt();
        scanner.close();
        Integer[] notes = new Integer[]{100,50,20,10,5,2,1};
        System.out.println(value_notes);
        for ( Integer note : notes){
            Integer amount_times = Math.abs(value_notes / note);
            value_notes -=  amount_times * note;
            System.out.printf("%d nota(s) de R$ %d,00\n",amount_times,note);
        }
    }
}
