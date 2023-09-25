class Cookie extends BakeryItem {
    private int quantity;

    public Cookie(String name, double price, int quantity) {
        super(name, price);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Quantity: " + quantity + " cookies");
    }
}