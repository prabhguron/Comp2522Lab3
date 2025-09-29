/**
 * The IPhone16 class extends IPhone and represents a modern smartphone
 * with additional features beyond the base IPhone class.
 *
 * It adds fields for high-resolution camera capability and memory capacity.
 * Demonstrates multilevel inheritance and method overriding.
 *
 */
public class IPhone16 extends IPhone
{
    /**
     * Whether this IPhone16 has a high-resolution camera.
     * final → cannot be reassigned after construction.
     */
    private final boolean highResCamera;

    /**
     * The memory capacity (in gigabytes) of this IPhone16.
     * final → cannot be reassigned after construction.
     */
    private final int memoryGB;

    /**
     * Constructs a new IPhone16 object with minutes remaining, carrier,
     * high-resolution camera capability, and memory capacity.
     *
     * @param minutesRemaining number of minutes remaining on the phone plan
     * @param carrier          the wireless carrier for this IPhone16
     * @param highResCamera    whether the phone has a high-resolution camera
     * @param memoryGB         the memory capacity in gigabytes
     */


    public IPhone16(final double minutesRemaining,
                    final String carrier,
                    final boolean highResCamera,
                    final int memoryGB)
    {

        super(minutesRemaining, carrier);
        this.highResCamera = highResCamera;
        this.memoryGB = memoryGB;
    }
}
