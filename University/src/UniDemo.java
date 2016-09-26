public class UniDemo {
	public static void main(String[] args) {

		University KLETU = new University();
		
		/*Branches offered
		  		CS: Computer Science & Engineering
				EC: Electronics & Communication
				ME: Mechanical Engineering
				EE: Electrical & Electronics Engineering
				CV: Civil Engineering
				AU: Automation & Robotics
				IT: Instrumentation Technology
				CH: Chemical Engineering
		*/
	
		//Enroll to desired Branch
		
		//KLETU.enrollStudent(sName, sBranch);
		
		KLETU.enrollStudent("Jack", "CS");
		KLETU.enrollStudent("Steve", "me");
		KLETU.enrollStudent("Jessie", "cs");
		KLETU.enrollStudent("Caitlyn", "ec");
		
		
		KLETU.display(); //To display the university details
		
		KLETU.studentList(); //To display the enrolled students list
		 
	}

}
