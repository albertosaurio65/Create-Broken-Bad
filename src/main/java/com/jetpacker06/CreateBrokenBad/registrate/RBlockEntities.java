package com.jetpacker06.CreateBrokenBad.registrate;

import com.jetpacker06.CreateBrokenBad.block.BrassCallBellBlockEntity;
import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.BlockEntityEntry;

public class RBlockEntities {
    public static BlockEntityEntry<BrassCallBellBlockEntity> BRASS_CALL_BELL;
 //   public static BlockEntityEntry<BrassCallBellBlockEntity> TRAPPED_BRASS_CALL_BELL;

    public static void registerBlockEntities(Registrate registrate) {
        BRASS_CALL_BELL = registrate.blockEntity("brass_call_bell", BrassCallBellBlockEntity::new)
                .validBlocks(() -> RBlocks.BRASS_CALL_BELL.get(), () -> RBlocks.TRAPPED_BRASS_CALL_BELL.get())
                .register();
    //    TRAPPED_BRASS_CALL_BELL = registrate.blockEntity("trapped_brass_call_bell", BrassCallBellBlockEntity::new)
    //            .validBlocks(() -> RBlocks.TRAPPED_BRASS_CALL_BELL.get())
    //            .register();
    }
}
