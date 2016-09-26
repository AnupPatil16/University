public class University {

	private final String sUniName = "KLE Tech University";
	private int iCount = 0;
	private boolean bUniCode;
	private final int iNoOfSchools = 8;
	private static int iStudentTotal=0;
	
	University() {
	}

	School[] Dept = new School[8];
	Student[] Stu = new Student[960];
	
	{
		//Dept[0]= new School(sSchoolName, sProgCode, sCoordinator, sUniCode, iNOfStaff);
		
	//**For CODE E30
			Dept[0]= new School("School of Electronics", "ECE107", "Dr. ***", true, 13);
			Dept[1]= new School("School Of Mechanical Engineering", "MEE104", "Dr. ***** ", true, 12);
			Dept[2]= new School("School Of Electrical Engineering", "EEE105", "Prof. ***", true, 16);
			Dept[3]= new School("School Of Civil Engineering", "CVE102", "Prof. ***", true, 16);
			
	//**For CODE E241
			Dept[4]= new School("School Of Chemical Engineering", "CHE102", "Prof. ***", false, 15);
			Dept[5]= new School("School Of Computer Science & Information Technology", "CSE101", "Prof. ***", false, 15);
			Dept[6]= new School("School Of Instrumentation Technology", "ITE106", "Prof. ***", false, 15);
			Dept[7]= new School("School of Automation & Robotics", "AUE103", "Prof. *******", false, 9);
	
	}
	
	public void enrollStudent(String sName, String sBranch){
		
		String sDept=" ";
		int iID=0;
		
		switch (sBranch){
		case "CS": case "cs": case "Cs": case "cS":
			sDept= Dept[5].getsSchoolName();
			iID= 600+(++Dept[5].iNoOfStuds);
			break;
			
		case "EC": case "ec": case "Ec": case "eC":
			sDept= Dept[0].getsSchoolName();
			iID= 100+(++Dept[0].iNoOfStuds);
			break;
			
		case "ME": case "me": case "Me": case "mE":
			sDept= Dept[1].getsSchoolName();
			iID= 200+(++Dept[1].iNoOfStuds);
			break;
			
		case "EE": case "ee": case "Ee": case "eE":
			sDept= Dept[2].getsSchoolName();
			iID= 300+(++Dept[2].iNoOfStuds);
			break;
			
		case "CV": case "cv": case "Cv": case "cV":
			sDept= Dept[3].getsSchoolName();
			iID= 400+(++Dept[3].iNoOfStuds);
			break;
			
		case "AU": case "au": case "Au": case "aU":
			sDept= Dept[7].getsSchoolName();
			iID= 500+(++Dept[7].iNoOfStuds);
			break;
			
		case "IT": case "it": case "It": case "iT":
			sDept= Dept[6].getsSchoolName();
			iID= 600+(++Dept[6].iNoOfStuds);
			break;
			
		case "CH": case "ch": case "Ch": case "cH":
			sDept= Dept[4].getsSchoolName();
			iID= 700+(++Dept[4].iNoOfStuds);
			break;
			
		}
		
		if(((iID*2)%200)>120)
		{
			System.out.println("Enrollment limit reached");
			return;
		}
		
		Stu[iStudentTotal++]= new Student(sName, sDept, iID);
		
		
	}
	
	public void display() {
		System.out.println("_________________________________________________________\n");
		System.out.println("\t\t" + this.sUniName + "\n");

		System.out.println("Schools under the University- \n");

		for (int iIter = 0; iIter < this.iNoOfSchools; iIter++) {
			System.out.print(iIter + 1 + ".");
			Dept[iIter].displaySchool();
			System.out.println("\n");
		}

		System.out.println("No of Students in the University= " + this.numStuds());

		System.out.println("_________________________________________________________\n\n\n\n");
	}

	public void studentList(){
		System.out.println("\tStudents Enrolled\n");
		
		System.out.println(" Sl No.\t    Name\t Roll No");
		
		for (int iIter = 0; iIter < this.numStuds(); iIter++) {
			if(iIter==0)
				System.out.println("   "+(iIter + 1) + "\t   " + Stu[iIter].getsName() + "\t\t   "+ Stu[iIter].getiId());
				
			else
				System.out.println("   "+(iIter + 1) + "\t   " + Stu[iIter].getsName() + "\t   "+ Stu[iIter].getiId());
		}
	}
	
	public int numStuds() {

		int iIter, sum;

		for (iIter = 0, sum = 0; iIter < this.iNoOfSchools; iIter++) {
			sum += Dept[iIter].iNoOfStuds;
		}

		return sum;
	}

	public String getsUniName() {
		return sUniName;
	}

	public int getiCount() {
		return iCount;
	}

	public int getiNoOfSchools() {
		return iNoOfSchools;
	}

	public boolean isbUniCode() {
		return bUniCode;
	}

	public School getDept(int i) {
		return Dept[i];
	}
	
}
