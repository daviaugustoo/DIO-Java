# Exceptions em Java

## O que são Exceptions?

Exceptions em Java são eventos que ocorrem durante a execução de um programa, indicando que algo inesperado aconteceu e interrompendo o fluxo normal de execução. Elas podem ser causadas por erros de programação, condições inesperadas durante a execução do programa ou operações inválidas.

As exceptions em Java são representadas por objetos das classes que estendem a classe Throwable. Existem dois tipos principais de exceptions: Checked Exceptions, que são verificadas durante a compilação, e Unchecked Exceptions (ou RuntimeExceptions), que não são verificadas durante a compilação.

## Exemplo de Checked Exception:

```java
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            File arquivo = new File("arquivo.txt");
            FileReader leitor = new FileReader(arquivo);
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        }
    }
}
```
No exemplo acima, a tentativa de criar um FileReader para um arquivo inexistente pode lançar uma FileNotFoundException, que é uma Checked Exception. Ela é tratada dentro do bloco catch correspondente, onde uma mensagem de erro é exibida.

## Exemplo de Unchecked Exception:

```java
public class Main {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};
        System.out.println(numeros[3]); // IndexOutOfBoundsException
    }
}
```
No exemplo acima, uma tentativa de acessar um índice inválido em um array resulta em uma IndexOutOfBoundsException, que é uma Unchecked Exception. Como não é tratada no código, ela causa a interrupção do programa.