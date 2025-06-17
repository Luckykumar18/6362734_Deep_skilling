public class Logger {
    private static Logger instance;

    // private constructor to prevent instantiation
    private Logger() {
        System.out.println("Logger initialized.");
    }

    // global access point to get the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // method to simulate logging
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
