/******************************************************************************
Atividade 3 - Classe Empregado
*******************************************************************************/
public class TesteEmpregado {
    public static void main (String[] args) {
        /* static permite a criação da classe sem objetos;
        i.e., indica que o método(função) pertence à classe e não à instâncias(objetos) individuais.*/
        
        //static significa estático; membros estáticos não mudam de um objeto para o outro.
        
        /* String[] args: array de strings, faz parte da assinatura do método principal,
        a JVM exige esse formato, ainda que não utilizado*/
        Empregado e1 = new Empregado(1232, "Paulo Silva", "Gerente Financeiro", 15400);
        
        Empregado e2 = new Empregado();
        //e2.setCodigo(4567); tirei por causa da questão 7.
        System.out.println("Código: "+e2.getCodigo());
        e2.setNome("Ana Paula");
        System.out.println(e2.getNome());
        e2.setCargo("Analista de Sistemas Senior");
        System.out.println(e2.getCargo());
        e2.setSalario(10700.00);
        System.out.println(e2.getSalario());
        
        e1.imprimeEmpregado();
        e2.imprimeEmpregado();
        
        e1.totalEmpregados();
        e2.totalEmpregados();
    }
}