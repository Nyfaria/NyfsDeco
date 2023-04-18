package com.nyfaria.nyfsdeco;

import com.nyfaria.nyfsdeco.init.BlockInit;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class NyfsDeco implements ModInitializer {
    public static final CreativeModeTab BLOCKS_TAB = FabricItemGroupBuilder
            .build(new ResourceLocation(Constants.MODID, "blocks"), () -> new ItemStack(BlockInit.RESPAWN_ANCHOR_TOP.getBlock().get()));
    public static final CreativeModeTab SLABS_TAB = FabricItemGroupBuilder
            .build(new ResourceLocation(Constants.MODID, "slabs"), () -> new ItemStack(BlockInit.RESPAWN_ANCHOR_TOP.getSlab().get()));
    public static final CreativeModeTab STAIRS_TAB = FabricItemGroupBuilder
            .build(new ResourceLocation(Constants.MODID, "stairs"), () -> new ItemStack(BlockInit.RESPAWN_ANCHOR_TOP.getStairs().get()));
    public static final CreativeModeTab CARPET_TAB = FabricItemGroupBuilder
            .build(new ResourceLocation(Constants.MODID, "carpet"), () -> new ItemStack(BlockInit.RESPAWN_ANCHOR_TOP.getCarpet().get()));
    public static final CreativeModeTab WALLS_TAB = FabricItemGroupBuilder
            .build(new ResourceLocation(Constants.MODID, "walls"), () -> new ItemStack(BlockInit.RESPAWN_ANCHOR_TOP.getWall().get()));
    public static final CreativeModeTab FENCES_TAB = FabricItemGroupBuilder
            .build(new ResourceLocation(Constants.MODID, "fences"), () -> new ItemStack(BlockInit.RESPAWN_ANCHOR_TOP.getFence().get()));
    public static final CreativeModeTab FENCE_GATES_TAB = FabricItemGroupBuilder
            .build(new ResourceLocation(Constants.MODID, "fence_gates"), () -> new ItemStack(BlockInit.RESPAWN_ANCHOR_TOP.getFenceGate().get()));
    public static final CreativeModeTab BUTTONS_TAB = FabricItemGroupBuilder
            .build(new ResourceLocation(Constants.MODID, "buttons"), () -> new ItemStack(BlockInit.RESPAWN_ANCHOR_TOP.getButton().get()));
    public static final CreativeModeTab PRESSURE_PLATES_TAB = FabricItemGroupBuilder
            .build(new ResourceLocation(Constants.MODID, "pressure_plates"), () -> new ItemStack(BlockInit.RESPAWN_ANCHOR_TOP.getPressurePlate().get()));
    public static final CreativeModeTab TRAPDOORS_TAB = FabricItemGroupBuilder
            .build(new ResourceLocation(Constants.MODID, "trapdoors"), () -> new ItemStack(BlockInit.RESPAWN_ANCHOR_TOP.getTrapdoor().get()));

    @Override
    public void onInitialize() {
        CommonClass.init();
    }
}
