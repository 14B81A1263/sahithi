package student;
import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		if(students.StudentGroup.length>0)
			return Student;
		else
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		int i=0;
		Scanner s=new Scanner(System.in);
		for(i=0;i<students.StudentGroup.length;i++){
			s.nextInt();
		}
	}

	@Override
	public Student getStudent(int index) {
		int i;
		for(i=0;i<students.StudentsGroup.length;i++){
			if(i==index){
				return Student[i];
			}
		else{
			return null;
		}
	}

	@Override
	public void setStudent(Student student, int index) {
		int i=0;
		for(i=0;i<students.StudentGroup.length;i++){
			if(i==index){
				Student[i]=student;
			}
		}
	}

	@Override
	public void addFirst(Student student) {
		int i=0;
		Student[students.StudentGroup.length+1]=0;
		for(i=students.StudentGroup.length;i>0;i++){
			int temp;
			Student[i+1]=Student[i];
			
		}
		students.StudentGroup.length=+1;
	}

	@Override
	public void addLast(Student student) {
		int i=0;
		Student[students.StudentGroup.length+1]=student;
		students.StudentGroup=+1;
		
	}

	@Override
	public void add(Student student, int index) {
		for(i=0;i<students.StudentGroup.length;i++){
			if(i==index){
				
			}
		}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		for(i=0;i<students.StudentGroup.length;i++){
			for(j=i+1;j<students.StudentGroup.length;j++){
				if(Student[i].id>Student[j].id){
					int temp=Student[i];
					Student[i]=Student[j];
					Student[j]=temp;
				}
			}
			
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		int i;
		for(i=0;i<students.StudentGroup.length;i++){
			if(equals(Student.birthDate,date)){
				return Student[i];
			}
		else{
		return null;
	}
		}
	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
