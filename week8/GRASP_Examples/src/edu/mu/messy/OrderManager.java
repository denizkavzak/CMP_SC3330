package edu.mu.messy;

class OrderManager {

    public void checkout(Order order) {

        double total = 0;

        for (OrderItem item : order.getItems()) {
            total += item.getPrice() * item.getQuantity();
        }
        
        total = order.calculateTotal();

        MySQLDatabase db = new MySQLDatabase();
        db.save(order);
        
        EmailSender email = new EmailSender();
        email.send(order.getCustomer().getEmail(),
                   "Order complete");

        if (order.getCustomer().isPremium()) {
            total *= 0.9;
        }

        System.out.println("Total: " + total);
    }
}