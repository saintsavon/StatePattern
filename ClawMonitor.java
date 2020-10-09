import java.rmi.*;

public class ClawMonitor {
    ClawMachine machine;

    public ClawMonitor(ClawMachineRemote machine) {
        this.machine = (ClawMachine) machine;
    }

    public void report() {
        try {
        System.out.println("Claw Machine: " + machine.getLocation());
        System.out.println("Current Inventory: " + machine.getCount() + " prizes");
        System.out.println("Current state: " + machine.getState());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
