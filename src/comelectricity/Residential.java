//Written by Alaa Eldin
package comelectricity;
//Residential customer This class is inherited from the main customer class
public class Residential extends Customer
{
    //Define consumption variables in three stages a day
    private int consumption_mor;
    private int consumption_eve;
    private int consumption_nig;
//Definition of the builder to collect the variables in the superclass and add to them 
    //the variables contained in the residential customer
    
    public Residential( int cust_id, String cust_name, int meter_id, int month, int year,int consumption_mor, int consumption_eve ,int consumption_nig) {
        super(cust_id, cust_name, meter_id, month, year);
        this.consumption_mor = consumption_mor;
        this.consumption_eve = consumption_eve;
        this.consumption_nig = consumption_nig;
    }
// here is setter and getter
    
    public int getConsumption_mor() {
        return consumption_mor;
    }

    public void setConsumption_mor(int consumption_mor) {
        this.consumption_mor = consumption_mor;
    }
    public int getConsumption_eve() {
        return consumption_eve;
    }
    public void setConsumption_eve(int consumption_eve) {
        this.consumption_eve = consumption_eve;
    }
    public int getConsumption_nig() {
        return consumption_nig;
    }
    public void setConsumption_nig(int consumption_nig) {
        this.consumption_nig = consumption_nig;
    }
    public double account()
    {
        return consumption_mor*0.2+consumption_eve*0.3+consumption_nig*0.5;
    }
//Collect the final results
    @Override
    public String toString() {
        return super.toString() + " consumption_mor = " + consumption_mor + ", consumption_eve= " + consumption_eve + ", consumption_nig= " + consumption_nig + " money= " +account();
    } 
}
