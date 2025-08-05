public class Main {
    
    public static void mains (String[] args) {
        Produto p1 = new Produto (1232, "Celular Samsung S8", 30);
        Produto p2 = new Produto ();
        
        p2.setCodigo(3456);
        System.out.println("Código: "+p2.getCodigo());
        
        p2.setDescricao("Monitor Samsung SyncMaster");
        System.out.println("Código: "+p2.getDescricao());
        
        p2.setQuantidade(12);
        System.out.println("Código: "+p2.getQuantidade());
        
        // terminar atividade
    }
}