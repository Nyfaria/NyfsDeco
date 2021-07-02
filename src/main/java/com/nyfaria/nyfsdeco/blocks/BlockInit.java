package com.nyfaria.nyfsdeco.blocks;

import com.nyfaria.nyfsdeco.NyfsDeco;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, NyfsDeco.MOD_ID);
	
	public static final RegistryObject<Block> CT_TOPBLOCK = BLOCKS.register("crafting_table_top_block",() -> new Block(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));
	public static final RegistryObject<SlabBlock> CT_TOPSLAB = BLOCKS.register("crafting_table_top_slab",() -> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));
	
	public static final RegistryObject<Block> ST_TOPBLOCK = BLOCKS.register("smithing_table_top_block",() -> new Block(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));
	public static final RegistryObject<SlabBlock> ST_TOPBLOCKSLAB = BLOCKS.register("smithing_table_top_slab",() -> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));
	
	public static final RegistryObject<Block> ST_BOTTOMBLOCK = BLOCKS.register("smithing_table_bottom_block",() -> new Block(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));
	public static final RegistryObject<SlabBlock> ST_BOTTOMBSLAB = BLOCKS.register("smithing_table_bottom_slab",() -> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> RA_TOPBLOCK = BLOCKS.register("respawn_anchor_top_block",() -> new Block(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));
	public static final RegistryObject<SlabBlock> RA_TOPSLAB = BLOCKS.register("respawn_anchor_top_slab",() -> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> RA_TOPBLOCK_ON = BLOCKS.register("respawn_anchor_top_block_on",() -> new Block(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));
	public static final RegistryObject<SlabBlock> RA_TOPSLAB_ON = BLOCKS.register("respawn_anchor_top_slab_on",() -> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> LS_TOPBLOCK = BLOCKS.register("lodestone_top_block",() -> new Block(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));
	public static final RegistryObject<SlabBlock> LS_TOPSLAB = BLOCKS.register("lodestone_top_slab",() -> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> LS_SIDEBLOCK = BLOCKS.register("lodestone_side_block",() -> new Block(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));
	public static final RegistryObject<SlabBlock> LS_SIDESLAB = BLOCKS.register("lodestone_side_slab",() -> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> BF_TOPBLOCK = BLOCKS.register("blast_furnace_top_block",() -> new Block(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));
	public static final RegistryObject<SlabBlock> BF_TOPSLAB = BLOCKS.register("blast_furnace_top_slab",() -> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> S_TOPBLOCK = BLOCKS.register("smoker_top_block",() -> new Block(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));
	public static final RegistryObject<SlabBlock> S_TOPSLAB = BLOCKS.register("smoker_top_slab",() -> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> S_BOTTOMBLOCK = BLOCKS.register("smoker_bottom_block",() -> new Block(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));
	public static final RegistryObject<SlabBlock> S_BOTTOMSLAB = BLOCKS.register("smoker_bottom_slab",() -> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> RED_SHULKERBLOCK = BLOCKS.register("red_shulker_block",() -> new Block(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));
	public static final RegistryObject<SlabBlock> RED_SHULKERSLAB = BLOCKS.register("red_shulker_slab",() -> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> BLACK_SHULKERBLOCK = BLOCKS.register("black_shulker_block",() -> new Block(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));
	public static final RegistryObject<SlabBlock> BLACK_SHULKERSLAB = BLOCKS.register("black_shulker_slab",() -> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> GREEN_SHULKERBLOCK = BLOCKS.register("green_shulker_block",() -> new Block(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));
	public static final RegistryObject<SlabBlock> GREEN_SHULKERSLAB = BLOCKS.register("green_shulker_slab",() -> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> ORANGE_SHULKERBLOCK = BLOCKS.register("orange_shulker_block",() -> new Block(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));
	public static final RegistryObject<SlabBlock> ORANGE_SHULKERSLAB = BLOCKS.register("orange_shulker_slab",() -> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> LIGHT_BLUE_SHULKERBLOCK = BLOCKS.register("light_blue_shulker_block",() -> new Block(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));
	public static final RegistryObject<SlabBlock> LIGHT_BLUE_SHULKERSLAB = BLOCKS.register("light_blue_shulker_slab",() -> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> YELLOW_SHULKERBLOCK = BLOCKS.register("yellow_shulker_block",() -> new Block(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));
	public static final RegistryObject<SlabBlock> YELLOW_SHULKERSLAB = BLOCKS.register("yellow_shulker_slab",() -> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> LIME_SHULKERBLOCK = BLOCKS.register("lime_shulker_block",() -> new Block(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));
	public static final RegistryObject<SlabBlock> LIME_SHULKERSLAB = BLOCKS.register("lime_shulker_slab",() -> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> PINK_SHULKERBLOCK = BLOCKS.register("pink_shulker_block",() -> new Block(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));
	public static final RegistryObject<SlabBlock> PINK_SHULKERSLAB = BLOCKS.register("pink_shulker_slab",() -> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> GRAY_SHULKERBLOCK = BLOCKS.register("gray_shulker_block",() -> new Block(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));
	public static final RegistryObject<SlabBlock> GRAY_SHULKERSLAB = BLOCKS.register("gray_shulker_slab",() -> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> LIGHT_GRAY_SHULKERBLOCK = BLOCKS.register("light_gray_shulker_block",() -> new Block(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));
	public static final RegistryObject<SlabBlock> LIGHT_GRAY_SHULKERSLAB = BLOCKS.register("light_gray_shulker_slab",() -> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> CYAN_SHULKERBLOCK = BLOCKS.register("cyan_shulker_block",() -> new Block(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));
	public static final RegistryObject<SlabBlock> CYAN_SHULKERSLAB = BLOCKS.register("cyan_shulker_slab",() -> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> PURPLE_SHULKERBLOCK = BLOCKS.register("purple_shulker_block",() -> new Block(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));
	public static final RegistryObject<SlabBlock> PURPLE_SHULKERSLAB = BLOCKS.register("purple_shulker_slab",() -> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> BLUE_SHULKERBLOCK = BLOCKS.register("blue_shulker_block",() -> new Block(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));
	public static final RegistryObject<SlabBlock> BLUE_SHULKERSLAB = BLOCKS.register("blue_shulker_slab",() -> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> BROWN_SHULKERBLOCK = BLOCKS.register("brown_shulker_block",() -> new Block(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));
	public static final RegistryObject<SlabBlock> BROWN_SHULKERSLAB = BLOCKS.register("brown_shulker_slab",() -> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> WHITE_SHULKERBLOCK = BLOCKS.register("white_shulker_block",() -> new Block(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));
	public static final RegistryObject<SlabBlock> WHITE_SHULKERSLAB = BLOCKS.register("white_shulker_slab",() -> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> MAGENTA_SHULKERBLOCK = BLOCKS.register("magenta_shulker_block",() -> new Block(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));
	public static final RegistryObject<SlabBlock> MAGENTA_SHULKERSLAB = BLOCKS.register("magenta_shulker_slab",() -> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> SHULKERBLOCK = BLOCKS.register("shulker_block",() -> new Block(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD)));
	public static final RegistryObject<SlabBlock> SHULKERSLAB = BLOCKS.register("shulker_slab",() -> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(2).strength(.5f).sound(SoundType.WOOD))); 

	
}
