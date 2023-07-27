import java.util.Scanner;

public class Quest1067 {

    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int range_fin = scanner.nextInt();

        for(Integer i = 1; i<= range_fin; i = i +2){
            System.out.println(i);
        }
    }
}
