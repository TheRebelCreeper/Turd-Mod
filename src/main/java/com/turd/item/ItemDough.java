package com.turd.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.turd.lib.StringLibrary;

public class ItemDough extends ItemFood
{
	
	public int potionId;
	public int potionDuration;
	public int potionAmplifier;
	public float potionEffectProbability;
	
	public ItemDough(int healAmount, float saturation, boolean wolfFood) 
	{
		super(healAmount, saturation, wolfFood);
		this.setUnlocalizedName("itemDough");
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setTextureName(StringLibrary.MODID +":itemDough");
		this.setAlwaysEdible();
	}
	
	protected void onFoodEaten(ItemStack p_77849_1_, World p_77849_2_, EntityPlayer p_77849_3_)
    {
            p_77849_3_.addPotionEffect(new PotionEffect(Potion.poison.id, 100, 0));
            p_77849_3_.addPotionEffect(new PotionEffect(Potion.hunger.id, 300, 1));
            super.onFoodEaten(p_77849_1_, p_77849_2_, p_77849_3_);
    }
	
}
