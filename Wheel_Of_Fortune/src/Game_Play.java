
public class Game_Play {

	
	private Overview PlayerName;
	private Overview Puzzle;
	private String Guess;
	private int points;
	
	
	
	public Game_Play()
	{
		super();
	}
	
	public Game_Play(Overview playerName, Overview puzzle, String guess) {
		super();
		PlayerName = playerName;
		Puzzle = puzzle;
		Guess = guess;
	}





	public Overview getPlayerName() {
		return PlayerName;
	}





	public void setPlayerName(Overview playerName) {
		PlayerName = playerName;
	}





	public Overview getPuzzle() {
		return Puzzle;
	}





	public void setPuzzle(Overview puzzle) {
		Puzzle = puzzle;
	}





	public String getGuess() {
		return Guess;
	}





	public void setGuess(String guess) {
		Guess = guess;
	}



	public void Bankurpt()
	{
		
	}
	
	public void LoseATurn()
	{
		
	}
	
	public int AddPoints(int points)
	{
		
		return points;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
