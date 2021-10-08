package package1;

//Immutable class
public final class Employee
{
	private final String name;
	private final String id;
	private final double salary;
	public Employee(String name, String id,double salary)
	{
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String getName()
	{
		return name;
	}
	public String getId()
	{
		return id;
	}
	public Double getSalary()
	{
		return salary;
	}
}
