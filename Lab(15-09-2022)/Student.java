class Student
{
	String Name;
	int Roll_no;
	String Class;

	Student(String n,int r,String c)
	{
	  Name =n;
	  Roll_no =r;
	  Class = c;	
	}
	
	void displayData()
	{
	System.out.println("Name:"+Name +"  "+"Roll_no:"+Roll_no+"  "+"Class:"+Class);

	}
	
	public static void main(String[] args)
	{
	 Student s1=new Student("ABC",1,"1ST");
	 Student s2=new Student("BCA",2,"2ND");
	 Student s3=new Student("CAB",3,"3RD");

	 s1.displayData();
	 s2.displayData();
	 s3.displayData();
	}
}