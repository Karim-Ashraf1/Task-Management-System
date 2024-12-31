package taskmanagement.tms.Util;

/// Singleton utility class for logging.
public class Logger {

    private static Logger instance; // Singleton instance

    private Logger() {
        // Private constructor to prevent instantiation
    }

    public static synchronized Logger getInstance() {
        // Returns the singleton instance, creating it if necessary
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        // Prints the log message to the console
        System.out.println("[LOG] " + message);
    }
}
