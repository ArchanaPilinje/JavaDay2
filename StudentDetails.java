import java.util.Scanner;
public class StudentDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students");
		int nS=sc.nextInt();
		Student[] students=new Student[nS];
		for(int i=0;i<nS;i++) {
			System.out.println("Enter the Student ID and Name respectively");
			students[i]=new Student();
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			students[i].setId(id);
			students[i].setName(name);
			System.out.println("Enter the number of exams");
			int nE=sc.nextInt();
			sc.nextLine();
			Exam[] exams=new Exam[nE];
			for(int j=0;j<nE;j++) {
				System.out.println("Enter the exam name,max marks and marks obtained respectively");
				exams[j]=new Exam();
				String examName=sc.nextLine();
				int max=sc.nextInt();
				int obt=sc.nextInt();
				sc.nextLine();
				exams[j].setExamName(examName);
				exams[j].setMaxMarks(max);
				exams[j].setObtMarks(obt);
			}
			students[i].setExams(exams);
			ReportCard r=new ReportCard();
			students[i].setReportCard(r);
			students[i].calculatePercentage();
		}
		
		for(Student s:students) {
			s.printStudent();
		}

	}

}
