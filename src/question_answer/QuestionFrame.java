package question_answer;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class QuestionFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public QuestionFrame(){
		
		setLayout(new BorderLayout());
		getContentPane().setBackground(Color.white);
		Toolkit tool = Toolkit.getDefaultToolkit();
		int x = (int)tool.getScreenSize().getWidth();
		int y = (int)tool.getScreenSize().getHeight();
		this.setSize(x,y);
		
		Font fins = new Font(Font.SERIF,Font.BOLD,28);
		Font ftitle = new Font(Font.MONOSPACED,Font.BOLD,45);
		JLabel title = new JLabel("TRAIN YOUR BRAIN");
		JLabel instruction = new JLabel("**Click on the Right Option!!**");
		instruction.setFont(fins);
		instruction.setForeground(Color.magenta);
		title.setFont(ftitle);
		title.setForeground(Color.ORANGE);
		title.setBackground(Color.darkGray);
		add(instruction,BorderLayout.SOUTH);
		
		title.setHorizontalAlignment(JLabel.CENTER);
		instruction.setHorizontalAlignment(JLabel.CENTER);
		add(title,BorderLayout.NORTH);
		
		JButton next = new JButton("Next Question");
		next.setFont(fins);
		add(next,BorderLayout.SOUTH);
		next.setBackground(Color.YELLOW);
		next.setPreferredSize(new Dimension(40,40));
		
		next.addActionListener(new Next());
		
	}
	public class Next implements ActionListener{
		public void actionPerformed(ActionEvent item){
			if(ReadingQuestions.count!=ReadingQuestions.questions.size()){
			setVisible(false);
			QuestionFrame frame = new QuestionFrame();
			frame.setTitle("TRAIN YOUR BRAIN");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			QuestionClass q = new QuestionClass();
			q = ReadingQuestions.questions.get(ReadingQuestions.count++);
			QuestionPanel q1 = new QuestionPanel(q);
			frame.add(q1,BorderLayout.CENTER);
			}
			else{
				JOptionPane.showMessageDialog(null, "Your score is "+ReadingQuestions.score+" /15");
				JOptionPane.showMessageDialog(null, "Thank You For Taking up the Quiz");
				System.exit(0);
			}
		}
	}

}
