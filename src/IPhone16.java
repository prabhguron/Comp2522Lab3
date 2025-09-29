public class IPhone16 extends IPhone
{


    private final boolean HighResolutionCamera;
    private final int  GigabytesOfMemory;


    IPhone16(final double minutesRemaining,
             final String carrier,
             final boolean HighResolutionCamera,
             final int GigabytesOfMemory)
    {
        super(minutesRemaining, carrier);
        this.HighResolutionCamera = HighResolutionCamera;
        this.GigabytesOfMemory = GigabytesOfMemory;



    }



}
