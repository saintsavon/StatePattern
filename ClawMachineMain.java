import java.rmi.*;

public class ClawMachineMain {

	public static void main(String[] args) {
		ClawMachineRemote clawMachine = null;
		int count;

		if (args.length < 2) {
			System.out.println("ClawMachine <name> <inventory>");
			System.exit(1);
		}

		try {
			count = Integer.parseInt(args[1]);

			clawMachine = new ClawMachine(args[0], count);
			Naming.rebind("//" + args[0] + "/clawMachine", clawMachine);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}