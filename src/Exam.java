public class Exam implements Gradable{
    //Fields of Data the Exam has
    private String topic;
    private double numCorrect; //default value of 0
    private double numQuestions; //default value of 0

    //constructor
    public Exam(String topic, double numCorrect, double numQuestions){
        this.topic = topic;
        this.numCorrect = numCorrect;
        this.numQuestions = numQuestions;
    }//end constructor

    //The behaviors that the Exam objects exhibit (getters and setters)
    public void setTopic(String topic){
        this.topic = topic;
    }//end setTopic
    public String getTopic() {
        return topic;
    }

    public void setNumCorrect(double numCorrect) {
        this.numCorrect = numCorrect;
    }//end setNumCorrect
    public double getNumCorrect(){
        return numCorrect;
    }//end of getNumCorrect

    public void setNumQuestions(double numQuestions){
        this.numQuestions = numQuestions;
    }//end setNumQuestions
    public double getNumQuestions(){
        return numQuestions;
    }//end of getNumQuestions

    //Methods implemented in Main
    public double calculateScore(){
        return numCorrect / numQuestions;
    }//end of calculateScore

    public char toLetterGrade(){
        if (calculateScore() >= .9){
            return 'A';
        }
        else if (calculateScore() >= .8 && calculateScore() <= .89){
            return 'B';
        }
        else if (calculateScore() >= .7 && calculateScore() <= .79){
            return 'C';
        }
        else if (calculateScore() >= .6 && calculateScore() <= .69){
            return 'D';
        }
        else if (calculateScore() <= .59){
            return 'F';
        }
        return 0;
    }

}//End of Class
