package net.mcreator.tntgoboom.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PigModel;

import net.mcreator.tntgoboom.entity.CheznomerEntity;

public class CheznomerRenderer extends MobRenderer<CheznomerEntity, PigModel<CheznomerEntity>> {
	public CheznomerRenderer(EntityRendererProvider.Context context) {
		super(context, new PigModel(context.bakeLayer(ModelLayers.PIG)), 0.5f);
		this.addLayer(new EyesLayer<CheznomerEntity, PigModel<CheznomerEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("tnt_go_boom:textures/download_7.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(CheznomerEntity entity) {
		return new ResourceLocation("tnt_go_boom:textures/download_7.png");
	}
}
