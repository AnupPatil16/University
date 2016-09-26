public class School {

	private String sSchoolName, sProgCode, sCoordinator;
	private int  iNoOfStaff;
	private String sUniCode;
	int iNoOfStuds=0;
	
	public School(String sSchoolName, String sProgCode, String sCoordinator, boolean bUniCode, int iNOfStaff) {
		this.sSchoolName = sSchoolName;
		this.sProgCode = sProgCode;
		this.sCoordinator = sCoordinator;
		this.iNoOfStaff = iNOfStaff;

		if (bUniCode == true)
			this.sUniCode = "E30";

		else
			this.sUniCode = "E241";
	}

	public void displaySchool() {
		System.out.println(" " + this.sSchoolName);
		System.out.println("\tUniversity Code: " + this.sUniCode);
		System.out.println("\tProgram Code: " + this.sProgCode);
		System.out.println("\tCoordinator: " + this.sCoordinator);
		System.out.println("\tFaculty Size: " + this.iNoOfStaff);
		System.out.println("\tStudents Registered: " + this.iNoOfStuds);
	}

	public String getsSchoolName() {
		return sSchoolName;
	}

	public String getsProgCode() {
		return sProgCode;
	}

	public String getsCoordinator() {
		return sCoordinator;
	}

	public int getiNoOfStaff() {
		return iNoOfStaff;
	}

	public String getsUniCode() {
		return sUniCode;
	}

}
