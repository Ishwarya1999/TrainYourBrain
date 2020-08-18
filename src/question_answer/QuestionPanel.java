package question_answer;
import java.awt.*;
import java.awt.event.*;
//import java.awt.event.ItemListener;

import javax.swing.*;
public class QuestionPanel extends JPanel  {

	private static final long serialVersionUID = 1L;
	private QuestionClass item;

	
	public QuestionPanel(){}
	public QuestionPanel(QuestionClass item){
			this.item = item;

			GridBagLayout g = new GridBagLayout();
			GridBagConstraints c = new GridBagConstraints();
			c.gridwidth=4;
			setLayout(g);
			setBackground(Color.white);
			
			Font fqn = new Font(Font.SANS_SERIF,Font.ROMAN_BASELINE,20);
			Font fch = new Font(Font.SERIF,Font.ITALIC,20);
			
					
			JLabel Question = new JLabel(item.getQuestion());
			Question.setFont(fqn);
			Question.setForeground(Color.blue);
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 1;
			c.gridy = 1;
			c.weightx = 0.5;
			c.weighty = 0;
			add(Question,c);
		
			JPanel answer = new JPanel(new GridLayout(4,1));
			ButtonGroup options = new ButtonGroup();
			JRadioButton ch1 = new JRadioButton(item.getOpt1());
			JRadioButton ch2 = new JRadioButton(item.getOpt2());
			JRadioButton ch3 = new JRadioButton(item.getOpt3());
			JRadioButton ch4 = new JRadioButton(item.getOpt4());
			
			ch1.setFont(fch);
			ch1.setBackground(Color.white);
			ch2.setFont(fch);
			ch2.setBackground(Color.white);
			ch3.setFont(fch);
			ch3.setBackground(Color.white);
			ch4.setFont(fch);
			ch4.setBackground(Color.white);
			options.add(ch1);
			options.add(ch2);
			options.add(ch3);
			options.add(ch4);
			
			answer.add(ch1);
			answer.add(ch2);
			answer.add(ch3);
			answer.add(ch4);
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 1;
			c.gridy = 2;
			c.weightx = 0.5;
			c.weighty = 0;
			add(answer,c);
			
			JButton submit = new JButton("Submit");
		
			c.gridx = 1;
			c.gridy = 5;
			submit.setBackground(Color.blue);
			submit.setForeground(Color.black);
			submit.setPreferredSize(new Dimension(20,40));
			submit.setLocation(20,20);
			submit.setHorizontalAlignment(JButton.CENTER);
	
				
			ch1.addItemListener(new AnswerEvaluation (1));
			ch2.addItemListener(new AnswerEvaluation (2));
			ch3.addItemListener(new AnswerEvaluation (3));
			ch4.addItemListener(new AnswerEvaluation (4));
			
	}
	public class AnswerEvaluation implements ItemListener{
			int ans;
			public AnswerEvaluation(){}
			public AnswerEvaluation(int a){
				ans=a;
			
			}
			public void itemStateChanged (ItemEvent ch){
				
				
				if(ans==item.getCorrect()){
					JOptionPane.showMessageDialog(null, "Right Answer! Keep up the pace!!");
					ReadingQuestions.score++;
				}
				else
					JOptionPane.showMessageDialog(null, "Wrong Answer! Don't Worry...Keep Going!! Answer:"+item.getCorrect());
			}
			
	}

}
