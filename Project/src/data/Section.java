/* Vournazidis Anastasios AM:2413
Vournazidis Georgios AM:2031 */


package data;

public class Section {
	
	private String title;
	private Paragraph par = new Paragraph();
	private BulletList list = new BulletList();
	
	
	public Section(){}
	
	public Section(String title){
			this.title = title;
	}
	
	public void addParagraph(String contents){
		par.setParagraph(contents);
	}
	
	public String getParagraph(){
		return par.getParagraph();
	}
	
	public void addBulletListItem(BulletListItem bulletListItem){
		list.addItem(bulletListItem);
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public String getTitle(){
		return title;
	}

	public BulletListItem getBulletListItem(int i){
		return list.getItem(i);
	}
	
	public int getSize(){
		return list.getSize();
	}
	
	public void clearBulletList(){
		list.clearBL();
	}
	
	public BulletList getBulletList(){
		return list;
	}
	
	@Override
	public boolean equals(Object o){
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Section sec = (Section) o;
		return title.equals(sec.getTitle()) && par.getParagraph().equals(sec.getParagraph()) && list.equals(sec.getBulletList());
	}
}
