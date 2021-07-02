package com.nyfaria.nyfsdeco;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import com.nyfaria.nyfsdeco.blocks.BlockInit;
import com.nyfaria.nyfsdeco.items.ItemInit;

@Mod("nyfsdeco")
public class NyfsDeco
{
    public static final String MOD_ID = "nyfsdeco";

    public NyfsDeco() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();


		BlockInit.BLOCKS.register(bus);
		ItemInit.ITEMS.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
    }

}
