/**
 * The IPod class extends IDevice and represents an iPod device
 * with properties like the number of songs stored and maximum volume level.
 */

public class IPod extends IDevice
{
    /**
     * A constant purpose for all iPods.
     * Declared static final because it never changes.
     */
    private static final String IPOD_PURPOSE = "music";

    /**
     * The total number of songs stored on this iPod.
     * final → cannot be reassigned after construction.
     */
    private final int numStoredSongs;

    /**
     * The maximum volume level (in decibels) for this iPod.
     * final → cannot be reassigned after construction.
     */
    private final double maxVolume;

    /**
     * Constructs a new IPod object with the given number of stored songs
     * and maximum volume. Calls the IDevice constructor to set the constant purpose.
     *
     * @param numStoredSongs  the number of songs stored on the iPod
     * @param maxVolume       the maximum volume of the iPod in decibels
     */
    public IPod(final int numStoredSongs,
                final double maxVolume)
    {
        super(IPOD_PURPOSE);
        this.numStoredSongs = numStoredSongs;
        this.maxVolume = maxVolume;
    }

    /**
     * Prints the details of the iPod, including its purpose,
     * number of stored songs, and maximum volume level.
     * Overrides the abstract/parent method from IDevice.
     */
    @Override
    public void printDetails()
    {
        System.out.println("iPod purpose: " + IPOD_PURPOSE
                + ", songs stored: " + numStoredSongs
                + ", max volume: " + maxVolume + " dB");
    }

    /**
     * Determines whether this IPod is equal to another object.
     * Two IPod objects are considered equal if they have the same number
     * of stored songs, regardless of maximum volume.
     *
     * @param that the object to compare with this IPod
     * @return true if the given object is an IPod with the same number of stored songs;
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

        final IPod pod = (IPod) that;

        return numStoredSongs == pod.numStoredSongs;
    }
}
