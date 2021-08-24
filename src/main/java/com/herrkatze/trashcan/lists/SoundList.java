package com.herrkatze.trashcan.lists;

import com.herrkatze.trashcan.Main;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundList {

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,Main.MOD_ID);


    public static final Lazy<SoundEvent> RICKROLL_DISC_LAZY = Lazy
            .of(() -> new SoundEvent(new ResourceLocation(Main.MOD_ID,"item.rickroll_disc")));
    public static final RegistryObject<SoundEvent> RICKROLL_DISC = SOUNDS.register("item.rickroll_disc.disc",RICKROLL_DISC_LAZY);

    public static final Lazy<SoundEvent> RICKROLL_DISC_GOOGLETRANSLATE_LAZY = Lazy
            .of(() -> new SoundEvent(new ResourceLocation(Main.MOD_ID,"item.rickroll_disc_googletranslate")));
    public static final RegistryObject<SoundEvent> RICKROLL_DISC_GOOGLETRANSLATE = SOUNDS.register("item.rickroll_disc_googletranslate.disc",RICKROLL_DISC_GOOGLETRANSLATE_LAZY);

}
