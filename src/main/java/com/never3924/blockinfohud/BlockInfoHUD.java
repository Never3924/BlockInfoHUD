package com.never3924.blockinfohud;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BlockInfoHUD.MOD_ID)
public class BlockInfoHUD {
    public static final String MOD_ID = "blockinfohud";

    public BlockInfoHUD(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    }
}
