public class IPad extends IDevice
{
    private static final String IPadPurpose = "learning";
    private  final Boolean hasCase;
    private  final String operatingSystem;


    public IPad(final boolean hasCase, final String operatingSystem)
    {
        super(IPadPurpose);
        this.hasCase = hasCase;
        this.operatingSystem = operatingSystem;
    }


    @Override
    public void printDetails()
    {
        System.out.println(
                "IPad purpose: " +
                IPadPurpose +
                ", has case: " + hasCase +
                 ", OS: " + operatingSystem);
    }
}