package net.lucyawrey.shattered_world;

import net.fabricmc.api.ModInitializer;

public class ShatteredWorld implements ModInitializer {

	@Override
	public void onInitialize() {
		SwContent content = new SwContent();
		content.init();
		SwWorld world = new SwWorld();
		world.init();
	}
}
