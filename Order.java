package Ecommerce;
 public class Order {
    private Product product;
    private Customer customer;
    private int quantityOrdered;
    public Order(Product product, Customer customer, int 
quantityOrdered) {
        this.product = product;
        this.customer = customer;
        this.quantityOrdered = quantityOrdered;
    }
    public void placeOrder() {
        System.out.println("Order placed successfully.");
    }
    public void displayOrderDetails() {
        System.out.println("Order Details");
        customer.displayCustomer();
        System.out.println();
        product.displayProduct();
        System.out.println("Quantity Ordered : " + 
quantityOrdered);
        System.out.println("Total Cost : " + 
calculateTotalCost());
    }
    public double calculateTotalCost() {
        return product.getPrice() * quantityOrdered;
    }
 }
