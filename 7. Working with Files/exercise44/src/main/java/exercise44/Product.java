package exercise44;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(){

    }
    public Product(String n, double p, int q){
        this.name = n;
        this.price = p;
        this.quantity = q;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString(){
        return String.format("Name: %s\nPrice: %.2f\nQuantity: %d\n", name, price, quantity);
    }

    @Override
    public boolean equals(Object obj){

        if(this == obj)
            return true;
        
        if(obj instanceof Product){
            Product p = (Product)obj;

            if(p.getName().equals(this.getName())
                && p.getPrice() == this.getPrice()
                && p.getQuantity() == this.getQuantity()){
                    return true;
                }
        }

        return false;

    }
    
}