package com.example.creativealloy;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@Mod(CreativeAlloyMod.MOD_ID)
public class CreativeAlloyMod {
	public static final String MOD_ID = "creativealloy";

	public CreativeAlloyMod(IEventBus modBus) {
		ModItems.ITEMS.register(modBus);
		modBus.addListener(CreativeAlloyMod::addToCreativeTab);
	}

	/** Кладём сплав во вкладку «Ингредиенты». */
	private static void addToCreativeTab(BuildCreativeModeTabContentsEvent event) {
		if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			event.accept(ModItems.CREATIVE_ALLOY);
		}
	}
}
