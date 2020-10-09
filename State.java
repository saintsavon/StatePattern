import java.io.*;

public interface State extends Serializable {
 
	public void insertPayment();
	public void ejectPayment();
    public void dropClaw();
	public void dispense();
	
}