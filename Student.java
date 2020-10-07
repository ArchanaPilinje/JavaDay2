
public class Student {
	private int id;
	private String name;
	private ReportCard reportCard;
	private Exam[] exams;

	public Student(int id, String name, ReportCard reportCard, Exam[] exams) {
		this.id = id;
		this.name = name;
		this.reportCard = reportCard;
		this.exams = exams;
	}

	public Student() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ReportCard getReportCard() {
		return reportCard;
	}

	public void setReportCard(ReportCard reportCard) {
		this.reportCard = reportCard;
	}

	public Exam[] getExams() {
		return exams;
	}

	public void setExams(Exam[] exams) {
		this.exams = exams;
	}
	
	public void calculatePercentage() {
		float totalMarks=0;
		float totalObtMarks=0;
		for(Exam e:exams) {
			totalMarks+=e.getMaxMarks();
			totalObtMarks+=e.getObtMarks();
		}
		double percentage= (totalObtMarks/totalMarks)*100;
		reportCard.setPer(percentage);
		reportCard.calculateGrade();
	}
	
	public void printStudent() {
		System.out.println("Student ID:"+id);
		System.out.println("Student Name:"+name);
		for(Exam e:exams) {
			e.printExam();
		}
		reportCard.printReportCard();
		System.out.println("*************************************");
	}

}
