public class ClawMachineMain {

	public static void main(String[] args) {
		ClawMachine clawMachine = 
			new ClawMachine(10);

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
	}
}