public class Empregado {
    private int codigo;
    private String nome;
    private String cargo;
    private double salario;
    private static int contaEmpregado = 1;
    
    public Empregado() {
        contaEmpregado++;
        codigo = contaEmpregado;
    }

    public Empregado(int codigo, String nome, String cargo, double salario) {// nem precisava do parametro codigo aqui, porque está sendo autoincrementado.
        this.codigo = contaEmpregado;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    //setter para o código do Empregado
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    //getter para o código do Empregado
    public int getCodigo() {
        return codigo;
    }
    //setter para o nome do Empregado
    public void setNome(String nome) {
        this.nome = nome;
    }
    //getter para o nome do Empregado
    public String getNome() {
        return nome;
    }
    //setter para o cargo do Empregado
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    //getter para o cargo do Empregado
    public String getCargo() {
        return cargo;
    }
    //setter para o salario do Empregado
    public void setSalario(double salario) {
        this.salario = salario;
    }
    //getter para o salario do Empregado
    public double getSalario() {
        return salario;
    }
    
    public void totalEmpregados() {
        System.out.printf("Quantidade de Empregados: "+contaEmpregado+"\n");

    }
    public void imprimeEmpregado() {
        System.out.printf("Nome: %s | Código: %d\n", nome, codigo);
        System.out.printf("Cargo: %s | Salário: R$%.2f\n", cargo, salario);
        System.out.printf("\n");
    }
    
}