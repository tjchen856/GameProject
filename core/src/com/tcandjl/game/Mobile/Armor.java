package com.tcandjl.game.Mobile;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by TonyC on 8/7/2015.
 */
public class Armor extends Mobile {

    public Armor() {
        this.setHealth(1100);
        this.setDefense(20);
        this.setMobility(10);
        this.setDelay(0);
        this.setPositionX(0);
        this.setPositionY(0);
        this.setModel(new Texture("armor.png"));
    }

    @Override
    public void fireProjectile() {

    }
}
