//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 18.03.2019 - 18:16:07
// Last changed on: 18.03.2019 - 18:16:07

package wwcp.client.render.rollingstock.freight; //Path where the model is located


import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import wwcp.client.render.rollingstock.bogies.EUBogies.SGGNSBogie;
import wwcp.common.library.Info;

public class R_Flatcars_BlockLoad extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public R_Flatcars_BlockLoad() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[9];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 100, textureX, textureY); // BlockLoad1
		bodyModel[1] = new ModelRendererTurbo(this, 209, 136, textureX, textureY); // BlockLoad8.2
		bodyModel[2] = new ModelRendererTurbo(this, 278, 136, textureX, textureY); // BlockLoad9.2
		bodyModel[3] = new ModelRendererTurbo(this, 140, 136, textureX, textureY); // BlockLoad7
		bodyModel[4] = new ModelRendererTurbo(this, 70, 136, textureX, textureY); // BlockLoad6
		bodyModel[5] = new ModelRendererTurbo(this, 1, 136, textureX, textureY); // BlockLoad5
		bodyModel[6] = new ModelRendererTurbo(this, 209, 100, textureX, textureY); // BlockLoad4
		bodyModel[7] = new ModelRendererTurbo(this, 140, 100, textureX, textureY); // BlockLoad3
		bodyModel[8] = new ModelRendererTurbo(this, 70, 100, textureX, textureY); // BlockLoad2

		bodyModel[0].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // BlockLoad1
		bodyModel[0].setRotationPoint(-72F, -16F, -8F);

		bodyModel[1].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // BlockLoad8.2
		bodyModel[1].setRotationPoint(40F, -16F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // BlockLoad9.2
		bodyModel[2].setRotationPoint(56F, -16F, -8F);

		bodyModel[3].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // BlockLoad7
		bodyModel[3].setRotationPoint(24F, -16F, -8F);

		bodyModel[4].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // BlockLoad6
		bodyModel[4].setRotationPoint(8F, -16F, -8F);

		bodyModel[5].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // BlockLoad5
		bodyModel[5].setRotationPoint(-8F, -16F, -8F);

		bodyModel[6].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // BlockLoad4
		bodyModel[6].setRotationPoint(-24F, -16F, -8F);

		bodyModel[7].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // BlockLoad3
		bodyModel[7].setRotationPoint(-40F, -16F, -8F);

		bodyModel[8].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // BlockLoad2
		bodyModel[8].setRotationPoint(-56F, -16F, -8F);
	}
}