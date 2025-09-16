/**
 * Represents a mobile clinic truck that can respond to emergencies.
 * Carries doctors and may be stocked with medicine.
 */
public class MobileClinicTruck implements EmergencySupport{
    private String truckID;
    private String region;
    private int doctorCount;
    private double currentSpeed;
    private boolean medicine;

    /**
     * Creates a mobile clinic truck with full details.
     */
    public MobileClinicTruck(String truckID, String region, int doctorCount, double currentSpeed, boolean medicine) {
        this.truckID = truckID;
        this.region = region;
        this.doctorCount = doctorCount;
        this.currentSpeed = currentSpeed;
        this.medicine = medicine;
    }

    /**
     * Creates a mobile clinic truck without speed specified.
     */
    public MobileClinicTruck(String truckID, String region, int doctorCount, boolean medicine) {
        this.truckID = truckID;
        this.region = region;
        this.doctorCount = doctorCount;
        this.medicine = medicine;
    }

    /**
     * Deploys the clinic truck, sending doctors and marking medicine as used.
     */
    @Override
    public void deployAid(){
        System.out.println("Mobile clinic truck " + this.truckID + " deploying " + this.doctorCount + " doctors.");
        this.medicine = false;
    }

    /**
     * Returns a readiness report including ID, region, doctors, and medicine status.
     */
    @Override
    public String getEmergencyReadinessReport(){
        String str = "";
        str += "Truck Emergency Report:\nID: " + this.truckID
                + "\nRegion: " + this.region
                + "\nDoctors on Board: " + this.doctorCount
                + "\nMedicine: " + (medicine ? "Stocked with Medicine" : "Unavailable")
                + "\n=======================================";
        return str;
    }

    @Override
    public String toString(){
        return "\n\nMobileClinicTruck" + "\nID: " + this.truckID + "\nRegion:  " + this.region + "\nDoctor Count: " + this.doctorCount + "\nCurrentSpeed: " + this.currentSpeed + "\nMedicine: " + this.medicine;
    }

    public String getTruckID() {
        return truckID;
    }

    public void setTruckID(String truckID) {
        this.truckID = truckID;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getDoctorCount() {
        return doctorCount;
    }

    public void setDoctorCount(int doctorCount) {
        this.doctorCount = doctorCount;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public boolean hasMedicine() {
        return medicine;
    }

    public void setMedicine(boolean medicine) {
        this.medicine = medicine;
    }
}
