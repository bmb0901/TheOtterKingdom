package com.otter.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class OtterModel extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer tail;
	private final ModelRenderer neck;
	private final ModelRenderer head;
	private final ModelRenderer l_front_leg;
	private final ModelRenderer l_lower_leg;
	private final ModelRenderer paw_1;
	private final ModelRenderer r_front_leg;
	private final ModelRenderer l_lower_leg2;
	private final ModelRenderer paw_2;
	private final ModelRenderer l_back_leg;
	private final ModelRenderer lower_leg_3;
	private final ModelRenderer paw_3;
	private final ModelRenderer r_back_leg;
	private final ModelRenderer lower_leg_4;
	private final ModelRenderer paw_4;

	public OtterModel() {
		textureWidth = 64;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -12.5F, -3.0F, 8, 6, 12, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(2.0F, -2.0F, 6.0F);
		body.addChild(tail);
		setRotationAngle(tail, -0.6109F, 0.0F, 0.0F);
		tail.cubeList.add(new ModelBox(tail, 28, 23, -3.0F, -7.4148F, 2.3749F, 2, 2, 7, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 22, 21, -4.0F, -8.9148F, -3.4416F, 4, 4, 7, 0.0F, false));

		neck = new ModelRenderer(this);
		neck.setRotationPoint(3.0F, 0.0F, -4.0F);
		body.addChild(neck);
		setRotationAngle(neck, -0.6109F, 0.0F, 0.0F);
		neck.cubeList.add(new ModelBox(neck, 0, 19, -6.0F, -11.1427F, -10.4052F, 6, 5, 8, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(-3.0F, -2.2119F, 3.6719F);
		neck.addChild(head);
		setRotationAngle(head, 0.6109F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 56, 0, -1.5F, -14.0F, -14.0F, 3, 2, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 42, 3, -2.0F, -15.0F, -13.0F, 4, 4, 7, 0.0F, true));

		l_front_leg = new ModelRenderer(this);
		l_front_leg.setRotationPoint(0.0F, -2.0F, 4.0F);
		body.addChild(l_front_leg);
		setRotationAngle(l_front_leg, 0.4363F, 0.0F, 0.0F);
		l_front_leg.cubeList.add(new ModelBox(l_front_leg, 50, 26, 4.0F, -9.0F, -3.0F, 2, 4, 2, 0.0F, false));

		l_lower_leg = new ModelRenderer(this);
		l_lower_leg.setRotationPoint(6.0F, 0.4378F, -5.5357F);
		l_front_leg.addChild(l_lower_leg);
		setRotationAngle(l_lower_leg, -0.4363F, 0.0F, 0.0F);
		l_lower_leg.cubeList.add(new ModelBox(l_lower_leg, 50, 25, -2.0F, -7.0F, -0.4969F, 2, 5, 2, 0.0F, false));

		paw_1 = new ModelRenderer(this);
		paw_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		l_lower_leg.addChild(paw_1);
		paw_1.cubeList.add(new ModelBox(paw_1, 50, 25, -2.0F, -2.0F, -2.4643F, 2, 1, 4, 0.0F, false));

		r_front_leg = new ModelRenderer(this);
		r_front_leg.setRotationPoint(-10.0F, -2.0F, 4.0F);
		body.addChild(r_front_leg);
		setRotationAngle(r_front_leg, 0.4363F, 0.0F, 0.0F);
		r_front_leg.cubeList.add(new ModelBox(r_front_leg, 50, 26, 4.0F, -9.0F, -3.0F, 2, 4, 2, 0.0F, false));

		l_lower_leg2 = new ModelRenderer(this);
		l_lower_leg2.setRotationPoint(6.0F, 0.4378F, -5.5357F);
		r_front_leg.addChild(l_lower_leg2);
		setRotationAngle(l_lower_leg2, -0.4363F, 0.0F, 0.0F);
		l_lower_leg2.cubeList.add(new ModelBox(l_lower_leg2, 50, 25, -2.0F, -7.0F, -0.4969F, 2, 5, 2, 0.0F, false));

		paw_2 = new ModelRenderer(this);
		paw_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		l_lower_leg2.addChild(paw_2);
		paw_2.cubeList.add(new ModelBox(paw_2, 50, 25, -2.0F, -2.0F, -2.4643F, 2, 1, 4, 0.0F, false));

		l_back_leg = new ModelRenderer(this);
		l_back_leg.setRotationPoint(5.0F, -7.0F, 7.0F);
		body.addChild(l_back_leg);
		setRotationAngle(l_back_leg, -0.6981F, 0.0F, 0.0F);
		l_back_leg.cubeList.add(new ModelBox(l_back_leg, 46, 14, -1.0F, -2.5205F, -2.55F, 2, 5, 3, 0.0F, false));

		lower_leg_3 = new ModelRenderer(this);
		lower_leg_3.setRotationPoint(1.0F, 2.2065F, 2.4425F);
		l_back_leg.addChild(lower_leg_3);
		setRotationAngle(lower_leg_3, 0.6981F, 0.0F, 0.0F);
		lower_leg_3.cubeList.add(new ModelBox(lower_leg_3, 46, 14, -2.0F, -3.4288F, -2.9056F, 2, 7, 2, 0.0F, false));

		paw_3 = new ModelRenderer(this);
		paw_3.setRotationPoint(0.0F, -2.1803F, 0.8067F);
		lower_leg_3.addChild(paw_3);
		paw_3.cubeList.add(new ModelBox(paw_3, 46, 14, -2.0F, 5.3356F, -5.9052F, 2, 1, 4, 0.0F, false));

		r_back_leg = new ModelRenderer(this);
		r_back_leg.setRotationPoint(-5.0F, -7.0F, 7.0F);
		body.addChild(r_back_leg);
		setRotationAngle(r_back_leg, -0.6981F, 0.0F, 0.0F);
		r_back_leg.cubeList.add(new ModelBox(r_back_leg, 46, 15, -1.0F, -2.5205F, -2.55F, 2, 5, 3, 0.0F, false));

		lower_leg_4 = new ModelRenderer(this);
		lower_leg_4.setRotationPoint(1.0F, 2.2065F, 2.4425F);
		r_back_leg.addChild(lower_leg_4);
		setRotationAngle(lower_leg_4, 0.6981F, 0.0F, 0.0F);
		lower_leg_4.cubeList.add(new ModelBox(lower_leg_4, 46, 15, -2.0F, -3.4288F, -2.9056F, 2, 6, 2, 0.0F, false));

		paw_4 = new ModelRenderer(this);
		paw_4.setRotationPoint(0.0F, -2.1803F, 0.8067F);
		lower_leg_4.addChild(paw_4);
		paw_4.cubeList.add(new ModelBox(paw_4, 46, 15, -2.0F, 4.8592F, -5.9052F, 2, 1, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}