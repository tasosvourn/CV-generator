/* Vournazidis Anastasios AM:2413
Vournazidis Georgios AM:2031 */


package data;

import java.util.*;
import java.io.*;



public class SaveTxt {
	
	private boolean exists = false;
	
	public SaveTxt(){}
	
	public SaveTxt(CV cv){
		
		File file = new File("C:\\Users\\Tasos\\Desktop\\" + cv.getName() + "'s " + cv.getType() + ".txt");
		int k = 1;
		while(file.exists()){
			file.renameTo(new File("C:\\Users\\Tasos\\Desktop\\" + cv.getName() + "'s " + cv.getType() + "(" + k +").txt"));
			k++;
		}
		
		if(file.exists()){
			exists = true;
		}
		
		try{
			PrintWriter writer = new PrintWriter(file, "UTF-8");
			writer.println("1.	GENERAL INFORMATION");
			writer.println("Name: " + cv.getName());
			writer.println("Address: " + cv.getAddress());
			writer.println("Telephone(Home): " + cv.getTelHome());
			writer.println("Telephine(Mobile): " + cv.getTelMob());
			writer.println("Email: " + cv.getEmail());
			writer.println();
			writer.println("2.	PROFESSIONAL PROFILE");
			writer.println(cv.getSection(1).getParagraph());
			writer.println();
			if(cv.getType().equals("chrCV")){
				writer.println("3.	CORE STRERNGTHS");
				writer.println(cv.getSection(2).getParagraph());
				writer.println();
			}else{
				writer.println("3.	SKILLS AND EXPERIENCE");
				for (int i = 0; i < cv.getSection(2).getSize(); i++){
					String[] s = cv.getSection(2).getBulletListItem(i).getContents().split("\n");
					writer.println("	3."+ i + "	SKILLS AND EXPERIENCE ON " + s[0]);
					writer.println("	" + s[1]);
				}
				writer.println();
			}
			if(cv.getType().equals("funCV")){
				writer.println("4.	CAREER SUMMARY");
				for(int i = 0; i < cv.getSection(3).getSize(); i++){
					writer.println(cv.getSection(3).getBulletListItem(i).getContents());
				}
				writer.println();
			}else{
				writer.println("4.	PROFESSIONAL EXPERIENCE");
				for(int i = 0; i < cv.getSection(3).getSize(); i++){
					String[] s = cv.getSection(3).getBulletListItem(i).getContents().split("\n");
					writer.println(s[0]);
					writer.println(s[1]);
					for(int j = 0; j < cv.getSection(3).getBulletListItem(i).getSize(); j++){
						writer.println("	" + cv.getSection(3).getBulletListItem(i).getAchiev(j));
					}
				}
				writer.println();
			} 
			
			writer.println("5.	EDUCATION AND TRAINING");
			for(int i = 0; i < cv.getSection(4).getSize(); i++){
				writer.println(cv.getSection(4).getBulletListItem(i).getContents());
			}
			writer.println();
			writer.println("6.	FURTHER COURSES");
			for(int i = 0; i < cv.getSection(5).getSize(); i++){
				writer.println(cv.getSection(5).getBulletListItem(i).getContents());
			}
			writer.println();
			writer.println("7.	ADDITIONAL INFORMATION");
			writer.println(cv.getSection(6).getParagraph());
			writer.println();
			writer.println("8.	INTERESTS");
			writer.println(cv.getSection(7).getParagraph());
			writer.println();
			writer.println();
			writer.close();
			return;
		} catch (IOException e) {
		   // do something
			e.printStackTrace();
		}
	}

	public boolean exists(){
		return exists;
	}
}
