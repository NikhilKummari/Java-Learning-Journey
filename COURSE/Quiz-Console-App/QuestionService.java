public class QuestionService {
    Question[] questions = new Question[5];


    public QuestionService(){
        questions[0] = new Question(1, "size of int", "2", "4", "6", "8" , "8");
        questions[1] = new Question(1, "size of double", "2", "4", "6", "8" , "8");
        questions[2] = new Question(1, "size of char", "2", "4", "6", "8" , "8");
        questions[3] = new Question(1, "size of long", "2", "4", "6", "8" , "8");
        questions[4] = new Question(1, "size of boolean", "2", "4", "6", "8" , "8");

    }

    public void displayQuestions(){
        for(Question q : questions)
        System.out.println(q);
    }
}
