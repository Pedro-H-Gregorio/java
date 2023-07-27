import java.util.Objects;
import java.util.Scanner;

public class Quest1131 {

        static public void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int gremio_victories = 0, inter_victories = 0, ties = 0;
            while(true){
                int  goal_inter = scanner.nextInt(), goal_gremio = scanner.nextInt();
                System.out.println("Novo grenal (1-sim 2-nao)");
                String choice = scanner.next();

                if(goal_inter>goal_gremio){
                    inter_victories++;
                } else if (goal_gremio>goal_inter) {
                    gremio_victories++;
                } else ties++;

                if (Objects.equals(choice, "2")){
                    break;
                }
            }
            System.out.printf("%d grenais\nInter:%d\nGremio:%d\nEmpates:%d\n",gremio_victories+inter_victories+ties,inter_victories,gremio_victories,ties);
            System.out.println(inter_victories>gremio_victories? "Inter venceu mais" : "Gremio venceu mais");
        }
}
