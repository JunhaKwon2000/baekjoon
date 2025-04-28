package pkg_25206;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] definedGrade = new double[5];
		String[] myScore = new String[5];
		double[] myGrade = new double[5];
		
		String subjectName;
		double gradeValue;
		String score;
		
		
		for(int i = 0; i < definedGrade.length; i++) {
				
			subjectName = sc.next();
			gradeValue = sc.nextDouble();
			score = sc.next();
			
			if(score.equals("P")) {
				definedGrade[i] = 9.9;
				myScore[i] = score;
				myGrade[i] = 9.9;
			}
			if(score.equals("F")) {
				definedGrade[i] = gradeValue;
				myScore[i] = score;
				myGrade[i] = 0.0;
			}
			if(score.equals("D0")) {
				definedGrade[i] = gradeValue;
				myScore[i] = score;
				myGrade[i] = 1.0;
			}
			if(score.equals("D+")) {
				definedGrade[i] = gradeValue;
				myScore[i] = score;
				myGrade[i] = 1.5;
			}
			if(score.equals("C0")) {
				definedGrade[i] = gradeValue;
				myScore[i] = score;
				myGrade[i] = 2.0;
			}
			if(score.equals("C+")) {
				definedGrade[i] = gradeValue;
				myScore[i] = score;
				myGrade[i] = 2.5;
			}
			if(score.equals("B0")) {
				definedGrade[i] = gradeValue;
				myScore[i] = score;
				myGrade[i] = 3.0;
			}
			if(score.equals("B+")) {
				definedGrade[i] = gradeValue;
				myScore[i] = score;
				myGrade[i] = 3.5;
			}
			if(score.equals("A0")) {
				definedGrade[i] = gradeValue;
				myScore[i] = score;
				myGrade[i] = 4.0;
			}
			if(score.equals("A+")) {
				definedGrade[i] = gradeValue;
				myScore[i] = score;
				myGrade[i] = 4.5;
			}
			
		}
		double avgScore = 0.0;
		double avgMyScore = 0.0;
		int cnt = 0;
		for(int i = 0; i < definedGrade.length; i++) {
			if(myGrade[i] != 9.9) {
				avgScore += myGrade[i] * definedGrade[i];
				avgMyScore += definedGrade[i];
			}
		}
		
		avgScore = avgScore / avgMyScore;
		System.out.println(avgScore);
	}

}
