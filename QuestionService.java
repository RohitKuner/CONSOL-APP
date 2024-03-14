import java.util.Scanner;

public class QuestionService  {

    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService(){
        questions[0] = new Question(1,"what is size of integer ?","1","2","3","4","4");
        questions[1] = new Question(2,"what is size of char ?","1","2","3","4","2");
        questions[2] = new Question(3,"what is size of float ?","1","8","3","4","8");
        questions[3] = new Question(4,"what is size of double ?","1","2","16","4","16");
        questions[4] = new Question(5,"what is size of Long ?","1","2","32","4","32");
    }

    public void displayQuestions(){

        int i = 0;
        for(Question q:questions){
        System.out.println("The question no is : " +q.getId());
        System.out.println(q.getQuestions());
        System.out.println(q.getOpt1());
        System.out.println(q.getOpt2());
        System.out.println(q.getOpt3());
        System.out.println(q.getOpt4());

        Scanner input = new Scanner(System.in);
        System.out.print("Please Choose the Answer: ");
        selection[i] = input.nextLine();
        i++;
        }

        for(String s:selection){
            System.out.println(s);
        }

       
    }

    public void quizScore(){

        int score = 0;

        for(int i = 0; i<questions.length;i++){

            Question que =  questions[i];
            String actualAns = que.getAnswer();
            String userAns = selection[i];

            if(actualAns.equals(userAns)){
                score++;
            }


        }

        System.out.println("The Score is :" + score);
            
    }
    



        
 }


    

