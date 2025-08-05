public class Quadrado implements FormaGeometrica {
    private double lado;
    
    public double Area() {
        return lado * lado; //lado*lado ou math.pow(lado,2)
    }
    public double Comprimento () {
        return 4 * lado;
    }
    public Quadrado (double lado) {
        this.lado = lado;
    }
    // Questão 3: acrescente getter e setter
    /*public double getLado () {
        return lado;*/
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
}
