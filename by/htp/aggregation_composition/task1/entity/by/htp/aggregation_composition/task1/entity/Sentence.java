package by.htp.aggregation_composition.task1.entity;

import java.util.ArrayList;
import java.util.List;

public class Sentence {

	private List<Word> sentence = new ArrayList<Word>();
	private String fullSentense = "";

	public Sentence() {

	}

	public void add(Word word) {
		sentence.add(word);
	}

	public String sh() {
		for (int i = 0; i < sentence.size(); i++) {
			Word f = sentence.get(i);
			fullSentense += f.getWord();

//			System.out.println(fullSentense);
//			System.out.println(sentence.size());
		}
//		System.out.println(fullSentense);

		return fullSentense;
	}

	public List<Word> getSentence() {
		return sentence;
	}

	public void setSentence(List<Word> sentence) {
		this.sentence = sentence;
	}

	public String getFullSentense() {
		return fullSentense;
	}

	public void setFullSentense(String fullSentense) {
		this.fullSentense = fullSentense;
	}

}
