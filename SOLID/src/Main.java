import Interfaces.Appender;
import Interfaces.Layout;
import Interfaces.Logger;
import controllers.ConsoleAppender;
import controllers.XmlLayout;
import logger.MessageLogger;

public class Main {
    public static void main(String[] args) {
         /* Layout   simpleLayout    = new SimpleLayout ();
        Appender consoleAppender = new ConsoleAppender (simpleLayout);
        Logger   logger          = new MessageLogger (consoleAppender);
        logger.logError ("3/26/2015 2:08:11 PM", "Error parsing JSON.");
        logger.logInfo ("3/26/2015 2:08:11 PM", "User Pesho successfully registered.");*/
        Layout xmlLayout = new XmlLayout();
        Appender consoleAppender = new ConsoleAppender(xmlLayout);
        Logger logger = new MessageLogger(consoleAppender);

        logger.logFatal("3/31/2015 5:23:54 PM", "mscorlib.dll does not respond");
        logger.logCritical("3/31/2015 5:23:54 PM", "No connection string found in App.config");
    }
}
