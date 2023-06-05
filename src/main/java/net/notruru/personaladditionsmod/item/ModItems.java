package net.notruru.personaladditionsmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.notruru.personaladditionsmod.PersonalAdditionsMod;

public class ModItems {

    public static final Item Soft_Bread = registerItem("soft_bread",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4F).build())));
    public static final Item Bread_Jem = registerItem("bread_jem",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.7F).build())));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PersonalAdditionsMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, Soft_Bread);
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, Bread_Jem);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems() {
        PersonalAdditionsMod.LOGGER.info("Registering Mod Items for" + PersonalAdditionsMod.MOD_ID);

        addItemsToItemGroup();
    }
}
