public class Pepperoni extends Pizza{
    private boolean pungentTaste;

    public Pepperoni(){}
    public Pepperoni(String namePizza, int price, int weight, boolean pungentTaste) {
        super(namePizza, price, weight);
        this.pungentTaste = pungentTaste;
    }


    @Override
    public void deliver(String namePizza, int price, int weight) {
        System.out.println("Доставляется пицца " + namePizza + ", цена: " + price + ", нетто: " + weight + ", и " + pungentTaste);
    }

    public boolean isPungentTaste() {
        return pungentTaste;
    }
    public void setPungentTaste(boolean pungentTaste) {
        this.pungentTaste = pungentTaste;
    }
}
