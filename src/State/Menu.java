package State;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.Game;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import Objects.Button;
import javafx.scene.image.Image;

public class Menu extends BasicGameState {
	
	private int stateId;
	private Button playBtn;
	private Button optionsBtn;
	private String klick = "Nope";
	
	public Menu(int stateId){
		this.stateId = stateId;
	}

	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		playBtn = new Button("res/menu/playBtn.png", 222, 66, 50, 50);
		//optionsBtn = new Button("res/menu/optionsBtn.png", 222, 66);
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		g.drawImage(playBtn, playBtn.getPosX(), playBtn.getPosY());
		//g.drawImage(optionsBtn, optionsBtn.getPosX(), optionsBtn.getPosY());
		g.drawString(klick, 10, 25);
		g.drawString(Mouse.getX() + " " + Mouse.getY() , 5, 50);
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		if(playBtn.isKlicked()){
			klick = "Klick";
		}else{
			klick = "Nope";
		}
	}

	public int getID() {
		return stateId;
	}

}
