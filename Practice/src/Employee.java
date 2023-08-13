
public class Employee{

		int eno , salary,did;
			
		 Employee()
		{
			eno=salary=did=0;
		}
		
	
		public Employee(int eno, int salary, int did) {
			super();
			this.eno = eno;
			this.salary = salary;
			this.did = did;
		}

		static Employee getEmployee1()
		{
		  											
			return new Employee(1,1000,10);                         
		}
		
		static Employee getEmployee2()
		{
			Employee employee = new Employee();
			return employee;
		}
		
		int add1(int a,int b)
		{
			return a+b;
		}
		
		void add2(int a,int b)
		{
			int c;
			c=a+b;
			System.out.println(c);
		}

		@Override
		public String toString() {
			return eno+ " " + salary + " " + did;
		}
		
		
		
	}



