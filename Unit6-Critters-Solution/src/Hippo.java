import java.awt.Color;


public class Hippo extends Critter {

	private int _timesToEat;
	private int _timesMoved;
	private int _direction;

	public Hippo(int hunger) {
		this._timesToEat = hunger;
		this._timesMoved = 0;
		this._direction = (int) (Math.random() * 4);

	}

	@Override
	public Color getColor() {
		if (this._timesToEat > 0)
			return Color.GRAY;
		else
			return Color.WHITE;
	}

	@Override
	public boolean eat() {
		if (this._timesToEat > 0) {
			this._timesToEat--;
			return true;
		}
		else
			return false;
	}

	@Override
	public Attack fight(String opponent) {
		if (this._timesToEat > 0)
			return Attack.SCRATCH;
		else
			return Attack.POUNCE;
	}

	@Override
	public Direction getMove() {
		_timesMoved++;

		if (_timesMoved > 5) {
			this._direction = (int) (Math.random() * 4);
			this._timesMoved = 1;
		}

		if (this._direction == 0)
			return Direction.NORTH;
		else if (this._direction == 1)
			return Direction.EAST;
		else if (this._direction == 2)
			return Direction.SOUTH;
		else
			return Direction.WEST;

	}

	@Override
	public String toString() {
		return this._timesToEat + "";
		
	}
	
}
