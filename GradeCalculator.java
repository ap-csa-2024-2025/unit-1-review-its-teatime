public class GradeCalculator
{
  public static void main(String[] args)
  {
    String courseName = "AP Computer Science A";
    int avgTime = 135;
    int hwGrade1 = 75;
    int hwGrade2 = 99;
    int hwGrade3 = 80;
    int hwGrade4 = 100;
    double quizGrade1 = 89.2;
    double quizGrade2 = 98.1;
    double examGrade = 87.58;

    System.out.println("course name: " + courseName);
    System.out.println("average time spent in a week for this course in minutes: "+ avgTime);
    System.out.println("homework grades for this course:");
    System.out.println(hwGrade1);
    System.out.println(hwGrade2);
    System.out.println(hwGrade3);
    System.out.println(hwGrade4);
    System.out.println("quiz grades for this course:");
    System.out.println(quizGrade1);
    System.out.println(quizGrade2);
    System.out.println("final exam grade for this course:");
    System.out.println(examGrade);

    System.out.println("Weekly time spent: " + avgTime / 60 + "h" + avgTime % 60);

    double avgHwGrade = (double) ((hwGrade1 + hwGrade2 + hwGrade3 + hwGrade4)) / 4;
    System.out.println("Average homework grade: " + avgHwGrade);
    double avgQuizGrade = (quizGrade1 + quizGrade2) / 2; //quizGrades already are double
    System.out.println("Average quiz grade: " + avgQuizGrade);
    System.out.println("Final exam grade: " + examGrade);

    int overallGrade = (int) ((avgHwGrade * 0.35) + (avgQuizGrade * 0.15) + (examGrade * 0.5) + 0.5);
    System.out.println("Overall grade: " + overallGrade);

  } 
}
