package com.turd.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.turd.lib.StringLibrary;

public class ItemDonut extends ItemFood
{
	public int potionId;
	public int potionDuration;
	public int potionAmplifier;
	public float potionEffectProbability;
	
	public ItemDonut(int healAmout, float saturation, boolean wolfFood) 
	{
		super(healAmout, saturation, wolfFood);
		this.setUnlocalizedName("ItemDonut");
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setTextureName(StringLibrary.MODID +":itemDonut");
		this.setAlwaysEdible();
	}
	
	protected void onFoodEaten(ItemStack p_77849_1_, World p_77849_2_, EntityPlayer p_77849_3_)
    {
		p_77849_3_.addPotionEffect(new PotionEffect(Potion.regeneration.id, 600, 3));
		p_77849_3_.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 600, 0));
		p_77849_3_.addPotionEffect(new PotionEffect(Potion.heal.id, 1, 20));
		p_77849_3_.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 600, 1));
		p_77849_3_.addPotionEffect(new PotionEffect(Potion.resistance.id, 600, 2));
		super.onFoodEaten(p_77849_1_, p_77849_2_, p_77849_3_);
    }
	
}
