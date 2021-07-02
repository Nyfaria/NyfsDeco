package com.nyfaria.nyfsdeco.items;


import com.nyfaria.nyfsdeco.NyfsDeco;
import com.nyfaria.nyfsdeco.blocks.BlockInit;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NyfsDeco.MOD_ID);
	public static final RegistryObject<BlockItem> ITEM_CT_SLAB = ITEMS.register("ct_slab", () -> new BlockItem(BlockInit.CT_TOPSLAB.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> ITEM_CT_TOP = ITEMS.register("ct_top", () -> new BlockItem(BlockInit.CT_TOPBLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	
	public static final RegistryObject<BlockItem> ITEM_ST_TOP = ITEMS.register("st_top", () -> new BlockItem(BlockInit.ST_TOPBLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> ITEM_ST_TOP_SLAB = ITEMS.register("st_top_slab", () -> new BlockItem(BlockInit.ST_TOPBLOCKSLAB.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	
	public static final RegistryObject<BlockItem> ITEM_ST_BOTTOM = ITEMS.register("st_bottom", () -> new BlockItem(BlockInit.ST_BOTTOMBLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> ITEM_ST_BOTTOM_SLAB = ITEMS.register("st_bottom_slab", () -> new BlockItem(BlockInit.ST_BOTTOMBSLAB.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

	public static final RegistryObject<BlockItem> ITEM_RA_TOP = ITEMS.register("ra_top", () -> new BlockItem(BlockInit.RA_TOPBLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> ITEM_RA_TOP_SLAB = ITEMS.register("ra_top_slab", () -> new BlockItem(BlockInit.RA_TOPSLAB.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

	public static final RegistryObject<BlockItem> ITEM_RA_TOP_ON = ITEMS.register("ra_top_on", () -> new BlockItem(BlockInit.RA_TOPBLOCK_ON.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> ITEM_RA_TOP_SLAB_ON = ITEMS.register("ra_top_slab_on", () -> new BlockItem(BlockInit.RA_TOPSLAB_ON.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

	public static final RegistryObject<BlockItem> ITEM_LS_TOP = ITEMS.register("ls_top", () -> new BlockItem(BlockInit.LS_TOPBLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> ITEM_LS_TOP_SLAB = ITEMS.register("ls_top_slab", () -> new BlockItem(BlockInit.LS_TOPSLAB.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

	public static final RegistryObject<BlockItem> ITEM_LS_SIDE = ITEMS.register("ls_side", () -> new BlockItem(BlockInit.LS_SIDEBLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> ITEM_LS_SIDE_SLAB = ITEMS.register("ls_side_slab", () -> new BlockItem(BlockInit.LS_SIDESLAB.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

	public static final RegistryObject<BlockItem> ITEM_BF_TOP = ITEMS.register("bf_top", () -> new BlockItem(BlockInit.BF_TOPBLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> ITEM_BF_TOP_SLAB = ITEMS.register("bf_top_slab", () -> new BlockItem(BlockInit.BF_TOPSLAB.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

	public static final RegistryObject<BlockItem> ITEM_S_TOP = ITEMS.register("s_top", () -> new BlockItem(BlockInit.S_TOPBLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> ITEM_S_TOP_SLAB = ITEMS.register("s_top_slab", () -> new BlockItem(BlockInit.S_TOPSLAB.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

	public static final RegistryObject<BlockItem> ITEM_S_BOTTOM = ITEMS.register("s_bottom", () -> new BlockItem(BlockInit.S_BOTTOMBLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> ITEM_S_BOTTOM_SLAB = ITEMS.register("s_bottom_slab", () -> new BlockItem(BlockInit.S_BOTTOMSLAB.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

	public static final RegistryObject<BlockItem> ITEM_RED_SHULKER = ITEMS.register("red_shulker_bottom", () -> new BlockItem(BlockInit.RED_SHULKERBLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> ITEM_RED_SHULKER_SLAB = ITEMS.register("red_shulker_slab", () -> new BlockItem(BlockInit.RED_SHULKERSLAB.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

	public static final RegistryObject<BlockItem> ITEM_WHITE_SHULKER = ITEMS.register("white_shulker_bottom", () -> new BlockItem(BlockInit.WHITE_SHULKERBLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> ITEM_WHITE_SHULKER_SLAB = ITEMS.register("white_shulker_slab", () -> new BlockItem(BlockInit.WHITE_SHULKERSLAB.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

	public static final RegistryObject<BlockItem> ITEM_ORANGE_SHULKER = ITEMS.register("orange_shulker_bottom", () -> new BlockItem(BlockInit.ORANGE_SHULKERBLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> ITEM_ORANGE_SHULKER_SLAB = ITEMS.register("orange_shulker_slab", () -> new BlockItem(BlockInit.ORANGE_SHULKERSLAB.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

	public static final RegistryObject<BlockItem> ITEM_MAGENTA_SHULKER = ITEMS.register("magenta_shulker_bottom", () -> new BlockItem(BlockInit.MAGENTA_SHULKERBLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> ITEM_MAGENTA_SHULKER_SLAB = ITEMS.register("magenta_shulker_slab", () -> new BlockItem(BlockInit.MAGENTA_SHULKERSLAB.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

	public static final RegistryObject<BlockItem> ITEM_LIGHT_BLUE_SHULKER = ITEMS.register("light_blue_shulker_bottom", () -> new BlockItem(BlockInit.LIGHT_BLUE_SHULKERBLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> ITEM_LIGHT_BLUE_SHULKER_SLAB = ITEMS.register("light_blue_shulker_slab", () -> new BlockItem(BlockInit.LIGHT_BLUE_SHULKERSLAB.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

	public static final RegistryObject<BlockItem> ITEM_YELLOW_SHULKER = ITEMS.register("yellow_shulker_bottom", () -> new BlockItem(BlockInit.YELLOW_SHULKERBLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> ITEM_YELLOW_SHULKER_SLAB = ITEMS.register("yellow_shulker_slab", () -> new BlockItem(BlockInit.YELLOW_SHULKERSLAB.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

	public static final RegistryObject<BlockItem> ITEM_LIME_SHULKER = ITEMS.register("lime_shulker_bottom", () -> new BlockItem(BlockInit.LIME_SHULKERBLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> ITEM_LIME_SHULKER_SLAB = ITEMS.register("lime_shulker_slab", () -> new BlockItem(BlockInit.LIME_SHULKERSLAB.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

	public static final RegistryObject<BlockItem> ITEM_PINK_SHULKER = ITEMS.register("pink_shulker_bottom", () -> new BlockItem(BlockInit.PINK_SHULKERBLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> ITEM_PINK_SHULKER_SLAB = ITEMS.register("pink_shulker_slab", () -> new BlockItem(BlockInit.PINK_SHULKERSLAB.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

	public static final RegistryObject<BlockItem> ITEM_GRAY_SHULKER = ITEMS.register("gray_shulker_bottom", () -> new BlockItem(BlockInit.GRAY_SHULKERBLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> ITEM_GRAY_SHULKER_SLAB = ITEMS.register("gray_shulker_slab", () -> new BlockItem(BlockInit.GRAY_SHULKERSLAB.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

	public static final RegistryObject<BlockItem> ITEM_LIGHT_GRAY_SHULKER = ITEMS.register("light_gray_shulker_bottom", () -> new BlockItem(BlockInit.LIGHT_GRAY_SHULKERBLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> ITEM_LIGHT_GRAY_SHULKER_SLAB = ITEMS.register("light_gray_shulker_slab", () -> new BlockItem(BlockInit.LIGHT_GRAY_SHULKERSLAB.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

	public static final RegistryObject<BlockItem> ITEM_CYAN_SHULKER = ITEMS.register("cyan_shulker_bottom", () -> new BlockItem(BlockInit.CYAN_SHULKERBLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> ITEM_CYAN_SHULKER_SLAB = ITEMS.register("cyan_shulker_slab", () -> new BlockItem(BlockInit.CYAN_SHULKERSLAB.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

	public static final RegistryObject<BlockItem> ITEM_PURPLE_SHULKER = ITEMS.register("purple_shulker_bottom", () -> new BlockItem(BlockInit.PURPLE_SHULKERBLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> ITEM_PURPLE_SHULKER_SLAB = ITEMS.register("purple_shulker_slab", () -> new BlockItem(BlockInit.PURPLE_SHULKERSLAB.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

	public static final RegistryObject<BlockItem> ITEM_BLUE_SHULKER = ITEMS.register("blue_shulker_bottom", () -> new BlockItem(BlockInit.BLUE_SHULKERBLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> ITEM_BLUE_SHULKER_SLAB = ITEMS.register("blue_shulker_slab", () -> new BlockItem(BlockInit.BLUE_SHULKERSLAB.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

	public static final RegistryObject<BlockItem> ITEM_BROWN_SHULKER = ITEMS.register("brown_shulker_bottom", () -> new BlockItem(BlockInit.BROWN_SHULKERBLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> ITEM_BROWN_SHULKER_SLAB = ITEMS.register("brown_shulker_slab", () -> new BlockItem(BlockInit.BROWN_SHULKERSLAB.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

	public static final RegistryObject<BlockItem> ITEM_GREEN_SHULKER = ITEMS.register("green_shulker_bottom", () -> new BlockItem(BlockInit.GREEN_SHULKERBLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> ITEM_GREEN_SHULKER_SLAB = ITEMS.register("green_shulker_slab", () -> new BlockItem(BlockInit.GREEN_SHULKERSLAB.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

	public static final RegistryObject<BlockItem> ITEM_BLACK_SHULKER = ITEMS.register("black_shulker_bottom", () -> new BlockItem(BlockInit.BLACK_SHULKERBLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> ITEM_BLACK_SHULKER_SLAB = ITEMS.register("black_shulker_slab", () -> new BlockItem(BlockInit.BLACK_SHULKERSLAB.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

	public static final RegistryObject<BlockItem> ITEM_SHULKER = ITEMS.register("shulker_bottom", () -> new BlockItem(BlockInit.SHULKERBLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> ITEM_SHULKER_SLAB = ITEMS.register("shulker_slab", () -> new BlockItem(BlockInit.SHULKERSLAB.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

	
}
