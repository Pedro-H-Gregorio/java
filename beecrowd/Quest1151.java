import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Quest1151 {
    static public ArrayList<Integer> fibonnati(int quantity){
        ArrayList<Integer> sequence = new ArrayList<>();
        sequence.add(0);
        sequence.add(1);
        for(int i = 1; i<=quantity - 2;i++){
            sequence.add(sequence.get(sequence.size() - 1) + sequence.get(sequence.size() -2));
        }
        return sequence;
    }

    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        System.out.println(String.join(" ", Arrays.toString(fibonnati(quantity).toArray())).replaceAll("[\\[,\\]]",""));
    }
}
