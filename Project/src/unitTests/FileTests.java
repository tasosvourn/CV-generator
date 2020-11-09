/* Vournazidis Anastasios AM:2413
Vournazidis Georgios AM:2031 */

package unitTests;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import gui.SelectType;

import org.junit.Test;

import data.BulletListItem;
import data.CV;
import data.SaveTex;
import data.SaveTxt;
import data.Section;

public class FileTests {

	@Test
	public void test() throws ParseException {
		
		CV cv = new CV();
		CV cv1 = new CV();
		CV cv2 = new CV();
		
		Section sec = new Section("Test section");
		Section sec1 = new Section("Test section 1");
		sec1.addParagraph("Paragraph example");
		Section sec2 = new Section("Test section 2");
		sec2.addParagraph("Another paragraph example");
		Section sec3 = new Section("Test section 3");
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date date1 = format.parse("30/05/2017");
		String contents = "Company, Job title, Date" + "\n" + "Example of responsibilities.";
		BulletListItem bli1 = new BulletListItem();
		bli1.addListItem("Achievement 1");
		bli1.addListItem("Achievement 2");
		bli1.addListItem("Achievement 3");
		bli1.setDate(date1);
		bli1.setContents(contents);
		sec3.addBulletListItem(bli1);
		Date date2 = format.parse("31/05/2017");
		BulletListItem bli2 = new BulletListItem(date2, contents + "!!!!");
		bli2.addListItem("Achievement 1!!!!");
		bli2.addListItem("Achievement 2!!!!");
		bli2.addListItem("Achievement 3!!!!");
		sec3.addBulletListItem(bli2);
		Section sec4 = new Section("Test section 4");
		sec4.addBulletListItem(new BulletListItem(date1, "Qualification, Establishment, Location, " + date1.toString()));
		sec4.addBulletListItem(new BulletListItem(date2, "Qualification!!, Establishment!!, Location!!, " + date2.toString()));
		Section sec5 = new Section("Test section 5"); 
		sec5.addBulletListItem(new BulletListItem(date1, "Course, Establishment, Location, " + date1.toString()));
		sec5.addBulletListItem(new BulletListItem(date2, "Course!!, Establishment!!, Location!!, " + date2.toString()));
		Section sec6 = new Section("Test section 6");
		sec6.addParagraph("Example of paragraph");
		Section sec7 = new Section("Test section 7");
		sec7.addParagraph("Another example of paragraph.");
		
		Section sec8 = new Section("Test section 8");
		String skills1 = "Skill 1 \n Skill 1 description paragraph";
		sec8.addBulletListItem(new BulletListItem(null, skills1));
		String skills2 = "Skill 2 \n Skill 2 description paragraph";
		sec8.addBulletListItem(new BulletListItem(null, skills2));
		String skills3 = "Skill 3 \n Skill 3 description paragraph";
		sec8.addBulletListItem(new BulletListItem(null, skills3));
		Section sec9 = new Section("Test section 9");
		sec9.addBulletListItem(new BulletListItem(date1, "Company name, job title, " + date1.toString()));
		sec9.addBulletListItem(new BulletListItem(date2, "Company name!!, job title!!, " + date2.toString()));
		
		cv.setType("chrCV");
		cv.setName("Name");
		cv.setAddress("Street 1");
		cv.setTelHome("1234567890");
		cv.setTelMob("0987654321");
		cv.setEmail("email@server.com");
		cv.addSection(sec);
		cv.addSection(sec1);
		cv.addSection(sec2);
		cv.addSection(sec3);
		cv.addSection(sec4);
		cv.addSection(sec5);
		cv.addSection(sec6);
		cv.addSection(sec7);
		
		cv1.setType("funCV");
		cv1.setName("Name");
		cv1.setAddress("Street 1");
		cv1.setTelHome("1234567890");
		cv1.setTelMob("0987654321");
		cv1.setEmail("email@server.com");
		cv1.addSection(sec);
		cv1.addSection(sec1);
		cv1.addSection(sec8);
		cv1.addSection(sec9);
		cv1.addSection(sec4);
		cv1.addSection(sec5);
		cv1.addSection(sec6);
		cv1.addSection(sec7);
		
		cv2.setType("comCV");
		cv2.setName("Name");
		cv2.setAddress("Street 1");
		cv2.setTelHome("1234567890");
		cv2.setTelMob("0987654321");
		cv2.setEmail("email@server.com");
		cv2.addSection(sec);
		cv2.addSection(sec1);
		cv2.addSection(sec8);
		cv2.addSection(sec3);
		cv2.addSection(sec4);
		cv2.addSection(sec5);
		cv2.addSection(sec6);
		cv2.addSection(sec7);
		
		SaveTxt file1 = new SaveTxt(cv);
		SaveTex file2 = new SaveTex(cv);
		SaveTxt file3 = new SaveTxt(cv1);
		SaveTex file4 = new SaveTex(cv1);
		SaveTxt file5 = new SaveTxt(cv2);
		SaveTex file6 = new SaveTex(cv2);
		
	}
}
