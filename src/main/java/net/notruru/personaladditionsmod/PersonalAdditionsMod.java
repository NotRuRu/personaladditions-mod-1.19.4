package net.notruru.personaladditionsmod;

import net.fabricmc.api.ModInitializer;

import net.notruru.personaladditionsmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersonalAdditionsMod implements ModInitializer {
    public static final String MOD_ID = "personaladditionsmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("personaladditionsmod");

    @Override
    public void onInitialize() {
        ModItems.registerModItems();

        LOGGER.info("Hello Fabric world!");
    }
}