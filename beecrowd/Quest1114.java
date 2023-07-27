import java.util.Scanner;

public class Quest1114 {
    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int password = 0;
        while(password != 2002){
            password = scanner.nextInt();
            if (password == 2002){
                System.out.println("Acesso Permitido");
            } else {
                System.out.println("Senha Invalida");
            }
        }
    }
}
