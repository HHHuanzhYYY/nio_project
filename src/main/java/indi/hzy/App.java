package indi.hzy;

import indi.hzy.util.Utility;
import indi.hzy.vo.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Customer customer = new Customer();
        customer.setName("zhangsan");
        customer.setGender("male");
        customer.setAge(32);
        
        Utility.write2File("C:\\Users\\HZY\\Desktop\\cus-test.txt", customer);
        
        
    }
}
