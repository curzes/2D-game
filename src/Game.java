
import java.util.HashMap;

import org.newdawn.slick.*;
import org.newdawn.slick.state.StateBasedGame;

import State.*;

public class Game extends StateBasedGame{
	
	public static final HashMap<String, Integer> states = new HashMap<String, Integer>();
	public static final int winWidth = 1000, winHeight = winWidth / 2;

	public Game(String title) {
		super(title);
		states.put("Menu", 0);
		states.put("Level 1", 1);
		this.addState( new Menu(states.get("Menu")) );
	}

	public static void main(String[] args) {
		AppGameContainer agc;
		try {
			agc = new AppGameContainer(new Game("Game Title"));
			agc.setDisplayMode(winWidth, winHeight, false); // Width, Height, Reziseble
			agc.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

	public void initStatesList(GameContainer gc) throws SlickException {
		this.getState(states.get("Menu")).init(gc, this);
		this.enterState(states.get("Menu"));
	}
	public static int getWinWidth(){
		return winWidth;
	}

}
