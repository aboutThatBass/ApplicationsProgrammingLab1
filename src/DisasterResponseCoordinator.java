import java.util.ArrayList;

/**
 * Coordinates multiple emergency response units during a disaster.
 * Maintains a registry of responders and provides methods to deploy
 * them and print readiness reports.
 */
public class DisasterResponseCoordinator {
    private ArrayList<EmergencySupport> responders;

    /**
     * Creates an empty coordinator with no registered responders.
     */
    public DisasterResponseCoordinator() {
        this.responders = new ArrayList<>();
    }

    /**
     * Registers a new emergency responder.
     *
     * @param responder is the responder to add
     */
    public void registerResponder(EmergencySupport responder) {
        this.responders.add(responder);
    }

    /**
     * Deploys all registered responders by calling their deployAid() method.
     */
    public void deployAll(){
        System.out.println("Deploying all emergency units:");
        for (EmergencySupport responder : responders) {
            responder.deployAid();
        }
    }

    /**
     * Prints readiness reports for all registered responders.
     */
    public void printAllReadinessReports(){
        System.out.println("Emergency Readiness Reports:");
        for(EmergencySupport responder : responders){
            System.out.println(responder.getEmergencyReadinessReport());
        }
    }

    /**
     * Returns a string representation of all registered responders.
     */
    @Override
    public String toString(){
        String str = "";
        System.out.println("DisasterResponseCoordinator");
        for(EmergencySupport responder : responders){
            str += responder.toString();
        }
        return str;
    }
}
