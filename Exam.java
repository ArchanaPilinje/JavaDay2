
public class Exam {
	private String examName;
	private int maxMarks;
	private int obtMarks;

	public Exam(String examName, int maxMarks, int obtMarks) {

		this.examName = examName;
		this.maxMarks = maxMarks;
		this.obtMarks = obtMarks;
	}

	public Exam() {

	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public int getMaxMarks() {
		return maxMarks;
	}

	public void setMaxMarks(int maxMarks) {
		this.maxMarks = maxMarks;
	}

	public int getObtMarks() {
		return obtMarks;
	}

	public void setObtMarks(int obtMarks) {
		this.obtMarks = obtMarks;
	}
	
	public void printExam() {
		System.out.println("Exam Name:"+examName);
		System.out.println("Maximum Marks:"+maxMarks);
		System.out.println("Obtained Marks:"+obtMarks);
	}

}
