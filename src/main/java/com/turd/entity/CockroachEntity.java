package com.turd.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;

public class CockroachEntity extends EntityAnimal
{

	public CockroachEntity(World world) 
	{
		super(world);
		this.setSize(0.75F, 2.0F);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) 
	{
		return null;
	}
		

	protected void applyEntityAttributes() 
	{
		super.applyEntityAttributes();
		
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
	}//end applyEntityAttributes

}
