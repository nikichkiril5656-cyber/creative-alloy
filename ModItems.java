package com.example.creativealloy;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModItems {
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreativeAlloyMod.MOD_ID);

	/** Креативный сплав: эпическая редкость и «зачарованное» свечение. */
	public static final DeferredItem<Item> CREATIVE_ALLOY = ITEMS.register("creative_alloy",
			() -> new Item(new Item.Properties().rarity(Rarity.EPIC)) {
				@Override
				public boolean isFoil(ItemStack stack) {
					return true;
				}
			});

	private ModItems() {}
}
