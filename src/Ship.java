/**
 * Abstract base class for ships.
 * Stores common attributes like name, registration number, tonnage,
 * crew size, speed, and current port. Implements basic navigation
 * and docking behavior.
 */
public abstract class Ship implements Navigable{
    private String name;
    private String registrationNumber;
    private double tonnage;
    private int crewSize;
    private double currentSpeed;
    private String currentPort;

    /**
     * Creates a ship with all details including current speed.
     */
    public Ship(String name, String registrationNumber, double tonnage, int crewSize, double currentSpeed, String currentPort) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.tonnage = tonnage;
        this.crewSize = crewSize;
        this.currentSpeed = currentSpeed;
        this.currentPort = currentPort;
    }

    /**
     * Creates a ship without current speed specified.
     */
    public Ship(String name, String registrationNumber, double tonnage, int crewSize, String currentPort) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.tonnage = tonnage;
        this.crewSize = crewSize;
        this.currentPort = currentPort;
    }

    /**
     * Navigates the ship to a new destination port.
     */
    @Override
    public void navigateTo(String destination) {
        this.currentPort = destination;
    }

    /**
     * Docks the ship at the given port and stops its movement.
     */
    public void dock(String port){
        this.currentPort = port;
        this.currentSpeed = 0;
    }

    @Override
    public String toString(){
        return "\nName: " + this.name
                + "\nRegistration Number: " + this.registrationNumber
                + "\nTonnage: " + this.tonnage
                + "\nCrew Size: " + this.crewSize
                + "\nCurrent Speed: " + this.currentSpeed
                + "\nCurrent Port: " + this.currentPort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    public int getCrewSize() {
        return crewSize;
    }

    public void setCrewSize(int crewSize) {
        this.crewSize = crewSize;
    }

    @Override
    public double getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public String getCurrentPort() {
        return currentPort;
    }

    public void setCurrentPort(String currentPort) {
        this.currentPort = currentPort;
    }


}
