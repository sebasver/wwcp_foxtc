package wwcp.client.render.rollingstock.bogies.AmericanTrucks;


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Joe_2Axel extends ModelConverter
{
	int textureX = 512;
	int textureY = 512;

	public Joe_2Axel() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[48];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 297, 177, textureX, textureY); // Box 9
		bodyModel[1] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 39
		bodyModel[2] = new ModelRendererTurbo(this, 17, 185, textureX, textureY); // Box 550
		bodyModel[3] = new ModelRendererTurbo(this, 201, 185, textureX, textureY); // Box 551
		bodyModel[4] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 173
		bodyModel[5] = new ModelRendererTurbo(this, 41, 201, textureX, textureY); // Box 553
		bodyModel[6] = new ModelRendererTurbo(this, 33, 225, textureX, textureY); // Box 668
		bodyModel[7] = new ModelRendererTurbo(this, 81, 225, textureX, textureY); // Box 669
		bodyModel[8] = new ModelRendererTurbo(this, 145, 225, textureX, textureY); // Box 670
		bodyModel[9] = new ModelRendererTurbo(this, 17, 193, textureX, textureY); // Box 671
		bodyModel[10] = new ModelRendererTurbo(this, 225, 225, textureX, textureY); // Box 672
		bodyModel[11] = new ModelRendererTurbo(this, 281, 225, textureX, textureY); // Box 673
		bodyModel[12] = new ModelRendererTurbo(this, 257, 225, textureX, textureY); // Box 674
		bodyModel[13] = new ModelRendererTurbo(this, 305, 225, textureX, textureY); // Box 675
		bodyModel[14] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Box 676
		bodyModel[15] = new ModelRendererTurbo(this, 321, 185, textureX, textureY); // Box 677
		bodyModel[16] = new ModelRendererTurbo(this, 329, 185, textureX, textureY); // Box 678
		bodyModel[17] = new ModelRendererTurbo(this, 369, 225, textureX, textureY); // Box 679
		bodyModel[18] = new ModelRendererTurbo(this, 97, 193, textureX, textureY); // Box 680
		bodyModel[19] = new ModelRendererTurbo(this, 385, 225, textureX, textureY); // Box 681
		bodyModel[20] = new ModelRendererTurbo(this, 105, 193, textureX, textureY); // Box 682
		bodyModel[21] = new ModelRendererTurbo(this, 273, 225, textureX, textureY); // Box 683
		bodyModel[22] = new ModelRendererTurbo(this, 385, 225, textureX, textureY); // Box 684
		bodyModel[23] = new ModelRendererTurbo(this, 385, 217, textureX, textureY); // Box 685
		bodyModel[24] = new ModelRendererTurbo(this, 241, 225, textureX, textureY); // Box 686
		bodyModel[25] = new ModelRendererTurbo(this, 289, 225, textureX, textureY); // Box 687
		bodyModel[26] = new ModelRendererTurbo(this, 409, 225, textureX, textureY); // Box 688
		bodyModel[27] = new ModelRendererTurbo(this, 9, 193, textureX, textureY); // Box 689
		bodyModel[28] = new ModelRendererTurbo(this, 25, 193, textureX, textureY); // Box 690
		bodyModel[29] = new ModelRendererTurbo(this, 9, 201, textureX, textureY); // Box 691
		bodyModel[30] = new ModelRendererTurbo(this, 73, 201, textureX, textureY); // Box 692
		bodyModel[31] = new ModelRendererTurbo(this, 417, 225, textureX, textureY); // Box 693
		bodyModel[32] = new ModelRendererTurbo(this, 441, 225, textureX, textureY); // Box 694
		bodyModel[33] = new ModelRendererTurbo(this, 161, 233, textureX, textureY); // Box 695
		bodyModel[34] = new ModelRendererTurbo(this, 97, 217, textureX, textureY); // Box 696
		bodyModel[35] = new ModelRendererTurbo(this, 305, 233, textureX, textureY); // Box 697
		bodyModel[36] = new ModelRendererTurbo(this, 337, 233, textureX, textureY); // Box 698
		bodyModel[37] = new ModelRendererTurbo(this, 505, 225, textureX, textureY); // Box 699
		bodyModel[38] = new ModelRendererTurbo(this, 129, 233, textureX, textureY); // Box 700
		bodyModel[39] = new ModelRendererTurbo(this, 129, 225, textureX, textureY); // Box 701
		bodyModel[40] = new ModelRendererTurbo(this, 177, 233, textureX, textureY); // Box 702
		bodyModel[41] = new ModelRendererTurbo(this, 193, 233, textureX, textureY); // Box 703
		bodyModel[42] = new ModelRendererTurbo(this, 105, 201, textureX, textureY); // Box 704
		bodyModel[43] = new ModelRendererTurbo(this, 385, 201, textureX, textureY); // Box 705
		bodyModel[44] = new ModelRendererTurbo(this, 449, 217, textureX, textureY); // Box 706
		bodyModel[45] = new ModelRendererTurbo(this, 465, 217, textureX, textureY); // Box 707
		bodyModel[46] = new ModelRendererTurbo(this, 321, 241, textureX, textureY); // Box 731
		bodyModel[47] = new ModelRendererTurbo(this, 369, 241, textureX, textureY); // Box 733

		bodyModel[0].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 9
		bodyModel[0].setRotationPoint(7F, 7F, 5.75F);

		bodyModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 39
		bodyModel[1].setRotationPoint(7F, 7F, -5.95F);

		bodyModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 550
		bodyModel[2].setRotationPoint(-7F, 7F, -5.95F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 551
		bodyModel[3].setRotationPoint(-7F, 7F, 5.75F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[4].setRotationPoint(6F, 6F, -8.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[5].setRotationPoint(-8F, 6F, -8.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 18, 2, 2, 0F); // Box 668
		bodyModel[6].setRotationPoint(-9F, 3.5F, -8F);

		bodyModel[7].addBox(0F, 0F, 0F, 12, 1, 2, 0F); // Box 669
		bodyModel[7].setRotationPoint(-6F, 5.5F, -8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 670
		bodyModel[8].setRotationPoint(-10F, 3.5F, -8F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 671
		bodyModel[9].setRotationPoint(-10F, 5.5F, -8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 672
		bodyModel[10].setRotationPoint(-1F, 6.5F, -8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 673
		bodyModel[11].setRotationPoint(-11F, 5.5F, -8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 674
		bodyModel[12].setRotationPoint(-10F, 6.5F, -8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 675
		bodyModel[13].setRotationPoint(-6F, 6.5F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 676
		bodyModel[14].setRotationPoint(-8F, 5.5F, -9F);

		bodyModel[15].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 677
		bodyModel[15].setRotationPoint(-8F, 8.5F, -8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 678
		bodyModel[16].setRotationPoint(6F, 5.5F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 679
		bodyModel[17].setRotationPoint(8F, 6.5F, -8F);

		bodyModel[18].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 680
		bodyModel[18].setRotationPoint(6F, 8.5F, -8F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 681
		bodyModel[19].setRotationPoint(4F, 6.5F, -8F);

		bodyModel[20].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 682
		bodyModel[20].setRotationPoint(8F, 5.5F, -8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 683
		bodyModel[21].setRotationPoint(9F, 3.5F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 684
		bodyModel[22].setRotationPoint(10F, 5.5F, -8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 685
		bodyModel[23].setRotationPoint(10F, 6.5F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 686
		bodyModel[24].setRotationPoint(-11F, 6.5F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 687
		bodyModel[25].setRotationPoint(-11F, 6.5F, 6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 688
		bodyModel[26].setRotationPoint(10F, 6.5F, 6F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 689
		bodyModel[27].setRotationPoint(-5F, 6.5F, -7.75F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 690
		bodyModel[28].setRotationPoint(1F, 6.5F, -7.75F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 691
		bodyModel[29].setRotationPoint(-5F, 6.5F, 7.75F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 692
		bodyModel[30].setRotationPoint(1F, 6.5F, 7.75F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 693
		bodyModel[31].setRotationPoint(-1F, 6.5F, 6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 694
		bodyModel[32].setRotationPoint(-10F, 6.5F, 6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 695
		bodyModel[33].setRotationPoint(-6F, 6.5F, 6F);

		bodyModel[34].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 696
		bodyModel[34].setRotationPoint(-10F, 5.5F, 6F);

		bodyModel[35].addBox(0F, 0F, 0F, 12, 1, 2, 0F); // Box 697
		bodyModel[35].setRotationPoint(-6F, 5.5F, 6F);

		bodyModel[36].addBox(0F, 0F, 0F, 18, 2, 2, 0F); // Box 698
		bodyModel[36].setRotationPoint(-9F, 3.5F, 6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 699
		bodyModel[37].setRotationPoint(-10F, 3.5F, 6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 700
		bodyModel[38].setRotationPoint(9F, 3.5F, 6F);

		bodyModel[39].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 701
		bodyModel[39].setRotationPoint(8F, 5.5F, 6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 702
		bodyModel[40].setRotationPoint(8F, 6.5F, 6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 703
		bodyModel[41].setRotationPoint(4F, 6.5F, 6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 704
		bodyModel[42].setRotationPoint(6F, 5.5F, 8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 705
		bodyModel[43].setRotationPoint(-8F, 5.5F, 8F);

		bodyModel[44].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 706
		bodyModel[44].setRotationPoint(-8F, 8.5F, 6F);

		bodyModel[45].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 707
		bodyModel[45].setRotationPoint(6F, 8.5F, 6F);

		bodyModel[46].addBox(0F, 0F, 0F, 6, 1, 12, 0F); // Box 731
		bodyModel[46].setRotationPoint(-3F, 3.5F, -6F);

		bodyModel[47].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 733
		bodyModel[47].setRotationPoint(-1F, 3F, -1F);
	}
}