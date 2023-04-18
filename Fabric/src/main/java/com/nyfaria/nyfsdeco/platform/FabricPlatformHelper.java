package com.nyfaria.nyfsdeco.platform;

import com.nyfaria.nyfsdeco.NyfsDeco;
import com.nyfaria.nyfsdeco.platform.services.IPlatformHelper;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.world.item.CreativeModeTab;

public class FabricPlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {
        return "Fabric";
    }

    @Override
    public boolean isModLoaded(String modId) {

        return FabricLoader.getInstance().isModLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {

        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }

    @Override
    public CreativeModeTab getBlocksTab() {
        return NyfsDeco.BLOCKS_TAB;
    }

    @Override
    public CreativeModeTab getSlabsTab() {
        return NyfsDeco.SLABS_TAB;
    }

    @Override
    public CreativeModeTab getStairsTab() {
        return NyfsDeco.STAIRS_TAB;
    }

    @Override
    public CreativeModeTab getWallsTab() {
        return NyfsDeco.WALLS_TAB;
    }

    @Override
    public CreativeModeTab getFencesTab() {
        return NyfsDeco.FENCES_TAB;
    }

    @Override
    public CreativeModeTab getFenceGatesTab() {
        return NyfsDeco.FENCE_GATES_TAB;
    }

    @Override
    public CreativeModeTab getTrapdoorsTab() {
        return NyfsDeco.TRAPDOORS_TAB;
    }

    @Override
    public CreativeModeTab getButtonsTab() {
        return NyfsDeco.BUTTONS_TAB;
    }

    @Override
    public CreativeModeTab getPressurePlatesTab() {
        return NyfsDeco.PRESSURE_PLATES_TAB;
    }

    @Override
    public CreativeModeTab getCarpetsTab() {
        return NyfsDeco.CARPET_TAB;
    }
}
