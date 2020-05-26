public class ExamTester{
    public static void main(String[] args) {
        Exam e1 = new Exam("Math",7,10);
        System.out.println("In the Subject " + e1.getTopic() + " The Grade was a(n) " + e1.toLetterGrade());
    }//End of Main Method
}//End of Class
