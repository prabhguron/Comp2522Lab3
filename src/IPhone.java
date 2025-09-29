/**
 * The IPhone class extends IDevice and represents a smartphone device
 * whose primary purpose is "talking".
 *
 * It stores the carrier and the number of minutes remaining on the phone plan.
 * Demonstrates inheritance, constants, final fields, and method overriding.
 */
public class IPhone extends IDevice
{
    /**
     * A constant purpose for all IPhones.
     * Declared static final because it never changes.
     */
    private static final String PURPOSE = "talking";

    /**
     * The wireless carrier for this IPhone.
     * final → cannot be reassigned after construction.
     */
    private final String carrier;

    /**
     * The number of minutes remaining on this IPhone's phone plan.
     * final → cannot be reassigned after construction.
     */
    private final double minutesRemaining;

    /**
     * Constructs a new IPhone with the given minutes remaining and carrier.
     * Calls the IDevice constructor to set the constant purpose.
     *
     * @param minutesRemaining the number of minutes remaining on the phone plan
     * @param carrier          the wireless carrier for this IPhone
     */
    public IPhone(final double minutesRemaining,
                  final String carrier)
    {
        super(PURPOSE);
        this.carrier = carrier;
        this.minutesRemaining = minutesRemaining;
    }

    /**
     * Prints the details of the IPhone, including its purpose,
     * minutes remaining on the plan, and carrier.
     * Overrides the abstract method from IDevice.
     */
    @Override
    public void printDetails()
    {
        System.out.println(
                "IPhone purpose: " + PURPOSE +
                ", minutes remaining: " + minutesRemaining +
                ", carrier: " + carrier);
    }
}
