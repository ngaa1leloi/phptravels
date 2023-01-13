package commons;

import java.io.File;

public class GlobalConstants {
	public static final String PROJECT_PATH = System.getProperty("user.dir");
	public static final String OS_NAME = System.getProperty("os.name");
	public static final String UPLOAD_FILE = PROJECT_PATH + File.separator + "uploadFiles" + File.separator;
	public static final String REPORTNG_SCREENSHOT = PROJECT_PATH + File.separator + "ReportNGScreenShots" + File.separator;
	public static final long LONG_TIMEOUT = 30;
	public static final long SHORT_TIMEOUT = 5;
}
