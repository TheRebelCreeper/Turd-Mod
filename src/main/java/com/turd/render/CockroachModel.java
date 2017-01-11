package com.turd.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class CockroachModel extends ModelBase
{
  //fields
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Body;
    ModelRenderer Arm2;
    ModelRenderer Arm1;
    ModelRenderer Head;
    ModelRenderer Horn1;
    ModelRenderer Horn2;
    ModelRenderer Horn3;
    ModelRenderer Horn4;
    ModelRenderer Horn5;
    ModelRenderer Horn6;
  
  public CockroachModel()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Leg1 = new ModelRenderer(this, 16, 16);
      Leg1.addBox(0F, 0F, -2F, 4, 12, 4);
      Leg1.setRotationPoint(0F, 12F, 0F);
      Leg1.setTextureSize(64, 32);
      Leg1.mirror = true;
      setRotation(Leg1, 0F, 0F, 0F);
      Leg2 = new ModelRenderer(this, 0, 16);
      Leg2.addBox(-4F, 0F, -2F, 4, 12, 4);
      Leg2.setRotationPoint(0F, 12F, 0F);
      Leg2.setTextureSize(64, 32);
      Leg2.mirror = true;
      setRotation(Leg2, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 32, 0);
      Body.addBox(-4F, 0F, -2F, 8, 12, 4);
      Body.setRotationPoint(0F, 0F, 0F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Arm2 = new ModelRenderer(this, 0, 0);
      Arm2.addBox(-4F, 0F, -2F, 4, 12, 4);
      Arm2.setRotationPoint(-4F, 0F, 0F);
      Arm2.setTextureSize(64, 32);
      Arm2.mirror = true;
      setRotation(Arm2, 0F, 0F, 0F);
      Arm1 = new ModelRenderer(this, 16, 0);
      Arm1.addBox(0F, 0F, -2F, 4, 12, 4);
      Arm1.setRotationPoint(4F, 0F, 0F);
      Arm1.setTextureSize(64, 32);
      Arm1.mirror = true;
      setRotation(Arm1, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 32, 16);
      Head.addBox(-4F, -8F, -4F, 8, 8, 8);
      Head.setRotationPoint(0F, 0F, 0F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Horn1 = new ModelRenderer(this, 60, 6);
      Horn1.addBox(0F, 0F, 0F, 1, 4, 1);
      Horn1.setRotationPoint(2F, -12F, 0F);
      Horn1.setTextureSize(64, 32);
      Horn1.mirror = true;
      setRotation(Horn1, 0F, 0F, 0F);
      Horn2 = new ModelRenderer(this, 56, 6);
      Horn2.addBox(0F, 0F, 0F, 1, 4, 1);
      Horn2.setRotationPoint(-2F, -12F, 0F);
      Horn2.setTextureSize(64, 32);
      Horn2.mirror = true;
      setRotation(Horn2, 0F, 0F, 0F);
      Horn3 = new ModelRenderer(this, 60, 2);
      Horn3.addBox(0F, 0F, 0F, 1, 1, 1);
      Horn3.setRotationPoint(2F, -13F, 1F);
      Horn3.setTextureSize(64, 32);
      Horn3.mirror = true;
      setRotation(Horn3, 0F, 0F, 0F);
      Horn4 = new ModelRenderer(this, 56, 2);
      Horn4.addBox(0F, 0F, 0F, 1, 1, 1);
      Horn4.setRotationPoint(-2F, -13F, 1F);
      Horn4.setTextureSize(64, 32);
      Horn4.mirror = true;
      setRotation(Horn4, 0F, 0F, 0F);
      Horn5 = new ModelRenderer(this, 60, 0);
      Horn5.addBox(0F, 0F, 0F, 1, 1, 1);
      Horn5.setRotationPoint(2F, -14F, 2F);
      Horn5.setTextureSize(64, 32);
      Horn5.mirror = true;
      setRotation(Horn5, 0F, 0F, 0F);
      Horn6 = new ModelRenderer(this, 56, 0);
      Horn6.addBox(0F, 0F, 0F, 1, 1, 1);
      Horn6.setRotationPoint(-2F, -14F, 2F);
      Horn6.setTextureSize(64, 32);
      Horn6.mirror = true;
      setRotation(Horn6, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Leg1.render(f5);
    Leg2.render(f5);
    Body.render(f5);
    Arm2.render(f5);
    Arm1.render(f5);
    Head.render(f5);
    Horn1.render(f5);
    Horn2.render(f5);
    Horn3.render(f5);
    Horn4.render(f5);
    Horn5.render(f5);
    Horn6.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float time, float speed, float rotationAngle, float rotationYaw, float rotationPitch, float scale, Entity entity)
  {
    super.setRotationAngles(time, speed, rotationAngle, rotationYaw, rotationPitch, scale, entity);
    
    Leg2.rotateAngleX = (float) (MathHelper.cos(time * 0.6662F) * 45 * Math.PI/180)*speed;
    Leg1.rotateAngleX = (float) (MathHelper.cos((float) (time * 0.6662F + Math.PI)) * 45 * Math.PI/180)*speed;
    Arm1.rotateAngleX = (float) ((MathHelper.cos((time * 0.6662F)) * 45 * Math.PI/180)*speed+(5.0* Math.PI/180));
    Arm2.rotateAngleX = (float) ((MathHelper.cos((float) (time * 0.6662F + Math.PI)) * 45 * Math.PI/180)*speed -(5.0* Math.PI/180));

    /*
    this.bipedHead.rotateAngleY = p_78087_4_ / (180F / (float)Math.PI);
    this.bipedHead.rotateAngleX = p_78087_5_ / (180F / (float)Math.PI);
    this.bipedHeadwear.rotateAngleY = this.bipedHead.rotateAngleY;
    this.bipedHeadwear.rotateAngleX = this.bipedHead.rotateAngleX;
    this.bipedRightArm.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 2.0F * p_78087_2_ * 0.5F;
    this.bipedLeftArm.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 2.0F * p_78087_2_ * 0.5F;
    this.bipedRightArm.rotateAngleZ = 0.0F;
    this.bipedLeftArm.rotateAngleZ = 0.0F;
    this.bipedRightLeg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
    this.bipedLeftLeg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.4F * p_78087_2_;
    this.bipedRightLeg.rotateAngleY = 0.0F;
    this.bipedLeftLeg.rotateAngleY = 0.0F;



 

    this.bipedRightArm.rotateAngleY = 0.0F;
    this.bipedLeftArm.rotateAngleY = 0.0F;
    float f6;
    float f7;

    if (this.onGround > -9990.0F)
    {
        f6 = this.onGround;
        this.bipedBody.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
        this.bipedRightArm.rotationPointZ = MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0F;
        this.bipedRightArm.rotationPointX = -MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0F;
        this.bipedLeftArm.rotationPointZ = -MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0F;
        this.bipedLeftArm.rotationPointX = MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0F;
        this.bipedRightArm.rotateAngleY += this.bipedBody.rotateAngleY;
        this.bipedLeftArm.rotateAngleY += this.bipedBody.rotateAngleY;
        this.bipedLeftArm.rotateAngleX += this.bipedBody.rotateAngleY;
        f6 = 1.0F - this.onGround;
        f6 *= f6;
        f6 *= f6;
        f6 = 1.0F - f6;
        f7 = MathHelper.sin(f6 * (float)Math.PI);
        float f8 = MathHelper.sin(this.onGround * (float)Math.PI) * -(this.bipedHead.rotateAngleX - 0.7F) * 0.75F;
        this.bipedRightArm.rotateAngleX = (float)((double)this.bipedRightArm.rotateAngleX - ((double)f7 * 1.2D + (double)f8));
        this.bipedRightArm.rotateAngleY += this.bipedBody.rotateAngleY * 2.0F;
        this.bipedRightArm.rotateAngleZ = MathHelper.sin(this.onGround * (float)Math.PI) * -0.4F;
    }


        this.bipedBody.rotateAngleX = 0.0F;
        this.bipedRightLeg.rotationPointZ = 0.1F;
        this.bipedLeftLeg.rotationPointZ = 0.1F;
        this.bipedRightLeg.rotationPointY = 12.0F;
        this.bipedLeftLeg.rotationPointY = 12.0F;
        this.bipedHead.rotationPointY = 0.0F;
        this.bipedHeadwear.rotationPointY = 0.0F;


    this.bipedRightArm.rotateAngleZ += MathHelper.cos(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
    this.bipedLeftArm.rotateAngleZ -= MathHelper.cos(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
    this.bipedRightArm.rotateAngleX += MathHelper.sin(p_78087_3_ * 0.067F) * 0.05F;
    this.bipedLeftArm.rotateAngleX -= MathHelper.sin(p_78087_3_ * 0.067F) * 0.05F;
*/

  }

}
