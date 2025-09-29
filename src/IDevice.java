abstract class IDevice
{
    private final String purpose;

    public IDevice(String purpose)
    {

        this.purpose = purpose;
    }

    public String getPurpose(final String purpose)
    {
        return purpose;
    }

     abstract void printDetails();
}
