package classComponents.blocks;

public class Customer {
    static int customerCount = 0;
    static String countryName= "India";

    {
        customerCount++;
    }

    public static void main(String[] args) {
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Customer customer3 = new Customer();
        Customer customer4 = new Customer();
        Customer customer5 = new Customer();
        System.out.println("no. of customer objects created "+ customer5.customerCount);
        System.out.println("Country name "+countryName);
        countryName ="United States of India";
    }
}
