package HelloWorldClient;


import HelloWorld.HelloWorldApp.*; 
import org.omg.CORBA.*;
import org.omg.CosNaming.*;

public class HelloWorldClient {
    public static void main(String[] args) {
        try {
            ORB orb = ORB.init(args, null);

            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            String name = "Hello";
            Hello hello = HelloHelper.narrow(ncRef.resolve_str(name));

            System.out.println("Obtained a handle on server object: " + hello);
            System.out.println(hello.HelloMessage());
        } catch (Exception e) {
            System.err.println("ERROR : " + e);
            e.printStackTrace(System.out);
        }
    }
}
