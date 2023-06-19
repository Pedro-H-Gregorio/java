import java.io.IOException;
import java.util.Scanner;

public class Quest1001{
 
  public static void main(String[] args) throws IOException {
    Scanner entrada = new Scanner(System.in);
    Integer x = entrada.nextInt(), y = entrada.nextInt();
    entrada.close();
    System.out.printf("X = %d\n",x+y);
    };
 
};