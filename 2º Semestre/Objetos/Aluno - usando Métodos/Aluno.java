public class Aluno {
    
    String nome, cpf;
    int codmat;
    char sexo;
    double nota_P1, nota_P2, nota_P3;
    
    void ImprimeAluno() {
        System.out.println("Nome: "+nome);
        System.out.println("Código de Matrícula: "+codmat);
        System.out.println("CPF: "+cpf);
        System.out.println("Sexo: "+sexo);
        System.out.println("Nota P1: "+nota_P1);
        System.out.println("Nota P2: "+nota_P2);
        System.out.println("Nota P3: "+nota_P3);
    }
    
    void ImprimeSexo() {
        System.out.print(nome+": ");
        switch (sexo) {
            case 'M': System.out.println("Masculino");
                break;
            case 'F': System.out.println("Feminino");
                break;
            default: System.out.println("Opção inválida!");
        }
    }
    
    double MediaAluno() {
        
        double nota1=0, nota2=0;
        if (nota_P1<nota_P2 && nota_P1<nota_P3) {
            nota1 = nota_P2;
            nota2 = nota_P3;
        } else if (nota_P2<nota_P1 && nota_P2<nota_P3) {
            nota1 = nota_P1;
            nota2 = nota_P3;
        } else {
            nota1 = nota_P1;
            nota2 = nota_P2;
        }
        
        double media = (nota1+nota2)/2.0;
        
        return media;
    }
    
    String Resultado() {
        
        double media = MediaAluno();
        return media >= 6.0 ? "Aprovado" : "Reprovado";
    }
}