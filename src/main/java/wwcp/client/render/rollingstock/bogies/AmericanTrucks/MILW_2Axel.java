package wwcp.client.render.rollingstock.bogies.AmericanTrucks;


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class MILW_2Axel extends ModelConverter
{
	int textureX = 512;
	int textureY = 512;

	public MILW_2Axel() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[38];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Wheel
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Wheel
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Wheel
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Wheel
		bodyModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 173
		bodyModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 553
		bodyModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 554
		bodyModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 555
		bodyModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 557
		bodyModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 558
		bodyModel[10] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 559
		bodyModel[11] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 560
		bodyModel[12] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 561
		bodyModel[13] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 562
		bodyModel[14] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 563
		bodyModel[15] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 564
		bodyModel[16] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 565
		bodyModel[17] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 566
		bodyModel[18] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 567
		bodyModel[19] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 568
		bodyModel[20] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 569
		bodyModel[21] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 570
		bodyModel[22] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 571
		bodyModel[23] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 572
		bodyModel[24] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 573
		bodyModel[25] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 574
		bodyModel[26] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 575
		bodyModel[27] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 576
		bodyModel[28] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 577
		bodyModel[29] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 578
		bodyModel[30] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 579
		bodyModel[31] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 580
		bodyModel[32] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 581
		bodyModel[33] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 582
		bodyModel[34] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 583
		bodyModel[35] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 584
		bodyModel[36] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 585
		bodyModel[37] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 590

		bodyModel[0].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Wheel
		bodyModel[0].setRotationPoint(7.5F, 7F, 5.75F);

		bodyModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Wheel
		bodyModel[1].setRotationPoint(7.5F, 7F, -5.95F);

		bodyModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Wheel
		bodyModel[2].setRotationPoint(-7.5F, 7F, -5.95F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Wheel
		bodyModel[3].setRotationPoint(-7.5F, 7F, 5.75F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 173
		bodyModel[4].setRotationPoint(6.5F, 6F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 553
		bodyModel[5].setRotationPoint(-8.5F, 6F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 554
		bodyModel[6].setRotationPoint(-4.5F, 6.5F, -7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 555
		bodyModel[7].setRotationPoint(-6.5F, 6.5F, -7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0.25F, 0F, -2F, 0.25F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 557
		bodyModel[8].setRotationPoint(-6.5F, 4.5F, -7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
		bodyModel[9].setRotationPoint(-8.5F, 4.5F, -7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 17, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 559
		bodyModel[10].setRotationPoint(-8.5F, 9F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 560
		bodyModel[11].setRotationPoint(-9.5F, 5F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 561
		bodyModel[12].setRotationPoint(-6.5F, 6F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 562
		bodyModel[13].setRotationPoint(8.5F, 5F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[14].setRotationPoint(6.5F, 4.5F, -7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -2F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[15].setRotationPoint(4.5F, 4.5F, -7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -2F, 0.25F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 565
		bodyModel[16].setRotationPoint(4.5F, 6.5F, -7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		bodyModel[17].setRotationPoint(5.5F, 6F, -7F);

		bodyModel[18].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 567
		bodyModel[18].setRotationPoint(-6.5F, 5F, -7F);

		bodyModel[19].addBox(0F, 0F, 0F, 5, 2, 12, 0F); // Box 568
		bodyModel[19].setRotationPoint(-2.5F, 6.5F, -6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F); // Box 569
		bodyModel[20].setRotationPoint(6.5F, 4.5F, 6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 570
		bodyModel[21].setRotationPoint(8.5F, 5F, 6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -2F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 571
		bodyModel[22].setRotationPoint(4.5F, 4.5F, 6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0.25F, 0F, 0F, 0.25F); // Box 572
		bodyModel[23].setRotationPoint(4.5F, 6.5F, 6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		bodyModel[24].setRotationPoint(5.5F, 6F, 6F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 574
		bodyModel[25].setRotationPoint(-4.5F, 6.5F, 6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -2F, 0.25F); // Box 575
		bodyModel[26].setRotationPoint(-6.5F, 6.5F, 6F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 576
		bodyModel[27].setRotationPoint(-6.5F, 4.5F, 6F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F); // Box 577
		bodyModel[28].setRotationPoint(-8.5F, 4.5F, 6F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		bodyModel[29].setRotationPoint(-9.5F, 5F, 6F);

		bodyModel[30].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 579
		bodyModel[30].setRotationPoint(-6.5F, 5F, 6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 17, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 580
		bodyModel[31].setRotationPoint(-8.5F, 9F, 6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 581
		bodyModel[32].setRotationPoint(-6.5F, 6F, 6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 582
		bodyModel[33].setRotationPoint(-2.5F, 4.5F, -7.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 583
		bodyModel[34].setRotationPoint(-1F, 4F, -1F);

		bodyModel[35].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 584
		bodyModel[35].setRotationPoint(-1F, 6F, -7F);

		bodyModel[36].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 585
		bodyModel[36].setRotationPoint(-1F, 6F, 6F);

		bodyModel[37].addBox(0F, 0F, 0F, 13, 2, 6, 0F); // Box 590
		bodyModel[37].setRotationPoint(-6.5F, 6F, -3F);
	}
}