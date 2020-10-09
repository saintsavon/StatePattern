import java.io.*;

public interface State {
 
	public void insertPayment();
	public void ejectPayment();
    public void dropClaw();
	public void dispense();
	
	public void refill();
}