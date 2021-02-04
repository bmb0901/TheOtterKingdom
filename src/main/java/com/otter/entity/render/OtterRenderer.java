package com.otter.entity.render;

import com.otter.entity.OtterMob;
import com.otter.entity.model.OtterModel;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class OtterRenderer extends RenderLiving<OtterMob> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation("otter", "textures/entity/otter.png");

    public OtterRenderer(RenderManager manager)
    {
        super(manager, new OtterModel(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(OtterMob entity) {
        return TEXTURE;
    }
}