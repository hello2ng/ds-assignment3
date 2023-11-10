import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Proposer extends Member
{
	// Initialise variables
	private int proposerID;
	private boolean leader = false;
	private int numberOfProposals = 0;

	private String message;
	
	private boolean accept;
	private String acceptVal;
	private int acceptID;

	// Parameterised constructors for Proposer
	public Proposer(String name)
	{

	}

	// Create unique ID for Proposer

	public void propose(string valPropose) throws InterruptedException
	{
		
	}
}