package lavaCar;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();
        List<Funcionario> funcionarios = new ArrayList<>();


        clientes.add(new Cliente("Salion", 23, "Ford Ka"));
        clientes.add(new Cliente("Ana", 20, "Fiat Argo"));
        funcionarios.add(new Funcionario("Andre", 40, "Lavador"));
        funcionarios.add(new Funcionario("Cleiton", 35, "Gerente"));

        while (true) {
            System.out.println("=== Menu Lava Car ===");
            System.out.println("1. Listar Clientes");
            System.out.println("2. Listar Funcionários");
            System.out.println("3. Adicionar Cliente");
            System.out.println("4. Adicionar Funcionário");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Clientes:");
                    for (Cliente cliente : clientes) {
                        System.out.println(cliente);
                    }
                    break;
                case 2:
                    System.out.println("Funcionários:");
                    for (Funcionario funcionario : funcionarios) {
                        System.out.println(funcionario);
                    }
                    break;
                case 3:
                    System.out.print("Nome do Cliente: ");
                    String nomeCliente = scanner.nextLine();
                    System.out.print("Idade do Cliente: ");
                    int idadeCliente = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Carro do Cliente: ");
                    String carroCliente = scanner.nextLine();
                    clientes.add(new Cliente(nomeCliente, idadeCliente, carroCliente));
                    break;
                case 4:
                    System.out.print("Nome do Funcionário: ");
                    String nomeFuncionario = scanner.nextLine();
                    System.out.print("Idade do Funcionário: ");
                    int idadeFuncionario = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Cargo do Funcionário: ");
                    String cargoFuncionario = scanner.nextLine();
                    funcionarios.add(new Funcionario(nomeFuncionario, idadeFuncionario, cargoFuncionario));
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
