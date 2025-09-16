public class Lab1 {

    public static void main(String[] args) {

        // Create units
        AidShip ship = new AidShip("Madleen", "AID-001", 8000, 120, "Melona", "Medical", 200, true);
        RescueHelicopter helicopter = new RescueHelicopter("ECHO-7", "Melona", 50, true);
        MobileClinicTruck truck = new MobileClinicTruck("TRK-12", "Melona", 5, true);

        // Coordinate response
        DisasterResponseCoordinator coordinator = new DisasterResponseCoordinator();
        coordinator.registerResponder(ship);
        coordinator.registerResponder(helicopter);
        coordinator.registerResponder(truck);

        // Print readiness reports
        coordinator.printAllReadinessReports();
        System.out.println();

        // Simulate deployment
        coordinator.deployAll();
        System.out.println();

        // Display the String representation of the coordinator
        System.out.println(coordinator);
    }
}
