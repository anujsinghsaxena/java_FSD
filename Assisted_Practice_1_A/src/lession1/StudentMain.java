package lession1;
class Student
{
	int regNum;
	String studentName;
	Student (int reg_no, String name){
		this.regNum = reg_no;
		this.studentName = name;
	}
}
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student[] arr;
        arr = new Student[5];
        arr[0] = new Student(12341, "Anuj");
        arr[1] = new Student(12342, "Roy");
        arr[2] = new Student(12343, "Sethi");
        arr[3] = new Student(12344, "Tarun");
        arr[4] = new Student(12345, "Gaurav");
//        for(int i=0;i<arr.length;i++)
//        	System.out.println(arr[i]);
        for(int i=0;i<arr.length;i++)
        	System.out.println("Student with Registration Number "+arr[i].regNum+" is: "+arr[i].studentName);
        
	}

}
