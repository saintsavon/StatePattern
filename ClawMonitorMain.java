import java.rmi.*;

public class ClawMonitorMain {

    public static void main(String[] args) {
        String[] location = {"rmi://santafe.clawmachine.com/clawmachine",
                             "rmi://boulder.clawmachine.com/clawmachine",
                             "rmi://austin.clawmachine.com/clawmachine"};
    
        if (args.length >= 0)
        {
            location = new String[1];
            location[0] = "rmi://" + args[0] + "/clawmachine";
        }

            ClawMonitor[] monitor = new ClawMonitor[location.length];

            for (int i=0;i < location.length; i++) {
                try {
                    ClawMachineRemote machine = (ClawMachineRemote) Naming.lookup(location[i]);
                    monitor[i] = new ClawMonitor(machine);
                    System.out.println(monitor[i]);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            for (int i=0; i < monitor.length; i++) {
                monitor[i].report();
            }
        }
    
}
