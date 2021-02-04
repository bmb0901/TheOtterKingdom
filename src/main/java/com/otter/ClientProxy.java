package com.otter;

import com.otter.entity.ModEntities;
import com.otter.entity.OtterMob;
import com.otter.entity.OtterWarrior;
import com.otter.entity.OtterWizard;
import com.otter.entity.render.OtterRenderer;
import com.otter.entity.render.OtterWarriorRenderer;
import com.otter.entity.render.OtterWizardRenderer;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;

public class ClientProxy implements IProxy {
	
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		ModEntities.registerEntities();
		ModEntities.registerEntityRenders();
		
		RenderingRegistry.registerEntityRenderingHandler(OtterMob.class, OtterRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(OtterWarrior.class, OtterWarriorRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(OtterWizard.class, OtterWizardRenderer::new);

		//plains spawn
		EntityRegistry.addSpawn(OtterWarrior.class, 50, 1, 3, EnumCreatureType.MONSTER, Biomes.PLAINS);
		EntityRegistry.addSpawn(OtterWizard.class, 50, 2, 4, EnumCreatureType.MONSTER, Biomes.PLAINS);
		// other biomes
		EntityRegistry.addSpawn(OtterWarrior.class, 50, 1, 3, EnumCreatureType.MONSTER, Biomes.SAVANNA);
		EntityRegistry.addSpawn(OtterWizard.class, 50, 1, 3, EnumCreatureType.MONSTER, Biomes.SAVANNA);

		EntityRegistry.addSpawn(OtterMob.class, 50, 1, 3, EnumCreatureType.MONSTER, Biomes.BEACH);

	}

	@Override
	public void init(FMLInitializationEvent event) {
		
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {		
	}
}
