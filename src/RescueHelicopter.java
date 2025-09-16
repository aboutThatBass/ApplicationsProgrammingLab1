/**
 * Represents a rescue helicopter that can deploy medical kits
 * and provide emergency support. May be equipped with a rescue hoist.
 */
public class RescueHelicopter implements EmergencySupport{
    private String callSign;
    private String baseLocation;
    private int numMedicalKits;
    private double altitude;
    private double currentSpeed;
    private boolean rescueHoist;

    /**
     * Creates a rescue helicopter with full details.
     */
    public RescueHelicopter(String callSign, String baseLocation, int numMedicalKits, double altitude, double currentSpeed, boolean rescueHoist) {
        this.callSign = callSign;
        this.baseLocation = baseLocation;
        this.numMedicalKits = numMedicalKits;
        this.altitude = altitude;
        this.currentSpeed = currentSpeed;
        this.rescueHoist = rescueHoist;
    }

    /**
     * Creates a rescue helicopter without altitude or speed specified.
     */
    public RescueHelicopter(String callSign, String baseLocation, int numMedicalKits,boolean rescueHoist) {
        this.callSign = callSign;
        this.baseLocation = baseLocation;
        this.numMedicalKits = numMedicalKits;
        this.rescueHoist = rescueHoist;
    }

    /**
     * Deploys all available medical kits and resets the kit count to zero.
     */
    @Override
    public void deployAid(){
        System.out.println("Rescue helicopter " + this.getCallSign() + " is deploying " + this.numMedicalKits + " medical kits.");
        numMedicalKits = 0;
    }

    /**
     * Returns a readiness report including call sign, base, kits, and hoist status.
     */
    @Override
    public String getEmergencyReadinessReport(){
        String str = "";
        str += "Helicopter Emergency Report:\nCall Sign: " + this.callSign
                + "\nBase Location: " + this.baseLocation
                + "\nMedical Kits: " + this.numMedicalKits
                + "\nRescue Hoist: " + (rescueHoist ? "Available" : "Unavailable")
                + "\n=======================================";
        return str;
    }

    @Override
    public String toString(){
        return "\n\nRescueHelicopter" + "\nCallsign: " + this.callSign + "\nBase Location: " + this.baseLocation + "\nNumber of Medical Kits: " +  this.numMedicalKits + "\nAltitude: " + this.altitude + "\nCurrent Speed: " + this.currentSpeed + "\nRescue Hoist: " + this.rescueHoist;
    }

    public String getCallSign() {
        return callSign;
    }

    public void setCallSign(String callSign) {
        this.callSign = callSign;
    }

    public String getBaseLocation() {
        return baseLocation;
    }

    public void setBaseLocation(String baseLocation) {
        this.baseLocation = baseLocation;
    }

    public int getNumMedicalKits() {
        return numMedicalKits;
    }

    public void setNumMedicalKits(int numMedicalKits) {
        this.numMedicalKits = numMedicalKits;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public boolean hasRescueHoist() {
        return rescueHoist;
    }

    public void setRescueHoist(boolean rescueHoist) {
        this.rescueHoist = rescueHoist;
    }
}
