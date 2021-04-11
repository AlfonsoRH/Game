package Main.states;

import Main.graphics.Sprite;
import Main.graphics.Font;
import Main.util.MouseHandler;
import Main.util.KeyHandler;
import Main.util.Vector2f;

import java.awt.*;

public class PlayState extends GameState{

    private Font font;

    public PlayState(GameStateManager gsm){

        super(gsm);
        font = new Font("font/ZeldaFont.png",16,16);

    }

    public void update(){ }
    public void input (MouseHandler mouse, KeyHandler key){}

    public void render(Graphics2D g) {
        Sprite.drawArray(g,font,"holis bolis",new Vector2f(100,100),32,32,16,0);
    }
}
