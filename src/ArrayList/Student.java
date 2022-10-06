package ArrayList;

public class Student {
	private String name;
	private int rollNo;
	private String dept;
	private String clgName;
	
	public void setName( String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setRollNo(int rollNo) {
		this.rollNo=rollNo;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setDept(String dept) {
		this.dept=dept;
	}
	public String getDept() {
		return dept;
	}
	public void  setClgName(String clgName) {
		this.clgName=clgName;
	}
	public String getClgName() {
		return clgName;
	}
	
	public Student(String name,int rollNo,String dept,String clgName) {
		this.name=name;
		this.rollNo=rollNo;
		this.dept=dept;
		this.clgName=clgName;
	
	}
	public String toString() {
		return name+" "+rollNo+" "+dept+" "+clgName;
		
	}

}
