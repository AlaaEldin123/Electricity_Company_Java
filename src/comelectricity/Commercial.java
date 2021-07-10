//Written by Alaa Eldin
package comelectricity;
//Commercial customer This class is inherited from the main customer class
public class Commercial extends Customer 
{
    private int consumption;
//Here the constant variables that we knew in the main class were called the 
//super class and added the variables contained in the commercial customer
    public Commercial( int cust_id, String cust_name, int meter_id, int month, int year,int consumption) 
    {   //Variables added by superclass
        super(cust_id, cust_name, meter_id, month, year);
        //Variables added by subclass Commercial
        this.consumption = consumption;
    }
    //Definition of a public class, in order to calculate 
    //the Commercial customer’s bill in three stages per day
   public double price() 
   {
       double money;
       if (consumption<=300) money=consumption*0.75;
       else if (consumption<=500) money=300*0.75+(consumption-300)*0.9;
       else if (consumption<=700) money=300*0.75+200*0.9+(consumption-500)*1.2;
       else money=300*0.75+200*0.9+200*1.2+(consumption-700)*1.5;
       return money;
   }
    //Define a generic class for the ordering of values and their return of a string type
    @Override
    public String toString() {
        return super.toString() + " consumption= " + consumption + " money= " + price() ;
    }
}
