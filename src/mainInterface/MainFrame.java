package mainInterface;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import question_answer.*;


public class MainFrame {
	
	public static void main(String[] args) {
		//Quiz Implementation
		
		QuestionFrame frame = new QuestionFrame();
		frame.setTitle("TRAIN YOUR BRAIN");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		QuestionClass q = new QuestionClass();
		ReadingQuestions.readIntoArray(); 
		q = ReadingQuestions.questions.get(ReadingQuestions.count++);
		QuestionPanel q1 = new QuestionPanel(q);
		frame.add(q1,BorderLayout.CENTER);
		JOptionPane.showMessageDialog(null, "Hi! Train Your Brain is a small quiz to test your general knowledge.There are 15 questions and you have to choose the right answer.Shall we begin!!");
		
		//To Write the questions to the file enable the following code and disable the above code
		//AddQuestions add = new AddQuestions();
		//add.addQuestion();
}


	
}
