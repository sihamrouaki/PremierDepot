package HelloWorldServer;
import HelloWorld.HelloWorldApp.*;           // classes générées par idlj
import org.omg.PortableServer.*;
import org.omg.CORBA.*;


public class HelloServant extends HelloPOA {
    private String message = "Bonjour tous Le monde !!";
    private ORB orb;

    public void setOrb(ORB orb) {
        this.orb = orb;
    }


	@Override
	public String HelloMessage() {
		// TODO Auto-generated method stub
		return message;
	}

	@Override
	public void HelloMessage(String newHelloMessage) {
		message=newHelloMessage;
		
	}
}