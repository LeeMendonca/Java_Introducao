public class Main {
    public static void main (String[] args) {
        FormaGeometrica f1 = new Circulo(5.0);
        FormaGeometrica f2 = new Quadrado (12.2);
        
        System.out.print("Área: "+f1.Area()+"Perímetro: "+f1.Comprimento());
        System.out.print("Área: "+f2.Area()+"Perímetro: "+f2.Comprimento());
    }
}
