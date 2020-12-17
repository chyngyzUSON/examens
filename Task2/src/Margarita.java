public class Margarita extends Pizza{
    private boolean meat;

    public Margarita(){}
    public Margarita(String namePizza, int price, int weight, boolean meat) {
        super(namePizza, price, weight);
        this.meat = meat;
    }

    @Override
    public void deliver(String namePizza, int price, int weight) {
        System.out.println("Доставляется пицца " + namePizza + ", цена: " + price + ", нетто: " + weight + ", и " + meat);
    }

    public boolean isMeat() {
        return meat;
    }
    public void setMeat(boolean meat) {
        this.meat = meat;
    }
}
