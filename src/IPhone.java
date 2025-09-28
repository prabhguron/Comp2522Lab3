public class IPhone extends IDevice
{
    private static final String IPhonePurpose = "talking";
    private  final String Carrier;
    private  final double MinutesPhonePlan;


    public IPhone(final String Carrier,
                  final double MinutesPhonePlan)
    {
        super(IPhonePurpose);
        this.Carrier = Carrier;
        this.MinutesPhonePlan = MinutesPhonePlan;
    }


    @Override
    public void printDetails()
    {
        System.out.println(
                "IPad purpose: " +
                            IPhonePurpose +
                            ", minutes remaing: " +
                            MinutesPhonePlan +
                            ", Carrier: " + Carrier);
    }
}