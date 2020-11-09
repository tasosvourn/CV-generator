/* Vournazidis Anastasios AM:2413
Vournazidis Georgios AM:2031 */

package unitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import data.Paragraph;

public class ParagraphTest {

	@Test
	public void test() {
		String contents ="contentsTest";
		Paragraph actual = new Paragraph(contents);
		Paragraph expected = new Paragraph("contentsTest");
		
		assertEquals(actual, expected);
	}

}
