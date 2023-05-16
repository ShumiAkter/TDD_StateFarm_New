package misc;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import org.testng.annotations.Test;
import utils.Configuration;

public class UnitTest {
	Configuration config = new Configuration();
	@Test
	public void configurationUnitTest() {
		Configuration conf = new Configuration();
		System.out.println(conf.getProp("browser"));
	}
	@Test
	public void confiNumTest() {
		System.out.println(config.getPropN("pageLoad"));
	}
@Test
public void systemGetPropTest() {
	System.out.println(System.getProperty("user.dir"));
}
@Test
public void fileops() {
	File folderFile = new File(System.getProperty("user.dir")+"/screenShot");
	System.out.println(folderFile.exists());
	
}
@Test
public void dateTest() {
	System.out.println( new Date());
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy  hh:mm:sss ");
	System.out.println(dateFormat.format(new Date()));
	System.out.println(Instant.now());
}
}
