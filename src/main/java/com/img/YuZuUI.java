package com.img;

import com.img.init.InitSounds;
import com.mojang.logging.LogUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

@Mod(YuZuUI.MODID)
public class YuZuUI
{
    public static final String MODID = "yuzu";
    public static final Logger LOGGER = LogUtils.getLogger();

    public YuZuUI(FMLJavaModLoadingContext ctx) {
        IEventBus modBus = ctx.getModEventBus();               // :contentReference[oaicite:0]{index=0}
        InitSounds.SOUND_EVENTS.register(modBus);
    }
}
