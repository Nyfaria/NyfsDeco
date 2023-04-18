package com.nyfaria.nyfsdeco.block;

import com.nyfaria.nyfsdeco.init.ItemInit;
import com.nyfaria.nyfsdeco.platform.Services;
import com.nyfaria.nyfsdeco.registration.RegistryObject;
import com.nyfaria.nyfsdeco.init.BlockInit;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.CarpetBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.WoodButtonBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.ArrayList;
import java.util.List;

public class BlockCollection {
    public static final List<BlockCollection> COLLECTIONS = new ArrayList<>();
    private final Block parentBlock;
    private final RegistryObject<Block> block;
    private final RegistryObject<Block> stairs;
    private final RegistryObject<Block> slab;
    private final RegistryObject<Block> carpet;
    private final RegistryObject<Block> pressurePlate;
    private final RegistryObject<Block> button;
    private final RegistryObject<Block> trapdoor;
    private final RegistryObject<Block> fence;
    private final RegistryObject<Block> fenceGate;
    private final RegistryObject<Block> wall;

    public BlockCollection(Block parentBlock, String name) {
        this(parentBlock, name, true, true, true, true);
    }

    public BlockCollection(Block parentBlock, String name, boolean block, boolean stairs, boolean slab, boolean carpet) {
        this.parentBlock = parentBlock;
        BlockBehaviour.Properties properties = BlockBehaviour.Properties.copy(Blocks.DIRT).noOcclusion();
        this.block = block ? BlockInit.registerBlockWithItem(parentBlock, name, () -> new Block(properties), ItemInit.getItemProperties().tab(Services.PLATFORM.getBlocksTab())) : null;
        this.stairs = stairs ? BlockInit.registerBlockWithItem(parentBlock, name + "_stairs", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), properties), ItemInit.getItemProperties().tab(Services.PLATFORM.getStairsTab())) : null;
        this.slab = slab ? BlockInit.registerBlockWithItem(parentBlock, name + "_slab", () -> new SlabBlock(properties), ItemInit.getItemProperties().tab(Services.PLATFORM.getSlabsTab())) : null;
        this.carpet = carpet ? BlockInit.registerBlockWithItem(parentBlock, name + "_carpet", () -> new CarpetBlock(properties), ItemInit.getItemProperties().tab(Services.PLATFORM.getCarpetsTab())) : null;
        this.pressurePlate = BlockInit.registerBlockWithItem(parentBlock, name + "_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,properties), ItemInit.getItemProperties().tab(Services.PLATFORM.getPressurePlatesTab()));
        this.button = BlockInit.registerBlockWithItem(parentBlock, name + "_button",()-> new WoodButtonBlock(properties), ItemInit.getItemProperties().tab(Services.PLATFORM.getButtonsTab()));
        this.trapdoor = BlockInit.registerBlockWithItem(parentBlock, name + "_trapdoor", ()-> new TrapDoorBlock(properties), ItemInit.getItemProperties().tab(Services.PLATFORM.getTrapdoorsTab()));
        this.fence = BlockInit.registerBlockWithItem(parentBlock, name + "_fence", ()-> new FenceBlock(properties), ItemInit.getItemProperties().tab(Services.PLATFORM.getFencesTab()));
        this.fenceGate = BlockInit.registerBlockWithItem(parentBlock, name + "_fence_gate", ()-> new FenceGateBlock(properties), ItemInit.getItemProperties().tab(Services.PLATFORM.getFenceGatesTab()));
        this.wall = BlockInit.registerBlockWithItem(parentBlock, name + "_wall", ()-> new WallBlock(properties), ItemInit.getItemProperties().tab(Services.PLATFORM.getWallsTab()));
        COLLECTIONS.add(this);
    }

    public Block getParentBlock() {
        return parentBlock;
    }

    public RegistryObject<Block> getBlock() {
        return block;
    }

    public RegistryObject<Block> getStairs() {
        return stairs;
    }

    public RegistryObject<Block> getSlab() {
        return slab;
    }

    public RegistryObject<Block> getCarpet() {
        return carpet;
    }
    public RegistryObject<Block> getPressurePlate() {
        return pressurePlate;
    }
    public RegistryObject<Block> getButton() {
        return button;
    }

    public RegistryObject<Block> getTrapdoor() {
        return trapdoor;
    }

    public RegistryObject<Block> getFence() {
        return fence;
    }

    public RegistryObject<Block> getFenceGate() {
        return fenceGate;
    }

    public RegistryObject<Block> getWall() {
        return wall;
    }
}
