
import java.util.Scanner;

public class exercicio_3 {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        String nome;
        System.out.println("Digite o nome que irá ser repetido 10 vezes ");
        nome = LER.nextLine();

        for (int i = 0; i < 10 - 1; i++) {
            System.out.println(nome);
        }




    }
}
