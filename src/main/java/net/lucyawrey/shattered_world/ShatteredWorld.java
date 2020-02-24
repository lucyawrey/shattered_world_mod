package net.lucyawrey.shattered_world;

import net.fabricmc.api.ModInitializer;

public class ShatteredWorld implements ModInitializer {

	@Override
	public void onInitialize() {
		SwContent.init();
		SwWorld.init();
	}
}
