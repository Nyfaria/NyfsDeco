package com.nyfaria.nyfsdeco;

import com.nyfaria.nyfsdeco.init.BlockInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;

@Mod(Constants.MODID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NyfsDeco {
    public static final CreativeModeTab BLOCKS_TAB = new CreativeModeTab("nyfsdeco.blocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlockInit.RESPAWN_ANCHOR_TOP.getBlock().get());
        }
    };
    public static final CreativeModeTab SLABS_TAB = new CreativeModeTab("nyfsdeco.slabs") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlockInit.RESPAWN_ANCHOR_TOP.getSlab().get());
        }
    };
    public static final CreativeModeTab STAIRS_TAB = new CreativeModeTab("nyfsdeco.stairs") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlockInit.RESPAWN_ANCHOR_TOP.getStairs().get());
        }
    };
    public static final CreativeModeTab WALLS_TAB = new CreativeModeTab("nyfsdeco.walls") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlockInit.RESPAWN_ANCHOR_TOP.getWall().get());
        }
    };
    public static final CreativeModeTab FENCES_TAB = new CreativeModeTab("nyfsdeco.fences") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlockInit.RESPAWN_ANCHOR_TOP.getFence().get());
        }
    };
    public static final CreativeModeTab FENCE_GATES_TAB = new CreativeModeTab("nyfsdeco.fence_gates") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlockInit.RESPAWN_ANCHOR_TOP.getFenceGate().get());
        }
    };
    public static final CreativeModeTab BUTTONS_TAB = new CreativeModeTab("nyfsdeco.buttons") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlockInit.RESPAWN_ANCHOR_TOP.getButton().get());
        }
    };
    public static final CreativeModeTab PRESSURE_PLATES_TAB = new CreativeModeTab("nyfsdeco.pressure_plates") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlockInit.RESPAWN_ANCHOR_TOP.getPressurePlate().get());
        }
    };
    public static final CreativeModeTab TRAPDOORS_TAB = new CreativeModeTab("nyfsdeco.trapdoors") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlockInit.RESPAWN_ANCHOR_TOP.getTrapdoor().get());
        }
    };
    public static final CreativeModeTab CARPETS_TAB = new CreativeModeTab("nyfsdeco.carpet") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlockInit.RESPAWN_ANCHOR_TOP.getCarpet().get());
        }
    };


    
    public NyfsDeco() {
    
        // This method is invoked by the Forge mod loader when it is ready
        // to load your mod. You can access Forge and Common code in this
        // project.
    
        // Use Forge to bootstrap the Common mod.
        Constants.LOG.info("Hello Forge world!");
        CommonClass.init();
        
    }
}