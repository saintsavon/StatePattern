public class ClawMonitor {
    ClawMachine machine;

    public ClawMonitor(ClawMachine machine) {
        this.machine = machine;
    }

    public void report() {
        System.out.println("Claw Machine: " + machine.getLocation());
        System.out.println("Current Inventory: " + machine.getCount() + " prizes");
        System.out.println("Current state: " + machine.getState());
    }
}
