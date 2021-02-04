package com.otter.entity.render;

import com.otter.entity.OtterWizard;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class OtterWizardRenderer extends RenderLiving<OtterWizard> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation("otter", "textures/entity/otter_wizard.png");

    public OtterWizardRenderer(RenderManager renderManagerIn) {
        super(renderManagerIn, new com.otter.entity.model.OtterWizardModel(), 0.7f);
    }

    @Override
    public ResourceLocation getEntityTexture(OtterWizard entity) {
        return TEXTURE;
    }
}