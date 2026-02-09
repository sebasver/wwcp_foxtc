//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 02.02.2020 - 12:42:42
// Last changed on: 02.02.2020 - 12:42:42

package wwcp.client.render.rollingstock.bogies.EUBogies; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class TaurusBogieFront extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public TaurusBogieFront() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[96];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 27
		bodyModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 69
		bodyModel[3] = new ModelRendererTurbo(this, 488, 31, textureX, textureY); // Box 74
		bodyModel[4] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 15
		bodyModel[5] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 20
		bodyModel[6] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 21
		bodyModel[7] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 23
		bodyModel[8] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 24
		bodyModel[9] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 25
		bodyModel[10] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 31
		bodyModel[11] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 32
		bodyModel[12] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 266
		bodyModel[13] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 35
		bodyModel[14] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 36
		bodyModel[15] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 37
		bodyModel[16] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 48
		bodyModel[17] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 49
		bodyModel[18] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 50
		bodyModel[19] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 51
		bodyModel[20] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 52
		bodyModel[21] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 53
		bodyModel[22] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 54
		bodyModel[23] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 55
		bodyModel[24] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 56
		bodyModel[25] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 57
		bodyModel[26] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 58
		bodyModel[27] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 59
		bodyModel[28] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 60
		bodyModel[29] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 61
		bodyModel[30] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 62
		bodyModel[31] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 63
		bodyModel[32] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 64
		bodyModel[33] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 65
		bodyModel[34] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 66
		bodyModel[35] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 67
		bodyModel[36] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 68
		bodyModel[37] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 69
		bodyModel[38] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 70
		bodyModel[39] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 71
		bodyModel[40] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 92
		bodyModel[41] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 93
		bodyModel[42] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 94
		bodyModel[43] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 95
		bodyModel[44] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 96
		bodyModel[45] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 97
		bodyModel[46] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 98
		bodyModel[47] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 99
		bodyModel[48] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 100
		bodyModel[49] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 101
		bodyModel[50] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 102
		bodyModel[51] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 103
		bodyModel[52] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 104
		bodyModel[53] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 105
		bodyModel[54] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 108
		bodyModel[55] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 109
		bodyModel[56] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 110
		bodyModel[57] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 111
		bodyModel[58] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 113
		bodyModel[59] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 114
		bodyModel[60] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 115
		bodyModel[61] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 116
		bodyModel[62] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 117
		bodyModel[63] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 118
		bodyModel[64] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 119
		bodyModel[65] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 120
		bodyModel[66] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 121
		bodyModel[67] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 122
		bodyModel[68] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 70
		bodyModel[69] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 71
		bodyModel[70] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 72
		bodyModel[71] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 73
		bodyModel[72] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 74
		bodyModel[73] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 75
		bodyModel[74] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 129
		bodyModel[75] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 130
		bodyModel[76] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 131
		bodyModel[77] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 132
		bodyModel[78] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 133
		bodyModel[79] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 134
		bodyModel[80] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 135
		bodyModel[81] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 136
		bodyModel[82] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 137
		bodyModel[83] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 138
		bodyModel[84] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 139
		bodyModel[85] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 140
		bodyModel[86] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 141
		bodyModel[87] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 142
		bodyModel[88] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 143
		bodyModel[89] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 144
		bodyModel[90] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 145
		bodyModel[91] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 146
		bodyModel[92] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 147
		bodyModel[93] = new ModelRendererTurbo(this, 488, 31, textureX, textureY); // Box 143
		bodyModel[94] = new ModelRendererTurbo(this, 488, 31, textureX, textureY); // Box 144
		bodyModel[95] = new ModelRendererTurbo(this, 488, 31, textureX, textureY); // Box 145

		bodyModel[0].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 15
		bodyModel[0].setRotationPoint(-19F, 1.5F, -8F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		bodyModel[1].setRotationPoint(-12.5F, 5F, -8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[2].setRotationPoint(-0.5F, -1.75F, -8.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 15, 2, 0F,0F, -5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5F, 0F, 0F, -5.25F, 0F, 0F, -4.75F, 0F, 0F, -4.75F, 0F, 0F, -5.25F, 0F); // Box 74
		bodyModel[3].setRotationPoint(-1F, -6.75F, -9F);

		bodyModel[4].addShapeBox(-5.5F, -5.5F, 0F, 11, 11, 0, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 15
		bodyModel[4].setRotationPoint(-12F, 5.5F, -5.45F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 20
		bodyModel[5].setRotationPoint(-19F, 1F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 8, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 21
		bodyModel[6].setRotationPoint(-4F, 3.5F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, -1F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F); // Box 23
		bodyModel[7].setRotationPoint(-6F, 1.5F, -8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 24
		bodyModel[8].setRotationPoint(-8F, 3F, -8F);

		bodyModel[9].addShapeBox(0F, 1F, 0F, 1, 4, 2, 0F,0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -2F, 0.5F, 0F); // Box 25
		bodyModel[9].setRotationPoint(-6F, 1.5F, -8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[10].setRotationPoint(-19F, 3F, -8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[11].setRotationPoint(-21F, 8F, -6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 266
		bodyModel[12].setRotationPoint(-15.5F, 4.5F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -2.5F, -0.75F, 0F); // Box 35
		bodyModel[13].setRotationPoint(-15.5F, 5F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -2.5F, -0.75F, 0F, -2.5F, -0.75F, 0F, -0.5F, -0.75F, 0F); // Box 36
		bodyModel[14].setRotationPoint(-12.5F, 5F, -7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 37
		bodyModel[15].setRotationPoint(-12.5F, 4.5F, -7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[16].setRotationPoint(-0.5F, -1.75F, -5.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[17].setRotationPoint(-1.5F, 3.5F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[18].setRotationPoint(0.5F, 3.5F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[19].setRotationPoint(-0.5F, 3.5F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[20].setRotationPoint(-19F, 1F, -6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[21].setRotationPoint(-21F, 8F, -4F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 54
		bodyModel[22].setRotationPoint(-19F, 1.5F, 6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 55
		bodyModel[23].setRotationPoint(-19F, 1F, 6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 8, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 56
		bodyModel[24].setRotationPoint(-4F, 3.5F, -5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, -1F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F); // Box 57
		bodyModel[25].setRotationPoint(-6F, 1.5F, 6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 58
		bodyModel[26].setRotationPoint(-8F, 3F, 6F);

		bodyModel[27].addShapeBox(0F, 1F, 0F, 1, 4, 2, 0F,0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -2F, 0.5F, 0F); // Box 59
		bodyModel[27].setRotationPoint(-6F, 1.5F, 6F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[28].setRotationPoint(-19F, 3F, 4F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 61
		bodyModel[29].setRotationPoint(-21F, 8F, 4F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 62
		bodyModel[30].setRotationPoint(-15.5F, 4.5F, 6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -2.5F, -0.75F, 0F); // Box 63
		bodyModel[31].setRotationPoint(-15.5F, 5F, 6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -2.5F, -0.75F, 0F, -2.5F, -0.75F, 0F, -0.5F, -0.75F, 0F); // Box 64
		bodyModel[32].setRotationPoint(-12.5F, 5F, 6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 65
		bodyModel[33].setRotationPoint(-12.5F, 4.5F, 6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 66
		bodyModel[34].setRotationPoint(-1.5F, 3.5F, 8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 67
		bodyModel[35].setRotationPoint(0.5F, 3.5F, 8F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[36].setRotationPoint(-0.5F, 3.5F, 8F);

		bodyModel[37].addShapeBox(-5.5F, -5.5F, 0F, 11, 11, 0, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 69
		bodyModel[37].setRotationPoint(-12F, 5.5F, 5.45F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 70
		bodyModel[38].setRotationPoint(-20F, 1F, -6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[39].setRotationPoint(-0.5F, -1.75F, 7.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[40].setRotationPoint(-0.5F, -1.75F, 4.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 93
		bodyModel[41].setRotationPoint(6F, 3F, -8F);

		bodyModel[42].addShapeBox(0F, 1F, 0F, 1, 4, 2, 0F,-1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 1F, -1F, 0F); // Box 94
		bodyModel[42].setRotationPoint(5F, 1.5F, -8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-2F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F); // Box 95
		bodyModel[43].setRotationPoint(4F, 1.5F, -8F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 96
		bodyModel[44].setRotationPoint(6F, 1.5F, -8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 97
		bodyModel[45].setRotationPoint(6F, 1F, -8F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[46].setRotationPoint(17F, 3F, -8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 99
		bodyModel[47].setRotationPoint(11.5F, 4.5F, -7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -2.5F, -0.75F, 0F, -2.5F, -0.75F, 0F, -0.5F, -0.75F, 0F); // Box 100
		bodyModel[48].setRotationPoint(11.5F, 5F, -7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -2.5F, -0.75F, 0F); // Box 101
		bodyModel[49].setRotationPoint(8.5F, 5F, -7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 102
		bodyModel[50].setRotationPoint(8.5F, 4.5F, -7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[51].setRotationPoint(11.5F, 5F, -8F);

		bodyModel[52].addShapeBox(-5.5F, -5.5F, 0F, 11, 11, 0, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 104
		bodyModel[52].setRotationPoint(12F, 5.5F, -5.45F);

		bodyModel[53].addShapeBox(-5.5F, -5.5F, 0F, 11, 11, 0, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 105
		bodyModel[53].setRotationPoint(12F, 5.5F, 5.45F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 108
		bodyModel[54].setRotationPoint(19F, 1F, -6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[55].setRotationPoint(17F, 1F, -6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 110
		bodyModel[56].setRotationPoint(6F, 1.5F, 6F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[57].setRotationPoint(17F, 3F, 4F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
		bodyModel[58].setRotationPoint(6F, 1F, 6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-2F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F); // Box 114
		bodyModel[59].setRotationPoint(4F, 1.5F, 6F);

		bodyModel[60].addShapeBox(0F, 1F, 0F, 1, 4, 2, 0F,-1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 1F, -1F, 0F); // Box 115
		bodyModel[60].setRotationPoint(5F, 1.5F, 6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 116
		bodyModel[61].setRotationPoint(6F, 3F, 6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 117
		bodyModel[62].setRotationPoint(8.5F, 4.5F, 6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -2.5F, -0.75F, 0F); // Box 118
		bodyModel[63].setRotationPoint(8.5F, 5F, 6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 119
		bodyModel[64].setRotationPoint(11.5F, 4.5F, 6F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -2.5F, -0.75F, 0F, -2.5F, -0.75F, 0F, -0.5F, -0.75F, 0F); // Box 120
		bodyModel[65].setRotationPoint(11.5F, 5F, 6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[66].setRotationPoint(17F, 5F, -4F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[67].setRotationPoint(-19F, 5F, -4F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 70
		bodyModel[68].setRotationPoint(-14F, 2.5F, -7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F); // Box 71
		bodyModel[69].setRotationPoint(-14.5F, 3.6F, -7.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F); // Box 72
		bodyModel[70].setRotationPoint(-14.5F, 3.1F, -7.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F); // Box 73
		bodyModel[71].setRotationPoint(-11.5F, 3.1F, -7.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F); // Box 74
		bodyModel[72].setRotationPoint(-11.5F, 3.6F, -7.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 75
		bodyModel[73].setRotationPoint(-11F, 2.5F, -7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 129
		bodyModel[74].setRotationPoint(-14F, 2.5F, 6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F); // Box 130
		bodyModel[75].setRotationPoint(-14.5F, 3.6F, 5.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F); // Box 131
		bodyModel[76].setRotationPoint(-14.5F, 3.1F, 5.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F); // Box 132
		bodyModel[77].setRotationPoint(-11.5F, 3.1F, 5.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F); // Box 133
		bodyModel[78].setRotationPoint(-11.5F, 3.6F, 5.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 134
		bodyModel[79].setRotationPoint(-11F, 2.5F, 6F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 135
		bodyModel[80].setRotationPoint(13F, 2.5F, -7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F); // Box 136
		bodyModel[81].setRotationPoint(12.5F, 3.6F, -7.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F); // Box 137
		bodyModel[82].setRotationPoint(12.5F, 3.1F, -7.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F); // Box 138
		bodyModel[83].setRotationPoint(9.5F, 3.1F, -7.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F); // Box 139
		bodyModel[84].setRotationPoint(9.5F, 3.6F, -7.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 140
		bodyModel[85].setRotationPoint(10F, 2.5F, -7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F); // Box 141
		bodyModel[86].setRotationPoint(12.5F, 3.6F, 5.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F); // Box 142
		bodyModel[87].setRotationPoint(12.5F, 3.1F, 5.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 143
		bodyModel[88].setRotationPoint(13F, 2.5F, 6F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 144
		bodyModel[89].setRotationPoint(10F, 2.5F, 6F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F); // Box 145
		bodyModel[90].setRotationPoint(9.5F, 3.1F, 5.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F); // Box 146
		bodyModel[91].setRotationPoint(9.5F, 3.6F, 5.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 147
		bodyModel[92].setRotationPoint(-2F, -0.5F, -3F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 15, 2, 0F,0F, -5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5F, 0F, 0F, -5.25F, 0F, 0F, -4.75F, 0F, 0F, -4.75F, 0F, 0F, -5.25F, 0F); // Box 143
		bodyModel[93].setRotationPoint(-1F, -6.75F, -6F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 15, 2, 0F,0F, -5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5F, 0F, 0F, -5.25F, 0F, 0F, -4.75F, 0F, 0F, -4.75F, 0F, 0F, -5.25F, 0F); // Box 144
		bodyModel[94].setRotationPoint(-1F, -6.75F, 7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 15, 2, 0F,0F, -5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5F, 0F, 0F, -5.25F, 0F, 0F, -4.75F, 0F, 0F, -4.75F, 0F, 0F, -5.25F, 0F); // Box 145
		bodyModel[95].setRotationPoint(-1F, -6.75F, 4F);
	}
}