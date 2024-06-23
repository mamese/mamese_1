package exception;

public class Throws_VotingEx {
	
	public void vote(int age) throws AgeException
	{
		if(age>18)
		{
			System.out.println("Eligible for Voting");
		}
		else
		{
			throw new AgeException("invalid");//custom exception -AgeException
		}
		
	}

	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub
		Throws_VotingEx obj=new Throws_VotingEx();
		obj.vote(17);
	}

}
