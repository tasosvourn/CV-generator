/* Vournazidis Anastasios AM:2413
Vournazidis Georgios AM:2031 */

package unitTests;

import data.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class CVTest {
	
	@Test
	public void cvComparison(){
		
		CV actual = new CV();
		CV expected = new CV();
		Section sec1 = new Section("Test section 1");
		Section sec2 = new Section("Test section 2"); 
		Section sec3 = new Section("Test section 3");
		
		actual.setType("type");
		actual.setName("Name");
		actual.setAddress("Street 1");
		actual.setTelHome("1234567890");
		actual.setTelMob("0987654321");
		actual.setEmail("email@server.com");
		actual.addSection(sec1);
		actual.addSection(sec2);
		actual.addSection(sec3);
		expected.setType("type");
		expected.setName("Name");
		expected.setAddress("Street 1");
		expected.setTelHome("1234567890");
		expected.setTelMob("0987654321");
		expected.setEmail("email@server.com");
		expected.addSection(sec1);
		expected.addSection(sec2);
		expected.addSection(sec3);
		
		//Test if equal
		assertEquals(actual, expected);
	}
}
