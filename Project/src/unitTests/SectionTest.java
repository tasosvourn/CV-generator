/* Vournazidis Anastasios AM:2413
Vournazidis Georgios AM:2031 */

package unitTests;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;

import data.*;

public class SectionTest {

	@Test
	public void test() throws ParseException {
		Section actual = new Section();
		Section expected = new Section();
		String title = "title";
		String contents = "An example of paragraph";
		Paragraph par = new Paragraph(contents);
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date date1 = format.parse("28/08/1997");
		String contents1 = "Example of bulletlist item content.";
		BulletListItem bli1 = new BulletListItem(date1, contents1);
		Date date2 = format.parse("28/08/1996");
		String contents2 = "Another example of bulletlist item content.";
		BulletListItem bli2 = new BulletListItem(date2, contents2);
		Date date3 = format.parse("28/08/1995");
		String contents3 = "A third example of bulletlist item content.";
		BulletListItem bli3 = new BulletListItem(date3, contents3);
		
		actual.setTitle(title);
		actual.addParagraph(par.getParagraph());
		actual.addBulletListItem(bli1);
		actual.addBulletListItem(bli2);
		actual.addBulletListItem(bli3);
		expected.setTitle("title");
		expected.addParagraph("An example of paragraph");
		expected.addBulletListItem(new BulletListItem(date1, contents1));
		expected.addBulletListItem(new BulletListItem(date2, contents2));
		expected.addBulletListItem(new BulletListItem(date3, contents3));
		
		
		//Test if equal
		assertEquals(actual, expected);
	}

}
