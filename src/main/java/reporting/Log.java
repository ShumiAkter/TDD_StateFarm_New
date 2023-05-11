package reporting;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Log {
	 static Logger loggar= Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	public static void log(String msg) {
		loggar.log(Level.INFO,msg);
	}
}

