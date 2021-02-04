package com.otter.entity.render;

import com.otter.entity.OtterWarrior;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class OtterWarriorRenderer extends RenderLiving<OtterWarrior> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation("otter", "textures/entity/otter_warrior.png");

    public OtterWarriorRenderer(RenderManager renderManagerIn) {
        super(renderManagerIn, new com.otter.entity.model.OtterWarriorModel(), 0.7f);
    }

    @Override
    public ResourceLocation getEntityTexture(OtterWarrior entity) {
        return TEXTURE;
    }
}