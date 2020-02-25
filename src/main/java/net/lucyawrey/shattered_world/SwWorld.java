package net.lucyawrey.shattered_world;

import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.minecraft.block.Block;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class SwWorld {

	public void init() {
		// Loop over existing biomes and add ores to each
		Registry.BIOME.forEach(this::handleOres);
		// Listen for other biomes being registered by mods and add ores to each
		RegistryEntryAddedCallback.event(Registry.BIOME).register((i, identifier, biome) -> handleOres(biome));
	}

	private void handleOres(Biome biome) {
		if (biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND) {
			addBasicOre(biome, SwContent.COPPER_ORE, 12, 18, 128);
			addBasicOre(biome, SwContent.TIN_ORE, 9, 16, 128);
			addBasicOre(biome, SwContent.SILVER_ORE, 9, 6, 64);
			addBasicOre(biome, SwContent.QUARTZ_ORE, 7, 4, 16);
		} else if (biome.getCategory() == Biome.Category.NETHER) {
			// Add nether ores
		}
	}

	private void addBasicOre(Biome biome, Block ore, int veinSize, int veinQuantity, int maxHeight) {
		biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES,
				Feature.ORE
						.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, ore.getDefaultState(), veinSize))
						.createDecoratedFeature(
								Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(veinQuantity, 0, 0, maxHeight))));
	}

	private void addNetherOre(Biome biome, Block ore, int veinSize, int veinQuantity, int maxHeight) {
		biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES,
				Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NETHERRACK, ore.getDefaultState(), veinSize))
						.createDecoratedFeature(
								Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(veinQuantity, 0, 0, maxHeight))));
	}
}
