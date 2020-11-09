/* Vournazidis Anastasios AM:2413
Vournazidis Georgios AM:2031 */


package data;
import java.util.*;

public class CV {

	private String type;
	private String name;
	private String address;
	private String telHome;
	private String telMob;
	private String email;
	ArrayList<Section> secList = new ArrayList<>();

	
	public CV(){}
	
	public void setType(String type){
		this.type = type;
	}
	
	public String getType(){
		return type;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setTelHome(String telHome){
		this.telHome = telHome;
	}
	
	public String getTelHome(){
		return telHome;
	}
	
	public void setTelMob(String telMob){
		this.telMob = telMob;
	}
	
	public String getTelMob(){
		return telMob;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void addSection(Section sec){
		secList.add(sec);
	}
	
	public Section getSection(int i){
		return secList.get(i);
	}
	
	public void addParagraph(Section section, String contents){
		section.addParagraph(contents);
	}
	
	public void addBulletListItem(Section section, BulletListItem blItem){
		section.addBulletListItem(blItem);
	}
	
	public ArrayList<Section> getSecList(){
		return secList;
	}
	
	@Override
	public boolean equals(Object o){
		
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CV cv = (CV) o;
		return type.equals(cv.getType()) && name.equals(cv.getName()) &&
				address.equals(cv.getAddress()) &&
				telHome.equals(cv.getTelHome()) && telMob.equals(cv.getTelMob()) &&
				secList.equals(cv.getSecList());
	}
}

