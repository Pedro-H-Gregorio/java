import java.util.Scanner;

public class Quest1080 {

    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int bigger = 0, position = 0;

        for(int i = 1; i<=3; i++){

            int number = scanner.nextInt();
            if(number > bigger){
                bigger = number;
                position = i;
            }
        }
        System.out.println(bigger);
        System.out.println(position);
    }
}
