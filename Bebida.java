public class Bebida extends Produto {
    private int ml;

    public int getMl() {
        return ml;
    }

    public void setMl(int ml) {
        this.ml = ml;
    }

    @Override
    public String toString() {
        return "Bebida " + ml + "ml - " + super.toString();
    }
}