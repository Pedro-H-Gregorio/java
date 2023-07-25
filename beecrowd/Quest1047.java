import java.util.Arrays;
import java.util.Scanner;

public class Quest1047 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] all_time = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int min_final = all_time[3]-all_time[1];
        int hours_final = all_time[2]-all_time[0];

        if(all_time[3] == all_time[1] && all_time[2] == all_time[0]){
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        } else {
            if(min_final < 0){
                hours_final--;
                min_final += 60;
            }
            if(hours_final<0){
                hours_final += 24;
            }
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",hours_final, min_final);
        }
    }
}
