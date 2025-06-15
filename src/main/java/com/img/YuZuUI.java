package com.img;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class YuZuUI implements ModInitializer {
    public static final String MOD_ID = "yuzu";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final ResourceLocation YUZU_TITLE_MUSIC_ID = new ResourceLocation("yuzu", "yuzu_title_music");

    public static final SoundEvent YUZU_TITLE_MUSIC = SoundEvent.createVariableRangeEvent(YUZU_TITLE_MUSIC_ID);

    public static final Holder<SoundEvent> YUZU_TITLE_MUSIC_HOLDER=Registry.registerForHolder(BuiltInRegistries.SOUND_EVENT, YUZU_TITLE_MUSIC_ID, YUZU_TITLE_MUSIC);
    @Override
    public void onInitialize() {
    }
}
