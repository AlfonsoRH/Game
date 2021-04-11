package Main.entity;

import Main.graphics.Animation;
import Main.graphics.Sprite;
import Main.util.KeyHandler;
import Main.util.MouseHandler;
import Main.util.Vector2f;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class Entity {

    private final int UP = 0;
    private final int DOWN = 1;
    private final int RIGHT = 2;
    private final int LEFT = 3;
    protected int currentAnimation;

    protected Animation ani;
    protected Sprite sprite;
    protected Vector2f pos;
    protected int size;

    protected boolean up;
    protected boolean down;
    protected boolean right;
    protected boolean left;
    protected boolean attack;
    protected int attackSpeed; //Might change later for action
    protected int attackDuration; //Might chage later for action

    protected float dx;
    protected float dy;

    protected float maxSpeed;
    protected float acc;
    protected float deacc;

    public Entity(Sprite sprite, Vector2f orgin, int size){
        this.sprite = sprite;
        pos = orgin;
        this.size=size;

        ani = new Animation();
        setAnimation(RIGHT, sprite.getSpriteArray(RIGHT),10);
    }

    public void setAnimation(int i, BufferedImage[] frames, int delay){
        currentAnimation = i;
        ani.setFrames(frames);
        ani.setDelay(delay);
    }

    public void animate(){
        if(left){
            if(currentAnimation != LEFT || ani.getDelay() == -1){
                setAnimation(LEFT, sprite.getSpriteArray(LEFT),5);
            }
        }
    }

    public void update(){
        animate();
        setHitBoxDirection();
        ani.update();
    }

    public abstract void render(Graphics2D g);
    public void input(KeyHandler key, MouseHandler mouse){}
}
