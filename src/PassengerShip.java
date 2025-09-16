/**
 * Represents a passenger ship that can carry passengers,
 * provide entertainment, and manage cabins.
 */
public class PassengerShip extends Ship implements PassengerServices {
    private int passengerCapacity;
    private int passengerCount;
    private int numCabins;
    private boolean entertainment;

    /**
     * Creates a passenger ship with full details.
     */
    public PassengerShip(String name, String registrationNumber, double tonnage, int crewSize, double currentSpeed, String currentPort, int passengerCapacity, int passengerCount, int numCabins, boolean entertainment) {
        super(name, registrationNumber, tonnage, crewSize, currentSpeed, currentPort);
        this.passengerCapacity = passengerCapacity;
        this.passengerCount = passengerCount;
        this.numCabins = numCabins;
        this.entertainment = entertainment;
    }

    /**
     * Starts passenger entertainment services.
     */
    @Override
    public void startEntertainment(){
        entertainment = true;
    }

    /**
     * Returns the passenger manifest.
     * Currently a placeholder.
     */
    @Override
    public String getPassengerManifest(){
        return "TODO: fix method";
    }

    /**
     * Docks the ship at a port and disembarks passengers.
     */
    @Override
    public void dock(String port){
        super.dock(port);
        this.disembarkPassengers();
    }

    /**
     * Disembarks all passengers, resetting the passenger count to zero.
     */
    private void disembarkPassengers(){
        this.passengerCount = 0;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPassenger Capacity: " + this.passengerCapacity + "\nPassenger Count: " + this.passengerCount + "\nNumber of Cabins: " + this.numCabins + "\nEntertainment: " + this.entertainment;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public int getNumCabins() {
        return numCabins;
    }

    public void setNumCabins(int numCabins) {
        this.numCabins = numCabins;
    }

    public boolean entertainmentRunning() {
        return entertainment;
    }

    public void setEntertainment(boolean entertainment) {
        this.entertainment = entertainment;
    }
}
