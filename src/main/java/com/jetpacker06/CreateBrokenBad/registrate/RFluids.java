package com.jetpacker06.CreateBrokenBad.registrate;


import com.jetpacker06.CreateBrokenBad.register.Tab;
import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.builders.FluidBuilder;
import com.tterrag.registrate.util.entry.FluidEntry;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BucketItem;
import net.minecraftforge.common.SoundActions;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.fluids.ForgeFlowingFluid;

public class RFluids {
    private static Registrate registrate;
    public static ResourceLocation still = new ResourceLocation("block/water_still");
    public static ResourceLocation flow = new ResourceLocation("block/water_flow");

    public static FluidEntry<ForgeFlowingFluid.Flowing> LIQUID_BLUE_METHAMPHETAMINE;
    public static FluidEntry<ForgeFlowingFluid.Flowing> LIQUID_METHAMPHETAMINE;
    public static FluidEntry<ForgeFlowingFluid.Flowing> METHYLAMINE;
    public static FluidEntry<ForgeFlowingFluid.Flowing> METHANOL;
    public static FluidEntry<ForgeFlowingFluid.Flowing> HYDROGEN;
    public static FluidEntry<ForgeFlowingFluid.Flowing> OXYGEN;
    public static FluidEntry<ForgeFlowingFluid.Flowing> AMMONIA;
    public static FluidEntry<ForgeFlowingFluid.Flowing> PHENYLACETIC_ACID;
    public static FluidEntry<ForgeFlowingFluid.Flowing> ACETIC_ANHYDRIDE;
    public static FluidEntry<ForgeFlowingFluid.Flowing> PHENYLACETONE;;

    public static ItemEntry<BucketItem> LIQUID_BLUE_METHAMPHETAMINE_BUCKET;
    public static ItemEntry<BucketItem> LIQUID_METHAMPHETAMINE_BUCKET;
    public static ItemEntry<BucketItem> METHYLAMINE_BUCKET;
    public static ItemEntry<BucketItem> METHANOL_BUCKET;
    public static ItemEntry<BucketItem> HYDROGEN_BUCKET;
    public static ItemEntry<BucketItem> OXYGEN_BUCKET;
    public static ItemEntry<BucketItem> AMMONIA_BUCKET;
    public static ItemEntry<BucketItem> PHENYLACETIC_ACID_BUCKET;
    public static ItemEntry<BucketItem> ACETIC_ANHYDRIDE_BUCKET;
    public static ItemEntry<BucketItem> PHENYLACETONE_BUCKET;

    public static void applyDefaultProperties(FluidType.Properties builder) {
        builder.viscosity(5);
        builder.density(2);
        builder.sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA);
    }
    public static void applyDefaultFluidProperties(ForgeFlowingFluid.Properties builder) {
        builder.slopeFindDistance(2).levelDecreasePerBlock(2);
    }
    public static FluidBuilder<ForgeFlowingFluid.Flowing, Registrate> makeFluid(String name) {
        return registrate.fluid(name, still, flow)
                .fluidProperties(RFluids::applyDefaultFluidProperties)
                .properties(RFluids::applyDefaultProperties)
                .source(ForgeFlowingFluid.Source::new);
    }
    public static void registerFluids(Registrate REGISTRATE) {
        registrate = REGISTRATE;
        registrate.creativeModeTab(() -> Tab.CREATEBB);

        var l1 = makeFluid("liquid_blue_methamphetamine");
        LIQUID_BLUE_METHAMPHETAMINE_BUCKET = l1.bucket().register();
        LIQUID_BLUE_METHAMPHETAMINE = l1.register();

        var l2 = makeFluid("liquid_methamphetamine");
        LIQUID_METHAMPHETAMINE_BUCKET = l2.bucket().register();
        LIQUID_METHAMPHETAMINE = l2.register();

        var l3 = makeFluid("methylamine");
        METHYLAMINE_BUCKET = l3.bucket().register();
        METHYLAMINE = l3.register();

        var l4 = makeFluid("methanol");
        METHANOL_BUCKET = l4.bucket().register();
        METHANOL = l4.register();

        var l5 = makeFluid("hydrogen");
        HYDROGEN_BUCKET = l5.bucket().register();
        HYDROGEN = l5.register();

        var l6 = makeFluid("oxygen");
        OXYGEN_BUCKET = l6.bucket().register();
        OXYGEN = l6.register();

        var l7 = makeFluid("ammonia");
        AMMONIA_BUCKET = l7.bucket().register();
        AMMONIA = l7.register();

        var l8 = makeFluid("phenylacetic_acid");
        PHENYLACETIC_ACID_BUCKET = l8.bucket().register();
        PHENYLACETIC_ACID = l8.register();

        var l9 = makeFluid("acetic_anhydride");
        ACETIC_ANHYDRIDE_BUCKET = l9.bucket().register();
        ACETIC_ANHYDRIDE = l9.register();

        var l10 = makeFluid("phenylacetone");
        PHENYLACETONE_BUCKET = l10.bucket().register();
        PHENYLACETONE = l10.register();

    }
}
