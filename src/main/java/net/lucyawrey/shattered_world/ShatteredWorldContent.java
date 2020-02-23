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

public class ShatteredWorldContent {

	// Blocks
	public static final Block COPPER_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3, 15).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 1).build());
	public static final Block TIN_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3, 15).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 1).build());
	public static final Block SILVER_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3, 15).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 2).build());
	public static final Block QUARTZ_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3, 15).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 0).build());

	// Items
	public static final Item COPPER_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Item TIN_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Item SILVER_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Item BRONZE_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Item ELECTRUM_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Item STEEL_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

	public static void init() {
		// Blocks
		Registry.register(Registry.BLOCK, new Identifier("shattered_world", "copper_ore"), COPPER_ORE);
		Registry.register(Registry.ITEM, new Identifier("shattered_world", "copper_ore"), new BlockItem(COPPER_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("shattered_world", "tin_ore"), TIN_ORE);
		Registry.register(Registry.ITEM, new Identifier("shattered_world", "tin_ore"), new BlockItem(TIN_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("shattered_world", "silver_ore"), SILVER_ORE);
		Registry.register(Registry.ITEM, new Identifier("shattered_world", "silver_ore"), new BlockItem(SILVER_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("shattered_world", "quartz_ore"), QUARTZ_ORE);
		Registry.register(Registry.ITEM, new Identifier("shattered_world", "quartz_ore"), new BlockItem(QUARTZ_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

		// Items
		Registry.register(Registry.ITEM, new Identifier("shattered_world", "copper_ingot"), COPPER_INGOT);
		Registry.register(Registry.ITEM, new Identifier("shattered_world", "tin_ingot"), TIN_INGOT);
		Registry.register(Registry.ITEM, new Identifier("shattered_world", "silver_ingot"), SILVER_INGOT);
		Registry.register(Registry.ITEM, new Identifier("shattered_world", "bronze_ingot"), BRONZE_INGOT);
		Registry.register(Registry.ITEM, new Identifier("shattered_world", "electrum_ingot"), ELECTRUM_INGOT);
		Registry.register(Registry.ITEM, new Identifier("shattered_world", "steel_ingot"), STEEL_INGOT);
	}
}
