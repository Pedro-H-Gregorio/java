import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Quest1045 {

     static String check_side(double[] sides){
         if(Arrays.stream(sides).distinct().toArray().length == 1){
             return "TRIANGULO EQUILATERO";
         } else if (Arrays.stream(sides).distinct().toArray().length == 2) {
             return "TRIANGULO ISOSCELES";
         }
         return null;
     }

    static String check_angle(double[] angles){
         Double result = Math.pow(angles[1],2) + Math.pow(angles[2],2);
         if(Math.pow(angles[0],2) == result){
             return "TRIANGULO RETANGULO";
         } else if (Math.pow(angles[0],2) > result) {
             return "TRIANGULO OBTUSANGULO";
         } else {
             return "TRIANGULO ACUTANGULO";
         }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] sides = Arrays.stream(
                        Arrays.stream(
                                scanner.nextLine().split(" "))
                                .mapToDouble(Double::parseDouble)
                                .toArray())
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToDouble(Double::doubleValue)
                .toArray();

        if(sides[0]<sides[1] + sides[2]){
            System.out.println(check_angle(sides));
            if (check_side(sides) != null){
                System.out.println(check_side(sides));
            }
        }else{
            System.out.println("NAO FORMA TRIANGULO");
        }
    }

}