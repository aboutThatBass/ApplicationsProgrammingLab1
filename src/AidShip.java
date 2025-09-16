/**
 * Represents a ship that delivers aid during emergencies.
 * Carries a type of aid, a supply count, and may have a helipad.
 */
public class AidShip extends Ship implements EmergencySupport {
    private String aidType;
    private int suppliesOnBoard;
    private boolean hasHelipad;


    /**
     * Creates an AidShip with speed specified.
     */
    public AidShip(String name, String registrationNumber, double tonnage, int crewSize, double currentSpeed, String currentPort, String aidType, int suppliesOnBoard, boolean hasHelipad) {
        super(name, registrationNumber, tonnage, crewSize, currentSpeed, currentPort);
        this.aidType = aidType;
        this.suppliesOnBoard = suppliesOnBoard;
        this.hasHelipad = hasHelipad;
    }

    /**
     * Creates an AidShip without specifying current speed.
     */
    public AidShip(String name, String registrationNumber, double tonnage, int crewSize, String currentPort, String aidType, int suppliesOnBoard, boolean hasHelipad) {
        super(name, registrationNumber, tonnage, crewSize, currentPort);
        this.aidType = aidType;
        this.suppliesOnBoard = suppliesOnBoard;
        this.hasHelipad = hasHelipad;
    }

    /**
     * Deploys all aid supplies and resets supply count to zero.
     */
    @Override
    public void deployAid() {
        System.out.println("Aid Ship " + this.getName() + " is deploying " + this.suppliesOnBoard + " units of Medical aid.");
        suppliesOnBoard = 0;
    }

    /**
     * Returns a readiness report with ship details and helipad status.
     */
    @Override
    public String getEmergencyReadinessReport() {
        String str = "";
        str += "Aid Ship Emergency Report:\nName: " + this.getName() + "\nAid Type: " + this.getAidType() + "\nSupplies on Board: " + this.getSuppliesOnBoard() + "\nHelipad: ";
        if(hasHelipad){
            str += "Available";
        } else{
            str += "Unavailable";
        }
        str += "\n=======================================";
        return str;
    }

    /**
     * Docks the ship at the given port and unloads supplies.
     */
    @Override
    public void dock(String port) {
        super.dock(port);
        this.unloadSupplies();
    }

    private void unloadSupplies() {
        this.suppliesOnBoard = 0;
    }

    @Override
    public String toString() {
        return "AidShip" + super.toString()
                + "\nAid Type: " + aidType
                + "\nSupplies On Board: " + suppliesOnBoard
                + "\nHas Helipad: " + hasHelipad;
    }

    public String getAidType() {
        return aidType;
    }

    public void setAidType(String aidType) {
        this.aidType = aidType;
    }

    public int getSuppliesOnBoard() {
        return suppliesOnBoard;
    }

    public void setSuppliesOnBoard(int suppliesOnBoard) {
        this.suppliesOnBoard = suppliesOnBoard;
    }

    public boolean getHasHelipad() {
        return hasHelipad;
    }

    public void setHasHelipad(boolean hasHelipad) {
        this.hasHelipad = hasHelipad;
    }
}
