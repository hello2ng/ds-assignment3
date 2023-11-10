// Create thread for each member

public class Member extends Thread
{
	private String name = "";
	private boolean wantsPresident = false;
	private boolean proposer = false;
	private boolean learner = false;
	private boolean acceptor = false;
	private int responseTime = 0;

	// Parameterised constructors for members
	public Member(String name, boolean wantsPresident, boolean proposer, boolean learner, boolean acceptor, int responseTime)
	{
		this.name = name;
		this.wantsPresident = wantsPresident;
		this.proposer = proposer;
		this.learner = learner;
		this.acceptor = acceptor;

		this.responseTime = responseTime;
	}
	
	// Parameterised constructors for members
	public Member(String name, int responseTime)
	{
		this.name = name;

		this.responseTime = responseTime;
	}

	// Function to obtain integer of member name
	public int memberNo(String name)
	{ 
		return Integer.parseInt(String.valueOf(name.charAt(1)));
	}

	// Get and set for members
	public String getvName()
	{
		return this.name;
	}

	public void setvName(String name)
	{
		this.name = name;
	}

	public static void main (String args[])
	{
		Member M1 = new Member("Lol",20000);
		M1.setvName("Hehe");
		System.out.println(M1.getvName());

		System.out.println(M1.memberNo("M4"));
	}
}