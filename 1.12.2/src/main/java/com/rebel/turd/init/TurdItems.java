package com.rebel.turd.init;

import com.rebel.turd.TurdMod;
import com.rebel.turd.item.GreenAxe;
import com.rebel.turd.item.GreenHoe;
import com.rebel.turd.item.GreenPickaxe;
import com.rebel.turd.item.GreenShovel;
import com.rebel.turd.item.GreenSword;
import com.rebel.turd.item.ItemGreenIngot;
import com.rebel.turd.item.ItemTurd;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(TurdMod.MODID)
public class TurdItems
{
	public static ToolMaterial turdToolMaterial = EnumHelper.addToolMaterial("Turd Tool Material", 3, 10000, 1.0F, 3.0F, 22);
	public static ToolMaterial greenToolMaterial = EnumHelper.addToolMaterial("Green Tool Material", 3, 500, 10.0F, 4.0F, 15);
	
	public static final Item GREEN_INGOT = new ItemGreenIngot("greenIngot", "green_ingot");
	public static final Item TURD_ITEM = new ItemTurd("itemTurd", "item_turd", 6, 0.1f, false);
	
	//itemDonut = new ItemDonut(10, 1, false);
	//itemDough = new ItemDough(0, 0, false);
	//itemGlaze = new ItemGlaze();
	//itemBullet = new ItemBullet();
	
	//Green Toolset
	public static final Item GREEN_PICKAXE = new GreenPickaxe("greenPickaxe", "green_pickaxe", greenToolMaterial);
	public static final Item GREEN_SWORD = new GreenSword("greenSword", "green_sword", greenToolMaterial);
	public static final Item GREEN_SHOVEL = new GreenShovel("greenShovel", "green_shovel", greenToolMaterial);
	public static final Item GREEN_AXE = new GreenAxe("greenAxe", "green_axe", greenToolMaterial);
	public static final Item GREEN_HOE = new GreenHoe("greenHoe", "green_hoe", greenToolMaterial);
	
	//Turd Toolset
	//turdPickaxe = new TurdPickaxe(turdToolMaterial);
	//turdShovel = new TurdShovel(turdToolMaterial);
	//turdAxe = new TurdAxe(turdToolMaterial);
	//turdSword = new TurdSword(turdToolMaterial);
	//turdHoe = new TurdHoe(turdToolMaterial);
	
	//greenHelmet = new GreenArmor(greenArmorMaterial, MainRegistry.proxy.addArmor("GreenHelmet"), 0, "GreenHelmet", ":greenHelmet");
	//greenChest = new GreenArmor(greenArmorMaterial, MainRegistry.proxy.addArmor("GreenChestplate"), 1, "GreenChest", ":greenChestplate");
	//greenLegs = new GreenArmor(greenArmorMaterial, MainRegistry.proxy.addArmor("GreenLeggings"), 2, "GreenLegs", ":greenLeggings");
	//greenBoots = new GreenArmor(greenArmorMaterial, MainRegistry.proxy.addArmor("GreenBoots"), 3, "GreenBoots", ":greenBoots");
}
