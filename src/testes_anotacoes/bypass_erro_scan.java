public @interface bypass_erro_scan {
    Scanner scanner = new Scanner(System.in);
    int numero = 0;
    boolean entradaValida = false;

    while (!entradaValida) {
        System.out.print("Digite um número inteiro: ");
        try {
            numero = scanner.nextInt();
            entradaValida = true; // Se a leitura for bem-sucedida, a entrada é válida
        }
        catch (InputMismatchException e) {
            System.out.println("Entrada inválida! Digite um número inteiro.");
            scanner.nextLine(); // Limpa o buffer do scanner
        }*/
//1 try...catch: O bloco try tenta executar o código dentro dele. Se ocorrer uma exceção, o bloco catch é executado.
//2 InputMismatchException: Essa exceção é lançada quando o usuário digita algo que não corresponde ao tipo de dado esperado (neste caso, um inteiro).
//3 scanner.nextLine();: Limpa o buffer do scanner para evitar que a entrada inválida seja lida novamente na próxima iteração do loop.
//4 entradaValida = true;: Se a leitura for bem-sucedida, a variável entradaValida é definida como true, o que faz com que o loop while termine.
}
