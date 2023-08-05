package net.aiko.theenderupdate;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheEnderUpdate implements ModInitializer {
public static final String MOD_ID = "theenderupdate?";
	public static final Logger logger = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		logger.info("Hello Fabric world!");
	}
}