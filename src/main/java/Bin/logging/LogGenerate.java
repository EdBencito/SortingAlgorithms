package Bin.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogGenerate {
    private static Logger l = LogManager.getLogger("My Sparta App");

    public static void main(String[] args) {
        l.info("this is an info function");
        l.error("This is an error function");
    }
}
