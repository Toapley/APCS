import java.awt.Color;

public class Ant extends Critter {

	private boolean _walkSouth;
	private boolean _flag = false;
	
	public Ant(boolean walkSouth) {
		this._walkSouth = walkSouth;
	} 
	
	@Override
	public Color getColor() {
		return Color.red;
	}
	
	@Override
	public boolean eat() {
		return true;
	}
	
	@Override
	public Attack fight(String opponent) {
		return Attack.SCRATCH;
	}
	
	@Override
	public Direction getMove() {
		
		_flag = !_flag;
		if (this._walkSouth) {
			if (this._flag) 
				return Direction.SOUTH;
			else
				return Direction.EAST;
		}
		else {
			if (this._flag) 
				return Direction.NORTH;
			else
				return Direction.EAST;						
		}
		
	}
	
	@Override
	public String toString() {
		return "%";
	}

}
