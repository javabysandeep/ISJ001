package accessSpecifier.p3;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
      //  System.out.println(customer.customerId);
        //System.out.println(customer.customerName);

        customer.setCustomerId(100);
        customer.setCustomerName("Pratik Kumar");

        System.out.println(customer.getCustomerId());
        System.out.println(customer.getCustomerName());
    }
}
