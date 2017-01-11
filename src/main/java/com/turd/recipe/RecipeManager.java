package com.turd.recipe;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.turd.block.BlockManager;
import com.turd.item.ItemManager;

import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeManager
{
    public static void mainRegistry()
    {
        addCraftingRecipes();
        addSmeltingRecipes();
    }//end mainRegistry
  
 
    public static void addCraftingRecipes()
    {
    //Shapesless
    	ItemStack pinkDye = new ItemStack(Items.dye, 1, 9);
    	GameRegistry.addShapelessRecipe(new ItemStack(BlockManager.blockTurd,1), ItemManager.turdItem,ItemManager.turdItem,ItemManager.turdItem,ItemManager.turdItem);
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.itemGlaze,4), Items.milk_bucket, Items.sugar,  pinkDye);
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.itemDonut,1), ItemManager.itemGlaze, ItemManager.itemDough);
    //Shaped
    	
    	//Donut
    		//Dough
    		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.itemDough), " b ", "b b"," b ", 'b', Items.bread);
    	//Green Toolset
    		//Helmet
    		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.greenHelmet), "xxx", "x x", "   ", 'x', ItemManager.greenIngot);
    		//Chestplate
    		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.greenChest), "x x", "xxx", "xxx", 'x', ItemManager.greenIngot);
    		//Leggins
    		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.greenLegs), "xxx", "x x", "x x", 'x', ItemManager.greenIngot);
    		//Boots
    		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.greenBoots), "   ", "x x", "x x", 'x', ItemManager.greenIngot);
    	
    	//Turd Toolset
    		//Pick
    		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.turdPickaxe), "xxx", " y ", " y ", 'x', ItemManager.turdItem, 'y', Items.stick);
    		//Axe
    		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.turdAxe), "xx ", "xy ", " y ", 'x', ItemManager.turdItem, 'y', Items.stick);
    		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.turdAxe), "xx ", " yx", " y ", 'x', ItemManager.turdItem, 'y', Items.stick);
    		//Shovel
    		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.turdShovel), "x  ", "y  ", "y  ", 'x', ItemManager.turdItem, 'y', Items.stick);
    		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.turdShovel), " x ", " y ", " y ", 'x', ItemManager.turdItem, 'y', Items.stick);
    		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.turdShovel), "  x", "  y", "  y", 'x', ItemManager.turdItem, 'y', Items.stick);
    		//Sword
    		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.turdSword), "x  ", "x  ", "y  ", 'x', ItemManager.turdItem, 'y', Items.stick);
    		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.turdSword), " x ", " x ", " y ", 'x', ItemManager.turdItem, 'y', Items.stick);
    		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.turdSword), "  x", "  x", "  y", 'x', ItemManager.turdItem, 'y', Items.stick);
    		//Hoe
    		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.turdHoe), "xx ", " y ", " y ", 'x', ItemManager.turdItem, 'y', Items.stick);
    		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.turdHoe), " xx", " y ", " y ", 'x', ItemManager.turdItem, 'y', Items.stick);
    
    }//end addCraftingRecipes    
  
 
    public static void addSmeltingRecipes()
    {    
 
    }//end addSmeltingRecipes}
}
