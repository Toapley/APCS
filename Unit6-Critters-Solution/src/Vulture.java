import java.awt.Color;


public class Vulture extends Bird{
	
	private boolean _isHungry;
	
	public Vulture() {
		this._isHungry=true;
	}
	
	@Override
	public Color getColor() {
		return Color.BLACK;	
	}
	
	@Override
	public boolean eat() {
		if (this._isHungry) {
			this._isHungry= false;
			return true;
		}		
		return false;
	}
	
	@Override
	public Attack fight(String opponent) {
		this._isHungry= true;
		return super.fight(opponent);

	}	

}
