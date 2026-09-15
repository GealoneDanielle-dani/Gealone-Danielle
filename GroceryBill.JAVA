public class GroceryBill {
     public static void main(String[] args) {
        double item1 = 89.50;
        double item3 = 45.00;
        double item3 = 120.75;

        double total = 0;
        total += item1;
         total += item2;
          total += item3;

          double tax = total * 0.12;
          double finalTotal = total + tax;

          System.out.println("Subtotal: " + total + "PHP");
          System.out.println("Tax: "12%" + tax + "PHP");

     } 
    
}
