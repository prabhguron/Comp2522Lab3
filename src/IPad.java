import java.util.Objects;

/**
 * The IPad class extends IDevice and represents an iPad device
 * with specific properties like whether it has a case and what
 * operating system it uses.
 *
 * Demonstrates inheritance, use of final fields, and overriding methods.
 */
public class IPad extends IDevice
{
    /**
     * A constant purpose for all iPads.
     * Declared static final because it never changes.
     */
    private static final String IPAD_PURPOSE = "learning";

    /**
     * Whether this iPad has a protective case.
     * final → cannot be reassigned after construction.
     */
    private final boolean withCase;

    /**
     * The operating system this iPad runs (e.g., iOS).
     * final → cannot be reassigned after construction.
     */
    private final String operatingSystem;

    /**
     * Constructs a new IPad object with the given case status
     * and operating system. Calls the IDevice constructor to
     * set the constant purpose.
     *
     * @param withCase          whether the iPad has a case
     * @param operatingSystem  the operating system of the iPad
     */
    public IPad(final boolean withCase,
                final String operatingSystem)
    {
        super(IPAD_PURPOSE);   // call parent constructor with constant purpose
        this.withCase = withCase;
        this.operatingSystem = operatingSystem;
    }

    /**
     * Prints the details of the iPad, including its purpose,
     * case status, and operating system.
     * Overrides the abstract/parent method from IDevice.
     */
    @Override
    public void printDetails()
    {
        System.out.println(
                "iPad purpose: " + IPAD_PURPOSE +
                        ", has case: " + withCase +
                        ", OS: " + operatingSystem);
    }

    /**
     * Determines whether this IPad is equal to another object.
     * Two IPad objects are considered equal if they have the same operating
     * system
     * @param that the object to compare with this IPad
     * @return true if the given object is an IPad with the same operating system;
     *         false otherwise
     */

    @Override
    public boolean equals(final Object that)
    {
        if (this == that)
        {
            return true;
        }

        if (that == null || getClass() != that.getClass())
        {
            return false;
        }

        final IPad pod = (IPad) that;

        return Objects.equals(operatingSystem, pod.operatingSystem);
    }


}
