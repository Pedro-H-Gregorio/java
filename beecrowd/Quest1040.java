import java.util.Arrays;
import java.util.Scanner;

public class Quest1040 {

    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        double[] grades = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        double avarage = (grades[0] * 2 + grades[1] * 3 + grades[2] * 4 + grades[3] * 1) / 10;
        System.out.printf("Media: %.1f\n",avarage - 0.01);

        if(avarage >= 7){
            System.out.println("Aluno aprovado.");
        } else if (avarage >=5) {
            System.out.println("Aluno em exame.");
            double rec_avarage = scanner.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", rec_avarage);

            if(((rec_avarage + avarage) / 2) >= 5 ){
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f\n", (rec_avarage + avarage) / 2 );
        } else {
            System.out.println("Aluno reprovado.");
        }

        scanner.close();
    }
}