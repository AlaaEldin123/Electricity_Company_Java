//Written by Alaa Eldin
package comelectricity;
//Class declaration is the main customer, which includes the common denominators 
//between the commercial customer, the government customer, and the residential customer. 
//This method is one of the characteristics of OOP in writing the code.

//this clas is superclase
public class Customer 
{
    //The characteristics common to all types of customers
    private int cust_id; //number of the customer
    private String cust_name; //name of the customer
    private int meter_id; //Amount of consumption in square meters
    private int month; //Month of consumption
    private int year; //Year of consumption
    
    //customer constructor
    public Customer(int cust_id, String cust_name, int meter_id, int month, int year) {
        this.cust_id = cust_id;
        this.cust_name = cust_name;
        this.meter_id = meter_id;
        this.month = month;
        this.year = year;
    }
    // here is setter and getter

    public int getCust_id() {
        return cust_id;
    }
    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }
    public String getCust_name() {
        return cust_name;
    }
    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }
    public int getMeter_id() {
        return meter_id;
    }
    public void setMeter_id(int meter_id) {
        this.meter_id = meter_id;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    //Collect the final results
    @Override
    public String toString() {
        return "Welcome to our company\n"+
                "cust_id=" + cust_id + ", cust_name=" + cust_name + ", meter_id=" + meter_id + ", month=" + month + ", year=" + year+"\n" ;
    }
    
}
 