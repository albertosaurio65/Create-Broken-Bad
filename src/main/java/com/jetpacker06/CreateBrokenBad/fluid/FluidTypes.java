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
    private static final Vector3f vec_blue = new Vector3f(0f, 224f / 255f, 240f / 255f);
    private static final Vector3f vec_white = new Vector3f(1f, 1f, 1f);

    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateBrokenBad.MOD_ID);

    public static final RegistryObject<FluidType> LIQUID_BLUE_METHAMPHETAMINE = registerFluidType("liquid_blue_methamphetamine", true);
    public static final RegistryObject<FluidType> LIQUID_METHAMPHETAMINE = registerFluidType("liquid_methamphetamine", false);
    public static final RegistryObject<FluidType> METHYLAMINE = registerFluidType("methylamine", false);
    public static final RegistryObject<FluidType> METHANOL = registerFluidType("methanol", false);
    public static final RegistryObject<FluidType> HYDROGEN = registerFluidType("hydrogen", false);
    public static final RegistryObject<FluidType> OXYGEN = registerFluidType("oxygen", false);
    public static final RegistryObject<FluidType> AMMONIA = registerFluidType("ammonia", false);
    public static final RegistryObject<FluidType> PHENYLACETIC_ACID = registerFluidType("phenylacetic_acid", false);
    public static final RegistryObject<FluidType> ACETIC_ANHYDRIDE = registerFluidType("acetic_anhydride", false);
    public static final RegistryObject<FluidType> PHENYLACETONE = registerFluidType("phenylacetone", false);

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
    private static RegistryObject<FluidType> registerFluidType(String name, boolean blue) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, CHEMICAL_OVERLAY_RL,
                (blue ? 0xA100fffb : 0xA1FFFFFF), (blue ? vec_blue : vec_white), FluidTypes.FLUID_TYPE_PROPERTIES));
    }
}