package com.jetpacker06.CreateBrokenBad.fluid;

import com.jetpacker06.CreateBrokenBad.CreateBrokenBad;
import com.mojang.math.Vector3f;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FluidTypes {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation CHEMICAL_OVERLAY_RL = new ResourceLocation(CreateBrokenBad.MOD_ID, "fluid/chemical_overlay");
    private static final FluidType.Properties FLUID_TYPE_PROPERTIES = FluidType.Properties.create().lightLevel(2).density(15).viscosity(5).sound(SoundAction.get("drink"), SoundEvents.GENERIC_DRINK);

    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateBrokenBad.MOD_ID);

    public static final RegistryObject<FluidType> CHEMICAL_WHITE = registerFluidType("chemical_white", false);
    public static final RegistryObject<FluidType> CHEMICAL_BLUE = registerFluidType("chemical_blue", false);

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
    private static RegistryObject<FluidType> registerFluidType(String name, boolean blue) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, CHEMICAL_OVERLAY_RL, (blue ? 0xA1E038D0 : 0xFFFFFFCC), new Vector3f(222f / 255f, 56f / 255f, 208f / 255f), FluidTypes.FLUID_TYPE_PROPERTIES));
    }
}
