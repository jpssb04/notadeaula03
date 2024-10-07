import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cachorro cachorroA = new Cachorro();
        Gato gatoA = new Gato();

        System.out.println("Digite o nome do Cachorro A: ");
        cachorroA.setNome(sc.nextLine());
        System.out.println("O nome do Cachorro A é: " + cachorroA.getNome());

        System.out.println("Digite o nome do Gato A: ");
        gatoA.setNome(sc.nextLine());
        System.out.println("O nome do Gato A é: " + gatoA.getNome());

        Cachorro cachorroB = new Cachorro("Biscoito");
        Gato gatoB = new Gato("Cotton");

        System.out.println("O nome do Cachorro B é: " + cachorroB.getNome());
        System.out.println("O nome do Gato B é: " + gatoB.getNome());

        System.out.print("O cachorro A está: ");
        cachorroA.caminha();
        System.out.print("O cachorro B está: ");
        cachorroB.late();
        System.out.print("O gato A está: ");
        gatoA.caminha();
        System.out.print("O gato B está: ");
        gatoB.mia();
    }
}