
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student student1 =new Student();
        student1.name ="AHmed";
        student1.id= 2026001;
        student1.major= "Computer engineering ";
        Student student2 = new Student(); 
        student2.name ="sara";
        student2.id= 2026002;
        student2.major= "Cybersecurity ";
        
        student1.displayinfo();
        student2.displayinfo();
	}

}
