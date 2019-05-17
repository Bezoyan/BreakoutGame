package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	float x;
	float y;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);



		if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
			y = y + 4;
		}

		if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
			y = y - 4;
		}

		if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
			x = x - 4;
		}

		if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
			x = x + 4;
		}



		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}

	@Override
	public void resize(int width, int height){

	}

	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
