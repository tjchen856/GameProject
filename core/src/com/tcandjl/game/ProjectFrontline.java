package com.tcandjl.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.tcandjl.game.Mobile.Armor;
import com.tcandjl.game.Mobile.Mobile;

public class ProjectFrontline extends ApplicationAdapter implements InputProcessor {
	SpriteBatch batch;
	Mobile armor;
	
	@Override
	public void create () {
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();

		batch = new SpriteBatch();
		armor = new Armor();

		armor.getModel().setPosition(armor.getPositionX(), armor.getPositionY());
		Gdx.input.setInputProcessor(this);
	}

	@Override
	public void dispose() {
		batch.dispose();
	}

	@Override
	public void render() {
		float moveAmount = 1.0f;
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		if(Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
			armor.setPositionX(armor.getPositionX() - moveAmount);
		}

		if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
			armor.setPositionX(armor.getPositionX() + moveAmount);
		}

		armor.getModel().setPosition(armor.getPositionX(), armor.getPositionY());
		batch.begin();
		armor.getModel().draw(batch);
		batch.end();
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		return false;
	}

	@Override
	public boolean keyDown(int keycode) {
		if(keycode == Keys.LEFT) {
			armor.getModel().flip(true, false);
		}
		if(keycode == Keys.RIGHT) {
			armor.getModel().flip(true, false);
		}
		return true;
	}

	@Override
	public boolean keyUp(int keycode) {
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		return false;
	}
}
