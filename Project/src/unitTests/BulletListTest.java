/* Vournazidis Anastasios AM:2413
Vournazidis Georgios AM:2031 */

package unitTests;
import data.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class BulletListTest {


	@Test
	public void testBulletList() throws ParseException{
		BulletList actual = new BulletList();
		BulletList expected = new BulletList();
		Date date = new Date();
		Date dateA = new Date();
		Date dateB = new Date();
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		date = format.parse("27/02/1993");
		dateA = format.parse("27/02/1994");
		dateB = format.parse("27/02/1995");
		String content = "test";
		String contentA = "testA";
		String contentB = "testB";
		BulletListItem BulletListItemA = new BulletListItem(date,content);
		BulletListItem BulletListItemB = new BulletListItem(dateA,contentA);
		BulletListItem BulletListItemC = new BulletListItem(dateB,contentB);
		actual.addItem(BulletListItemA);
		actual.addItem(BulletListItemB);
		actual.addItem(BulletListItemC);
		expected.addItem(new BulletListItem(format.parse("27/02/1993"), "test"));
		expected.addItem(new BulletListItem(format.parse("27/02/1994"), "testA"));
		expected.addItem(new BulletListItem(format.parse("27/02/1995"), "testB"));
		
		//Test if equal
		assertEquals(actual, expected);
	
	}
}

