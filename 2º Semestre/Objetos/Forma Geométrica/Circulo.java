public class Circulo implements FormaGeometrica {
    private double raio;
    
    public double Area () {
        return Math.PI * raio * raio; //raio*raio ou math.pow(raio,2)
    }
    public double Comprimento () {
        return 2 * Math.PI * raio;
    }
    
    //Na questão 2, acrescente o construtor getter e setter
    public Circulo (double raio) {
        this.raio = raio;
    }
    /*public double getRaio () {
        return raio;*/
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
}
