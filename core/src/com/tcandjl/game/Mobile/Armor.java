package com.tcandjl.game.Mobile;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by TonyC on 8/7/2015.
 */
public class Armor extends Mobile {

    public Armor() {
        super(1100, 20, 10);
        Texture armorTexture = new Texture("armor.png");
        this.setModel(armorTexture);
        this.setBounds(this.getPositionX(), this.getPositionY(), armorTexture.getWidth(), armorTexture.getHeight());
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(this.getModel(), this.getX(), this.getY());
    }

    @Override
    public void fireProjectile() {

    }
}
