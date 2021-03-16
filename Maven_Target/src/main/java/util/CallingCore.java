package util;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class CallingCore {
	
	
/*	
	<sourceDirectory>/Users/tawhidchowdhury/eclipse-workspace/Maven_Target/src/main/java</sourceDirectory>
   
    <scriptSourceDirectory>/Users/tawhidchowdhury/eclipse-workspace/Maven_Target/src/main/scripts</scriptSourceDirectory>
   
    <testSourceDirectory>/Users/tawhidchowdhury/eclipse-workspace/Maven_Target/src/test/java</testSourceDirectory>
   
    <outputDirectory>/Users/tawhidchowdhury/eclipse-workspace/Maven_Target/target/classes</outputDirectory>
   
    <testOutputDirectory>/Users/tawhidchowdhury/eclipse-workspace/Maven_Target/target/test-classes</testOutputDirectory>
   
    <resources>
      <resource>
     
        <directory>/Users/tawhidchowdhury/eclipse-workspace/Maven_Target/src/main/resources</directory>
     
      </resource>
    </resources>
    
    <testResources>
      <testResource>
       
        <directory>/Users/tawhidchowdhury/eclipse-workspace/Maven_Target/src/test/resources</directory>
     
      </testResource>
    </testResources>
    
    <directory>/Users/tawhidchowdhury/eclipse-workspace/Maven_Target/target</directory>
	
	
	*/

	
	public Properties testing() throws IOException, InterruptedException {
		FileInputStream v=new FileInputStream("/Users/tawhidchowdhury/eclipse-workspace/Maven_Target/src/main/resources/confit.properties");
		
		Properties p=new Properties();
		
		p.load(v);
	
		return p;
	}
	
	
	
	
	
	

}
