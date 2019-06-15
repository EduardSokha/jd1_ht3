package by.htp.aggregation_composition.task1.entity;

public class Text {

	private String text;
//	private String header;
//	private String addText;

	public Text() {

	}

	public Text(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Text other = (Text) obj;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Text [text=" + text + "]";
	}

}


//public void headline(String header) {
//
//this.header = header;
////String t = header + "/r" + text;
////return t;
//}
//
//public void add(String addText) {
//this.addText = addText;
//text = text + addText;		
//}
//
//public String displayAll() {
//
//String all = header + "\r" + text + addText;
//
//return all;
//
//}