package com.img.init;

import com.img.YuZuUI;
import net.minecraft.core.Registry;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;

/**
 * @author : IMG
 * @create : 2024/10/25
 */
public class InitSounds {
    public static final ResourceLocation YUZU_TITLE_BUTTON_ON_ID = new ResourceLocation("yuzu", "yuzu_title_button_on");
    public static final ResourceLocation YUZU_TITLE_BUTTON_CLICK_ID = new ResourceLocation("yuzu", "yuzu_title_button_click");
    public static final ResourceLocation YUZU_TITLE_BUTTON_SELECT_WORLD_ID = new ResourceLocation("yuzu", "yuzu_title_button_select_world");
    public static final ResourceLocation YUZU_TITLE_BUTTON_OPTIONS_ID = new ResourceLocation("yuzu", "yuzu_title_button_options");
    public static final ResourceLocation YUZU_TITLE_BUTTON_QUIT_GAME_ID = new ResourceLocation("yuzu", "yuzu_title_button_quit_game");
    public static final ResourceLocation YUZU_TITLE_SENREN_ID = new ResourceLocation("yuzu", "yuzu_title_senren");
    public static final ResourceLocation YUZU_TITLE_BUTTON_REALMS_ID = new ResourceLocation("yuzu", "yuzu_title_button_realms");
    public static final ResourceLocation YUZU_TITLE_BUTTON_MOD_LIST_ID = new ResourceLocation("yuzu", "yuzu_title_button_mod_list");
    public static final ResourceLocation YUZU_TITLE_BUTTON_SINGLEPLAYER_ID = new ResourceLocation("yuzu", "yuzu_title_button_singleplayer");
    public static final ResourceLocation YUZU_TITLE_BUTTON_MUTIPLAYER_ID = new ResourceLocation("yuzu", "yuzu_title_button_mutiplayer");

    public static final SoundEvent YUZU_TITLE_BUTTON_ON = SoundEvent.createVariableRangeEvent(YUZU_TITLE_BUTTON_ON_ID);
    public static final SoundEvent YUZU_TITLE_BUTTON_CLICK = SoundEvent.createVariableRangeEvent(YUZU_TITLE_BUTTON_CLICK_ID);
    public static final SoundEvent YUZU_TITLE_BUTTON_SELECT_WORLD = SoundEvent.createVariableRangeEvent(YUZU_TITLE_BUTTON_SELECT_WORLD_ID);
    public static final SoundEvent YUZU_TITLE_BUTTON_OPTIONS = SoundEvent.createVariableRangeEvent(YUZU_TITLE_BUTTON_OPTIONS_ID);
    public static final SoundEvent YUZU_TITLE_BUTTON_QUIT_GAME = SoundEvent.createVariableRangeEvent(YUZU_TITLE_BUTTON_QUIT_GAME_ID);
    public static final SoundEvent YUZU_TITLE_SENREN = SoundEvent.createVariableRangeEvent(YUZU_TITLE_SENREN_ID);
    public static final SoundEvent YUZU_TITLE_BUTTON_REALMS = SoundEvent.createVariableRangeEvent(YUZU_TITLE_BUTTON_REALMS_ID);
    public static final SoundEvent YUZU_TITLE_BUTTON_MOD_LIST = SoundEvent.createVariableRangeEvent(YUZU_TITLE_BUTTON_MOD_LIST_ID);
    public static final SoundEvent YUZU_TITLE_BUTTON_SINGLEPLAYER = SoundEvent.createVariableRangeEvent(YUZU_TITLE_BUTTON_SINGLEPLAYER_ID);
    public static final SoundEvent YUZU_TITLE_BUTTON_MUTIPLAYER = SoundEvent.createVariableRangeEvent(YUZU_TITLE_BUTTON_MUTIPLAYER_ID);

    public static void register() {
        Registry.register(BuiltInRegistries.SOUND_EVENT, YUZU_TITLE_BUTTON_ON_ID, YUZU_TITLE_BUTTON_ON);
        Registry.register(BuiltInRegistries.SOUND_EVENT, YUZU_TITLE_BUTTON_CLICK_ID, YUZU_TITLE_BUTTON_CLICK);
        Registry.register(BuiltInRegistries.SOUND_EVENT, YUZU_TITLE_BUTTON_SELECT_WORLD_ID, YUZU_TITLE_BUTTON_SELECT_WORLD);
        Registry.register(BuiltInRegistries.SOUND_EVENT, YUZU_TITLE_BUTTON_OPTIONS_ID, YUZU_TITLE_BUTTON_OPTIONS);
        Registry.register(BuiltInRegistries.SOUND_EVENT, YUZU_TITLE_BUTTON_QUIT_GAME_ID, YUZU_TITLE_BUTTON_QUIT_GAME);
        Registry.register(BuiltInRegistries.SOUND_EVENT, YUZU_TITLE_SENREN_ID, YUZU_TITLE_SENREN);
        Registry.register(BuiltInRegistries.SOUND_EVENT, YUZU_TITLE_BUTTON_REALMS_ID, YUZU_TITLE_BUTTON_REALMS);
        Registry.register(BuiltInRegistries.SOUND_EVENT, YUZU_TITLE_BUTTON_MOD_LIST_ID, YUZU_TITLE_BUTTON_MOD_LIST);
        Registry.register(BuiltInRegistries.SOUND_EVENT, YUZU_TITLE_BUTTON_SINGLEPLAYER_ID, YUZU_TITLE_BUTTON_SINGLEPLAYER);
        Registry.register(BuiltInRegistries.SOUND_EVENT, YUZU_TITLE_BUTTON_MUTIPLAYER_ID, YUZU_TITLE_BUTTON_MUTIPLAYER);
    }
}

