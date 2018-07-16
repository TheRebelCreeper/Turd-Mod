package com.rebel.turd.init;

import com.rebel.turd.TurdMod;
import com.rebel.turd.item.GreenAxe;
import com.rebel.turd.item.GreenHoe;
import com.rebel.turd.item.GreenPickaxe;
import com.rebel.turd.item.GreenShovel;
import com.rebel.turd.item.GreenSword;
import com.rebel.turd.item.ItemDonut;
import com.rebel.turd.item.ItemDough;
import com.rebel.turd.item.ItemGlaze;
import com.rebel.turd.item.ItemGreenIngot;
import com.rebel.turd.item.ItemTurd;
import com.rebel.turd.item.TurdAxe;
import com.rebel.turd.item.TurdHoe;
import com.rebel.turd.item.TurdPickaxe;
import com.rebel.turd.item.TurdShovel;
import com.rebel.turd.item.TurdSword;

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
	public static final Item ITEM_TURD = new ItemTurd("itemTurd", "item_turd", 6, 0.1f, false);
	
	public static final Item ITEM_DONUT = new ItemDonut("itemDonut", "item_donut", 10, 1, false);
	public static final Item ITEM_DOUGH = new ItemDough("itemDough", "item_dough", 0, 0, false);
	public static final Item ITEM_GLAZE = new ItemGlaze("itemGlaze", "item_glaze");
	
	//Green Toolset
	public static final Item GREEN_PICKAXE = new GreenPickaxe("greenPickaxe", "green_pickaxe", greenToolMaterial);
	public static final Item GREEN_SWORD = new GreenSword("greenSword", "green_sword", greenToolMaterial);
	public static final Item GREEN_SHOVEL = new GreenShovel("greenShovel", "green_shovel", greenToolMaterial);
	public static final Item GREEN_AXE = new GreenAxe("greenAxe", "green_axe", greenToolMaterial);
	public static final Item GREEN_HOE = new GreenHoe("greenHoe", "green_hoe", greenToolMaterial);
	
	//Turd Toolset
	public static final Item TURD_PICKAXE = new TurdPickaxe("turdPickaxe", "turd_pickaxe", turdToolMaterial);
	public static final Item TURD_SHOVEL = new TurdShovel("turdShovel", "turd_shovel", turdToolMaterial);
	public static final Item TURD_AXE = new TurdAxe("turdAxe", "turd_axe", turdToolMaterial);
	public static final Item TURD_SWORD = new TurdSword("turdSword", "turd_sword", turdToolMaterial);
	public static final Item TURD_HOE = new TurdHoe("turdHoe", "turd_hoe", turdToolMaterial);
	
	//greenHelmet = new GreenArmor(greenArmorMaterial, MainRegistry.proxy.addArmor("GreenHelmet"), 0, "GreenHelmet", ":greenHelmet");
	//greenChest = new GreenArmor(greenArmorMaterial, MainRegistry.proxy.addArmor("GreenChestplate"), 1, "GreenChest", ":greenChestplate");
	//greenLegs = new GreenArmor(greenArmorMaterial, MainRegistry.proxy.addArmor("GreenLeggings"), 2, "GreenLegs", ":greenLeggings");
	//greenBoots = new GreenArmor(greenArmorMaterial, MainRegistry.proxy.addArmor("GreenBoots"), 3, "GreenBoots", ":greenBoots");
}
