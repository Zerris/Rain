package tarlgrenier.rain.entity.spawner;

import java.util.ArrayList;
import java.util.List;

import tarlgrenier.rain.entity.Entity;
import tarlgrenier.rain.entity.particle.Particle;
import tarlgrenier.rain.level.Level;

@SuppressWarnings("unused")
public abstract class Spawner extends Entity {

	public enum Type {
		MOB, PARTICLE;
	}

	private Type type;

	public Spawner(int x, int y, Type type, int amount, Level level) {
		init(level);
		this.x = x;
		this.y = y;

	}

}
