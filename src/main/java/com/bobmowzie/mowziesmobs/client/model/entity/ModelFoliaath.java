package com.bobmowzie.mowziesmobs.client.model.entity;

import com.bobmowzie.mowziesmobs.client.model.animation.tools.MowzieModelBase;
import com.bobmowzie.mowziesmobs.client.model.animation.tools.MowzieModelRenderer;
import com.bobmowzie.mowziesmobs.entity.EntityFoliaath;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import thehippomaster.AnimationAPI.IAnimatedEntity;
import thehippomaster.AnimationAPI.client.Animator;

public class ModelFoliaath extends MowzieModelBase
{
    public MowzieModelRenderer BigLeaf2Base;
    public MowzieModelRenderer BigLeaf1Base;
    public MowzieModelRenderer BigLeaf4Base;
    public MowzieModelRenderer BigLeaf3Base;
    public MowzieModelRenderer Stem1Base;
    public MowzieModelRenderer Stem1Joint;
    public MowzieModelRenderer Stem2;
    public MowzieModelRenderer Stem3;
    public MowzieModelRenderer Stem4;
    public MowzieModelRenderer HeadBase;
    public MowzieModelRenderer MouthTop1;
    public MowzieModelRenderer Leaf1Head;
    public MowzieModelRenderer Leaf2Head;
    public MowzieModelRenderer Leaf3Head;
    public MowzieModelRenderer Leaf4Head;
    public MowzieModelRenderer Leaf5Head;
    public MowzieModelRenderer Leaf6Head;
    public MowzieModelRenderer Leaf7Head;
    public MowzieModelRenderer Leaf8Head;
    public MowzieModelRenderer Tongue1Base;
    public MowzieModelRenderer MouthBack;
    public MowzieModelRenderer MouthBottom1;
    public MowzieModelRenderer MouthTop2;
    public MowzieModelRenderer TeethTop1;
    public MowzieModelRenderer TeethTop2;
    public MowzieModelRenderer Tongue2;
    public MowzieModelRenderer Tongue3;
    public MowzieModelRenderer MouthBottom2;
    public MowzieModelRenderer TeethBottom1;
    public MowzieModelRenderer TeethBottom2;
    public MowzieModelRenderer BigLeaf2End;
    public MowzieModelRenderer BigLeaf1End;
    public MowzieModelRenderer BigLeaf4End;
    public MowzieModelRenderer BigLeaf3End;
    public MowzieModelRenderer[] stemParts;
    public MowzieModelRenderer[] tongueParts;
    public MowzieModelRenderer[] leafParts1;
    public MowzieModelRenderer[] leafParts2;
    public MowzieModelRenderer[] leafParts3;
    public MowzieModelRenderer[] leafParts4;
    private float activeProgress;

    private Animator animator;

    public ModelFoliaath()
    {
        this.textureWidth = 128;
        this.textureHeight = 64;
        animator = new Animator(this);

        this.HeadBase = new MowzieModelRenderer(this, 80, 15);
        this.HeadBase.setRotationPoint(0.0F, -10.0F, 0.0F);
        this.HeadBase.addBox(-3.0F, -3.0F, 0.0F, 6, 6, 2, 0.0F);
        this.setRotateAngle(HeadBase, 1.3658946726107624F, 0.0F, 0.0F);
        this.Leaf6Head = new MowzieModelRenderer(this, 0, 18);
        this.Leaf6Head.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Leaf6Head.addBox(-3.5F, -19.0F, 0.0F, 7, 19, 0, 0.0F);
        this.setRotateAngle(Leaf6Head, 0.6829473363053812F, 0.0F, 3.9269908169872414F);
        this.BigLeaf3End = new MowzieModelRenderer(this, 64, 0);
        this.BigLeaf3End.setRotationPoint(0.0F, -14.0F, 0.0F);
        this.BigLeaf3End.addBox(-4.0F, -14.0F, 0.0F, 8, 14, 0, 0.0F);
        this.setRotateAngle(BigLeaf3End, -1.2292353921796064F, 0.0F, 0.0F);
        this.Stem1Base = new MowzieModelRenderer(this, 0, 0);
        this.Stem1Base.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.Stem1Base.addBox(-1.5F, -15.0F, -1.5F, 3, 15, 3, 0.0F);
        this.setRotateAngle(Stem1Base, 0.136659280431156F, 0.0F, 0.0F);
        this.Stem1Joint = new MowzieModelRenderer(this, 0, 0);
        this.Stem1Joint.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.Stem1Joint.addBox(0F, 0F, 0F, 0, 0, 0, 0.0F);
        this.setRotateAngle(Stem1Joint, 0.0F, 0.0F, 0.0F);
        this.TeethBottom2 = new MowzieModelRenderer(this, 15, 22);
        this.TeethBottom2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.TeethBottom2.addBox(-3.0F, 0.0F, 0.0F, 6, 3, 7, 0.0F);
        this.Tongue1Base = new MowzieModelRenderer(this, 40, 26);
        this.Tongue1Base.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Tongue1Base.addBox(-3.0F, -1.0F, 0.0F, 6, 2, 6, 0.0F);
        this.BigLeaf2Base = new MowzieModelRenderer(this, 64, 14);
        this.BigLeaf2Base.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.BigLeaf2Base.addBox(-4.0F, -14.0F, 0.0F, 8, 14, 0, 0.0F);
        this.setRotateAngle(BigLeaf2Base, -0.6829473363053812F, 2.356194490192345F, 0.0F);
        this.MouthBack = new MowzieModelRenderer(this, 54, 37);
        this.MouthBack.setRotationPoint(0.0F, -0.5F, 2.0F);
        this.MouthBack.addBox(-6.0F, -4.5F, 0.0F, 12, 9, 2, 0.0F);
        this.BigLeaf1End = new MowzieModelRenderer(this, 64, 0);
        this.BigLeaf1End.setRotationPoint(0.0F, -14.0F, 0.0F);
        this.BigLeaf1End.addBox(-4.0F, -14.0F, 0.0F, 8, 14, 0, 0.0F);
        this.setRotateAngle(BigLeaf1End, -1.2292353921796064F, 0.0F, 0.0F);
        this.Leaf4Head = new MowzieModelRenderer(this, 0, 18);
        this.Leaf4Head.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Leaf4Head.addBox(-3.5F, -19.0F, 0.0F, 7, 19, 0, 0.0F);
        this.setRotateAngle(Leaf4Head, 0.6829473363053812F, 0.0F, 2.356194490192345F);
        this.MouthBottom2 = new MowzieModelRenderer(this, 36, 16);
        this.MouthBottom2.setRotationPoint(0.0F, 0.0F, 12.0F);
        this.MouthBottom2.addBox(-3.0F, -2.0F, 0.0F, 6, 2, 7, 0.0F);
        this.Leaf5Head = new MowzieModelRenderer(this, 0, 18);
        this.Leaf5Head.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Leaf5Head.addBox(-3.5F, -19.0F, 0.0F, 7, 19, 0, 0.0F);
        this.setRotateAngle(Leaf5Head, 0.6829473363053812F, 0.0F, 3.141592653589793F);
        this.Leaf3Head = new MowzieModelRenderer(this, 0, 18);
        this.Leaf3Head.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Leaf3Head.addBox(-3.5F, -19.0F, 0.0F, 7, 19, 0, 0.0F);
        this.setRotateAngle(Leaf3Head, 0.6829473363053812F, 0.0F, 1.5707963267948966F);
        this.BigLeaf1Base = new MowzieModelRenderer(this, 64, 14);
        this.BigLeaf1Base.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.BigLeaf1Base.addBox(-4.0F, -14.0F, 0.0F, 8, 14, 0, 0.0F);
        this.setRotateAngle(BigLeaf1Base, -0.6829473363053812F, 0.7853981633974483F, 0.0F);
        this.BigLeaf4End = new MowzieModelRenderer(this, 64, 0);
        this.BigLeaf4End.setRotationPoint(0.0F, -14.0F, 0.0F);
        this.BigLeaf4End.addBox(-4.0F, -14.0F, 0.0F, 8, 14, 0, 0.0F);
        this.setRotateAngle(BigLeaf4End, -1.2292353921796064F, 0.0F, 0.0F);
        this.MouthBottom1 = new MowzieModelRenderer(this, 16, 0);
        this.MouthBottom1.setRotationPoint(0.0F, 1.0F, 2.0F);
        this.MouthBottom1.addBox(-6.0F, -4.0F, 0.0F, 12, 4, 12, 0.0F);
        this.setRotateAngle(MouthBottom1, 0.0F, 0.0F, 3.141592653589793F);
        this.Leaf8Head = new MowzieModelRenderer(this, 0, 18);
        this.Leaf8Head.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Leaf8Head.addBox(-3.5F, -19.0F, 0.0F, 7, 19, 0, 0.0F);
        this.setRotateAngle(Leaf8Head, 0.6829473363053812F, 0.0F, 5.497787143782138F);
        this.Leaf2Head = new MowzieModelRenderer(this, 0, 18);
        this.Leaf2Head.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Leaf2Head.addBox(-3.5F, -19.0F, 0.0F, 7, 19, 0, 0.0F);
        this.setRotateAngle(Leaf2Head, 0.6829473363053812F, 0.0F, 0.7853981633974483F);
        this.TeethBottom1 = new MowzieModelRenderer(this, 80, 0);
        this.TeethBottom1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.TeethBottom1.addBox(-6.0F, 0.0F, 0.0F, 12, 3, 12, 0.0F);
        this.Tongue3 = new MowzieModelRenderer(this, 80, 24);
        this.Tongue3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Tongue3.addBox(-2.0F, -1.0F, 0.0F, 4, 2, 5, 0.0F);
        this.Leaf1Head = new MowzieModelRenderer(this, 0, 18);
        this.Leaf1Head.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Leaf1Head.addBox(-3.5F, -19.0F, 0.0F, 7, 19, 0, 0.0F);
        this.setRotateAngle(Leaf1Head, 0.6829473363053812F, 0.0F, 0.0F);
        this.TeethTop2 = new MowzieModelRenderer(this, 15, 22);
        this.TeethTop2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.TeethTop2.addBox(-3.0F, 0.0F, 0.0F, 6, 3, 7, 0.0F);
        this.Stem3 = new MowzieModelRenderer(this, 0, 0);
        this.Stem3.setRotationPoint(0.0F, -15.0F, 0.0F);
        this.Stem3.addBox(-1.5F, -13.0F, -1.5F, 3, 13, 3, 0.0F);
        this.setRotateAngle(Stem3, -1.1383037381507017F, 0.0F, 0.0F);
        this.Stem2 = new MowzieModelRenderer(this, 0, 0);
        this.Stem2.setRotationPoint(0.0F, -15.0F, 0.0F);
        this.Stem2.addBox(-1.5F, -15.0F, -1.5F, 3, 15, 3, 0.0F);
        this.setRotateAngle(Stem2, 0.36425021489121656F, 0.0F, 0.0F);
        this.BigLeaf3Base = new MowzieModelRenderer(this, 64, 14);
        this.BigLeaf3Base.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.BigLeaf3Base.addBox(-4.0F, -14.0F, 0.0F, 8, 14, 0, 0.0F);
        this.setRotateAngle(BigLeaf3Base, -0.6829473363053812F, 3.9269908169872414F, 0.0F);
        this.BigLeaf4Base = new MowzieModelRenderer(this, 64, 14);
        this.BigLeaf4Base.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.BigLeaf4Base.addBox(-4.0F, -14.0F, 0.0F, 8, 14, 0, 0.0F);
        this.setRotateAngle(BigLeaf4Base, -0.6829473363053812F, 5.497787143782138F, 0.0F);
        this.Tongue2 = new MowzieModelRenderer(this, 40, 26);
        this.Tongue2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Tongue2.addBox(-3.0F, -1.0F, 0.0F, 6, 2, 6, 0.0F);
        this.MouthTop2 = new MowzieModelRenderer(this, 36, 16);
        this.MouthTop2.setRotationPoint(0.0F, 0.0F, 12.0F);
        this.MouthTop2.addBox(-3.0F, -2.0F, 0.0F, 6, 2, 7, 0.0F);
        this.BigLeaf2End = new MowzieModelRenderer(this, 64, 0);
        this.BigLeaf2End.setRotationPoint(0.0F, -14.0F, 0.0F);
        this.BigLeaf2End.addBox(-4.0F, -14.0F, 0.0F, 8, 14, 0, 0.0F);
        this.setRotateAngle(BigLeaf2End, -1.2292353921796064F, 0.0F, 0.0F);
        this.Stem4 = new MowzieModelRenderer(this, 0, 0);
        this.Stem4.setRotationPoint(0.0F, -13.0F, 0.0F);
        this.Stem4.addBox(-1.5F, -10.0F, -1.5F, 3, 10, 3, 0.0F);
        this.setRotateAngle(Stem4, -0.9105382707654417F, 0.0F, 0.0F);
        this.TeethTop1 = new MowzieModelRenderer(this, 80, 0);
        this.TeethTop1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.TeethTop1.addBox(-6.0F, 0.0F, 0.0F, 12, 3, 12, 0.0F);
        this.MouthTop1 = new MowzieModelRenderer(this, 16, 0);
        this.MouthTop1.setRotationPoint(0.0F, -2.0F, 2.0F);
        this.MouthTop1.addBox(-6.0F, -4.0F, 0.0F, 12, 4, 12, 0.0F);
        this.Leaf7Head = new MowzieModelRenderer(this, 0, 18);
        this.Leaf7Head.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Leaf7Head.addBox(-3.5F, -19.0F, 0.0F, 7, 19, 0, 0.0F);
        this.setRotateAngle(Leaf7Head, 0.6829473363053812F, 0.0F, 4.71238898038469F);
        this.Stem4.addChild(this.HeadBase);
        this.HeadBase.addChild(this.Leaf6Head);
        this.BigLeaf3Base.addChild(this.BigLeaf3End);
        this.MouthBottom2.addChild(this.TeethBottom2);
        this.HeadBase.addChild(this.Tongue1Base);
        this.HeadBase.addChild(this.MouthBack);
        this.BigLeaf1Base.addChild(this.BigLeaf1End);
        this.HeadBase.addChild(this.Leaf4Head);
        this.MouthBottom1.addChild(this.MouthBottom2);
        this.HeadBase.addChild(this.Leaf5Head);
        this.HeadBase.addChild(this.Leaf3Head);
        this.BigLeaf4Base.addChild(this.BigLeaf4End);
        this.HeadBase.addChild(this.MouthBottom1);
        this.HeadBase.addChild(this.Leaf8Head);
        this.HeadBase.addChild(this.Leaf2Head);
        this.MouthBottom1.addChild(this.TeethBottom1);
        this.Tongue2.addChild(this.Tongue3);
        this.HeadBase.addChild(this.Leaf1Head);
        this.MouthTop2.addChild(this.TeethTop2);
        this.Stem2.addChild(this.Stem3);
        this.Stem1Base.addChild(this.Stem2);
        this.Stem1Joint.addChild(this.Stem1Base);
        this.Tongue1Base.addChild(this.Tongue2);
        this.MouthTop1.addChild(this.MouthTop2);
        this.BigLeaf2Base.addChild(this.BigLeaf2End);
        this.Stem3.addChild(this.Stem4);
        this.MouthTop1.addChild(this.TeethTop1);
        this.HeadBase.addChild(this.MouthTop1);
        this.HeadBase.addChild(this.Leaf7Head);

        this.stemParts = new MowzieModelRenderer[]{HeadBase, Stem4, Stem3, Stem2, Stem1Base};
        this.tongueParts = new MowzieModelRenderer[]{Tongue1Base, Tongue2, Tongue3};
        this.leafParts1 = new MowzieModelRenderer[]{BigLeaf1End, BigLeaf1Base};
        this.leafParts2 = new MowzieModelRenderer[]{BigLeaf2End, BigLeaf2Base};
        this.leafParts3 = new MowzieModelRenderer[]{BigLeaf3End, BigLeaf3Base};
        this.leafParts4 = new MowzieModelRenderer[]{BigLeaf4End, BigLeaf4Base};

        //Adjustments
        Stem1Joint.rotationPointY += 2;
        Stem1Joint.rotateAngleX += 0.05;
        Stem2.rotateAngleX += 0.3;
        Stem3.rotateAngleX += -0.1;
        HeadBase.rotateAngleX += -0.35;
        Stem1Base.setRotationPoint(0, 0, 0);

        this.parts = new MowzieModelRenderer[]{Stem1Joint, Stem1Base, BigLeaf2Base, BigLeaf1Base, BigLeaf4Base, BigLeaf3Base, Stem2, Stem3, Stem4, HeadBase, MouthTop1, Leaf1Head, Leaf2Head, Leaf3Head, Leaf4Head, Leaf5Head, Leaf6Head, Leaf7Head, Leaf8Head, Tongue1Base, MouthBack, MouthBottom1, MouthTop2, TeethTop1, TeethTop2, Tongue2, Tongue3, MouthBottom2, TeethBottom1, TeethBottom2, BigLeaf2End, BigLeaf1End, BigLeaf4End, BigLeaf3End};
        this.setInitPose();
    }

    @Override
    public void render(Entity foliaath, float f, float f1, float f2, float f3, float f4, float f5)
    {
        animate((IAnimatedEntity) foliaath, f, f1, f2, f3, f4, f5);
        float leafScale = 1.25F;
        GL11.glScalef(leafScale, leafScale, leafScale);
        this.BigLeaf2Base.rotationPointY -= 3.5;
        this.BigLeaf1Base.rotationPointY -= 3.5;
        this.BigLeaf3Base.rotationPointY -= 3.5;
        this.BigLeaf4Base.rotationPointY -= 3.5;
        this.BigLeaf2Base.render(f5);
        this.BigLeaf1Base.render(f5);
        this.BigLeaf3Base.render(f5);
        this.BigLeaf4Base.render(f5);
        GL11.glScalef(1 / leafScale, 1 / leafScale, 1 / leafScale);
        GL11.glTranslatef(0, 1.4F, 0);
        GL11.glTranslatef(0, -1.4F * activeProgress, 0);
        GL11.glScalef(activeProgress, activeProgress, activeProgress);
        Stem1Joint.render(f5);
    }

    public void setRotateAngle(MowzieModelRenderer modelRenderer, float x, float y, float z)
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void setRotationAngles(EntityFoliaath foliaath, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, foliaath);
        setToInitPose();

        activeProgress = foliaath.activate.getAnimationProgressSinSqrt();
        float activeIntermittent = foliaath.activate.getAnimationProgressSinSqrt() - foliaath.activate.getAnimationProgressSinToTenWithoutReturn();
        float activeComplete = activeProgress - activeIntermittent;

        float globalSpeed = 0.9f;

        Stem1Joint.rotateAngleY += (f3 / (180f / (float) Math.PI));

        flap(Stem1Base, 0.25F * globalSpeed, 0.15F * activeComplete, false, 0F, 0F, foliaath.frame, 1F);
        walk(Stem1Base, 0.5F * globalSpeed, 0.05F * activeComplete, false, 0F, 0F, foliaath.frame, 1F);
        walk(Stem2, 0.5F * globalSpeed, 0.05F * activeComplete, false, 0.5F, 0F, foliaath.frame, 1F);
        walk(Stem3, 0.5F * globalSpeed, 0.07F * activeComplete, false, 1F, 0F, foliaath.frame, 1F);
        walk(Stem4, 0.5F * globalSpeed, 0.05F * activeComplete, false, 1.5F, 0F, foliaath.frame, 1F);
        walk(HeadBase, 0.5F * globalSpeed, 0.15F * activeComplete, true, 1.3F, 0F, foliaath.frame, 1F);
        HeadBase.rotateAngleY += rotateBox(0.25F * globalSpeed, 0.15F * activeComplete, false, 0F, 0F, foliaath.frame, 1F);
        walk(Leaf1Head, 0.5F * globalSpeed, 0.15F * activeComplete, false, 3F, -0.1F, foliaath.frame, 1F);
        walk(Leaf2Head, 0.5F * globalSpeed, 0.15F * activeComplete, false, 3F, -0.1F, foliaath.frame, 1F);
        walk(Leaf3Head, 0.5F * globalSpeed, 0.15F * activeComplete, false, 3F, -0.1F, foliaath.frame, 1F);
        walk(Leaf4Head, 0.5F * globalSpeed, 0.15F * activeComplete, false, 3F, -0.1F, foliaath.frame, 1F);
        walk(Leaf5Head, 0.5F * globalSpeed, 0.15F * activeComplete, false, 3F, -0.1F, foliaath.frame, 1F);
        walk(Leaf6Head, 0.5F * globalSpeed, 0.15F * activeComplete, false, 3F, -0.1F, foliaath.frame, 1F);
        walk(Leaf7Head, 0.5F * globalSpeed, 0.15F * activeComplete, false, 3F, -0.1F, foliaath.frame, 1F);
        walk(Leaf8Head, 0.5F * globalSpeed, 0.15F * activeComplete, false, 3F, -0.1F, foliaath.frame, 1F);
        chainWave(leafParts1, 0.5F * globalSpeed, 0.13F * activeComplete, 2, foliaath.frame, 1F);
        chainWave(leafParts2, 0.5F * globalSpeed, 0.13F * activeComplete, 2, foliaath.frame, 1F);
        chainWave(leafParts3, 0.5F * globalSpeed, 0.13F * activeComplete, 2, foliaath.frame, 1F);
        chainWave(leafParts4, 0.5F * globalSpeed, 0.13F * activeComplete, 2, foliaath.frame, 1F);

        //Open Mouth Animation
        float openMouthProgress = foliaath.openMouth.getAnimationProgressSinSqrt();
        float openMouthIntermittent = foliaath.openMouth.getAnimationProgressSinSqrt() - foliaath.openMouth.getAnimationProgressSinToTenWithoutReturn();
        float headLeafRotation = 0.2F * openMouthProgress - 0.8F * openMouthIntermittent;
        MouthTop1.rotateAngleX -= 0.3 * openMouthIntermittent;
        MouthBottom1.rotateAngleX -= 0.3 * openMouthIntermittent;
        MouthTop2.rotateAngleX += 0.3 * openMouthIntermittent;
        MouthBottom2.rotateAngleX += 0.3 * openMouthIntermittent;
        Stem2.rotateAngleX += 0.9 * openMouthIntermittent;
        Stem3.rotateAngleX -= 0.6 * openMouthIntermittent;
        Stem4.rotateAngleX -= 0.6 * openMouthIntermittent;
        HeadBase.rotateAngleX += 0.6 * openMouthIntermittent;
        flap(HeadBase, 1.5F, 0.6F * openMouthIntermittent, false, 0F, 0F, foliaath.frame, 1F);
        MouthTop1.rotateAngleX += 0.15 * openMouthProgress;
        MouthBottom1.rotateAngleX += 0.15 * openMouthProgress;
        chainWave(tongueParts, 0.5F * globalSpeed, -0.15F * (openMouthProgress - openMouthIntermittent), -2, foliaath.frame, 1F);
        Tongue1Base.rotateAngleY += 0.3 * (openMouthProgress - openMouthIntermittent);
        Tongue2.rotateAngleY += 0.4 * (openMouthProgress - openMouthIntermittent);
        Tongue2.rotateAngleX -= 0.1 * (openMouthProgress - openMouthIntermittent);
        Tongue3.rotateAngleX -= 0.5 * (openMouthProgress - openMouthIntermittent);
        Stem1Base.rotateAngleX -= 0.2 * openMouthProgress;
        Stem2.rotateAngleX -= 0.1 * openMouthProgress;
        Stem3.rotateAngleX -= 0.1 * openMouthProgress;
        Stem4.rotateAngleX -= 0.1 * openMouthProgress;
        HeadBase.rotateAngleX += 0.6 * openMouthProgress;
        Leaf1Head.rotateAngleX -= headLeafRotation;
        Leaf2Head.rotateAngleX -= headLeafRotation;
        Leaf3Head.rotateAngleX -= headLeafRotation;
        Leaf4Head.rotateAngleX -= headLeafRotation;
        Leaf5Head.rotateAngleX -= headLeafRotation;
        Leaf6Head.rotateAngleX -= headLeafRotation;
        Leaf7Head.rotateAngleX -= headLeafRotation;
        Leaf8Head.rotateAngleX -= headLeafRotation;

        //Activate Animation
        chainFlap(stemParts, 0.7F, 0.2F * 2 * activeIntermittent, 2F, foliaath.frame, 1F);
        chainSwing(tongueParts, 0.7F, 0.6F * 2 * activeIntermittent, -2F, foliaath.frame, 1F);
        chainWave(leafParts1, 1.5F, 0.1F * 2 * activeIntermittent, 0, foliaath.frame, 1F);
        chainWave(leafParts2, 1.5F, 0.1F * 2 * activeIntermittent, 0, foliaath.frame, 1F);
        chainWave(leafParts3, 1.5F, 0.1F * 2 * activeIntermittent, 0, foliaath.frame, 1F);
        chainWave(leafParts4, 1.5F, 0.1F * 2 * activeIntermittent, 0, foliaath.frame, 1F);
        Stem1Base.rotateAngleX -= 0.1 * 2 * activeIntermittent;
        Stem2.rotateAngleX -= 0.5 * 2 * activeIntermittent;
        Stem3.rotateAngleX += 0.9 * 2 * activeIntermittent;
        Stem4.rotateAngleX += 0.6 * 2 * activeIntermittent;
        HeadBase.rotateAngleX += 0.6 * 2 * activeIntermittent;
        MouthTop1.rotateAngleX += 0.4 * 2 * activeIntermittent;
        MouthBottom1.rotateAngleX += 0.4 * 2 * activeIntermittent;
    }

    public void animate(IAnimatedEntity foliaath, float f, float f1, float f2, float f3, float f4, float f5)
    {
        animator.update(foliaath);
        setRotationAngles((EntityFoliaath) foliaath, f, f1, f2, f3, f4, f5);

        //Bite
        animator.setAnim(1);
        animator.startPhase(3);
        animator.rotate(Stem1Base, 0.4F, 0, 0);
        animator.rotate(Stem2, -0.3F, 0, 0);
        animator.rotate(Stem3, 0.2F, 0, 0);
        animator.rotate(Stem4, 0.2F, 0, 0);
        animator.rotate(HeadBase, -0.6F, 0, 0);
        animator.rotate(MouthTop1, 0.8F, 0, 0);
        animator.rotate(MouthBottom1, 0.8F, 0, 0);
        animator.rotate(Tongue1Base, -0.2F, 0, 0);
        animator.rotate(Tongue2, -0.5F, 0, 0);
        animator.move(Tongue2, 0, -0.3F, 0);
        animator.rotate(Tongue3, 0.4F, 0, 0);
        animator.endPhase();
        animator.setStationaryPhase(1);
        animator.startPhase(2);
        animator.rotate(Stem1Base, -0.6F, 0, 0);
        animator.rotate(Stem2, -1.2F, 0, 0);
        animator.rotate(Stem3, 0.8F, 0, 0);
        animator.rotate(Stem4, 0.8F, 0, 0);
        animator.rotate(HeadBase, 0.4F, 0, 0);
        animator.rotate(MouthTop1, -0.1F, 0, 0);
        animator.rotate(MouthBottom1, -0.1F, 0, 0);
        animator.rotate(MouthTop2, 0.15F, 0, 0);
        animator.rotate(MouthBottom2, 0.15F, 0, 0);
        animator.endPhase();
        animator.setStationaryPhase(3);
        animator.resetPhase(5);
    }
}
