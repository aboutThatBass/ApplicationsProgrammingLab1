/**
 * Defines passenger-related services for transport units.
 * Implementing classes should be able to provide entertainment
 * and maintain a passenger manifest.
 */
public interface PassengerServices {

    /**
     * Starts passenger entertainment services.
     */
    public void startEntertainment();

    /**
     * Returns the passenger manifest.
     */
    public String getPassengerManifest();
}
