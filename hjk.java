package com.snake.wsei;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.GridPoint2;
import java.util.ArrayList;
import java.util.List;
public class Snake {
    private final Texture texture;
    private final List<GridPoint2> snakeSegments;
    public Snake(Texture texture) {
        this.texture = texture;
        snakeSegments = new ArrayList<>();
        snakeSegments.add(new GridPoint2(90, 30));
        snakeSegments.add(new GridPoint2(75, 30));
        snakeSegments.add(new GridPoint2(60, 30));
        snakeSegments.add(new GridPoint2(45, 30));
        snakeSegments.add(new GridPoint2(30, 30));
    }
    public void draw(Batch batch) {
        for (GridPoint2 pos : snakeSegments) {
            batch.draw(texture, pos.x, pos.y);
        }
    }
}