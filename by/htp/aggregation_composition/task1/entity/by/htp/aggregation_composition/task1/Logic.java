package by.htp.aggregation_composition.task1;

public class Logic {

	private String text;
	private String header;
	private String addText;
	
	public Logic() {
		
	}

	public Logic(String text) {
		this.text = text;
	}

	public void headline(String header) {

		this.header = header;
//		String t = header + "/r" + text;
//		return t;
	}

	public void add(String addText) {
		this.addText = addText;
		text = text + addText;
	}

	public String displayAll() {

		String all = header + "\r" + text + addText;

		return all;

	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getAddText() {
		return addText;
	}

	public void setAddText(String addText) {
		this.addText = addText;
	}

}
