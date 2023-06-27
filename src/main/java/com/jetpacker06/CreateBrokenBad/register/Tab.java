package com.jetpacker06.CreateBrokenBad.register;

import com.jetpacker06.CreateBrokenBad.registrate.RItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class Tab {
    public static final CreativeModeTab CREATEBB = new CreativeModeTab("CreateBB") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(RItems.WHITE_METH.get());
        }
    };
}