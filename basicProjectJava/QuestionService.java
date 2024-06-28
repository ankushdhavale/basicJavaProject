public class QuestionService {

    Questions[] question = new Questions[5];

    public void displayQuestion(){
        for(int q : question){
            System.out.println(q);
        }
    }
}
