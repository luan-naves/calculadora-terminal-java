public class Soma {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Uso correto: java Soma <num1> <num2>");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int resultado = num1 + num2;
        System.out.println("A soma é: " + resultado);
    }
}

// O javac compila o código-fonte .java e gera o bytecode .class somente naquele momento.
// Se você mudar o código e não compilar de novo, o .class antigo ainda será executado.