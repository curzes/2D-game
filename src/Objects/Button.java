package Objects;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;


public class Button extends Image{
	
	private int width, height, posX, posY;

	public Button(String ref, int width, int height, int posX, int posY) throws SlickException {
		super(ref);
		this.width = width;
		this.height = height;
		this.posX = posX;
		this.posY = posY;
	}
	public int getPosX(){
		return posX;
	}
	public int getPosY(){
		return posY;
	}
	public boolean isKlicked(){
		int mX = Mouse.getX();
		int mY = Mouse.getY();
		if(mX > posX && mX < posX + width){
			return true;
		}
		return false;
	}
}
