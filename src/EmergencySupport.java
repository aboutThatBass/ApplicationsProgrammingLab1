/**
 * Defines behavior for units that can provide emergency support.
 * Implementing classes should be able to deploy aid and report readiness.
 */
public interface EmergencySupport {

    /**
     * Deploys the aid carried by this responder.
     */
    public void deployAid();

    /**
     * Returns a readiness report with the current status of this responder.
     */
    public String getEmergencyReadinessReport();
}
