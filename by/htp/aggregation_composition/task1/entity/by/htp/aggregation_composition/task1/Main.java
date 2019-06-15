package by.htp.aggregation_composition.task1;

import by.htp.aggregation_composition.task1.entity.Sentence;
import by.htp.aggregation_composition.task1.entity.Text;
import by.htp.aggregation_composition.task1.entity.Word;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Word word = new Word("Look,");
		Word word2 = new Word(" I was ");
		Word word3 = new Word("gonna go ");
		Word word4 = new Word("easy on");
		Word word5 = new Word(" you and ");

		Sentence sent = new Sentence();

		sent.add(word);
		sent.add(word2);
		sent.add(word3);
		sent.add(word4);
		sent.add(word5);

		System.out.println("--------------");

		Text text = new Text(sent.sh());
//		
//		text.headline("dfgsdsd");
//		
//		text.add("efwefw");
//		
//		System.out.println(text.displayAll());

		Logic lg = new Logic(text.getText());

		lg.headline("fdsfdf");
		lg.add("sfasfas");

		System.out.println(lg.displayAll());

	}

}
