/* Vournazidis Anastasios AM:2413
Vournazidis Georgios AM:2031 */


package data;
import java.util.*;

public class BulletList {
	
	ArrayList<BulletListItem> list = new ArrayList<BulletListItem>();
	
	public BulletList(){}
	
	public void addItem(BulletListItem bulletItem){
		list.add(bulletItem);
	}
	
	public ArrayList<BulletListItem> getList(){
		return list;
	}
	
	public BulletListItem getItem(int i){
		return list.get(i);
	}
	
	public int getSize(){
		return list.size();
	}
	
	public void clearBL(){
		list.clear();
	}
	
	@Override
	public boolean equals(Object o){
		
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		BulletList bl = (BulletList) o;
		return list.equals(bl.getList());
	}
}
