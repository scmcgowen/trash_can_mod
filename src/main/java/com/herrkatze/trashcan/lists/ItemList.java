package com.herrkatze.trashcan.lists;

import com.herrkatze.trashcan.Main;
import com.herrkatze.trashcan.items.RickrollMusicDisc;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemList {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,Main.MOD_ID);

    public static final RegistryObject<Item> MUSIC_DISC_RICKROLL = ITEMS.register("music_disc_rickroll",() -> new RickrollMusicDisc(15,SoundList.RICKROLL_DISC_LAZY.get(), new Item.Properties().maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<Item> MUSIC_DISC_RICKROLL_GOOGLE_TRANSLATE = ITEMS.register("music_disc_rickroll_googletranslate",() -> new RickrollMusicDisc(15,SoundList.RICKROLL_DISC_GOOGLETRANSLATE_LAZY.get(), new Item.Properties().maxStackSize(1).group(ItemGroup.MISC)));

}
