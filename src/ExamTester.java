public class ExamTester implements Gradable{
    public static void main(String[] args) {
        Exam e1 = new Exam("Math",7,10);
        System.out.println("In the Subject " + e1.getTopic() + " The Grade was a(n) " + e1.toLetterGrade());
    }//End of Main Method

    @Override
    public double calculateScore() {
        return 0;
    }

    @Override
    public char toLetterGrade() {
        return 0;
    }
}//End of Class
