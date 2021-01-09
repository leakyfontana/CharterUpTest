package assessment2;

/**
 * Creates the pricing engine and provides
 * desired behavior.
 * 
 * @author xanderdyer
 *
 */

public class PriceComputer {
    
    private int vCount;
    private Vehicle rental;
    private double units;
    
    public PriceComputer(int vehicleCount, Vehicle v, double pricingUnits)
    {
        vCount = vehicleCount;
        rental = v;
        units = pricingUnits;
    }
    
    public double compute()
    {
        return vCount * rental.getRate() * units;
    }

}
