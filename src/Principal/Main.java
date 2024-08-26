import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite o valor estipulado para as compras.");
        Scanner scanner = new Scanner(System.in);
        double valorPossuido = scanner.nextDouble();
        double orcamentoInicial = valorPossuido;

        List produtos = new ArrayList<Produto>();
        boolean stopFor = true;
        int j = 0;
        for (int i = 0; stopFor; i++) {
            j = i;
            String nome;
            double valor;
            System.out.println("Digite o que desejas comprar");
            scanner.nextLine();
            nome = scanner.nextLine();
            System.out.println("Digite o valor a ser gasto");
            valor = scanner.nextDouble();
            boolean paraWhile = true;
            while (paraWhile) {
                if (valor > valorPossuido) {
                    System.out.println("Saldo extrapolado tente algo mais barato");
                    valor = scanner.nextDouble();
                } else {
                    paraWhile = false;
                }
            }
            Produto produto = new Produto(nome, valor);
            produtos.add(produto);
            valorPossuido -= valor;

            System.out.println("Saldo atual de R$: " + valorPossuido);
            System.out.println("Dite 0 para encerrar a lista de compras ou outro numero para continuar");
            int pare = 1;
            pare = scanner.nextInt();
            if (pare == 0) {
                stopFor = false;
            }

        }
        Collections.sort(produtos);
        System.out.println("********************");

        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i));
        }
        System.out.println("Você vai gastar um total de R$: " + (orcamentoInicial - valorPossuido));
        System.out.println("E ainda sobrou R$: " + valorPossuido + " para próximas compras.");
        System.out.println("********************");
    }}