//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 25.02.2020 - 21:53:08
// Last changed on: 25.02.2020 - 21:53:08

package wwcp.client.render.rollingstock.freight; //Path where the model is located

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import wwcp.client.render.rollingstock.bogies.EUBogies.SGGNSBogie;
import wwcp.common.library.Info;

public class SGGNS60 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public SGGNS60() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[101];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 147
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 148
		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 149
		bodyModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 150
		bodyModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 151
		bodyModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 152
		bodyModel[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 154
		bodyModel[7] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 200
		bodyModel[8] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 201
		bodyModel[9] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 202
		bodyModel[10] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 203
		bodyModel[11] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 204
		bodyModel[12] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 25
		bodyModel[20] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 26
		bodyModel[21] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 27
		bodyModel[22] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 28
		bodyModel[23] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 29
		bodyModel[24] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 155
		bodyModel[25] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 80
		bodyModel[26] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 82
		bodyModel[27] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 36
		bodyModel[28] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 37
		bodyModel[29] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 38
		bodyModel[30] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 39
		bodyModel[31] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 40
		bodyModel[32] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 41
		bodyModel[33] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 42
		bodyModel[34] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box22
		bodyModel[35] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box25
		bodyModel[36] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box26
		bodyModel[37] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 158
		bodyModel[38] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 159
		bodyModel[39] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 160
		bodyModel[40] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 161
		bodyModel[41] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 162
		bodyModel[42] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 163
		bodyModel[43] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 164
		bodyModel[44] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 190
		bodyModel[45] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 191
		bodyModel[46] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 192
		bodyModel[47] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 193
		bodyModel[48] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 194
		bodyModel[49] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 195
		bodyModel[50] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 196
		bodyModel[51] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 197
		bodyModel[52] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 198
		bodyModel[53] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 199
		bodyModel[54] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 63
		bodyModel[55] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 64
		bodyModel[56] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 65
		bodyModel[57] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 66
		bodyModel[58] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 67
		bodyModel[59] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 68
		bodyModel[60] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box30
		bodyModel[61] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box33
		bodyModel[62] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box42
		bodyModel[63] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box43
		bodyModel[64] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 165
		bodyModel[65] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 166
		bodyModel[66] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 167
		bodyModel[67] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 168
		bodyModel[68] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 169
		bodyModel[69] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 170
		bodyModel[70] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 171
		bodyModel[71] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 172
		bodyModel[72] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 173
		bodyModel[73] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 174
		bodyModel[74] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 175
		bodyModel[75] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 176
		bodyModel[76] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 177
		bodyModel[77] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 178
		bodyModel[78] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 179
		bodyModel[79] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 180
		bodyModel[80] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 182
		bodyModel[81] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 183
		bodyModel[82] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 184
		bodyModel[83] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 185
		bodyModel[84] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 186
		bodyModel[85] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 187
		bodyModel[86] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 189
		bodyModel[87] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 96
		bodyModel[88] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 97
		bodyModel[89] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 98
		bodyModel[90] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 99
		bodyModel[91] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 100
		bodyModel[92] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 101
		bodyModel[93] = new ModelRendererTurbo(this, 311, 66, textureX, textureY); // Box 5
		bodyModel[94] = new ModelRendererTurbo(this, 4, 67, textureX, textureY); // Box 94
		bodyModel[95] = new ModelRendererTurbo(this, 154, 67, textureX, textureY); // Box 96
		bodyModel[96] = new ModelRendererTurbo(this, 155, 156, textureX, textureY); // Box 94
		bodyModel[97] = new ModelRendererTurbo(this, 4, 110, textureX, textureY); // Box 5
		bodyModel[98] = new ModelRendererTurbo(this, 254, 110, textureX, textureY); // Box 5
		bodyModel[99] = new ModelRendererTurbo(this, 311, 156, textureX, textureY); // Box 5
		bodyModel[100] = new ModelRendererTurbo(this, 4, 156, textureX, textureY); // Box 94

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 147
		bodyModel[0].setRotationPoint(72.75F, 1.5F, -9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 148
		bodyModel[1].setRotationPoint(73.75F, 1.5F, -9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.7F, 1.1F, -1.3F, 0.7F, 0.9F, -1.3F, 0.7F, -0.1F, 0F, 0.7F, 0.1F, 0F, -0.3F, 1.1F, -1.3F, -0.3F, 0.9F, -1.3F, -0.3F, -0.1F, 0F, -0.3F, 0.1F); // Box 149
		bodyModel[2].setRotationPoint(75.75F, 1.5F, -9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 150
		bodyModel[3].setRotationPoint(72.75F, 1.5F, 8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 151
		bodyModel[4].setRotationPoint(73.75F, 1.5F, 8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.7F, 0.1F, -1.3F, 0.7F, -0.1F, -1.3F, 0.7F, 0.9F, 0F, 0.7F, 1.1F, 0F, -0.3F, 0.1F, -1.3F, -0.3F, -0.1F, -1.3F, -0.3F, 0.9F, 0F, -0.3F, 1.1F); // Box 152
		bodyModel[5].setRotationPoint(75.75F, 1.5F, 7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 72, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[6].setRotationPoint(-72.75F, 1F, -11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F); // Box 200
		bodyModel[7].setRotationPoint(71.75F, -7.5F, -10.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, 0F, -0.4F, 0.6F, 0F, -0.4F, 0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.8F, -0.4F, 0.6F, -0.8F, -0.4F, 0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F); // Box 201
		bodyModel[8].setRotationPoint(71.75F, -3F, -10.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F); // Box 202
		bodyModel[9].setRotationPoint(72.75F, -7.5F, -10.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.2F, -0.4F, 0.6F, 0.2F, -0.4F, 0.6F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F, -1F, -0.4F, 0.6F, -1F, -0.4F, 0.6F, -1F, -0.4F, -0.4F, -1F, -0.4F); // Box 203
		bodyModel[10].setRotationPoint(71.75F, -7.5F, -10.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 2, 20, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[11].setRotationPoint(69.75F, 0.5F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 14
		bodyModel[12].setRotationPoint(-73.75F, 1.5F, -9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 15
		bodyModel[13].setRotationPoint(-75.75F, 1.5F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1.3F, 0.7F, 0.9F, 0F, 0.7F, 1.1F, 0F, 0.7F, 0.1F, -1.3F, 0.7F, -0.1F, -1.3F, -0.3F, 0.9F, 0F, -0.3F, 1.1F, 0F, -0.3F, 0.1F, -1.3F, -0.3F, -0.1F); // Box 16
		bodyModel[14].setRotationPoint(-77.75F, 1.5F, -9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 17
		bodyModel[15].setRotationPoint(-73.75F, 1.5F, 8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 18
		bodyModel[16].setRotationPoint(-75.75F, 1.5F, 8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1.3F, 0.7F, -0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 1.1F, -1.3F, 0.7F, 0.9F, -1.3F, -0.3F, -0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 1.1F, -1.3F, -0.3F, 0.9F); // Box 19
		bodyModel[17].setRotationPoint(-77.75F, 1.5F, 7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 2, 20, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[18].setRotationPoint(-72.75F, 0.5F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 72, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[19].setRotationPoint(0.75F, 1F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[20].setRotationPoint(-0.75F, 1F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 72, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[21].setRotationPoint(-72.75F, 1F, 10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 72, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[22].setRotationPoint(0.75F, 1F, 10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[23].setRotationPoint(-0.75F, 1F, 10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 26, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 155
		bodyModel[24].setRotationPoint(-26.75F, 3F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F); // Box 80
		bodyModel[25].setRotationPoint(-38.75F, 3F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F); // Box 82
		bodyModel[26].setRotationPoint(26.75F, 3F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 26, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 36
		bodyModel[27].setRotationPoint(0.75F, 3F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 37
		bodyModel[28].setRotationPoint(-0.75F, 3F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 26, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[29].setRotationPoint(-26.75F, 3F, 10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F); // Box 39
		bodyModel[30].setRotationPoint(-38.75F, 3F, 10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F); // Box 40
		bodyModel[31].setRotationPoint(26.75F, 3F, 10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 26, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[32].setRotationPoint(0.75F, 3F, 10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 42
		bodyModel[33].setRotationPoint(-0.75F, 3F, 10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box22
		bodyModel[34].setRotationPoint(-44F, 0.5F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,3F, -0.5F, 0F, -4F, -0.5F, 2F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 3F, 0F, 0F, -4F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F); // Box25
		bodyModel[35].setRotationPoint(-40F, 0.5F, 4F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -0.5F, 0F, 1F, -0.5F, 0F, -4F, -0.5F, 2F, 3F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 2F, 3F, 0F, 0F); // Box26
		bodyModel[36].setRotationPoint(-40F, 0.5F, -10F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 2, 20, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[37].setRotationPoint(-57F, 0.5F, -10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[38].setRotationPoint(-69F, 0.5F, -8.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[39].setRotationPoint(-69F, 0.5F, -2.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[40].setRotationPoint(-69F, 0.5F, 4.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[41].setRotationPoint(-54F, 0.5F, -2.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[42].setRotationPoint(-54F, 0.5F, -8.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[43].setRotationPoint(-54F, 0.5F, 4.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,1F, -0.5F, 0F, 0F, -0.5F, 0F, 3F, -0.5F, 0F, -4F, -0.5F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 2F); // Box 190
		bodyModel[44].setRotationPoint(39F, 0.5F, -10F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[45].setRotationPoint(43F, 0.5F, -10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-4F, -0.5F, 2F, 3F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, -4F, 0F, 2F, 3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 192
		bodyModel[46].setRotationPoint(39F, 0.5F, 4F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[47].setRotationPoint(44F, 0.5F, -2.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[48].setRotationPoint(44F, 0.5F, 4.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 2, 20, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[49].setRotationPoint(54F, 0.5F, -10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[50].setRotationPoint(44F, 0.5F, -8.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[51].setRotationPoint(57F, 0.5F, -8.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[52].setRotationPoint(57F, 0.5F, -2.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[53].setRotationPoint(57F, 0.5F, 4.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 63
		bodyModel[54].setRotationPoint(-70F, 0.5F, -8.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 64
		bodyModel[55].setRotationPoint(-70F, 0.5F, -2.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 65
		bodyModel[56].setRotationPoint(-70F, 0.5F, 4.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[57].setRotationPoint(69F, 0.5F, -8.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[58].setRotationPoint(69F, 0.5F, -2.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[59].setRotationPoint(69F, 0.5F, 4.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box30
		bodyModel[60].setRotationPoint(-21F, 1.5F, -10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box33
		bodyModel[61].setRotationPoint(-20F, 1.5F, -3F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box42
		bodyModel[62].setRotationPoint(-21F, 2.5F, 3F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box43
		bodyModel[63].setRotationPoint(-21F, 2.5F, -10F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 165
		bodyModel[64].setRotationPoint(-21.25F, 2.5F, -3F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 166
		bodyModel[65].setRotationPoint(-21.25F, 2.5F, 2F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[66].setRotationPoint(-11.5F, 2.5F, -10F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[67].setRotationPoint(-11.5F, 2.5F, 3F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 169
		bodyModel[68].setRotationPoint(-11.5F, 1.5F, -10F);

		bodyModel[69].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 170
		bodyModel[69].setRotationPoint(-10.5F, 1.5F, -3F);

		bodyModel[70].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 171
		bodyModel[70].setRotationPoint(-10.5F, 1.5F, 2F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[71].setRotationPoint(-0.5F, 2.5F, -10F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 173
		bodyModel[72].setRotationPoint(-0.5F, 2.5F, 3F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 174
		bodyModel[73].setRotationPoint(-0.5F, 1.5F, -10F);

		bodyModel[74].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 175
		bodyModel[74].setRotationPoint(0.5F, 1.5F, -3F);

		bodyModel[75].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 176
		bodyModel[75].setRotationPoint(0.5F, 1.5F, 2F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[76].setRotationPoint(10.5F, 2.5F, -10F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 178
		bodyModel[77].setRotationPoint(10.5F, 2.5F, 3F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 179
		bodyModel[78].setRotationPoint(10.5F, 1.5F, -10F);

		bodyModel[79].addBox(0F, 0F, 0F, 9, 1, 6, 0F); // Box 180
		bodyModel[79].setRotationPoint(11.5F, 1.5F, -3F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 182
		bodyModel[80].setRotationPoint(20.5F, 2.5F, 3F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[81].setRotationPoint(20.5F, 2.5F, -10F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 184
		bodyModel[82].setRotationPoint(20.5F, 1.5F, -10F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[83].setRotationPoint(-10.5F, 1.5F, -2F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 186
		bodyModel[84].setRotationPoint(2.75F, 1.5F, -2F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 187
		bodyModel[85].setRotationPoint(2.75F, 1.5F, -10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 189
		bodyModel[86].setRotationPoint(2.75F, 1.5F, 3F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F); // Box 96
		bodyModel[87].setRotationPoint(20.5F, 2.5F, 11F);

		bodyModel[88].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,-2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F); // Box 97
		bodyModel[88].setRotationPoint(21F, 3F, 11.25F);
		bodyModel[88].rotateAngleZ = 0.71558499F;

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, 0.6F, 0F, -0.4F, 0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0.6F, -0.8F, -0.4F); // Box 98
		bodyModel[89].setRotationPoint(-72.75F, -3F, 9.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F); // Box 99
		bodyModel[90].setRotationPoint(-73.75F, -7.5F, 9.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F); // Box 100
		bodyModel[91].setRotationPoint(-72.75F, -7.5F, 9.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.6F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F, 0.6F, 0.2F, -0.4F, 0.6F, -1F, -0.4F, -0.4F, -1F, -0.4F, -0.4F, -1F, -0.4F, 0.6F, -1F, -0.4F); // Box 101
		bodyModel[92].setRotationPoint(-72.75F, -7.5F, 9.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 51, 20, 20, 0F,-1.75F, 0.2F, 0F, -1.75F, 0.2F, 0F, -1.75F, 0.2F, 0F, -1.75F, 0.2F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F); // Box 5
		bodyModel[93].setRotationPoint(-73F, -18.5F, -10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 51, 20, 20, 0F,-1.75F, 0.2F, 0F, -1.75F, 0.2F, 0F, -1.75F, 0.2F, 0F, -1.75F, 0.2F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F); // Box 94
		bodyModel[94].setRotationPoint(22F, -18.5F, -10F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 51, 20, 20, 0F,-1.75F, 0.2F, 0F, -1.75F, 0.2F, 0F, -1.75F, 0.2F, 0F, -1.75F, 0.2F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F); // Box 96
		bodyModel[95].setRotationPoint(-25.5F, -18.5F, -10F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 51, 20, 20, 0F,-1.75F, 0.2F, 0F, -1.75F, 0.2F, 0F, -1.75F, 0.2F, 0F, -1.75F, 0.2F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F); // Box 94
		bodyModel[96].setRotationPoint(22F, -18.5F, -10F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 102, 20, 20, 0F,-3.5F, 0.2F, 0F, -3.5F, 0.2F, 0F, -3.5F, 0.2F, 0F, -3.5F, 0.2F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 5
		bodyModel[97].setRotationPoint(-74.75F, -18.5F, -10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 102, 20, 20, 0F,-3.5F, 0.2F, 0F, -3.5F, 0.2F, 0F, -3.5F, 0.2F, 0F, -3.5F, 0.2F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 5
		bodyModel[98].setRotationPoint(-51F, -18.5F, -10F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 51, 20, 20, 0F,-1.75F, 0.2F, 0F, -1.75F, 0.2F, 0F, -1.75F, 0.2F, 0F, -1.75F, 0.2F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F); // Box 5
		bodyModel[99].setRotationPoint(-57.75F, -18.5F, -10F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 51, 20, 20, 0F,-1.75F, 0.2F, 0F, -1.75F, 0.2F, 0F, -1.75F, 0.2F, 0F, -1.75F, 0.2F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F); // Box 94
		bodyModel[100].setRotationPoint(6.75F, -18.5F, -10F);
	}

	SGGNSBogie bogie = new SGGNSBogie();


	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);

		Tessellator.bindTexture(new ResourceLocation(Info.modID, "textures/bogies/EUBogies/SGNSSBogie.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(3.5f,0f,0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		Tessellator.bindTexture(new ResourceLocation(Info.modID, "textures/bogies/EUBogies/SGNSSBogie.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(-3.5f,0f,0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}