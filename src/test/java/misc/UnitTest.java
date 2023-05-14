package misc;

import org.testng.annotations.Test;
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

}
