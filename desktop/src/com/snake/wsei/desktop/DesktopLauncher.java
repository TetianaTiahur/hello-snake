package com.snake.wsei.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.snake.wsei.HelloSnake;

public class DesktopLauncher {
  public static void main (String[] arg) {
    LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

    config.resizable = false;
    config.width = 640;
    config.height = 480;
    config.title = "Snake";

    new LwjglApplication(new HelloSnake(), config);
  }
}




