public class IPhone extends IDevice
{
    private static final String IPhonePurpose = "talking";
    private  final String carrier;
    private  final double MinutesPhonePlan;


    public IPhone(final double MinutesPhonePlan,
                  final String carrier)
    {
        super(IPhonePurpose);
        this.carrier = carrier;
        this.MinutesPhonePlan = MinutesPhonePlan;
    }


    @Override
    public void printDetails()
    {
        System.out.println(
                "IPhone purpose: " +
                            IPhonePurpose +
                            ", minutes remaing: " +
                            MinutesPhonePlan +
                            ", Carrier: " + carrier);
    }
}