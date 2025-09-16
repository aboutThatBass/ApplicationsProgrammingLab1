/**
 * Defines navigation behavior for vehicles or vessels.
 * Implementing classes should be able to move to a destination
 * and track their current speed.
 */
public interface Navigable {
    /**
     * Moves the vehicle or vessel to the given destination.
     *
     * @param destination the target location
     */
    public void navigateTo(String destination);

    /**
     * Sets the current speed.
     *
     * @param speed the speed to set
     */
    public void setCurrentSpeed(double speed);

    /**
     * Gets the current speed.
     *
     * @return the current speed
     */
    public double getCurrentSpeed();
}
