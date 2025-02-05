package aggregation;

public class AggregationChildClass 
{
	String subject;
	int mark;
	AggregationParentClass ref;
	
	public AggregationChildClass(String subject,int mark,AggregationParentClass ref)
	{
		this.subject=subject;
		this.mark=mark;
		this.ref=ref;
	}
	
	public void display()
	{
		System.out.println("Student Name: "+ref.studentName);
		System.out.println("Roll No: "+ref.rollNo);
		System.out.println("Subject: "+subject);
		System.out.println("Mark: "+mark);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AggregationParentClass parent=new AggregationParentClass("Meera",37);
		AggregationChildClass obj=new AggregationChildClass("Maths",90,parent);
		obj.display();
		
	}

}
