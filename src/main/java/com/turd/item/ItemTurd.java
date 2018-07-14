package com.turd.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.turd.lib.StringLibrary;

public class ItemTurd extends ItemFood
{


	public ItemTurd(int healAmout, float saturation, boolean wolfFood) 
	{
		super(healAmout, saturation, wolfFood);
		this.setUnlocalizedName("ItemTurd");
    	this.setCreativeTab(CreativeTabs.tabFood);
    	this.setTextureName(StringLibrary.MODID+":itemTurd");
    	this.setAlwaysEdible();
    	
	}
	
	protected void onFoodEaten(ItemStack p_77849_1_, World p_77849_2_, EntityPlayer p_77849_3_)
    {
            p_77849_3_.addPotionEffect(new PotionEffect(Potion.poison.id, 100, 0));
            p_77849_3_.addPotionEffect(new PotionEffect(Potion.hunger.id, 300, 1));
            p_77849_3_.addPotionEffect(new PotionEffect(Potion.confusion.id, 300, 1));
            super.onFoodEaten(p_77849_1_, p_77849_2_, p_77849_3_);
    }
	
/*
	public ItemFood setPotionEffect(int p_77844_1_, int p_77844_2_, int p_77844_3_, float p_77844_4_)
    {
        this.potionId = p_77844_1_;
        this.potionDuration = p_77844_2_;
        this.potionAmplifier = p_77844_3_;
        this.potionEffectProbability = p_77844_4_;
        return this;
    }
    */
}
