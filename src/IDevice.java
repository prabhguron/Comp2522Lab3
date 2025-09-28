abstract class IDevice
{
    private final String purpose;

    public IDevice(String purpose)
    {
        this.purpose = purpose;
    }

    public final String getPurpose()
    {
        return purpose;
    }


     abstract void printDetails();
}
