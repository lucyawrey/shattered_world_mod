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

public class SwContent {

	// Constants
	public static final String NAMESPACE = "shattered_world";

	// Ore Blocks
	public static final Block COPPER_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3, 15)
			.breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 1).build());
	public static final Block TIN_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3, 15)
			.breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 1).build());
	public static final Block SILVER_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3, 15)
			.breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 2).build());
	public static final Block QUARTZ_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3, 15)
			.breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 0).build());
	public static final Block NETHER_SILVER_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3, 15)
			.breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 2).build());
	public static final Block NETHER_COAL_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3, 15)
			.breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 0).build());

	// Material Blocks
	public static final Block COPPER_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5, 30)
			.breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 1).build());
	public static final Block TIN_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5, 30)
			.breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 1).build());
	public static final Block SILVER_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5, 30)
			.breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 2).build());
	public static final Block BRONZE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5, 30)
			.breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 1).build());
	public static final Block ELECTRUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5, 30)
			.breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 2).build());
	public static final Block STEEL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5, 30)
			.breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 2).build());

	// Material Items
	public static final Item COPPER_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Item TIN_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Item SILVER_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Item BRONZE_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Item ELECTRUM_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Item STEEL_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Item COPPER_NUGGET = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Item TIN_NUGGET = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Item SILVER_NUGGET = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Item BRONZE_NUGGET = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Item ELECTRUM_NUGGET = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Item STEEL_NUGGET = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

	public void init() {
		// Ore Blocks
		registerBlock("copper_ore", COPPER_ORE, ItemGroup.BUILDING_BLOCKS);
		registerBlock("tin_ore", TIN_ORE, ItemGroup.BUILDING_BLOCKS);
		registerBlock("silver_ore", SILVER_ORE, ItemGroup.BUILDING_BLOCKS);
		registerBlock("quartz_ore", QUARTZ_ORE, ItemGroup.BUILDING_BLOCKS);
		registerBlock("nether_silver_ore", NETHER_SILVER_ORE, ItemGroup.BUILDING_BLOCKS);
		registerBlock("nether_coal_ore", NETHER_COAL_ORE, ItemGroup.BUILDING_BLOCKS);

		// Material Blocks
		registerBlock("copper_block", COPPER_BLOCK, ItemGroup.BUILDING_BLOCKS);
		registerBlock("tin_block", TIN_BLOCK, ItemGroup.BUILDING_BLOCKS);
		registerBlock("silver_block", SILVER_BLOCK, ItemGroup.BUILDING_BLOCKS);
		registerBlock("bronze_block", BRONZE_BLOCK, ItemGroup.BUILDING_BLOCKS);
		registerBlock("electrum_block", ELECTRUM_BLOCK, ItemGroup.BUILDING_BLOCKS);
		registerBlock("steel_block", STEEL_BLOCK, ItemGroup.BUILDING_BLOCKS);

		// Material Items
		registerItem("copper_ingot", COPPER_INGOT);
		registerItem("tin_ingot", TIN_INGOT);
		registerItem("silver_ingot", SILVER_INGOT);
		registerItem("bronze_ingot", BRONZE_INGOT);
		registerItem("electrum_ingot", ELECTRUM_INGOT);
		registerItem("steel_ingot", STEEL_INGOT);
		registerItem("copper_nugget", COPPER_NUGGET);
		registerItem("tin_nugget", TIN_NUGGET);
		registerItem("silver_nugget", SILVER_NUGGET);
		registerItem("bronze_nugget", BRONZE_NUGGET);
		registerItem("electrum_nugget", ELECTRUM_NUGGET);
		registerItem("steel_nugget", STEEL_NUGGET);
	}

	private void registerItem(String id, Item item) {
		Registry.register(Registry.ITEM, new Identifier(NAMESPACE, id), item);
	}

	private void registerBlock(String id, Block block, ItemGroup itemGroup) {
		Registry.register(Registry.BLOCK, new Identifier(NAMESPACE, id), block);
		Registry.register(Registry.ITEM, new Identifier(NAMESPACE, id),
				new BlockItem(block, new Item.Settings().group(itemGroup)));
	}
}
