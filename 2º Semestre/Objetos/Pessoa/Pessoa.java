/* Escreva a classe Pessoa contendo nome e idade,
contendo 4 construtores diferentes e 
com o método Imprime que imprime na Console os dados da Pessoa.*/

class Pessoa {
    private String nome; //private restringe acesso: para encapsulamento, assim os nomes já definidos não podem ser alterados.
    private int idade; //private para que a idade não possa ser alterada fora dessa classe.

    // Construtor 1: Nome e idade
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        /* 'this' é usado para diferenciar os atributos da classe dos parâmetros, é
        uma palavra-chave usada para fazer referência à variável de instância da classe atual*/
    }

    // Construtor 2: Apenas nome, idade padrão 0
    public Pessoa(String nome) {
        this.nome = nome;
        this.idade = 0;
    }

    // Construtor 3: Apenas idade, nome padrão "Desconhecido"
    public Pessoa(int idade) {
        this.nome = "Desconhecido";
        this.idade = idade;
    }

    // Construtor 4: Sem parâmetros, valores padrão
    public Pessoa() {
        this.nome = "Desconhecido";
        this.idade = 0;
    }

    // Método para imprimir os dados da pessoa
    public void Imprime() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}
