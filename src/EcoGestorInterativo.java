import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class EcoGestorInterativo {

    // --- CÓDIGOS DE CORES PARA ESTILIZAÇÃO (ANSI ESCAPE CODES) ---
    public static final String RESET = "\u001B[0m";
    public static final String NEGRITO = "\u001B[1m";
    public static final String VERDE = "\u001B[32m";
    public static final String VERMELHO = "\u001B[31m";
    public static final String AMARELO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String CIANO = "\u001B[36m";

    // Variáveis globais do Placar
    static double totalAreaSalva = 0;
    static double totalCO2Gerado = 0;
    static double totalDinheiroSalvo = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        mostrarCabecalho();

        while (opcao != 0) {
            System.out.println(CIANO + "\n=========================================================" + RESET);
            System.out.println(NEGRITO + " 🌍 MENU DE OPERAÇÕES CLIMÁTICAS" + RESET);
            System.out.println(CIANO + "=========================================================" + RESET);
            System.out.println(VERDE + " 1 🌳 Fiscalização Espacial (Satélites)" + RESET);
            System.out.println(VERMELHO + " 2 🏭 Auditoria de Big Techs (Pegada de Carbono)" + RESET);
            System.out.println(AMARELO + " 3 🚜 Gestão de Crise Agrícola (Clima e IA)" + RESET);
            System.out.println(" 0 🚪 Sair e Ver Relatório Final");
            System.out.print(NEGRITO + "\n➡️  Escolha sua missão (0 a 3): " + RESET);

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1: missaoFiscalizacao(scanner); break;
                    case 2: missaoAuditoria(scanner); break;
                    case 3: missaoAgricultura(scanner); break;
                    case 0: exibirRelatorioFinal(); break;
                    default: System.out.println(VERMELHO + "\n[Ops!] Escolha um número entre 0 e 3." + RESET);
                }
            } catch (InputMismatchException e) {
                System.out.println(VERMELHO + "\n[ERRO] Por favor, digite apenas números inteiros." + RESET);
                scanner.nextLine();
            }
        }
        scanner.close();
    }

    // --- ANIMAÇÃO DE CARREGAMENTO NO CONSOLE ---
    private static void animarProcessamento(String mensagem) {
        System.out.print(AZUL + NEGRITO + "\n[ " + mensagem);
        for (int i = 0; i < 4; i++) {
            try {
                Thread.sleep(600); // Espera 0.6 segundos por pontinho
                System.out.print(".");
            } catch (InterruptedException e) { }
        }
        System.out.println(" CONCLUÍDO ]" + RESET);
    }

    private static void mostrarCabecalho() {
        System.out.println(VERDE + NEGRITO + "  ______               _____           _             ");
        System.out.println(" |  ____|             / ____|         | |            ");
        System.out.println(" | |__   ___ ___ ____| |  __  ___  ___| |_ ___  _ __ ");
        System.out.println(" |  __| / __/ _ \\____| | |_ |/ _ \\/ __| __/ _ \\| '__|");
        System.out.println(" | |___| (_| (_) |   | |__| |  __/\\__ \\ || (_) | |   ");
        System.out.println(" |______\\___\\___/     \\_____|\\___||___/\\__\\___/|_|   " + RESET);
        System.out.println(CIANO + " Desenvolvido com base no estudo científico de IA e Clima." + RESET);
    }

    private static void missaoFiscalizacao(Scanner scanner) {
        System.out.println(VERDE + "\n--- 🚁 MISSÃO 1: FISCALIZAÇÃO ESPACIAL ---" + RESET);
        System.out.print("Quantos hectares sua equipe precisa patrulhar? ");
        double hectares = scanner.nextDouble();

        if (hectares <= 0) return;

        animarProcessamento("Cruzando dados de satélite e redes neurais");

        double reducao = hectares * 0.278;
        totalAreaSalva += reducao;

        System.out.printf(VERDE + ">> RESULTADO: A IA filtrou as áreas de baixo risco.\n");
        System.out.printf(">> ECONOMIA: %.0f hectares poupados de patrulha inútil!\n" + RESET, reducao);

        System.out.println(AMARELO + "\n🔍 TRANSPARÊNCIA: DE ONDE VEIO ISSO?" + RESET);
        System.out.printf(" ├─ Cálculo..: %.0f hectares * 27,8%% = %.0f hectares economizados.\n", hectares, reducao);
        System.out.println(" └─ Ciência..: Mataveli et al. (2022) provaram que o algoritmo Random Forest reduz a área de combate em 27,8%.");
    }

    private static void missaoAuditoria(Scanner scanner) {
        System.out.println(VERMELHO + "\n--- 🕵️ MISSÃO 2: AUDITORIA DE DATA CENTERS ---" + RESET);
        System.out.print("Quantos dias essa IA passou em treinamento ininterrupto? ");
        int dias = scanner.nextInt();

        if (dias <= 0) return;

        animarProcessamento("Auditando consumo de energia dos servidores");

        double carbonoBase = dias * 250;
        totalCO2Gerado += carbonoBase;

        System.out.printf(VERMELHO + ">> PEGADA DE CARBONO: %.2f kg de CO2 lançados na atmosfera.\n" + RESET, carbonoBase);

        System.out.println(AMARELO + "\n🔍 TRANSPARÊNCIA: DE ONDE VEIO ISSO?" + RESET);
        System.out.printf(" ├─ Cálculo..: %d dias * 250 kg/dia = %.0f kg de CO2 estimados.\n", dias, carbonoBase);
        System.out.println(" └─ Ciência..: A ONU (2025) alertou que as gigantes de IA aumentaram emissões em 150%. De Vries-Gao (2025) confirmam o altíssimo custo de refrigeração.");
    }

    private static void missaoAgricultura(Scanner scanner) {
        System.out.println(AMARELO + "\n--- 🌽 MISSÃO 3: GESTÃO DE CRISE AGRÍCOLA ---" + RESET);
        System.out.print("Qual o valor do investimento da safra (em R$)? ");
        double investimento = scanner.nextDouble();

        if (investimento <= 0) return;

        System.out.println(CIANO + "⚠️  A IA meteorológica prevê SECA extrema." + RESET);
        System.out.print("Você deseja adiar o plantio? (1-Sim / 2-Não): ");
        int decisao = scanner.nextInt();

        animarProcessamento("Avançando 15 dias no tempo");

        Random random = new Random();
        boolean realmenteSecou = (random.nextInt(100) >= 9); // 91% de acerto

        if (realmenteSecou) {
            System.out.println(AMARELO + "🌤️ O clima foi SECO. A previsão da IA ACERTOU!" + RESET);
            if (decisao == 2) {
                System.out.printf(VERMELHO + ">> PREJUÍZO: Você ignorou a IA. Perda de R$ %.2f.\n" + RESET, investimento);
            } else {
                System.out.printf(VERDE + ">> SUCESSO: Você confiou na IA. Safra salva (R$ %.2f garantidos)!\n" + RESET, investimento);
                totalDinheiroSalvo += investimento;
            }
        } else {
            System.out.println(AZUL + "🌧️ CHOVEU. A previsão da IA FALHOU (9% de erro da máquina)." + RESET);
            System.out.println(">> Acontece. A tecnologia ajuda, mas a natureza é imprevisível.");
        }

        System.out.println(AMARELO + "\n🔍 TRANSPARÊNCIA: DE ONDE VEIO ISSO?" + RESET);
        System.out.println(" ├─ Cálculo..: Sorteio de 91% de acerto vs 9% de falha.");
        System.out.println(" └─ Ciência..: Scheifer et al. (2025) obtiveram exatos 91% de acurácia prevendo dias secos no Paraná.");
    }

    private static void exibirRelatorioFinal() {
        System.out.println(CIANO + NEGRITO + "\n=======================================================" + RESET);
        System.out.println(NEGRITO + " 📊 BALANÇO FINAL DO SEU MANDATO AMBIENTAL" + RESET);
        System.out.println(CIANO + NEGRITO + "=======================================================" + RESET);
        System.out.printf(VERDE + " 🌳 Hectares poupados...: %.2f ha\n" + RESET, totalAreaSalva);
        System.out.printf(VERMELHO + " 🏭 CO2 gerado pela IA..: %.2f Kg\n" + RESET, totalCO2Gerado);
        System.out.printf(AMARELO + " 💰 Verba Agrícola salva: R$ %.2f\n" + RESET, totalDinheiroSalvo);
        System.out.println("\nLembre-se da conclusão do artigo: A IA é uma ferramenta, não a salvação isolada.");
    }
}