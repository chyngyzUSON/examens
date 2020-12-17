public class Pizza {
    private String namePizza;
    private int price;
    private int weight;


    public Pizza(){}
    public Pizza(String namePizza, int price, int weight) {
        this.namePizza = namePizza;
        this.price = price;
        this.weight = weight;
    }


    public void cook(String namePizza){
        System.out.println("Готовится пицца " + namePizza);
    }

    public void deliver(String namePizza, int price, int weight){
        System.out.println("Досдавляется пицца " + namePizza + ", цена: " + price + ", вес: " + weight);
    }

    public String getNamePizza() {
        return namePizza;
    }

    public void setNamePizza(String namePizza) {
        this.namePizza = namePizza;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
}
