/*package net.minecraft.src;

public class ModelScath extends ModelBase
{
    //fields
    ModelRenderer Head;
    ModelRenderer Body;
    ModelRenderer LLeg;
    ModelRenderer RLeg;
    ModelRenderer RArm;
    ModelRenderer LArm;

    public ModelScath()
    {
        textureWidth = 64;
        textureHeight = 32;

        Head = new ModelRenderer(this, 0, 23);
        Head.addBox(-1F, 0F, 0F, 8, 8, 1);
        Head.setRotationPoint(-1F, -7F, 0F);
        Head.setTextureSize(64, 32);
        Head.mirror = true;
        setRotation(Head, 0F, 0F, 0F);
        Body = new ModelRenderer(this, 0, 0);
        Body.addBox(0F, 0F, 0F, 12, 12, 1);
        Body.setRotationPoint(-4F, 1F, 0F);
        Body.setTextureSize(64, 32);
        Body.mirror = true;
        setRotation(Body, 0F, 0F, 0F);
        LLeg = new ModelRenderer(this, 52, 21);
        LLeg.addBox(0F, 0F, 0F, 5, 10, 1);
        LLeg.setRotationPoint(3F, 13F, 0F);
        LLeg.setTextureSize(64, 32);
        LLeg.mirror = true;
        setRotation(LLeg, 0F, 0F, 0F);
        RLeg = new ModelRenderer(this, 52, 21);
        RLeg.addBox(0F, 0F, 0F, 5, 10, 1);
        RLeg.setRotationPoint(-4F, 13F, 0F);
        RLeg.setTextureSize(64, 32);
        RLeg.mirror = true;
        setRotation(RLeg, 0F, 0F, 0F);
        RArm = new ModelRenderer(this, 54, 0);
        RArm.addBox(0F, 0F, 0F, 4, 10, 1);
        RArm.setRotationPoint(-8F, 1F, 0F);
        RArm.setTextureSize(64, 32);
        RArm.mirror = true;
        setRotation(RArm, 0F, 0F, 0F);
        LArm = new ModelRenderer(this, 54, 0);
        LArm.addBox(0F, 0F, 0F, 4, 10, 1);
        LArm.setRotationPoint(8F, 1F, 0F);
        LArm.setTextureSize(64, 32);
        LArm.mirror = true;
        setRotation(LArm, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5);
        Head.render(f5);
        Body.render(f5);
        LLeg.render(f5);
        RLeg.render(f5);
        RArm.render(f5);
        LArm.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5);
    }

}
*/