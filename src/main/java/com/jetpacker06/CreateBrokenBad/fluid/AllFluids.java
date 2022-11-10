package com.jetpacker06.CreateBrokenBad.fluid;

import com.jetpacker06.CreateBrokenBad.CreateBrokenBad;
import com.jetpacker06.CreateBrokenBad.register.AllBlocks;
import com.jetpacker06.CreateBrokenBad.register.AllItems;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AllFluids {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, CreateBrokenBad.MOD_ID);
    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }

    public static final RegistryObject<FlowingFluid> LIQUID_BLUE_METHAMPHETAMINE = FLUIDS.register("liquid_blue_methamphetamine", () -> new ForgeFlowingFluid.Source(AllFluids.LIQUID_BLUE_METHAMPHETAMINE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> LIQUID_BLUE_METHAMPHETAMINE_FLOWING = FLUIDS.register("liquid_blue_methamphetamine_flowing", () -> new ForgeFlowingFluid.Flowing(AllFluids.LIQUID_BLUE_METHAMPHETAMINE_PROPERTIES));
    public static final RegistryObject<LiquidBlock> LIQUID_BLUE_METHAMPHETAMINE_BLOCK = AllBlocks.BLOCKS.register("liquid_blue_methamphetamine_block", () -> new LiquidBlock(AllFluids.LIQUID_BLUE_METHAMPHETAMINE, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final ForgeFlowingFluid.Properties LIQUID_BLUE_METHAMPHETAMINE_PROPERTIES = new ForgeFlowingFluid.Properties(FluidTypes.CHEMICAL_BLUE,  LIQUID_BLUE_METHAMPHETAMINE, LIQUID_BLUE_METHAMPHETAMINE_FLOWING).slopeFindDistance(2).levelDecreasePerBlock(2).block(LIQUID_BLUE_METHAMPHETAMINE_BLOCK).bucket(AllItems.LIQUID_BLUE_METHAMPHETAMINE_BUCKET);

    public static final RegistryObject<FlowingFluid> LIQUID_METHAMPHETAMINE = FLUIDS.register("liquid_methamphetamine", () -> new ForgeFlowingFluid.Source(AllFluids.LIQUID_METHAMPHETAMINE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> LIQUID_METHAMPHETAMINE_FLOWING = FLUIDS.register("liquid_methamphetamine_flowing", () -> new ForgeFlowingFluid.Flowing(AllFluids.LIQUID_METHAMPHETAMINE_PROPERTIES));
    public static final RegistryObject<LiquidBlock> LIQUID_METHAMPHETAMINE_BLOCK = AllBlocks.BLOCKS.register("liquid_methamphetamine_block", () -> new LiquidBlock(AllFluids.LIQUID_METHAMPHETAMINE, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final ForgeFlowingFluid.Properties LIQUID_METHAMPHETAMINE_PROPERTIES = new ForgeFlowingFluid.Properties(FluidTypes.CHEMICAL_WHITE,  LIQUID_METHAMPHETAMINE, LIQUID_METHAMPHETAMINE_FLOWING).slopeFindDistance(2).levelDecreasePerBlock(2).block(LIQUID_METHAMPHETAMINE_BLOCK).bucket(AllItems.LIQUID_METHAMPHETAMINE_BUCKET);

    public static final RegistryObject<FlowingFluid> METHYLAMINE = FLUIDS.register("methylamine", () -> new ForgeFlowingFluid.Source(AllFluids.METHYLAMINE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> METHYLAMINE_FLOWING = FLUIDS.register("methylamine_flowing", () -> new ForgeFlowingFluid.Flowing(AllFluids.METHYLAMINE_PROPERTIES));
    public static final RegistryObject<LiquidBlock> METHYLAMINE_BLOCK = AllBlocks.BLOCKS.register("methylamine_block", () -> new LiquidBlock(AllFluids.METHYLAMINE, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final ForgeFlowingFluid.Properties METHYLAMINE_PROPERTIES = new ForgeFlowingFluid.Properties(FluidTypes.CHEMICAL_WHITE,  METHYLAMINE, METHYLAMINE_FLOWING).slopeFindDistance(2).levelDecreasePerBlock(2).block(METHYLAMINE_BLOCK).bucket(AllItems.METHYLAMINE_BUCKET);

    public static final RegistryObject<FlowingFluid> METHANOL = FLUIDS.register("methanol", () -> new ForgeFlowingFluid.Source(AllFluids.METHANOL_PROPERTIES));
    public static final RegistryObject<FlowingFluid> METHANOL_FLOWING = FLUIDS.register("methanol_flowing", () -> new ForgeFlowingFluid.Flowing(AllFluids.METHANOL_PROPERTIES));
    public static final RegistryObject<LiquidBlock> METHANOL_BLOCK = AllBlocks.BLOCKS.register("methanol_block", () -> new LiquidBlock(AllFluids.METHANOL, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final ForgeFlowingFluid.Properties METHANOL_PROPERTIES = new ForgeFlowingFluid.Properties(FluidTypes.CHEMICAL_WHITE,  METHANOL, METHANOL_FLOWING).slopeFindDistance(2).levelDecreasePerBlock(2).block(METHANOL_BLOCK).bucket(AllItems.METHANOL_BUCKET);

    public static final RegistryObject<FlowingFluid> HYDROGEN = FLUIDS.register("hydrogen", () -> new ForgeFlowingFluid.Source(AllFluids.HYDROGEN_PROPERTIES));
    public static final RegistryObject<FlowingFluid> HYDROGEN_FLOWING = FLUIDS.register("hydrogen_flowing", () -> new ForgeFlowingFluid.Flowing(AllFluids.HYDROGEN_PROPERTIES));
    public static final RegistryObject<LiquidBlock> HYDROGEN_BLOCK = AllBlocks.BLOCKS.register("hydrogen_block", () -> new LiquidBlock(AllFluids.HYDROGEN, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final ForgeFlowingFluid.Properties HYDROGEN_PROPERTIES = new ForgeFlowingFluid.Properties(FluidTypes.CHEMICAL_WHITE,  HYDROGEN, HYDROGEN_FLOWING).slopeFindDistance(2).levelDecreasePerBlock(2).block(HYDROGEN_BLOCK).bucket(AllItems.HYDROGEN_BUCKET);

    public static final RegistryObject<FlowingFluid> OXYGEN = FLUIDS.register("oxygen", () -> new ForgeFlowingFluid.Source(AllFluids.OXYGEN_PROPERTIES));
    public static final RegistryObject<FlowingFluid> OXYGEN_FLOWING = FLUIDS.register("oxygen_flowing", () -> new ForgeFlowingFluid.Flowing(AllFluids.OXYGEN_PROPERTIES));
    public static final RegistryObject<LiquidBlock> OXYGEN_BLOCK = AllBlocks.BLOCKS.register("oxygen_block", () -> new LiquidBlock(AllFluids.OXYGEN, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final ForgeFlowingFluid.Properties OXYGEN_PROPERTIES = new ForgeFlowingFluid.Properties(FluidTypes.CHEMICAL_WHITE,  OXYGEN, OXYGEN_FLOWING).slopeFindDistance(2).levelDecreasePerBlock(2).block(OXYGEN_BLOCK).bucket(AllItems.OXYGEN_BUCKET);

    public static final RegistryObject<FlowingFluid> AMMONIA = FLUIDS.register("ammonia", () -> new ForgeFlowingFluid.Source(AllFluids.AMMONIA_PROPERTIES));
    public static final RegistryObject<FlowingFluid> AMMONIA_FLOWING = FLUIDS.register("ammonia_flowing", () -> new ForgeFlowingFluid.Flowing(AllFluids.AMMONIA_PROPERTIES));
    public static final RegistryObject<LiquidBlock> AMMONIA_BLOCK = AllBlocks.BLOCKS.register("ammonia_block", () -> new LiquidBlock(AllFluids.AMMONIA, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final ForgeFlowingFluid.Properties AMMONIA_PROPERTIES = new ForgeFlowingFluid.Properties(FluidTypes.CHEMICAL_WHITE,  AMMONIA, AMMONIA_FLOWING).slopeFindDistance(2).levelDecreasePerBlock(2).block(AMMONIA_BLOCK).bucket(AllItems.AMMONIA_BUCKET);

    public static final RegistryObject<FlowingFluid> PHENYLACETIC_ACID = FLUIDS.register("phenylacetic_acid", () -> new ForgeFlowingFluid.Source(AllFluids.PHENYLACETIC_ACID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> PHENYLACETIC_ACID_FLOWING = FLUIDS.register("phenylacetic_acid_flowing", () -> new ForgeFlowingFluid.Flowing(AllFluids.PHENYLACETIC_ACID_PROPERTIES));
    public static final RegistryObject<LiquidBlock> PHENYLACETIC_ACID_BLOCK = AllBlocks.BLOCKS.register("phenylacetic_acid_block", () -> new LiquidBlock(AllFluids.PHENYLACETIC_ACID, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final ForgeFlowingFluid.Properties PHENYLACETIC_ACID_PROPERTIES = new ForgeFlowingFluid.Properties(FluidTypes.CHEMICAL_WHITE,  PHENYLACETIC_ACID, PHENYLACETIC_ACID_FLOWING).slopeFindDistance(2).levelDecreasePerBlock(2).block(PHENYLACETIC_ACID_BLOCK).bucket(AllItems.PHENYLACETIC_ACID_BUCKET);

    public static final RegistryObject<FlowingFluid> ACETIC_ANHYDRIDE = FLUIDS.register("acetic_anhydride", () -> new ForgeFlowingFluid.Source(AllFluids.ACETIC_ANHYDRIDE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> ACETIC_ANHYDRIDE_FLOWING = FLUIDS.register("acetic_anhydride_flowing", () -> new ForgeFlowingFluid.Flowing(AllFluids.ACETIC_ANHYDRIDE_PROPERTIES));
    public static final RegistryObject<LiquidBlock> ACETIC_ANHYDRIDE_BLOCK = AllBlocks.BLOCKS.register("acetic_anhydride_block", () -> new LiquidBlock(AllFluids.ACETIC_ANHYDRIDE, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final ForgeFlowingFluid.Properties ACETIC_ANHYDRIDE_PROPERTIES = new ForgeFlowingFluid.Properties(FluidTypes.CHEMICAL_WHITE,  ACETIC_ANHYDRIDE, ACETIC_ANHYDRIDE_FLOWING).slopeFindDistance(2).levelDecreasePerBlock(2).block(ACETIC_ANHYDRIDE_BLOCK).bucket(AllItems.ACETIC_ANHYDRIDE_BUCKET);

    public static final RegistryObject<FlowingFluid> PHENYLACETONE = FLUIDS.register("phenylacetone", () -> new ForgeFlowingFluid.Source(AllFluids.PHENYLACETONE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> PHENYLACETONE_FLOWING = FLUIDS.register("phenylacetone_flowing", () -> new ForgeFlowingFluid.Flowing(AllFluids.PHENYLACETONE_PROPERTIES));
    public static final RegistryObject<LiquidBlock> PHENYLACETONE_BLOCK = AllBlocks.BLOCKS.register("phenylacetone_block", () -> new LiquidBlock(AllFluids.PHENYLACETONE, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final ForgeFlowingFluid.Properties PHENYLACETONE_PROPERTIES = new ForgeFlowingFluid.Properties(FluidTypes.CHEMICAL_WHITE,  PHENYLACETONE, PHENYLACETONE_FLOWING).slopeFindDistance(2).levelDecreasePerBlock(2).block(PHENYLACETONE_BLOCK).bucket(AllItems.PHENYLACETONE_BUCKET);


}
