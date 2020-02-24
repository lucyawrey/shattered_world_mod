package net.lucyawrey.shattered_world;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SwWorld {

	public static void init() {
		//Loop over existing biomes
		Registry.BIOME.forEach(SwWorld.handleBiomeOres);

		//Listen for other biomes being registered	
		RegistryEntryAddedCallback.event(Registry.BIOME).register((i, identifier, biome) -> handleBiomeOres(biome));
	}

	public static void handleBiomeOres(Biome biome) {
		if(biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND) {
			biome.addFeature(
								GenerationStep.Feature.UNDERGROUND_ORES,
								Biome.configureFeature(
										Feature.ORE,
							new OreFeatureConfig(
								OreFeatureConfig.Target.NATURAL_STONE,
								Blocks.NETHER_QUARTZ_ORE.getDefaultState(),
											8 //Ore vein size
				
							),
										Decorator.COUNT_RANGE,
				
							new RangeDecoratorConfig(
								8, //Number of veins per chunk
				
								0, //Bottom Offset
								0, //Min y level
				
								64 //Max y level
							)));
		}
	}
}
