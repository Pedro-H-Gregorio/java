import java.util.Scanner;

public class Quest1079 {
    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int range_fin = scanner.nextInt();

        for(int i = 1; i <= range_fin; i++){
            System.out.printf("%.1f\n",(scanner.nextDouble()* 2 + scanner.nextDouble() * 3 + scanner.nextDouble() * 5)/10);
        }
    }
}
