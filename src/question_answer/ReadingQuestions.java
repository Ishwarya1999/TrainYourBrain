package question_answer;

import java.io.*;
import java.util.*;

public class ReadingQuestions {
	private static Scanner input;
	public static ArrayList <QuestionClass> questions = new ArrayList<QuestionClass>();
	public static int count=0;
	public static int score=0;
	public static void openFile(){
		try{
			input = new Scanner (new File("Question.txt"));
		}
		catch(Exception e){
			System.err.println("Error in opening the QuestionFile");
		}
		
	}
	public static void closeFile(){
		try{
		if(input!=null)
			input.close();
		}
		catch(Exception e){
			System.err.println("Error in closing the file");
		}
	}
	public static void readIntoArray(){
		openFile();
		while(input.hasNext()){
			QuestionClass q = new QuestionClass();
			q.setQuestion(input.nextLine());
			q.setOpt1(input.nextLine());
			q.setOpt2(input.nextLine());
			q.setOpt3(input.nextLine());
			q.setOpt4(input.nextLine());
			q.setCorrect(input.nextInt());
			questions.add(q);
			String buff =  input.nextLine();
		}
		closeFile();
	}
}


