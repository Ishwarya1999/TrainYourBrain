package mainInterface;

import java.util.*;

import question_answer.QuestionClass;
public class AddQuestions {
	
	private Formatter output;
	
	
	public void openFile(){
		try{
			
			output = new Formatter("Question.txt");
		}
		catch(Exception e){
			System.err.println("Error in opening the QuestionFile");
		}
	}
	public void addQuestion(){
	
		Scanner in = new Scanner(System.in);
		openFile();
		System.out.println("Press Ctrl+Z to terminate\nEnter the Question");
		while(in.hasNext()){
			String q = in.nextLine();
			System.out.println("Enter the first option");
			String a = in.nextLine();
			System.out.println("Enter the second option");
			String b= in.nextLine();
			System.out.println("Enter the third option");
			String c = in.nextLine();
			System.out.println("Enter the fourth option");
			String d = in.nextLine();
			System.out.println("Enter the correct option");
			int crt = in.nextInt();
			String buffer = in.nextLine();
			try{
				QuestionClass Qn = new QuestionClass(crt,a,b,c,d,q);
				output.format("%s%n%s%n%s%n%s%n%s%n%d%n",Qn.getQuestion(),Qn.getOpt1(),Qn.getOpt2(),Qn.getOpt3(),Qn.getOpt4(),Qn.getCorrect());
				System.out.println("Written to file");
			}
			catch(Exception e){
				e.printStackTrace();
				System.err.println("Error in adding questions to the file"+e);
			}
			System.out.println("Enter the Question");
			
		}
		closeFile();
		in.close();
	}
	public void closeFile(){
		try{
		if(output!=null)
			output.close();
		}
		catch(Exception e){
			System.err.println("Error in closing the file");
		}
	}
}
