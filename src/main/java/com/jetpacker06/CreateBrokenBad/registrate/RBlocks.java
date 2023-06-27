package com.jetpacker06.CreateBrokenBad.registrate;

import com.jetpacker06.CreateBrokenBad.block.BrassCallBellBlock;
import com.jetpacker06.CreateBrokenBad.block.EphedraCropBlock;
import com.jetpacker06.CreateBrokenBad.block.TrayBlock;
import com.jetpacker06.CreateBrokenBad.register.Tab;
import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.BlockEntry;

public class RBlocks {

    public static BlockEntry<EphedraCropBlock> EPHEDRA_CROP_BLOCK;
    public static BlockEntry<BrassCallBellBlock> BRASS_CALL_BELL;
    public static BlockEntry<BrassCallBellBlock.Trapped> TRAPPED_BRASS_CALL_BELL;
    public static BlockEntry<TrayBlock.Blue> BLUE_METH_TRAY;
    public static BlockEntry<TrayBlock.Empty> TRAY;
    public static BlockEntry<TrayBlock.White> WHITE_METH_TRAY;

    public static void registerBasicBlocks(Registrate registrate) {
        registrate.creativeModeTab(() -> Tab.CREATEBB);
        EPHEDRA_CROP_BLOCK = registrate.block("ephedra_crop_block", EphedraCropBlock::new)
                //.lang("Ephedra Crop")
                .register();
        BRASS_CALL_BELL = registrate.block("brass_call_bell", BrassCallBellBlock::new)
                .simpleItem()
                //.lang("Brass Call Bell")
                .register();
        TRAPPED_BRASS_CALL_BELL = registrate.block("trapped_brass_call_bell", BrassCallBellBlock.Trapped::new)
                .simpleItem()
                //.lang("Trapped Brass Call Bell")
                .register();
        BLUE_METH_TRAY = registrate.block("blue_meth_tray", TrayBlock.Blue::new)
                .simpleItem()
                //.lang("Blue Meth Tray")
                .register();
        TRAY = registrate.block("tray", TrayBlock.Empty::new)
                .simpleItem()
                //.lang("Tray")
                .register();
        WHITE_METH_TRAY = registrate.block("white_meth_tray", TrayBlock.White::new)
                .simpleItem()
                //.lang("White Meth Tray")
                .register();

    }
}
