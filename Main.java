import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Selecione seu compo");
        System.out.println("1. Combo Master");
        System.out.println("2. Super Combo");
        System.out.print("Sua escolha: ");

        Scanner input = new Scanner(System.in);

        int tipo = input.nextInt();
        Combo combo = new Combo();
        if (tipo == 1) {
            Combo combo = combo.criarComboMaster();
            System.out.println(combo.getDescricao() + " - Preço: R$" + combo.getPreco());
        } else if (tipo == 2) {
            Combo combo = combo.criarSuperCombo();
            System.out.println(combo.getDescricao() + " - Preço: R$" + combo.getPreco());
        } else {
            System.out.println("Opção inválida!");
        }
        System.out.println(combo);
    }
}
