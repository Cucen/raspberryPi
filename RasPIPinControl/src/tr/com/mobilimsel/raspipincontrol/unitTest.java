/**
 * 
 */
package tr.com.mobilimsel.raspipincontrol;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Muzeyyen
 *
 */
public class unitTest {
	  static final String GPIO_OUT = "out";  
	  static final String GPIO_ON = "1";  
	  static final String GPIO_OFF = "0";  
	  static String[] GpioChannels = { "24" };  

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testLedControl(){
		LedControl test = new LedControl();
		test.MyLed();
	}	

}
