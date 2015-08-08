package com.tcandjl.game.Mobile;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by TonyC on 8/7/2015.
 */
public abstract class Mobile extends Actor {
    private int health;
    private int defense;
    private int mobility;
    private int delay;
    private float positionX, positionY;
    private Sprite model;

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

    public Sprite getModel() {
        return model;
    }

    public void setModel(Texture model) {
        this.model = new Sprite(model);
    }

    public abstract void fireProjectile();
}
