package com.jetpacker06.CreateBrokenBad;

import com.jetpacker06.CreateBrokenBad.register.AllCustomTriggerAdvancements;
import com.jetpacker06.CreateBrokenBad.register.AllSoundEvents;
import com.jetpacker06.CreateBrokenBad.registrate.RBlockEntities;
import com.jetpacker06.CreateBrokenBad.registrate.RBlocks;
import com.jetpacker06.CreateBrokenBad.registrate.RFluids;
import com.jetpacker06.CreateBrokenBad.registrate.RItems;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.nullness.NonNullSupplier;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod("createbb")
@SuppressWarnings("removal")
public class CreateBrokenBad {
    public static final String MOD_ID = "createbb";
    private static final NonNullSupplier<CreateRegistrate> createRegistrate = () -> CreateRegistrate.create(MOD_ID);
    public static CreateRegistrate registrate() {
        return createRegistrate.get();
    }

    public CreateBrokenBad() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        AllSoundEvents.register(eventBus);


        Registrate registrate = Registrate.create(MOD_ID);
        RItems.registerItems(registrate);
        RBlocks.registerBasicBlocks(registrate);
        RFluids.registerFluids(registrate);
        RBlockEntities.registerBlockEntities(registrate);


        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(RBlocks.EPHEDRA_CROP_BLOCK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(RBlocks.BRASS_CALL_BELL.get(), RenderType.cutout());

         
    }
    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ComposterBlock.COMPOSTABLES.put(RItems.EPHEDRA.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(RItems.EPHEDRA_SEEDS.get(), 0.65f);
        });
        
        AllCustomTriggerAdvancements.register();
    }
}