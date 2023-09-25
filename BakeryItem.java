class BakeryItem {
    private String name;
    private double price;

    public BakeryItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void describe() {
        System.out.println("Item: " + name);
        System.out.println("Price: $" + price);
    }
}
