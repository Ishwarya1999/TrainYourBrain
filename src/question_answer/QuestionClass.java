package question_answer;

public class QuestionClass {

	private int correct;
	private String opt1, opt2, opt3, opt4;
	private String question;
	
	public QuestionClass(){}
	public QuestionClass(int crt, String a, String b, String c,String d, String q){
		correct = crt;
		opt1 = a;
		opt2 = b;
		opt3 = c;
		opt4 = d;
		question = q;
	}
	public int getCorrect(){
		return correct;
	}
	public String getOpt1(){
		return opt1;
	}
	public String getOpt2(){
		return opt2;
	}
	public String getOpt3(){
		return opt3;
	}
	public String getOpt4(){
		return opt4;
	}
	public String getQuestion(){
		return question;
	}
	public void setQuestion(String q){
		question =q;
	}
	public void setOpt1(String q){
		opt1 =q;
	}
	public void setOpt2(String q){
		opt2 =q;
	}
	public void setOpt3(String q){
		opt3 =q;
	}
	public void setOpt4(String q){
		opt4 =q;
	}
	public void setCorrect(int q){
		correct = q;
	}

}
