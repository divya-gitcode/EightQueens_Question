public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		// WRITE YOUR LOGIC HERE...
		//Check for odd even row
		if((square/8)%2==0)
		{
			if(square%2==0)
			{
				return false;
			}
		}
		else
		{
			if(square%2!=0)
			{
				return false;
			}
		}
		return true;
	}
}
