package GENERICS;

public abstract class stud implements Comparable
{
	int rollno;
	int marks;
	String name;
	
	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	public int compareTo(stud x) {
		return marks>x.marks?1:-1;
	
	}
	
	

}
