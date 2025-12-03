import java.util.Scanner;

public class AppFolhaPagamento {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("CALCULADORA DE TRIBUTAMENTO");
        
        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();
        
        System.out.println("Digite o CPF: ");
        String cpf = sc.nextLine();
        
        System.out.println("Digite o salário bruto: ");
        double salarioBruto = sc.nextDouble();

        System.out.println("Selecione o tipo de contribuinte");
        System.out.println("1 = Funcionário CLT");
        System.out.println("2 = Estagiário");
        System.out.println("3 = Prestador de serviço");
        int tipo = sc.nextInt();

        Contribuinte c = null;

        switch(tipo){
            case 1:
                c = new FuncionarioCLT(nome, cpf, salarioBruto);
                break;
            case 2:
                c = new Estagiario(nome, cpf, salarioBruto);
                break;
            case 3:
                c = new PrestadorServico(nome, cpf, salarioBruto);
                break;
            default:
                System.out.println("opção invalida");
                System.exit(0);
        }

        System.out.println();
        c.exibirResumo();

        sc.close();
    }
}
