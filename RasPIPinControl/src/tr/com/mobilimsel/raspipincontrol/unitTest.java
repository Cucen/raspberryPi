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
		 FileWriter[] commandChannels;  
		    try {  
		      // Open file handles to GPIO port unexport and export controls  

		      // Loop through all ports if more than 1  
		      for (String gpioChannel : GpioChannels) {  
		        System.out.println(gpioChannel);  
		    
		     
		      }  
		      // Set up a GPIO port as a command channel  
		      FileWriter commandChannel = new   
		               FileWriter("value");  
		        
		      int period = 2000; // Sleep time in milliseconds  
		        
		      while (true) {  
		          // HIGH: Set GPIO port ON  
		          commandChannel.write(GPIO_ON);  
		          commandChannel.flush();          
		          java.lang.Thread.sleep(period);  
		      
		          // LOW: Set GPIO port OFF  
		          commandChannel.write(GPIO_OFF);  
		          commandChannel.flush();  
		          java.lang.Thread.sleep(period);  
		        }    
		    } catch (Exception exception) {  
		      exception.printStackTrace();  
		    }   
	}

}
