import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class AdvanceJavaClass {

    public static void main(String args[]) {

        Logger log = Logger.getLogger(AdvanceJavaClass.class);

        BasicConfigurator.configure();

        log.info("Java class for Advanced users");

        log.info("Argument :" + args[0]);
        log.info("Argument :" + args[1]);
        log.info("Argument :" + args[2]);
        log.info("Argument :" + args[3]);
        log.info("Argument :" + args[4]);
        log.info("Argument :" + args[5]);
        log.info("Argument :" + args[6]);


        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = a + b;
        log.info("Add a and b =" + c);

    }

}
