public class PokemonChallenge {
	
	public static void main(String[] args) {
		
	}
	
	public static int attackRaichu(int x) {
		return (x*2)+5;
	}
	
	public static int hpRaichu(int y) {
		return (y*2)+110;
	}
	
	public static int maxStat(int blastoise, int raichu) {
		return Math.max(blastoise, raichu);
	}
	
	public static int randomStat(int irregular) {
		return (irregular/2)* (int)Math.random();
	}
}
