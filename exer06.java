Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = (int) (Math.random() * 100) + 1; // Gera um número aleatório entre 1 e 100
        int tentativas = 0;
        int palpite;

        System.out.println("Bem-vindo ao jogo de adivinhação! Tente adivinhar o número entre 1 e 100.");

        do {
            System.out.print("Digite o seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroAleatorio) {
                System.out.println("O número que você está procurando é maior.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número que você está procurando é menor.");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
            }
        } while (palpite != numeroAleatorio);

        scanner.close();
