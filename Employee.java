public class Employee{
    public void handleCustomer(Customer cust1, boolean finance, Vehicle vehicle){
        if(finance == true){
            double loanAmount = vehicle.getPrice() - cust1.getCashOnHand();
            runCreditHistory(cust1, loanAmount);
        }
        else if(vehicle.getPrice() <= cust1.getCashOnHand()){
            // customer pays in cash
            processTransaction(cust1, vehicle);
        }
        else{
            System.out.println("Customer will need more money to purchase vehicle: " + vehicle);
        }
    }

    public void runCreditHistory(Customer cust1, double loanAmount){
        System.out.println("Ran credit history for the customer...");
        System.out.println("Customer has been approved to purchase the vehicle");
    }

    public void processTransaction(Customer cust1, Vehicle vehicle){
        System.out.println("Customer has purchased the vehicle: " + vehicle +
         " for the price: " + vehicle.getPrice());
    }
}