/* Vournazidis Anastasios AM:2413
Vournazidis Georgios AM:2031 */


package data;

import java.util.*;

public class BulletListItem {
	private Date date;
	private String contents;
	ArrayList<String> list = new ArrayList<String>();
	
	public BulletListItem(){}
	
	public BulletListItem(Date date, String contents){
		this.date = date;
		this.contents = contents;
	}

	public void setDate(Date date){
		this.date = date;
	}
	
	public Date getDate(){
		return date;
	}

	public void setContents(String contents){
		this.contents = contents;
	}
	
	public String getContents(){
		return contents;
	}
	
	public void addListItem(String input){
		list.add(input);
	}
	public void emptyList(){
			list.clear();			
	}
	
	public String getAchiev(int i){
		return list.get(i);
	}
	
	public int getSize(){
		return list.size();
	}
	
	public ArrayList<String> getList(){
		return list;
	}
	
	@Override
	public boolean equals(Object o){
		
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		BulletListItem bli = (BulletListItem) o;
		return date.equals(bli.getDate()) && contents.equals(bli.getContents()) && list.equals(bli.getList());
	}
}
