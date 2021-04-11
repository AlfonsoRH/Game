package Main.states;
import Main.util.KeyHandler;
import Main.util.MouseHandler;

import java.awt.Graphics2D;

public abstract class GameState {

    private GameStateManager gam;

    public GameState(GameStateManager gam) {
        this.gam = gam;
    }

    public abstract void update();
    public abstract void input(MouseHandler mouse, KeyHandler key);
    public abstract void render(Graphics2D g);
}
