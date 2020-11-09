/* Vournazidis Anastasios AM:2413
Vournazidis Georgios AM:2031 */


package data;

public class Paragraph {

	private String contents;
	
	public Paragraph(){}
	
	public Paragraph(String contents){
		this.contents = contents;
	}
	
	public void setParagraph(String contents){
		this.contents = contents;
	}
	
	public String getParagraph(){
		return contents;
	}
	
	@Override
	public boolean equals(Object o){
		
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Paragraph par = (Paragraph) o;
		return contents.equals(par.getParagraph());
	
	}
}
