package object_class_programs;

public class Student {
	private String name;
	private int rollNo;
	private int marks;
	private String gender;
	private String section;
	public Student(String name,int rollNo,int marks ,String gender,String section)
	{
		this.name=name;
		this.rollNo=rollNo;
		this.marks=marks;
		this.gender=gender;
		this.section=section;
	}
	public void dispay()
	{
		System.out.println("Student Name is "+name);
		System.out.println("Student rollNo is "+rollNo);
		System.out.println("Student marks is "+marks);
		System.out.println("Student gender is "+gender);
		System.out.println("Student section is "+section);
	}
	public String toString()
	{
		return name+" "+marks;
	}

    public static void main(String[] args) {
		
		Student s1=new Student("Rama",1,67,"Male","A");
		Student s2=new Student("Hema",2,75,"Female","B");
		Student s3=new Student("Seema",3,59,"Female","C");
		System.out.println(s1);
		System.out.println(s2);
	    s3.dispay();
		
		

	}

}
