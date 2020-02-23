package net.lucyawrey.shattered_world;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ShatteredWorld implements ModInitializer {
	public static final Block COPPER_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(2, 15).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 1).build());
	
	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK, new Identifier("shattered_world", "copper_ore"), COPPER_ORE);
		Registry.register(Registry.ITEM, new Identifier("shattered_world", "copper_ore"), new BlockItem(COPPER_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}
}
