public class LaFeinta extends Pizza{
    private boolean mushrooms;

    public LaFeinta(){}
    public LaFeinta(String namePizza, int price, int weight, boolean mushrooms) {
        super(namePizza, price, weight);
        this.mushrooms = mushrooms;
    }

    @Override
    public void deliver(String namePizza, int price, int weight) {
        System.out.println("Доставляется пицца " + namePizza + ", цена: " + price + ", нетто: " + weight + ", и " + mushrooms);
    }

    public boolean isMushrooms() {
        return mushrooms;
    }
    public void setMushrooms(boolean mushrooms) {
        this.mushrooms = mushrooms;
    }
}
