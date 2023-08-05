import java.util.*;

class employeeInfo
{
	
	Scanner sc1=new Scanner(System.in);
	ArrayList<Integer> a1=new ArrayList<>();
	ArrayList<String> a2=new ArrayList<>();
	ArrayList<Integer> a3=new ArrayList<>();

	
	public void add()
	{
		System.out.println("Enter employee ID =");
		
		int id = sc1.nextInt();
		a1.add(id);
		
		
		System.out.println("Enter employee name =");
		String name = sc1.next();
		a2.add(name);
		
		System.out.println("Enter employee Salary =");
		int salary = sc1.nextInt();
		a3.add(salary);
	}
	public void Display()
	{
		System.out.println("-----------------------------------------");
		for(int i=0; i<a1.size(); i++) 
		{
			System.out.println(a1.get(i)+" "+a2.get(i)+" "+a3.get(i));
		}
		System.out.println("-----------------------------------------");
	}
	public void Delete()
	{
		System.out.println("Which id's record do you want to delete:");
		int i = sc1.nextInt();
		int a = a1.indexOf(i);
		a1.remove(a);
		System.out.println("Record deleted...");
		System.out.println("-----------------------------------------");	
	}
	public void Search()
	{
		System.out.println("Which id's record do you want to search:");
		int s = sc1.nextInt();
		int present=1;
		int show=0;
		for(int i=0; i<a1.size(); i++) 
			{
				int zc;
				zc=a1.get(i);
				if(s==zc)
				{
					present=0;
					show=i;
				}
			}
				if(present==0)
				{
					System.out.println("-----------------------------------------");
					System.out.println(a1.get(show)+" "+a2.get(show)+" "+a3.get(show));
					System.out.println("-----------------------------------------");
				}
				else
				{
					System.out.println("Id does not exist");
				}
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("**********Employee Information**********");
		employeeInfo e1=new employeeInfo();
		Boolean x = true; 
		while(x==true)
		{
			System.out.println("1.Add\n2.Display\n3.Delete\n4.Search\n5.Exit");
			System.out.println("=================================================");
		
			System.out.println("Enter your choice:");
			int ch =  sc.nextInt();
			
				switch(ch)
				{
					case 1:
							System.out.println("How much record you want to enter");
							int record = sc.nextInt();
							
							for (int i=1; i<=record;i++)
							{
								e1.add();
							
								System.out.println("------------------------------");
								System.out.println("Record submited....");
								System.out.println("------------------------------");
							}
							
							break;
					case 2:
							e1.Display();
							break;
					case 3:
							e1.Delete();
							break;
					case 4:
							e1.Search();
							break;
					case 5:
							System.exit(0);
							break;
				}
			}
		}
}