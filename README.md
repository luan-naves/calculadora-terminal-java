# 📄 Projeto: Soma de Dois Números no Terminal em Java

## 🧠 Descrição
Este projeto é uma calculadora simples de **soma de dois números**, executada via terminal, desenvolvida com Java puro.  
A entrada é feita por **argumentos de linha de comando** (`args[]`) e o programa realiza o **parse e validação dos dados**, retornando o resultado formatado.

Ideal para iniciantes que desejam aprender:
- Uso de argumentos no `main()`
- Conversão de `String` para `Double`
- Tratamento de exceções com `try/catch`
- Impressão formatada no terminal

---

## 🚀 Como executar

1. Compile o código:
```bash
javac Soma.java
```

2. Execute passando dois números como argumentos:
```bash
java Soma 10 20
```

✅ Saída:
```
A soma é: 30.00
```

---

## ⚠️ Validações

- Se o usuário não passar exatamente dois valores:
```bash
java Soma
```

⚠️ Saída:
```
Por favor, digite dois números inteiros separados por espaço
Exemplo de uso correto: java Soma 20 20
```

- Se algum valor não for numérico:
```bash
java Soma 10 abc
```

⚠️ Saída:
```
Erro: Certifique-se de que ambos os argumentos são números inteiros válidos.
```

---

## 💡 Conceitos Aplicados

- `public static void main(String[] args)` — ponto de entrada do programa
- `args.length` — validação de argumentos
- `Double.parseDouble()` — conversão de `String` para `Double`
- `try/catch` — tratamento de exceções (como valores inválidos)
- `System.out.printf("%.2f")` — formatação para exibir **2 casas decimais**
- Boas práticas de feedback ao usuário

---

## 📚 Aprendizado envolvido

Este projeto foi construído com foco no entendimento real de:
- Como o Java lida com entrada de dados via terminal
- Como capturar e tratar exceções que surgem durante a execução
- Por que usar `Double` permite trabalhar com números decimais
- Por que devemos **compilar novamente** (`javac`) sempre que alteramos o código `.java`

---

## 🛠️ Possíveis melhorias futuras

- Permitir múltiplas operações matemáticas (como `-`, `*`, `/`)
- Adicionar validação para números decimais com separador incorreto (ex: `12,3`)
- Internacionalização da saída (mensagens em múltiplos idiomas)

---

## 📁 Arquivo principal

```java
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
```
