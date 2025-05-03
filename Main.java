public class Main {
    public static void main(String[] args) {
        // Test the simulate method (previous test)
        FrogSimulation sim1 = new FrogSimulation(24, 5);
        System.out.println("--- Simulate Tests ---");
        System.out.println("Simulation 1 successful? " + sim1.simulate());
        System.out.println("Simulation 2 successful? " + sim1.simulate());
        System.out.println("Simulation 3 successful? " + sim1.simulate());
        System.out.println("Simulation 4 successful? " + sim1.simulate());
        System.out.println("Simulation 5 successful? " + sim1.simulate());

        // Test the runSimulations method
        FrogSimulation sim2 = new FrogSimulation(24, 5);
        int numSimulations = 4;
        System.out.println("\n--- Run Simulations Test ---");
        System.out.println("Proportion of successful simulations (" + numSimulations + " trials): " + sim2.runSimulations(numSimulations));
    }
}
