//Written by Alaa Eldin
package comelectricity;
//A library call that allows the user to enter values into windows
import javax.swing.JOptionPane;
public class Comelectricity { 
    public static void main(String[] args)
    {
        //Define variables
       int choice,cust_id,meter_id,month,year,consumption,consumption_mor,consumption_eve,consumption_nig;
       String category,cust_name,password = null,user = null;
       user=JOptionPane.showInputDialog("please enter the username");
       if(user.equals("alaa"))
       password=JOptionPane.showInputDialog("please enter the password");
       if(password.equals("alaa"))
       {    
       do
       {
        //Equip the user interface
       choice=Integer.parseInt(JOptionPane.showInputDialog("1: If you are a commercial customer please click here\n2: If you are a Governmental customer please click here\n3: If you are a Residential customer please click\n4: Click here if you are sure you want to exit\n Welcome to our company, choose one of our services"));
       if (choice!=4)
       {
        //The values that the user will enter are taken from the Super Class
       cust_id=Integer.parseInt(JOptionPane.showInputDialog("cust_id"));
       cust_name=(JOptionPane.showInputDialog("cust_name"));
       meter_id=Integer.parseInt(JOptionPane.showInputDialog("meter_id"));
       month=Integer.parseInt(JOptionPane.showInputDialog("month"));
       year=Integer.parseInt(JOptionPane.showInputDialog("year"));
       
       //Examining the variables that the user will enter
       switch(choice)
       {
       //In case the user enters No. 1 upon his choice, 
           //an invoice value will be calculated on a commercial customer
           case 1: consumption=Integer.parseInt(JOptionPane.showInputDialog("consumption"));
           //Call the commercial sub Class and define it with a new variable named com 
           //and put the data in it
                   Commercial com = new Commercial(cust_id,cust_name,meter_id,month,year,consumption);
                   System.out.println(com);
                   break;
           //In case the user enters No. 2 upon his choice, 
           //an invoice value will be calculated on a Governmental customer
           case 2:
                   category=JOptionPane.showInputDialog("category");
           //Call the Governmental sub Class and define it with a new variable named gov
           //and put the data in it
                   consumption=Integer.parseInt(JOptionPane.showInputDialog("consumption"));
                   Governmental gov = new Governmental(cust_id,cust_name,meter_id,month,year,category,consumption);
                   System.out.println(gov);
                   break;    
            //In case the user enters No. 3 upon his choice, 
           //an invoice value will be calculated on a Residential customer
           case 3:
                   consumption_mor=Integer.parseInt(JOptionPane.showInputDialog("consumption_mor"));
           //Call the Residential sub Class and define it with a new variable named res
           //and put the data in it
                   consumption_eve=Integer.parseInt(JOptionPane.showInputDialog("consumption_eve"));
                   consumption_nig=Integer.parseInt(JOptionPane.showInputDialog("consumption_nig"));
                   Residential res = new Residential(cust_id,cust_name,meter_id,month,year,consumption_mor,consumption_eve,consumption_nig);
                   System.out.println(res);
                   break;    
       }
       }
       }
       //if you click on choice number 4 you will go out
       while (choice!=4);}
       else 
           JOptionPane.showInputDialog(null,"sory the username or password is not correct");
       
    }
    
}
