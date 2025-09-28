public class IPod extends IDevice
{

    private static final String IPodPurpose = "music";
    private final int numStoredSongs;
    private final double maxVolume;

     public IPod(final int numStoredSongs,
                final double maxVolume)
    {
        super(IPodPurpose);
        this.numStoredSongs = numStoredSongs;
        this.maxVolume = maxVolume;
    }

    @Override
    public void printDetails()
    {
        System.out.println("IPod purpose: " + IPodPurpose
                + ", songs stored: " + numStoredSongs
                + ", max volume: " + maxVolume + " dB");
    }

}
