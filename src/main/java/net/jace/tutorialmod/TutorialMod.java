package net.jace.tutorialmod;
//very important comment

import net.fabricmc.api.ModInitializer;

import net.jace.tutorialmod.block.ModBlocks;
import net.jace.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorial-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.regsiterModBlocks();
	}
}