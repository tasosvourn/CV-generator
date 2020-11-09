/* Vournazidis Anastasios AM:2413
Vournazidis Georgios AM:2031 */

package unitTests;

import static org.junit.Assert.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import data.BulletListItem;

public class BulletListItemTest {

	@Test
	public void testBulletList() throws ParseException{		
		Date date = new Date();
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		date = format.parse("27/02/1993");
		String content = "test";
		BulletListItem actual = new BulletListItem(date,content);
		BulletListItem expected = new BulletListItem(format.parse("27/02/1993"),"test");
		
		assertEquals(actual, expected);
	}

}

