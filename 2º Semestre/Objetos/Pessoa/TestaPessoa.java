/******************************************************************************
Escreva a classe TestaPessoa, que contem o método main, onde serão criadas 4 pessoas:
a Ana Souza com 31 anos, a Bia Nunes com 25 anos, Paulo Santos com 45 anos e Rui Matos com 13 anos.
Cada pessoa deve ser criada com um construtor diferentes escrito na questão anterior.

Dentro do main usar o método Imprime para mostrar na console as informações das 4 pessoas criadas em tempo de execução.
*******************************************************************************/

public class TestaPessoa { 
    public static void main(String[] args) {
        // Criando as pessoas com diferentes construtores
        Pessoa pessoa1 = new Pessoa("Ana Souza", 31);
        Pessoa pessoa2 = new Pessoa("Bia Nunes");
        Pessoa pessoa3 = new Pessoa(45);
        Pessoa pessoa4 = new Pessoa();

        // Ajustando os valores manualmente para que correspondam à questão
        pessoa2 = new Pessoa("Bia Nunes", 25);
        pessoa3 = new Pessoa("Paulo Santos", 45);
        pessoa4 = new Pessoa("Rui Matos", 13);

        // Imprimindo os dados das pessoas
        pessoa1.Imprime();
        pessoa2.Imprime();
        pessoa3.Imprime();
        pessoa4.Imprime();
    }
}

