class Array05 
{
	public static void main(String[] args) 
	{
		Emp e1 = new Emp(100, "Satish");
		Emp e2 = new Emp(101, "Sham");
		Emp e3 = new Emp(102, "Ram");
		Emp[] e = new Emp[3];
		e[0] = e1;
		e[1] = e2;
		e[2] = e3;
		for(Emp ee : e)// for giving for each loop you achive values.
			{
				System.out.println(ee.empid+" "+ee.empname);
			}
	}
}
