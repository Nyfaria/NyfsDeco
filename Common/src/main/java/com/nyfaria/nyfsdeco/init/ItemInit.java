package com.nyfaria.nyfsdeco.init;

import com.nyfaria.nyfsdeco.Constants;
import com.nyfaria.nyfsdeco.registration.RegistrationProvider;
import net.minecraft.core.Registry;
import net.minecraft.world.item.Item;

public class ItemInit {
    public static final RegistrationProvider<Item> ITEMS = RegistrationProvider.get(Registry.ITEM, Constants.MODID);

    public static Item.Properties getItemProperties() {
        return new Item.Properties();
    }

    public static void loadClass() {
    }
}
