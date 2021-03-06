package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.MyGdxGame;

public class MainGameScreen implements Screen {
    Texture img;

    public static final float SPEED = 120;

    float x;
    float y;

    MyGdxGame game;

    public MainGameScreen (MyGdxGame game){
        this.game = game;

    }

    @Override
    public void show() {
        img = new Texture("paddle.png");
    }

    @Override
    public void render(float delta) {
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT))
            x -= SPEED * Gdx.graphics.getDeltaTime();
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT))
            x += SPEED * Gdx.graphics.getDeltaTime();


        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);




        game.batch.begin();
        game.batch.draw(img, x, y);
        game.batch.end();

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
