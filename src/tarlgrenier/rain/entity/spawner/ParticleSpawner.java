package tarlgrenier.rain.entity.spawner;

import tarlgrenier.rain.entity.particle.Particle;
import tarlgrenier.rain.entity.spawner.Spawner.Type;
import tarlgrenier.rain.level.Level;

@SuppressWarnings("unused")
public class ParticleSpawner extends Spawner {

	private int life;

	public ParticleSpawner(int x, int y, int life, int amount, Level level) {
		super(x, y, Type.PARTICLE, amount, level);
		this.life = life;
		for (int i = 0; i < amount; i++) {
			level.add(new Particle(x, y, life));
		}
	}

}
