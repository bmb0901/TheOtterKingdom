package com.otter.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class OtterWarriorModel extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer right_leg;
	private final ModelRenderer r_lower;
	private final ModelRenderer r_paw;
	private final ModelRenderer left_leg;
	private final ModelRenderer l_lower;
	private final ModelRenderer l_paw;
	private final ModelRenderer tail;
	private final ModelRenderer lower_tail;
	private final ModelRenderer torso;
	private final ModelRenderer head;
	private final ModelRenderer hat;
	private final ModelRenderer upper_torso;
	private final ModelRenderer l_arm;
	private final ModelRenderer r_arm;
	private final ModelRenderer bb_main;

	public OtterWarriorModel() {
		textureWidth = 64;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 4.0F);
		setRotationAngle(body, 0.5236F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 24, -3.0F, -10.0F, -1.0F, 4, 4, 4, 0.0F, false));

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(6.0F, 0.0F, 0.0F);
		body.addChild(right_leg);
		right_leg.cubeList.add(new ModelBox(right_leg, 56, 26, -5.0F, -8.0F, 0.0F, 2, 4, 2, 0.0F, false));

		r_lower = new ModelRenderer(this);
		r_lower.setRotationPoint(-3.0F, -2.366F, -2.0981F);
		right_leg.addChild(r_lower);
		setRotationAngle(r_lower, -0.6545F, 0.0F, 0.0F);
		r_lower.cubeList.add(new ModelBox(r_lower, 56, 26, -2.0F, -4.0F, 0.2481F, 2, 4, 2, 0.0F, false));

		r_paw = new ModelRenderer(this);
		r_paw.setRotationPoint(0.0F, 0.0F, 0.0F);
		r_lower.addChild(r_paw);
		setRotationAngle(r_paw, 0.1309F, 0.0F, 0.0F);
		r_paw.cubeList.add(new ModelBox(r_paw, 44, 27, -2.0F, -0.0086F, -1.8695F, 2, 1, 4, 0.0F, false));

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(left_leg);
		setRotationAngle(left_leg, 0.0436F, 0.0F, 0.0F);
		left_leg.cubeList.add(new ModelBox(left_leg, 56, 26, -5.0F, -8.0F, 0.0F, 2, 4, 2, 0.0F, false));

		l_lower = new ModelRenderer(this);
		l_lower.setRotationPoint(-3.0F, -2.366F, -2.0981F);
		left_leg.addChild(l_lower);
		setRotationAngle(l_lower, -0.6545F, 0.0F, 0.0F);
		l_lower.cubeList.add(new ModelBox(l_lower, 56, 26, -2.0F, -4.0F, 0.2481F, 2, 4, 2, 0.0F, false));

		l_paw = new ModelRenderer(this);
		l_paw.setRotationPoint(0.0F, 0.0F, 0.0F);
		l_lower.addChild(l_paw);
		setRotationAngle(l_paw, 0.1309F, 0.0F, 0.0F);
		l_paw.cubeList.add(new ModelBox(l_paw, 44, 27, -2.0F, -0.0086F, -1.8695F, 2, 1, 4, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(1.0F, -10.4641F, -0.7321F);
		body.addChild(tail);
		setRotationAngle(tail, -1.1781F, 0.0F, 0.0F);
		tail.cubeList.add(new ModelBox(tail, 48, 0, -3.5F, -2.2321F, 3.5981F, 3, 2, 5, 0.0F, false));

		lower_tail = new ModelRenderer(this);
		lower_tail.setRotationPoint(0.0F, 2.1955F, 0.4242F);
		tail.addChild(lower_tail);
		setRotationAngle(lower_tail, 0.3054F, 0.0F, 0.0F);
		lower_tail.cubeList.add(new ModelBox(lower_tail, 52, 7, -3.0F, -2.0314F, 8.5973F, 2, 2, 4, 0.0F, false));

		torso = new ModelRenderer(this);
		torso.setRotationPoint(1.0F, -8.7321F, -1.7321F);
		body.addChild(torso);
		setRotationAngle(torso, -0.5236F, 0.0F, 0.0F);
		torso.cubeList.add(new ModelBox(torso, 18, 0, -4.0F, -11.0F, 1.0F, 4, 3, 3, 0.0F, false));
		torso.cubeList.add(new ModelBox(torso, 0, 15, -4.0F, -6.2321F, -0.0679F, 4, 5, 4, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 1.0F, 3.0F);
		torso.addChild(head);
		setRotationAngle(head, 0.3054F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -14.0F, 0.0F, 4, 3, 5, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 8, -4.0F, -13.9944F, -1.8679F, 4, 2, 2, 0.0F, false));

		hat = new ModelRenderer(this);
		hat.setRotationPoint(0.0F, -0.9537F, 0.3007F);
		head.addChild(hat);
		

		upper_torso = new ModelRenderer(this);
		upper_torso.setRotationPoint(0.0F, 0.0F, -2.0F);
		torso.addChild(upper_torso);
		setRotationAngle(upper_torso, -0.2182F, 0.0F, 0.0F);
		upper_torso.cubeList.add(new ModelBox(upper_torso, 0, 16, -4.0F, -10.0F, 0.6321F, 4, 4, 4, 0.0F, false));

		l_arm = new ModelRenderer(this);
		l_arm.setRotationPoint(0.0F, 1.5151F, -6.8341F);
		upper_torso.addChild(l_arm);
		setRotationAngle(l_arm, -0.5672F, 0.0F, 0.0F);
		l_arm.cubeList.add(new ModelBox(l_arm, 24, 24, 0.0F, -14.4597F, 1.1974F, 2, 6, 2, 0.0F, false));

		r_arm = new ModelRenderer(this);
		r_arm.setRotationPoint(-6.0F, 1.5151F, -6.8341F);
		upper_torso.addChild(r_arm);
		setRotationAngle(r_arm, -0.5672F, 0.0F, 0.0F);
		r_arm.cubeList.add(new ModelBox(r_arm, 24, 24, 0.0F, -14.4597F, 1.1974F, 2, 6, 2, 0.0F, false));

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 36, 3, -5.0F, -25.0F, -4.0F, 1, 25, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		bb_main.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}