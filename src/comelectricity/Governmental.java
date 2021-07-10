//Written by Alaa Eldin
package comelectricity;
//Governmental customer This class is inherited from the main customer class
public class Governmental extends Customer
{ //The variables contained in the government are not found in the superclass
    private String category;
    private int consumption; 
    //Here the constant variables that we knew in the main class were called the 
    //super class and added the variables contained in the commercial customer
    public Governmental( int cust_id, String cust_name, int meter_id, int month, int year,String category, int consumption) {
        //Variables added by superclass
        super(cust_id, cust_name, meter_id, month, year);
        //Variables added by subclass Commercial
        this.category = category;
        this.consumption = consumption;
    }
    // here is setter and getter
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getConsumption() {
        return consumption;
    }
    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }
    //Create a class of public type to calculate 
    //the consumption of the three types of government customere 
    public double Total()    
    {
        double amount;
        if (category.equals("A"))
            amount=consumption*0.5;
        else if (category.equals("B"))
            amount=consumption*0.75;
        else amount=consumption*0.9;
        return amount;
    }
    //Collect the final results
    @Override
    public String toString() {
        return super.toString()+" category = " + category + ", consumption= " + consumption + " money= " + Total() ;
    }
}
