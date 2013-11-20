package tarlgrenier.rain.level.tile;

import tarlgrenier.rain.graphics.Screen;
import tarlgrenier.rain.graphics.Sprite;

public class VoidTile extends Tile {

	public VoidTile(Sprite sprite) {
		super(sprite);

	}

	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}

}
