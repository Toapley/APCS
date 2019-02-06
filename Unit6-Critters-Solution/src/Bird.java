import java.awt.Color;

public class Bird extends Critter {

	private int movement = 0;
	private Direction lastMove = Direction.NORTH;
	
	public Bird() {
		
	}
	
	@Override
	public Color getColor() {
		return Color.BLUE;	
	}
	
	@Override
	public boolean eat() {
		return false;
	}
	
	@Override
	public Attack fight(String opponent) {
		if (opponent.equals("%"))
			return Attack.ROAR;
		else 
			return Attack.POUNCE;
	}
	
	@Override
	public Direction getMove() {
		movement++;
		if(movement <= 3) {
			lastMove = Direction.NORTH;
			return Direction.NORTH;
		}
		else if (movement <=6) {
			lastMove = Direction.EAST;
			return Direction.EAST;
		}			
		else if (movement <=9) {
			lastMove = Direction.SOUTH;
			return Direction.SOUTH;
		}			
		else { 			
			lastMove = Direction.WEST;
			if (movement == 12) movement = 0;
			return Direction.WEST;
		}
		
	}
	
	@Override
	public String toString() {
		if (lastMove == Direction.NORTH) 
			return "^";
		else if (lastMove == Direction.SOUTH)
			return "V";
		else if (lastMove == Direction.EAST)
			return ">";
		else 
			return "<";
		
	}
}
