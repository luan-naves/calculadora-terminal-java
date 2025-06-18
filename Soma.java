public class Soma {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Por favor, digite dois números inteiros separados por espaço");
            System.out.println("Exemplo de uso correto: java Soma 20 20");
            return;
        }
        try {
            Double num1 = Double.parseDouble(args[0]);
            Double num2 = Double.parseDouble(args[1]);

            Double resultado = num1 + num2;
            System.out.printf("A soma é: %.2f\n", resultado);
        } catch (NumberFormatException ex) {
        System.out.println("Erro: Certifique-se de que ambos os argumentos são números inteiros válidos.");
    }
    
    }
}

// Teste de push com nova máquina
// O javac compila o código-fonte .java e gera o bytecode .class somente naquele momento.
// Se você mudar o código e não compilar de novo, o .class antigo ainda será executado.