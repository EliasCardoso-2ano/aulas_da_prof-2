import java.util.Scanner;

public class execicio_4 {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        String nome;
        System.out.println("Digite o seu nome: ");
        nome = LER.nextLine();

        int N = 0;
        System.out.println("Digite quantas vezes que irá se repetir o nome:");
        N = LER.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println(nome);
        }








    }
}
