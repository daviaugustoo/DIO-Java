# Try-Catch em Java

## O que é Try-Catch?

O bloco try-catch em Java é utilizado para lidar com exceções, permitindo que o código execute operações que podem gerar erros de forma controlada, evitando que o programa quebre inesperadamente. O bloco try engloba o código suscetível a exceções, enquanto o bloco catch captura e trata essas exceções.

```java
try {
    // Código que pode gerar exceções
} catch (ExcecaoTipo1 e) {
    // Tratamento para ExcecaoTipo1
} catch (ExcecaoTipo2 e) {
    // Tratamento para ExcecaoTipo2
} finally {
    // Código a ser executado independentemente de exceções
}
```
No exemplo acima, o bloco try contém o código onde as exceções podem ocorrer. Os blocos catch são utilizados para tratar exceções específicas. O bloco finally é opcional e é executado independentemente de ocorrerem exceções ou não, sendo frequentemente usado para liberar recursos.

## Exemplo de uso:

```java
try {
    int resultado = dividir(10, 0);
    System.out.println("Resultado: " + resultado);
} catch (ArithmeticException e) {
    System.out.println("Erro: Divisão por zero.");
} finally {
    System.out.println("Operação concluída.");
}
```
No exemplo acima, o método dividir é chamado dentro do bloco try. Se uma exceção do tipo ArithmeticException (divisão por zero) ocorrer durante a execução do método dividir, o controle é transferido para o bloco catch correspondente, onde a mensagem de erro é exibida. O bloco finally garante que a mensagem "Operação concluída" seja sempre exibida, independentemente de ocorrerem exceções.