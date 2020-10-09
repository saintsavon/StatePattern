public class ClawMachineMain {

	public static void main(String[] args) {
		int count = 0;

		if (args.length < 2) {
			System.out.println("ClawMachine <name> <inventory>");
			System.exit(1);
		}

		try {
			count = Integer.parseInt(args[1]);
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(1);
			}
			ClawMachine clawMachine = new ClawMachine(args[0], count);

			ClawMonitor monitor = new ClawMonitor(clawMachine);

		System.out.println(clawMachine);

		clawMachine.insertPayment();
		clawMachine.dropClaw();
		clawMachine.insertPayment();
		clawMachine.dropClaw();

		System.out.println(clawMachine);

		clawMachine.insertPayment();
		clawMachine.dropClaw();
		clawMachine.insertPayment();
		clawMachine.dropClaw();

		System.out.println(clawMachine);

		clawMachine.insertPayment();
		clawMachine.dropClaw();
		clawMachine.insertPayment();
		clawMachine.dropClaw();

		System.out.println(clawMachine);

		clawMachine.insertPayment();
		clawMachine.dropClaw();
		clawMachine.insertPayment();
		clawMachine.dropClaw();

		System.out.println(clawMachine);

		clawMachine.insertPayment();
		clawMachine.dropClaw();
		clawMachine.insertPayment();
		clawMachine.dropClaw();

		System.out.println(clawMachine);

		monitor.report();
	}
}