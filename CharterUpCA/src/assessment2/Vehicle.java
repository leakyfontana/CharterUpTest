package assessment2;

/** 
 * Creates object of type vehicle and provides
 * desired behavior.
 * 
 * @author xanderdyer
 *
 */
public class Vehicle {
    
    private int vType;
    private int priceMethod;
    
    public Vehicle(int type, int method)
    {
        vType = type;
        priceMethod = method;
    }
    
    public int getType()
    {
        return vType;
    }
    
    public int getMethod()
    {
        return priceMethod;
    }
    

    public double getRate()
    {
        if (vType == 1)
        {
            if(priceMethod == 1)
            {
                return 1000.00;
            }
            
            if(priceMethod == 2)
            {
                return 400.00;
            }
            
            if(priceMethod == 3)
            {
                return 3.50;
            }
            else {
                throw new IllegalArgumentException("Invalid pricing method."
                    + "Please choose: Daily, Hourly or Distance");
            }
        }
        if (vType == 2)
        {
            if(priceMethod == 1)
            {
                return 925.00;
            }
            
            if(priceMethod == 2)
            {
                return 360.00;
            }
            
            if(priceMethod == 3)
            {
                return 3.25;
            }
            else { 
                throw new IllegalArgumentException("Invalid pricing method."
                    + "Please choose: Daily, Hourly or Distance");
            }
        }
        if (vType == 3)
        {
            if(priceMethod == 1)
            {
                return 850.00;
            }
            
            if(priceMethod == 2)
            {
                return 320.00;
            }
            
            if(priceMethod == 3)
            {
                return 3.00;
            }
            else {
                throw new IllegalArgumentException("Invalid pricing method."
                    + "Please choose: Daily, Hourly or Distance");
            }
        }
        if (vType == 4)
        {
            if(priceMethod == 1)
            {
                return 775.00;
            }
            
            if(priceMethod == 2)
            {
                return 280.00;
            }
            
            if(priceMethod == 3)
            {
                return 2.75;
            }
            else {
                throw new IllegalArgumentException("Invalid pricing method."
                    + "Please choose: Daily, Hourly or Distance");
            }
        } 
        if (vType == 5)
        {
            if(priceMethod == 1)
            {
                return 700.00;
            }
            
            if(priceMethod == 2)
            {
                return 240.00;
            }
            
            if(priceMethod == 3)
            {
                return 2.50;
            }
            else {
                throw new IllegalArgumentException("Invalid pricing method."
                    + "Please choose: Daily, Hourly or Distance");
            }
        }
        if (vType == 6)
        {
            if(priceMethod == 1)
            {
                return 625.00;
            }
            
            if(priceMethod == 2)
            {
                return 200.00;
            }
            
            if(priceMethod == 3)
            {
                return 2.25;
            }
            else {
                throw new IllegalArgumentException("Invalid pricing method."
                    + "Please choose: Daily, Hourly or Distance");
            }
        }
        if (vType == 7)
        {
            if(priceMethod == 1)
            {
                return 550.00;
            }
            
            if(priceMethod == 2)
            {
                return 160.00;
            }
            
            if(priceMethod == 3)
            {
                return 2.00;
            }
            else {
                throw new IllegalArgumentException("Invalid pricing method."
                    + "Please choose: Daily, Hourly or Distance");
            }
        }
        if (vType == 8)
        {
            if(priceMethod == 1)
            {
                return 475.00;
            }
            
            if(priceMethod == 2)
            {
                return 120.00;
            }
            
            if(priceMethod == 3)
            {
                return 1.75;
            }
            else {
                throw new IllegalArgumentException("Invalid pricing method."
                    + "Please choose: Daily, Hourly or Distance");
            }
        }
        
          throw new IllegalArgumentException("Invalid vehicle selection."
                + "Please choose: Charter, Mini Bus, Sprinter, Party Bus"
                + "Sedan, SUV, Limousine or Trolley");        
    }
}
