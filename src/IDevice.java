/**
 * The IDevice class is an abstract parent for all iDevice types
 * (such as IPod, IPad, IPhone, and IPhone16).
 * It stores the shared purpose of a device and requires all
 * child classes to implement their own details through the
 * @author Prabh Guron Justin Chik Qian Zhang
 * @version 1.0
 */
public abstract class IDevice
{
    /**
     * The purpose of this device (e.g., "music", "learning", "talking").
     * It is final because the purpose cannot change after construction.
     */
    private final String purpose;

    /**
     * Constructs an IDevice with the given purpose.
     *
     * @param purpose the purpose string for this device
     */
    public IDevice(final String purpose)
    {
        this.purpose = purpose;
    }

    /**
     * Returns the purpose of this device.
     *
     * @return the purpose string
     */
    public final String getPurpose()
    {
        return purpose;
    }

    /**
     * Prints the details of the device.
     */
    public abstract void printDetails();
}
