import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Aeroporto {
    public static void main(String[] args) {
        // Informações sobre os voos
        String[] opcoesDeLocais = { "Roma - Itália", "Paris - França", "Buenos Aires - Argentina", "Vancouver - Canadá",
                "Las Vegas - E.U.A" };
        String[] modelosAvioes = { "Boeing 747", "Airbus A380", "Boeing 787", "Airbus A320", "Boeing 737" };
        String[] company = { "LATAM Airlines Group SA.", "Gol Transportes Aéreos.", "Azul Brazilian Airlines.", "Aerolineas Argentinas.", "Azul Brazilian Airlines." };
        String[] capacity = { "200", "250", "230", "300", "200" };
        String[] datasVoos = { "01/05/2024", "15/05/2024", "20/05/2024", "25/05/2024", "30/05/2024" };
        int[] fileiras = { 30, 40, 35, 20, 25 };
        float[] valoresPassagens = { 500.0f, 600.0f, 550.0f, 400.0f, 450.0f };

        // Exibindo as opções de avião para o usuário
        System.out.println("Escolha para onde deseja viajar:\n");

        for (int i = 0; i < opcoesDeLocais.length; i++) {
            System.out.println((i + 1) + ". " + opcoesDeLocais[i]);
        }

        System.out.print("\nDigite o número correspondente à opção desejada: ");

        // Obtendo a escolha do usuário
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();
        scanner.nextLine();

        // Verificando se a escolha está dentro do intervalo válido
        if (escolha >= 1 && escolha <= opcoesDeLocais.length) {
            // Acessando as informações do voo escolhido pelo usuário
            String modeloAviao = modelosAvioes[escolha - 1];
            String com = company[escolha - 1];
            String cap = capacity[escolha - 1];
            String dataVoo = datasVoos[escolha - 1];
            int fileirasDisponiveis = fileiras[escolha - 1];
            float valorPassagem = valoresPassagens[escolha - 1];

            // Imprimindo as informações do voo escolhido pelo usuário
            System.out.println("\nVocê escolheu o voo para " + opcoesDeLocais[escolha - 1] + ":\n");
            System.out.println("Empresa Aérea: " + com);
            System.out.println("Capacidade do voo: " + cap);
            System.out.println("Modelo do Avião: " + modeloAviao);
            System.out.println("Data do Voo: " + dataVoo);
            System.out.println("Fileiras Disponíveis: " + fileirasDisponiveis);
            System.out.println("Valor da Passagem: " + valorPassagem);

            // Perguntando se o usuário deseja comprar a passagem
            System.out.println("\nVocê deseja comprar a passagem?\n");
            System.out.println("1. Comprar a passagem");
            System.out.println("2. Voltar ao menu\n");

            int comprarPassagem = scanner.nextInt();
            if (comprarPassagem == 1) {
                System.out.println("\nVocê escolheu a opção para comprar a passagem.");

                // Coletando dados pessoais do passageiro
                System.out.println("\nInsira seus dados pessoais para finalizar a compra:\n");
                Passageiro passageiro = criarPassageiro(scanner);

                // Imprimindo os dados pessoais do passageiro
                System.out.println("\nDados pessoais inseridos:");
                System.out.println("Nome: " + passageiro.getNome());
                System.out.println("CPF: " + passageiro.getCpf());
                System.out.println("Endereço: " + passageiro.getEndereco());
                System.out.println("Data de Nascimento: " + passageiro.getDataDeNascimento());

                System.out.println("\nPassagem comprada com sucesso.");
            } else if (comprarPassagem == 2) {
                // Retorna ao menu principal
                main(args);
            } else {
                System.out.println("Opção inválida.");
            }

        } else {
            System.out.println("Opção inválida.");
        }

        // Fechando o scanner
        scanner.close();
    }

    // Método para criar um passageiro com base nos dados inseridos pelo usuário
    private static Passageiro criarPassageiro(Scanner scanner) {
        System.out.println("Nome: ");
        String nome = scanner.nextLine(); // Consumindo a quebra de linha pendente
        nome = scanner.nextLine(); // Lendo o nome

        System.out.println("CPF: ");
        String cpf = scanner.nextLine();

        System.out.println("Endereço completo: ");
        String endereco = scanner.nextLine();

        System.out.println("Data de Nascimento (formato dd/mm/aaaa): ");
        String dataString = scanner.nextLine();

        // Converter a string da data para o formato Date
        Date dataDeNascimento = null;
        try {
            dataDeNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return new Passageiro(nome, cpf, endereco, dataDeNascimento);
    }
}
