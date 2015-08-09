package com.tcandjl.game.Mobile;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by TonyC on 8/7/2015.
 */
public abstract class Mobile extends Actor {

    private Sprite model;
    private int health;
    private int defense;
    private int mobility;
    private int delay;
    private float positionX, positionY;
    private boolean isFacingRight;

    public Mobile() {
        this.model = new Sprite(new Texture("armor.png"));
        this.health = 1000;
        this.defense = 10;
        this.mobility = 5;
        this.delay = 500;
        this.positionX = 0;
        this.positionY = 0;
        this.isFacingRight = false;
    }

    public Mobile(int health, int defense, int mobility) {
        this.health = health;
        this.defense = defense;
        this.mobility = mobility;
        this.delay = 500;
        this.positionX = 0;
        this.positionY = 0;
        this.isFacingRight = false;
    }

    public Sprite getModel() {
        return model;
    }

    public void setModel(Texture model) {
        this.model = new Sprite(model);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getMobility() {
        return mobility;
    }

    public void setMobility(int mobility) {
        this.mobility = mobility;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public float getPositionX() {
        return positionX;
    }

    public void setPositionX(float positionX) {
        this.positionX = positionX;
    }

    public float getPositionY() {
        return positionY;
    }

    public void setPositionY(float positionY) {
        this.positionY = positionY;
    }

    public boolean isFacingRight() {
        return isFacingRight;
    }

    public void setIsFacingRight(boolean isFacingRight) {
        this.isFacingRight = isFacingRight;
    }

    public abstract void fireProjectile();
}
