package com.img;

import com.img.init.InitSounds;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(EnvType.CLIENT)
public class YuZuUIClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        InitSounds.register();
    }
}
