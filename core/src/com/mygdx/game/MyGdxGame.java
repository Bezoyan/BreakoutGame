package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.screens.MainGameScreen;

public class MyGdxGame extends Game {
	public SpriteBatch batch;

	@Override
	public void create() {
		batch = new SpriteBatch();
		this.setScreen(new MainGameScreen(this));
//		img = new Texture("badlogic.jpg");
//		sprite = new Sprite(img);
//		sprite.setPosition(
//				Gdx.graphics.getWidth() / 2 - sprite.getWidth() / 2,
//				Gdx.graphics.getHeight() / 2 - sprite.getHeight() / 2
//		);
	}

	@Override
	public void render() {
		super.render();
//		if(Gdx.input.isKeyPressed(Input.Keys.LEFT))
//			sprite.translateX(-1f);
//		if(Gdx.input.isKeyPressed(Input.Keys.RIGHT))
//			sprite.translateX(1f);
//
//		if(Gdx.input.isButtonPressed(Input.Buttons.LEFT))
//			sprite.setPosition( Gdx.input.getX(), Gdx.graphics.getHeight() - Gdx.input.getY());
//
//		Gdx.gl.glClearColor(0, 0, 0, 1);
//		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//
//
//
//
//		batch.begin();
//		batch.draw(sprite, sprite.getX(), sprite.getY());
//		batch.end();
	}
}
//	@Override
//	public void resize(int width, int height){
//
//	}
//
//	@Override
//	public void dispose () {
//		batch.dispose();
//		img.dispose();
//	}
//
//}
