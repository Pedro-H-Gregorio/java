import java.util.Scanner;

public class Quest1048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double salary = scanner.nextDouble();
        Double[] variation = new Double[]{0.00,400.00, 800.00, 1200.00, 2000.00, 0.00};
        Integer[] percentage = new Integer[]{15, 12, 10, 7, 4};
        Double new_salary = (double) 0;
        Integer percentage_add = 0;
        Double readjustment = (double) 0;

        for(Integer i = 0; i<=4; i++){
            if(salary>variation[i] && variation[i] != 0 && salary<=variation[i++]){
                percentage_add = percentage[i];
                readjustment = (salary * percentage_add/100);
                new_salary = salary + readjustment;
            } else if (variation[++i] == 0.00 ) {
                percentage_add = percentage[i];
                readjustment = (salary * (4/100));
                new_salary = salary + readjustment;
                break;
            }
        }

        System.out.printf("Novo salario: %.2f\n" + "Reajuste ganho: %.2f\n"+ "Em percentual: %d %%",new_salary,readjustment,percentage_add);

    }
}
