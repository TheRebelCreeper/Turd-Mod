package com.turd.item;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.turd.lib.StringLibrary;
import com.turd.main.MainRegistry;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemManager 
{
    public static void mainRegistry()
    {
        initializeItem();
        registerItem();
    }
 
    //Items
    public static Item itemDough;
    public static Item itemDonut;
    public static Item itemGlaze;
    public static Item itemBullet;
    
    public static Item greenIngot;
    public static Item greenPickaxe;
    public static Item greenSword;
    public static Item greenShovel;
    public static Item greenAxe;
    public static Item greenHoe;
    
    public static Item turdItem;
    
    public static Item turdPickaxe;
    public static Item turdShovel;
    public static Item turdAxe;
    public static Item turdSword;
    public static Item turdHoe;
    
    public static Item greenHelmet;
    public static Item greenChest;
    public static Item greenLegs;
    public static Item greenBoots;
    
    //Tool Types
    public static ToolMaterial turdToolMaterial = EnumHelper.addToolMaterial("Turd Tool Material", 3, 10000, 1.0F, 3.0F, 22);
    public static ToolMaterial greenToolMaterial = EnumHelper.addToolMaterial("Green Tool Material", 3, 500, 10.0F, 4.0F, 15);
    
    //Armor Types
    public static ArmorMaterial greenArmorMaterial = EnumHelper.addArmorMaterial("Green", 10, new int[]{7,9,2,2}, 15);
    
    public static void initializeItem()
    {
    	greenIngot = new GreenItem("ItemGreenIngot", StringLibrary.MODID+":stupidItem1");
    	turdItem = new ItemTurd(6, 0.1f, false);
    	itemDonut = new ItemDonut(10, 1, false);
    	itemDough = new ItemDough(0, 0, false);
    	itemGlaze = new ItemGlaze();
    	itemBullet = new ItemBullet();
    	
    	//Green Toolset
    	greenPickaxe = new GreenPickaxe(greenToolMaterial);
    	greenSword = new GreenSword(greenToolMaterial);
    	greenShovel = new GreenShovel(greenToolMaterial);
    	greenAxe = new GreenAxe(greenToolMaterial);
    	greenHoe = new GreenHoe(greenToolMaterial);
    	
    	//Turd Toolset
    	turdPickaxe = new TurdPickaxe(turdToolMaterial);
    	turdShovel = new TurdShovel(turdToolMaterial);
    	turdAxe = new TurdAxe(turdToolMaterial);
    	turdSword = new TurdSword(turdToolMaterial);
    	turdHoe = new TurdHoe(turdToolMaterial);
    	
    	greenHelmet = new GreenArmor(greenArmorMaterial, MainRegistry.proxy.addArmor("GreenHelmet"), 0, "GreenHelmet", ":greenHelmet");
    	greenChest = new GreenArmor(greenArmorMaterial, MainRegistry.proxy.addArmor("GreenChestplate"), 1, "GreenChest", ":greenChestplate");
    	greenLegs = new GreenArmor(greenArmorMaterial, MainRegistry.proxy.addArmor("GreenLeggings"), 2, "GreenLegs", ":greenLeggings");
    	greenBoots = new GreenArmor(greenArmorMaterial, MainRegistry.proxy.addArmor("GreenBoots"), 3, "GreenBoots", ":greenBoots");
    }
    
    public static void registerItem() 
    {
    	GameRegistry.registerItem(itemGlaze, itemGlaze.getUnlocalizedName());
    	GameRegistry.registerItem(itemDough, itemDough.getUnlocalizedName());
    	GameRegistry.registerItem(itemDonut, itemDonut.getUnlocalizedName());
    	GameRegistry.registerItem(turdItem, turdItem.getUnlocalizedName());
    	GameRegistry.registerItem(turdPickaxe, turdPickaxe.getUnlocalizedName());
    	GameRegistry.registerItem(turdAxe, turdAxe.getUnlocalizedName());
    	GameRegistry.registerItem(turdShovel, turdShovel.getUnlocalizedName());
    	GameRegistry.registerItem(turdHoe, turdHoe.getUnlocalizedName());
    	GameRegistry.registerItem(turdSword, turdSword.getUnlocalizedName());
    	GameRegistry.registerItem(greenIngot, greenIngot.getUnlocalizedName());
    	GameRegistry.registerItem(greenPickaxe, greenPickaxe.getUnlocalizedName());
    	GameRegistry.registerItem(greenHelmet, greenHelmet.getUnlocalizedName());
    	GameRegistry.registerItem(greenChest, greenChest.getUnlocalizedName());
    	GameRegistry.registerItem(greenLegs, greenLegs.getUnlocalizedName());
    	GameRegistry.registerItem(greenBoots, greenBoots.getUnlocalizedName());
    	GameRegistry.registerItem(greenSword, greenSword.getUnlocalizedName());
    	GameRegistry.registerItem(greenShovel, greenShovel.getUnlocalizedName());
    	GameRegistry.registerItem(greenAxe, greenAxe.getUnlocalizedName());
    	GameRegistry.registerItem(greenHoe, greenHoe.getUnlocalizedName());
    	//GameRegistry.registerItem(itemBullet, itemBullet.getUnlocalizedName());
    }
}
