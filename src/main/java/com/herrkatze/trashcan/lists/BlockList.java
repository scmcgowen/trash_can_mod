package com.herrkatze.trashcan.lists;

import com.herrkatze.trashcan.Main;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockList {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,Main.MOD_ID);
    public static final RegistryObject<Block> TRASH_CAN = BLOCKS.register("trash_can",() -> new Block(AbstractBlock.Properties.create(Material.IRON).sound(SoundType.METAL)));




}
