/* Vournazidis Anastasios AM:2413
Vournazidis Georgios AM:2031 */


package data;

import gui.ChronologicalCV;
import gui.CombinedCV;
import gui.FunctionalCV;
import gui.MainWindow;

import java.io.*;
import java.util.*;

public class Load {

	private File ld;
	
	
	public Load(File ld) throws FileNotFoundException{
		FileReader fr = new FileReader(ld);
		BufferedReader br = new BufferedReader(fr);
		String s = null;
		int type = 0;
		try {
			s = br.readLine();
			if(s.equals("chrCV")){
				ChronologicalCV chr = new ChronologicalCV();
				MainWindow.setFrame();
				type = 1;
			}else if(s.equals("comCV")){
				CombinedCV comb = new CombinedCV();
				MainWindow.setFrame();
				type = 2;
			}else if(s.equals("funCV")){
				FunctionalCV func = new FunctionalCV();
				MainWindow.setFrame();
				type = 3;
			}else{
				System.out.println("The file you are trying to open is not supported.");
			}
			
			br.readLine();
			while(s != null){
				if(s.equals("1.	GENERAL INFORMATION") && type == 1){
					s = br.readLine();
					String[] tmp = s.split(":");
					
				}
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
}
