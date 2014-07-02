package com.mk.apps.superm.tiledMapGame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.mk.apps.superm.screens.MenuScreen;
import com.mk.apps.superm.tiledMapGame.screens.Play;

public class TiledMapGame extends Game {

	@Override
	public void create() {
		setScreen(new Play());
//		setScreen(new MenuScreen(this, ""));
	}

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	public void render() {
		super.render();
		if(Gdx.input.isKeyPressed(Keys.R))
			try {
				setScreen(getScreen().getClass().newInstance());
			} catch(InstantiationException e) {
				e.printStackTrace();
			} catch(IllegalAccessException e) {
				e.printStackTrace();
			}
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}

	@Override
	public void pause() {
		super.pause();
	}

	@Override
	public void resume() {
		super.resume();
	}

}
