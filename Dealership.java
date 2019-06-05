public class Dealership{
    public static void main(String[] args){
        Customer cust1 = new Customer();
        cust1.setName("Amit");
        cust1.setAddress("123, Dugri, Ludhiana");
        cust1.setCashOnHand(100000);

        Vehicle vehicle = new Vehicle("Honda", "Accord", 90000);
       

        Employee emp = new Employee();

        cust1.purchaseCar(vehicle, emp, false);

        

    }
}