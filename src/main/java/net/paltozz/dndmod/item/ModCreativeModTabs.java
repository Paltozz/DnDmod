package net.paltozz.dndmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.paltozz.dndmod.DNDmod;
import net.paltozz.dndmod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DNDmod.MOD_ID);

public static final RegistryObject<CreativeModeTab> DND_TAB = CREATIVE_MODE_TABS.register("dnd_tab",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.OWLBEAR_CLAW.get()))
                .title(Component.translatable("creativetab.dnd_tab"))
                .displayItems((itemDisplayParameters, output) -> {
                    output.accept(ModItems.OWLBEAR_FEATHER.get());
                    output.accept(ModItems.OWLBEAR_CLAW.get());
                    output.accept(ModItems.RAW_ADAMANT.get());
                    output.accept(ModItems.RAW_ELECTRUM.get());
                    output.accept(ModItems.RAW_ADAMANTINE.get());
                    output.accept(ModItems.ADAMANT_INGOT.get());
                    output.accept(ModItems.ELECTRUM_INGOT.get());
                    output.accept(ModItems.ADAMANTINE_INGOT.get());

                    output.accept(ModBlocks.ADAMANT_ORE.get());
                    output.accept(ModBlocks.DEEPSLATE_ADAMANT_ORE.get());
                    output.accept(ModBlocks.RAW_ADAMANT_BLOCK.get());
                    output.accept(ModBlocks.RAW_ADAMANTINE_BLOCK.get());
                    output.accept(ModBlocks.ADAMANT_BLOCK.get());
                    output.accept(ModBlocks.ADAMANTINE_BLOCK.get());

                } )
                .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
