package net.paltozz.dndmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.paltozz.dndmod.DNDmod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DNDmod.MOD_ID);

    public static final RegistryObject<Item> OWLBEAR_FEATHER = ITEMS.register("owlbear_feather",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OWLBEAR_CLAW = ITEMS.register("owlbear_claw",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ADAMANT = ITEMS.register("raw_adamant",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ELECTRUM = ITEMS.register("raw_electrum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ADAMANTINE = ITEMS.register("raw_adamantine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ADAMANT_INGOT = ITEMS.register("adamant_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTRUM_INGOT = ITEMS.register("electrum_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ADAMANTINE_INGOT = ITEMS.register("adamantine_ingot",
            () -> new Item(new Item.Properties()));


    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
