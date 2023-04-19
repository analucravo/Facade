public class Combo {
    private Burger burger;
    private Sobremesa sobremesa;
    private Bebida bebida;

    public Combo() {
        this.burger = new Burger();
        this.sobremesa = new Sobremesa();
        this.bebida = new Bebida();
    }

    public void criarComboMaster() {
        burger.setDescricao("Hamburguer Duplo com Queijo");
        burger.setPreco(15.0);
        burger.setGramas(200);

        sobremesa.setDescricao("Sorvete de Chocolate");
        sobremesa.setPreco(8.0);
        sobremesa.setTamanho("Médio");

        bebida.setDescricao("Coca-Cola");
        bebida.setPreco(5.0);
        bebida.setMl(350);
    }

    public void criarSuperCombo() {
        burger.setDescricao("Hamburguer Triplo com Queijo e Bacon");
        burger.setPreco(20.0);
        burger.setGramas(300);

        sobremesa.setDescricao("Brownie de Chocolate");
        sobremesa.setPreco(10.0);
        sobremesa.setTamanho("Grande");

        bebida.setDescricao("Fanta Laranja");
        bebida.setPreco(5.0);
        bebida.setMl(500);
    }

    @Override
    public String toString() {
        return burger.getDescricao() + " + " + sobremesa.getDescricao() + " + " + bebida.getDescricao();
    }
}
