package tarlgrenier.rain.level.tile.spawn_level;

import tarlgrenier.rain.graphics.Screen;
import tarlgrenier.rain.graphics.Sprite;
import tarlgrenier.rain.level.tile.Tile;

public class SpawnWallTile extends Tile {

	public SpawnWallTile(Sprite sprite) {
		super(sprite);
	}

	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}

	public boolean solid() {
		return true;
	}
}
