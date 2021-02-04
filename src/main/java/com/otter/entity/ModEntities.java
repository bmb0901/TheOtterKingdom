package com.otter.entity;

import com.otter.OtterMod;
import com.otter.entity.render.OtterRenderer;
import com.otter.entity.render.OtterWarriorRenderer;
import com.otter.entity.render.OtterWizardRenderer;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.registry.EntityRegistry;

@EventBusSubscriber(modid = "otter")
public class ModEntities {
	
	public static void registerEntities()
	{
		registerEntity("otter", OtterMob.class, 25, 50, 11437146, 000000);
		registerEntity("otter_warrior", OtterWarrior.class, 26, 50, 11437146, 000000);
		registerEntity("otter_wizard", OtterWizard.class, 27, 50, 11437146, 000000);


	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation("otter" + ":" + name), entity, name, id, OtterMod.instance, range, 1, true, color1, color2);
	}
	
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(OtterMob.class, OtterRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(OtterWarrior.class, OtterWarriorRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(OtterWizard.class, OtterWizardRenderer::new);

	}
}