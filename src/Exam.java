public class Exam implements Gradable{
    //Fields of Data the Exam has
    private String topic;
    private double numCorrect; //default value of 0
    private double numQuestions; //default value of 0

    /***
     * Setting the blueprint of what every Exam will consist of.
     * @param topic object that holds the subject of Grade
     * @param numCorrect object that holds number correct of Exam
     * @param numQuestions object that holds total number of questions
     */
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

    /***
     *  Method that calculates score.
     * @return returns Number of correct questions divided by Total number of questions and returns the result
     */
    public double calculateScore(){
        return numCorrect / numQuestions;
    }//end of calculateScore

    /***
     * method which calls calculateScore method implemented earlier
     * @return returns letter grade in specified range
     */
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
