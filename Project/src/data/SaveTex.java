/* Vournazidis Anastasios AM:2413
Vournazidis Georgios AM:2031 */


package data;

import java.util.*;
import java.io.*;



public class SaveTex {

	public SaveTex(CV cv){
		
		File file = new File("C:\\Users\\Tasos\\Desktop\\" + cv.getName() + "'s " + cv.getType() + ".tex");
		int k = 1;
		while(file.exists()){
			file.renameTo(new File("C:\\Users\\Tasos\\Desktop\\" + cv.getName() + "'s " + cv.getType() + "(" + k +").txt"));
			k++;
		}
		
		try{
			PrintWriter writer = new PrintWriter(file, "UTF-8");
			writer.println("\\documentclass[margin, 10pt]{res}  \n \\usepackage{helvet} \n \\begin{document} \n "
					+ "\\setlength{\\textwidth}{5.1in} \n \\moveleft.5\\hoffset\\centerline{\\large\\bf Curriculum Vitae} \n "
					+ "\\moveleft\\hoffset\\vbox{\\hrule width\\resumewidth height 1pt}\\smallskip \n \\begin{resume}");
			
			writer.println("\\section{GENERAL INFORMATION}");
			writer.println("Name: " + cv.getName());
			writer.println("\\\\Address: " + cv.getAddress());
			writer.println("\\\\Telephone(Home): " + cv.getTelHome());
			writer.println("\\\\Telephine(Mobile): " + cv.getTelMob());
			writer.println("\\\\Email: " + cv.getEmail());
			writer.println();
			writer.println("\\section{PROFESSIONAL PROFILE}");
			writer.println(cv.getSection(1).getParagraph());
			writer.println();
			if(cv.getType().equals("chrCV")){
				writer.println("\\section{CORE STRERNGTHS}");
				writer.println(cv.getSection(2).getParagraph());
				writer.println();
			}else{
				writer.println("\\section{SKILLS AND EXPERIENCE}");
				writer.println("\\begin{itemize} \\itemsep -2pt");
				for (int i = 0; i < cv.getSection(2).getSize(); i++){
					String[] s = cv.getSection(2).getBulletListItem(i).getContents().split("\n");
					writer.println("\\item SKILLS AND EXPERIENCE ON" + s[0]);
					writer.println("\\begin{itemize} \\itemsep -2pt");
					writer.println("\\item " + s[1]);
					writer.println("\\end{itemize} ");
				}
				writer.println("\\end{itemize}");
				writer.println();
			}
			if(cv.getType().equals("funCV")){
				writer.println("\\section{CAREER SUMMARY}");
				writer.println("\\begin{itemize} \\itemsep -2pt");
				for(int i = 0; i < cv.getSection(3).getSize(); i++){
					writer.println("\\item " + cv.getSection(3).getBulletListItem(i).getContents());
				}
				writer.println("\\end{itemize}");
			}else{
				writer.println("\\section{PROFESSIONAL EXPERIENCE}");
				writer.println("\\begin{itemize} \\itemsep -2pt");
				for(int i = 0; i < cv.getSection(3).getSize(); i++){
					String[] s = cv.getSection(3).getBulletListItem(i).getContents().split("\n");
					writer.println("\\item " +s[0]);
					writer.println("\\begin{itemize}");
					writer.println("\\item " +s[1]);
					for(int j = 0; j < cv.getSection(3).getBulletListItem(i).getSize(); j++){
						writer.println("\\item " + cv.getSection(3).getBulletListItem(i).getAchiev(j));
					}
					writer.println("\\end{itemize}");
					
				}
				writer.println("\\end{itemize}");
				writer.println();
			}
			
			writer.println("\\section{EDUCATION AND TRAINING}");
			writer.println("\\begin{itemize}\\itemsep -2pt");
			for(int i = 0; i < cv.getSection(4).getSize(); i++){
				writer.println("\\item " + cv.getSection(4).getBulletListItem(i).getContents());
			}
			writer.println("\\end{itemize}");
			writer.println();
			writer.println("\\section{FURTHER COURSES}");
			writer.println("\\begin{itemize}\\itemsep -2pt");
			for(int i = 0; i < cv.getSection(5).getSize(); i++){
				writer.println("\\item " + cv.getSection(5).getBulletListItem(i).getContents());
			}
			writer.println("\\end{itemize} ");
			writer.println();
			writer.println("\\section{ADDITIONAL INFORMATION}");
			writer.println(cv.getSection(6).getParagraph());
			writer.println();
			writer.println("\\section{INTERESTS}");
			writer.println(cv.getSection(7).getParagraph() );
			writer.println("\\end{resume} \n \\end{document}");
			writer.println();
			writer.close();
		} catch (IOException e) {
		   // do something
			e.printStackTrace();
		}
	}
	
	
}
