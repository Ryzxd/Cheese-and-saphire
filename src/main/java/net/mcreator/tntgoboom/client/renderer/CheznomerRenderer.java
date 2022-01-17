package net.mcreator.tntgoboom.client.renderer;

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
