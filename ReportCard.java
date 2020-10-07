
public class ReportCard {
	private String grade;
	private double per;
	
	public ReportCard() {
		
	}
	public ReportCard(String grade, double per) {

		this.grade = grade;
		this.per = per;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}
	
	public void calculateGrade() {
		if(per < 40) {
			grade="Fail";
		}
		else if (per>=40 && per<60) {
			grade="Second Class";
		}
		else if (per>=60 && per<75) {
			grade="First Class";
		}
		else {
			grade="Distinction";
		}
	}
	
	public void printReportCard() {
		System.out.println("Percentage:"+per);
		System.out.println("Grade:"+grade);
	}

}
