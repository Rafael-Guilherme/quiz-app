package services;

import entities.Question;

public class QuestionService {
	
	Question[] questions = new Question[5];
	
	public QuestionService() {
		question[0] = new Question(1, "What", "Java", "Cpp", "Python", "C#", "Java")
		question[1] = new Question(2, "What", "Java", "Cpp", "Python", "C#", "Java")
		question[2] = new Question(3, "What", "Java", "Cpp", "Python", "C#", "Java")
		question[3] = new Question(4, "What", "Java", "Cpp", "Python", "C#", "Java")
		question[4] = new Question(5, "What", "Java", "Cpp", "Python", "C#", "Java")
	}
	
	public void displayQuestions() {
		questions[0] = new Question();
		System.out.println(questions[0].getQuestion());
	}
}
