public class Burger extends Produto {
    private int gramas;

    public int getGramas() {
        return gramas;
    }

    public void setGramas(int gramas) {
        this.gramas = gramas;
    }

    @Override
    public String toString() {
        return "Hambúrguer " + gramas + "g - " + super.toString();
    }
}
