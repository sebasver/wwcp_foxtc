//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 24.12.2018 - 14:39:34
// Last changed on: 24.12.2018 - 14:39:34

package wwcp.client.render.rollingstock.locomotives.diesels; //Path where the model is located


import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import wwcp.client.render.rollingstock.bogies.AmericanTrucks.DofascoTruck;
import wwcp.client.render.rollingstock.bogies.AmericanTrucks.DofascoTruckR;
import wwcp.common.library.Info;

public class M630 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public M630() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[569];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 84, 433, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 113, 458, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 81, 493, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 263, 41, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 69, 49, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 111, 49, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 154, 413, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 152, 423, textureX, textureY); // Box 19
		bodyModel[16] = new ModelRendererTurbo(this, 151, 401, textureX, textureY); // Box 20
		bodyModel[17] = new ModelRendererTurbo(this, 438, 212, textureX, textureY); // Box 31
		bodyModel[18] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 32
		bodyModel[19] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 33
		bodyModel[20] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 37
		bodyModel[21] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 38
		bodyModel[22] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 39
		bodyModel[23] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 40
		bodyModel[24] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 41
		bodyModel[25] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 42
		bodyModel[26] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 49
		bodyModel[27] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 50
		bodyModel[28] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 51
		bodyModel[29] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 53
		bodyModel[30] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // box
		bodyModel[31] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // box
		bodyModel[32] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // box
		bodyModel[33] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // box
		bodyModel[34] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // box
		bodyModel[35] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 52
		bodyModel[36] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 52
		bodyModel[37] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 412
		bodyModel[38] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 413
		bodyModel[39] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 414
		bodyModel[40] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 64
		bodyModel[41] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 65
		bodyModel[42] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 66
		bodyModel[43] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 67
		bodyModel[44] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 68
		bodyModel[45] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 69
		bodyModel[46] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 70
		bodyModel[47] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 71
		bodyModel[48] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // box
		bodyModel[49] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 84
		bodyModel[50] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 85
		bodyModel[51] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 86
		bodyModel[52] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 87
		bodyModel[53] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 88
		bodyModel[54] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 89
		bodyModel[55] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 90
		bodyModel[56] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 91
		bodyModel[57] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 92
		bodyModel[58] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 95
		bodyModel[59] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 96
		bodyModel[60] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 97
		bodyModel[61] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 98
		bodyModel[62] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 102
		bodyModel[63] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 96
		bodyModel[64] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 97
		bodyModel[65] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 98
		bodyModel[66] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 99
		bodyModel[67] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 103
		bodyModel[68] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 104
		bodyModel[69] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 105
		bodyModel[70] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 110
		bodyModel[71] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 111
		bodyModel[72] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 112
		bodyModel[73] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 121
		bodyModel[74] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 122
		bodyModel[75] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 123
		bodyModel[76] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 124
		bodyModel[77] = new ModelRendererTurbo(this, 407, 249, textureX, textureY); // Box 125
		bodyModel[78] = new ModelRendererTurbo(this, 378, 89, textureX, textureY); // Box 126
		bodyModel[79] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 127
		bodyModel[80] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 128
		bodyModel[81] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 129
		bodyModel[82] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 130
		bodyModel[83] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 131
		bodyModel[84] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 132
		bodyModel[85] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 133
		bodyModel[86] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 134
		bodyModel[87] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 135
		bodyModel[88] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 136
		bodyModel[89] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 139
		bodyModel[90] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 140
		bodyModel[91] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 141
		bodyModel[92] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 142
		bodyModel[93] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 143
		bodyModel[94] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 144
		bodyModel[95] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 145
		bodyModel[96] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 146
		bodyModel[97] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 147
		bodyModel[98] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 148
		bodyModel[99] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 149
		bodyModel[100] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 150
		bodyModel[101] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 151
		bodyModel[102] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 152
		bodyModel[103] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 153
		bodyModel[104] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 154
		bodyModel[105] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 155
		bodyModel[106] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 156
		bodyModel[107] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 157
		bodyModel[108] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 158
		bodyModel[109] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 159
		bodyModel[110] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 160
		bodyModel[111] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 161
		bodyModel[112] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 162
		bodyModel[113] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 163
		bodyModel[114] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 164
		bodyModel[115] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 165
		bodyModel[116] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 166
		bodyModel[117] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 173
		bodyModel[118] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 176
		bodyModel[119] = new ModelRendererTurbo(this, 76, 123, textureX, textureY); // Box 186
		bodyModel[120] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 187
		bodyModel[121] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 188
		bodyModel[122] = new ModelRendererTurbo(this, 473, 114, textureX, textureY); // Box 194
		bodyModel[123] = new ModelRendererTurbo(this, 1, 122, textureX, textureY); // Box 195
		bodyModel[124] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 196
		bodyModel[125] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 197
		bodyModel[126] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // DFL
		bodyModel[127] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // DRR
		bodyModel[128] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 200
		bodyModel[129] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 201
		bodyModel[130] = new ModelRendererTurbo(this, 97, 130, textureX, textureY); // Box 202
		bodyModel[131] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 204
		bodyModel[132] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 205
		bodyModel[133] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 206
		bodyModel[134] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 208
		bodyModel[135] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 209
		bodyModel[136] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 72
		bodyModel[137] = new ModelRendererTurbo(this, 272, 145, textureX, textureY); // Box 211
		bodyModel[138] = new ModelRendererTurbo(this, 3, 156, textureX, textureY); // Box 212
		bodyModel[139] = new ModelRendererTurbo(this, 488, 105, textureX, textureY); // Box 213
		bodyModel[140] = new ModelRendererTurbo(this, 344, 113, textureX, textureY); // Box 214
		bodyModel[141] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 215
		bodyModel[142] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 216
		bodyModel[143] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 217
		bodyModel[144] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 218
		bodyModel[145] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 219
		bodyModel[146] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 220
		bodyModel[147] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 221
		bodyModel[148] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 222
		bodyModel[149] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 223
		bodyModel[150] = new ModelRendererTurbo(this, 33, 154, textureX, textureY); // Box 224
		bodyModel[151] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 225
		bodyModel[152] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 226
		bodyModel[153] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 655
		bodyModel[154] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 241
		bodyModel[155] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 242
		bodyModel[156] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Box 243
		bodyModel[157] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 244
		bodyModel[158] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 245
		bodyModel[159] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 246
		bodyModel[160] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 247
		bodyModel[161] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 248
		bodyModel[162] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 249
		bodyModel[163] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 250
		bodyModel[164] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 251
		bodyModel[165] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 252
		bodyModel[166] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 253
		bodyModel[167] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 254
		bodyModel[168] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 255
		bodyModel[169] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 256
		bodyModel[170] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 257
		bodyModel[171] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 258
		bodyModel[172] = new ModelRendererTurbo(this, 154, 391, textureX, textureY); // Box 259
		bodyModel[173] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 260
		bodyModel[174] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 261
		bodyModel[175] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 262
		bodyModel[176] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 263
		bodyModel[177] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Box 264
		bodyModel[178] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 265
		bodyModel[179] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 266
		bodyModel[180] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Box 267
		bodyModel[181] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 268
		bodyModel[182] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 269
		bodyModel[183] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 270
		bodyModel[184] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 271
		bodyModel[185] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 272
		bodyModel[186] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 273
		bodyModel[187] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 274
		bodyModel[188] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 278
		bodyModel[189] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 282
		bodyModel[190] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 284
		bodyModel[191] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 285
		bodyModel[192] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 286
		bodyModel[193] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 287
		bodyModel[194] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 288
		bodyModel[195] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 290
		bodyModel[196] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 291
		bodyModel[197] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 292
		bodyModel[198] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Box 293
		bodyModel[199] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 294
		bodyModel[200] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 295
		bodyModel[201] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 296
		bodyModel[202] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 297
		bodyModel[203] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 298
		bodyModel[204] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 299
		bodyModel[205] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 300
		bodyModel[206] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Box 301
		bodyModel[207] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 302
		bodyModel[208] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 303
		bodyModel[209] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Box 304
		bodyModel[210] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 305
		bodyModel[211] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 306
		bodyModel[212] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Box 307
		bodyModel[213] = new ModelRendererTurbo(this, 25, 153, textureX, textureY); // Box 308
		bodyModel[214] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Box 309
		bodyModel[215] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 310
		bodyModel[216] = new ModelRendererTurbo(this, 33, 153, textureX, textureY); // Box 311
		bodyModel[217] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Box 312
		bodyModel[218] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Box 313
		bodyModel[219] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Box 314
		bodyModel[220] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 315
		bodyModel[221] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 316
		bodyModel[222] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 317
		bodyModel[223] = new ModelRendererTurbo(this, 377, 153, textureX, textureY); // Box 318
		bodyModel[224] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Box 319
		bodyModel[225] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 320
		bodyModel[226] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 323
		bodyModel[227] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 324
		bodyModel[228] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 325
		bodyModel[229] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 326
		bodyModel[230] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 11
		bodyModel[231] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 11
		bodyModel[232] = new ModelRendererTurbo(this, 385, 153, textureX, textureY); // Box 11
		bodyModel[233] = new ModelRendererTurbo(this, 65, 153, textureX, textureY); // Box 11
		bodyModel[234] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Box 335
		bodyModel[235] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 336
		bodyModel[236] = new ModelRendererTurbo(this, 425, 153, textureX, textureY); // Box 337
		bodyModel[237] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Box 382
		bodyModel[238] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 339
		bodyModel[239] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Box 340
		bodyModel[240] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Box 341
		bodyModel[241] = new ModelRendererTurbo(this, 265, 153, textureX, textureY); // Box 342
		bodyModel[242] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Box 343
		bodyModel[243] = new ModelRendererTurbo(this, 89, 161, textureX, textureY); // Box 347
		bodyModel[244] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Box 348
		bodyModel[245] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 349
		bodyModel[246] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Box 350
		bodyModel[247] = new ModelRendererTurbo(this, 105, 177, textureX, textureY); // Box 351
		bodyModel[248] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Box 352
		bodyModel[249] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 353
		bodyModel[250] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // DFL
		bodyModel[251] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // DFL
		bodyModel[252] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Box 356
		bodyModel[253] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Box 357
		bodyModel[254] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 358
		bodyModel[255] = new ModelRendererTurbo(this, 361, 145, textureX, textureY); // Box 359
		bodyModel[256] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Box 360
		bodyModel[257] = new ModelRendererTurbo(this, 393, 153, textureX, textureY); // Box 361
		bodyModel[258] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Box 362
		bodyModel[259] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // DRR
		bodyModel[260] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // DRR
		bodyModel[261] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 365
		bodyModel[262] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 366
		bodyModel[263] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Box 367
		bodyModel[264] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Box 368
		bodyModel[265] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Box 369
		bodyModel[266] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Box 370
		bodyModel[267] = new ModelRendererTurbo(this, 201, 177, textureX, textureY); // Box 371
		bodyModel[268] = new ModelRendererTurbo(this, 361, 161, textureX, textureY); // Box 372
		bodyModel[269] = new ModelRendererTurbo(this, 433, 153, textureX, textureY); // Box 373
		bodyModel[270] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 374
		bodyModel[271] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Box 376
		bodyModel[272] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Box 377
		bodyModel[273] = new ModelRendererTurbo(this, 401, 161, textureX, textureY); // Box 378
		bodyModel[274] = new ModelRendererTurbo(this, 393, 161, textureX, textureY); // Box 379
		bodyModel[275] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); // Box 380
		bodyModel[276] = new ModelRendererTurbo(this, 497, 169, textureX, textureY); // FNumL
		bodyModel[277] = new ModelRendererTurbo(this, 193, 177, textureX, textureY); // FNumR
		bodyModel[278] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Box 470
		bodyModel[279] = new ModelRendererTurbo(this, 9, 161, textureX, textureY); // LMRed
		bodyModel[280] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // LMGreen
		bodyModel[281] = new ModelRendererTurbo(this, 265, 169, textureX, textureY,"lamp"); // LMWhite
		bodyModel[282] = new ModelRendererTurbo(this, 497, 169, textureX, textureY); // RMRed
		bodyModel[283] = new ModelRendererTurbo(this, 57, 177, textureX, textureY,"lamp"); // RMWhite
		bodyModel[284] = new ModelRendererTurbo(this, 97, 177, textureX, textureY); // RMGreen
		bodyModel[285] = new ModelRendererTurbo(this, 313, 177, textureX, textureY); // Box 387
		bodyModel[286] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Box 388
		bodyModel[287] = new ModelRendererTurbo(this, 345, 177, textureX, textureY); // Box 389
		bodyModel[288] = new ModelRendererTurbo(this, 361, 177, textureX, textureY); // Box 390
		bodyModel[289] = new ModelRendererTurbo(this, 377, 177, textureX, textureY); // Box 391
		bodyModel[290] = new ModelRendererTurbo(this, 105, 177, textureX, textureY); // Box 392
		bodyModel[291] = new ModelRendererTurbo(this, 193, 177, textureX, textureY); // Box 393
		bodyModel[292] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 394
		bodyModel[293] = new ModelRendererTurbo(this, 401, 177, textureX, textureY); // Box 395
		bodyModel[294] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 396
		bodyModel[295] = new ModelRendererTurbo(this, 417, 177, textureX, textureY); // Box 397
		bodyModel[296] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 398
		bodyModel[297] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Box 430
		bodyModel[298] = new ModelRendererTurbo(this, 11, 198, textureX, textureY); // Box 433
		bodyModel[299] = new ModelRendererTurbo(this, 11, 198, textureX, textureY); // Box 434
		bodyModel[300] = new ModelRendererTurbo(this, 2, 195, textureX, textureY); // Box 435
		bodyModel[301] = new ModelRendererTurbo(this, 2, 195, textureX, textureY); // Box 436
		bodyModel[302] = new ModelRendererTurbo(this, 3, 223, textureX, textureY); // Box 440
		bodyModel[303] = new ModelRendererTurbo(this, 41, 220, textureX, textureY); // Box 441
		bodyModel[304] = new ModelRendererTurbo(this, 2, 227, textureX, textureY); // Box 442
		bodyModel[305] = new ModelRendererTurbo(this, 88, 222, textureX, textureY); // Box 443
		bodyModel[306] = new ModelRendererTurbo(this, 86, 234, textureX, textureY); // Box 444
		bodyModel[307] = new ModelRendererTurbo(this, 33, 242, textureX, textureY); // Box 445
		bodyModel[308] = new ModelRendererTurbo(this, 62, 260, textureX, textureY); // Box 446
		bodyModel[309] = new ModelRendererTurbo(this, 61, 245, textureX, textureY); // Box 447
		bodyModel[310] = new ModelRendererTurbo(this, 33, 258, textureX, textureY); // Box 448
		bodyModel[311] = new ModelRendererTurbo(this, 33, 276, textureX, textureY); // Box 449
		bodyModel[312] = new ModelRendererTurbo(this, 62, 275, textureX, textureY); // Box 450
		bodyModel[313] = new ModelRendererTurbo(this, 10, 210, textureX, textureY); // Box 473
		bodyModel[314] = new ModelRendererTurbo(this, 345, 194, textureX, textureY); // Box 463
		bodyModel[315] = new ModelRendererTurbo(this, 377, 193, textureX, textureY); // Box 464
		bodyModel[316] = new ModelRendererTurbo(this, 361, 223, textureX, textureY); // Box 465
		bodyModel[317] = new ModelRendererTurbo(this, 361, 238, textureX, textureY); // Box 466
		bodyModel[318] = new ModelRendererTurbo(this, 65, 195, textureX, textureY); // Box 468
		bodyModel[319] = new ModelRendererTurbo(this, 332, 218, textureX, textureY); // Box 469
		bodyModel[320] = new ModelRendererTurbo(this, 138, 410, textureX, textureY); // Box 478
		bodyModel[321] = new ModelRendererTurbo(this, 137, 393, textureX, textureY); // Box 479
		bodyModel[322] = new ModelRendererTurbo(this, 138, 419, textureX, textureY); // Box 480
		bodyModel[323] = new ModelRendererTurbo(this, 137, 402, textureX, textureY); // Box 481
		bodyModel[324] = new ModelRendererTurbo(this, 113, 413, textureX, textureY); // Box 486
		bodyModel[325] = new ModelRendererTurbo(this, 103, 413, textureX, textureY); // Box 487
		bodyModel[326] = new ModelRendererTurbo(this, 113, 413, textureX, textureY); // Box 488
		bodyModel[327] = new ModelRendererTurbo(this, 103, 413, textureX, textureY); // Box 489
		bodyModel[328] = new ModelRendererTurbo(this, 113, 413, textureX, textureY); // Box 490
		bodyModel[329] = new ModelRendererTurbo(this, 103, 413, textureX, textureY); // Box 491
		bodyModel[330] = new ModelRendererTurbo(this, 113, 413, textureX, textureY); // Box 492
		bodyModel[331] = new ModelRendererTurbo(this, 103, 413, textureX, textureY); // Box 493
		bodyModel[332] = new ModelRendererTurbo(this, 154, 394, textureX, textureY); // Box 490
		bodyModel[333] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 491
		bodyModel[334] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 492
		bodyModel[335] = new ModelRendererTurbo(this, 189, 374, textureX, textureY); // Box 487
		bodyModel[336] = new ModelRendererTurbo(this, 408, 318, textureX, textureY); // Box 560
		bodyModel[337] = new ModelRendererTurbo(this, 393, 368, textureX, textureY); // Box 561
		bodyModel[338] = new ModelRendererTurbo(this, 377, 376, textureX, textureY); // Box 562
		bodyModel[339] = new ModelRendererTurbo(this, 408, 299, textureX, textureY); // Box 564
		bodyModel[340] = new ModelRendererTurbo(this, 355, 283, textureX, textureY); // Box 565
		bodyModel[341] = new ModelRendererTurbo(this, 370, 274, textureX, textureY); // Box 566
		bodyModel[342] = new ModelRendererTurbo(this, 2, 288, textureX, textureY); // Box 11
		bodyModel[343] = new ModelRendererTurbo(this, 7, 266, textureX, textureY); // Bell
		bodyModel[344] = new ModelRendererTurbo(this, 503, 246, textureX, textureY); // Box 150
		bodyModel[345] = new ModelRendererTurbo(this, 356, 253, textureX, textureY); // Box 11
		bodyModel[346] = new ModelRendererTurbo(this, 473, 202, textureX, textureY); // Box 11
		bodyModel[347] = new ModelRendererTurbo(this, 93, 253, textureX, textureY); // Box 11
		bodyModel[348] = new ModelRendererTurbo(this, 63, 242, textureX, textureY); // Box 11
		bodyModel[349] = new ModelRendererTurbo(this, 447, 258, textureX, textureY); // Box 543
		bodyModel[350] = new ModelRendererTurbo(this, 457, 258, textureX, textureY); // Box 544
		bodyModel[351] = new ModelRendererTurbo(this, 501, 209, textureX, textureY,"lamp"); // Box 535
		bodyModel[352] = new ModelRendererTurbo(this, 420, 210, textureX, textureY); // Box 536
		bodyModel[353] = new ModelRendererTurbo(this, 441, 247, textureX, textureY,"lamp"); // Box 537
		bodyModel[354] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Box 413
		bodyModel[355] = new ModelRendererTurbo(this, 73, 185, textureX, textureY); // Box 414
		bodyModel[356] = new ModelRendererTurbo(this, 81, 185, textureX, textureY); // Box 415
		bodyModel[357] = new ModelRendererTurbo(this, 89, 185, textureX, textureY); // Box 416
		bodyModel[358] = new ModelRendererTurbo(this, 97, 185, textureX, textureY); // Box 417
		bodyModel[359] = new ModelRendererTurbo(this, 105, 185, textureX, textureY); // Box 418
		bodyModel[360] = new ModelRendererTurbo(this, 422, 443, textureX, textureY); // Box 660
		bodyModel[361] = new ModelRendererTurbo(this, 422, 457, textureX, textureY); // Box 661
		bodyModel[362] = new ModelRendererTurbo(this, 385, 263, textureX, textureY); // Box 473
		bodyModel[363] = new ModelRendererTurbo(this, 489, 281, textureX, textureY); // Box 474
		bodyModel[364] = new ModelRendererTurbo(this, 385, 272, textureX, textureY); // Box 475
		bodyModel[365] = new ModelRendererTurbo(this, 489, 290, textureX, textureY); // Box 476
		bodyModel[366] = new ModelRendererTurbo(this, 497, 281, textureX, textureY); // Box 478
		bodyModel[367] = new ModelRendererTurbo(this, 369, 292, textureX, textureY); // Box 479
		bodyModel[368] = new ModelRendererTurbo(this, 394, 263, textureX, textureY); // Box 480
		bodyModel[369] = new ModelRendererTurbo(this, 394, 272, textureX, textureY); // Box 481
		bodyModel[370] = new ModelRendererTurbo(this, 497, 290, textureX, textureY); // Box 482
		bodyModel[371] = new ModelRendererTurbo(this, 369, 305, textureX, textureY); // Box 484
		bodyModel[372] = new ModelRendererTurbo(this, 369, 320, textureX, textureY); // Box 494
		bodyModel[373] = new ModelRendererTurbo(this, 394, 318, textureX, textureY); // Box 495
		bodyModel[374] = new ModelRendererTurbo(this, 497, 313, textureX, textureY); // Box 496
		bodyModel[375] = new ModelRendererTurbo(this, 369, 334, textureX, textureY); // Box 497
		bodyModel[376] = new ModelRendererTurbo(this, 394, 330, textureX, textureY); // Box 498
		bodyModel[377] = new ModelRendererTurbo(this, 497, 324, textureX, textureY); // Box 499
		bodyModel[378] = new ModelRendererTurbo(this, 497, 333, textureX, textureY); // Box 500
		bodyModel[379] = new ModelRendererTurbo(this, 394, 340, textureX, textureY); // Box 501
		bodyModel[380] = new ModelRendererTurbo(this, 369, 365, textureX, textureY); // Box 502
		bodyModel[381] = new ModelRendererTurbo(this, 369, 349, textureX, textureY); // Box 503
		bodyModel[382] = new ModelRendererTurbo(this, 394, 352, textureX, textureY); // Box 504
		bodyModel[383] = new ModelRendererTurbo(this, 497, 341, textureX, textureY); // Box 505
		bodyModel[384] = new ModelRendererTurbo(this, 495, 222, textureX, textureY); // Box 128
		bodyModel[385] = new ModelRendererTurbo(this, 115, 327, textureX, textureY,"lamp"); // Light_Rear_Right
		bodyModel[386] = new ModelRendererTurbo(this, 205, 217, textureX, textureY,"ditch"); // Ditchlight_Right_Bottom_ble
		bodyModel[387] = new ModelRendererTurbo(this, 209, 228, textureX, textureY); // box
		bodyModel[388] = new ModelRendererTurbo(this, 217, 217, textureX, textureY,"ditch"); // Ditchlight_Left_Bottom_ble
		bodyModel[389] = new ModelRendererTurbo(this, 225, 217, textureX, textureY); // Ditchlight_Left_Bottom_ble
		bodyModel[390] = new ModelRendererTurbo(this, 24, 222, textureX, textureY); // Box 556
		bodyModel[391] = new ModelRendererTurbo(this, 449, 423, textureX, textureY); // Box 557
		bodyModel[392] = new ModelRendererTurbo(this, 26, 281, textureX, textureY); // Box 558
		bodyModel[393] = new ModelRendererTurbo(this, 54, 292, textureX, textureY); // Box 559
		bodyModel[394] = new ModelRendererTurbo(this, 59, 311, textureX, textureY); // Box 563
		bodyModel[395] = new ModelRendererTurbo(this, 458, 479, textureX, textureY); // Box 122
		bodyModel[396] = new ModelRendererTurbo(this, 481, 473, textureX, textureY); // Box 122
		bodyModel[397] = new ModelRendererTurbo(this, 49, 189, textureX, textureY); // Box 546
		bodyModel[398] = new ModelRendererTurbo(this, 6, 459, textureX, textureY); // Box 625
		bodyModel[399] = new ModelRendererTurbo(this, 39, 459, textureX, textureY); // Box 626
		bodyModel[400] = new ModelRendererTurbo(this, 54, 443, textureX, textureY); // Box 627
		bodyModel[401] = new ModelRendererTurbo(this, 39, 460, textureX, textureY); // Box 628
		bodyModel[402] = new ModelRendererTurbo(this, 39, 452, textureX, textureY); // Box 629
		bodyModel[403] = new ModelRendererTurbo(this, 207, 249, textureX, textureY); // Box 631
		bodyModel[404] = new ModelRendererTurbo(this, 207, 249, textureX, textureY); // Box 632
		bodyModel[405] = new ModelRendererTurbo(this, 14, 332, textureX, textureY); // Box 644
		bodyModel[406] = new ModelRendererTurbo(this, 14, 345, textureX, textureY); // Box 645
		bodyModel[407] = new ModelRendererTurbo(this, 112, 423, textureX, textureY); // Box 446
		bodyModel[408] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 180
		bodyModel[409] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 181
		bodyModel[410] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 182
		bodyModel[411] = new ModelRendererTurbo(this, 12, 403, textureX, textureY); // Box 459
		bodyModel[412] = new ModelRendererTurbo(this, 12, 413, textureX, textureY); // Box 460
		bodyModel[413] = new ModelRendererTurbo(this, 12, 403, textureX, textureY); // Box 461
		bodyModel[414] = new ModelRendererTurbo(this, 12, 413, textureX, textureY); // Box 462
		bodyModel[415] = new ModelRendererTurbo(this, 12, 428, textureX, textureY); // Box 463
		bodyModel[416] = new ModelRendererTurbo(this, 12, 434, textureX, textureY); // Box 464
		bodyModel[417] = new ModelRendererTurbo(this, 12, 434, textureX, textureY); // Box 466
		bodyModel[418] = new ModelRendererTurbo(this, 12, 434, textureX, textureY); // Box 467
		bodyModel[419] = new ModelRendererTurbo(this, 12, 434, textureX, textureY); // Box 468
		bodyModel[420] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 483
		bodyModel[421] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 484
		bodyModel[422] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 485
		bodyModel[423] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 486
		bodyModel[424] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 487
		bodyModel[425] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 488
		bodyModel[426] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 489
		bodyModel[427] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 490
		bodyModel[428] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 491
		bodyModel[429] = new ModelRendererTurbo(this, 407, 214, textureX, textureY); // Box 492
		bodyModel[430] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 493
		bodyModel[431] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 494
		bodyModel[432] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 495
		bodyModel[433] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 496
		bodyModel[434] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 497
		bodyModel[435] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 498
		bodyModel[436] = new ModelRendererTurbo(this, 458, 277, textureX, textureY); // Box 482
		bodyModel[437] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 94
		bodyModel[438] = new ModelRendererTurbo(this, 192, 260, textureX, textureY); // Box 699
		bodyModel[439] = new ModelRendererTurbo(this, 423, 387, textureX, textureY); // Box 500
		bodyModel[440] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 29
		bodyModel[441] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 21
		bodyModel[442] = new ModelRendererTurbo(this, 393, 212, textureX, textureY); // Box 504
		bodyModel[443] = new ModelRendererTurbo(this, 393, 218, textureX, textureY); // Box 505
		bodyModel[444] = new ModelRendererTurbo(this, 393, 230, textureX, textureY); // Box 506
		bodyModel[445] = new ModelRendererTurbo(this, 393, 224, textureX, textureY); // Box 507
		bodyModel[446] = new ModelRendererTurbo(this, 165, 359, textureX, textureY); // Box 508
		bodyModel[447] = new ModelRendererTurbo(this, 184, 360, textureX, textureY); // Box 509
		bodyModel[448] = new ModelRendererTurbo(this, 201, 359, textureX, textureY); // Box 510
		bodyModel[449] = new ModelRendererTurbo(this, 225, 360, textureX, textureY); // Box 511
		bodyModel[450] = new ModelRendererTurbo(this, 225, 352, textureX, textureY); // Box 512
		bodyModel[451] = new ModelRendererTurbo(this, 281, 360, textureX, textureY); // Box 513
		bodyModel[452] = new ModelRendererTurbo(this, 94, 189, textureX, textureY); // Box 514
		bodyModel[453] = new ModelRendererTurbo(this, 97, 207, textureX, textureY); // Box 515
		bodyModel[454] = new ModelRendererTurbo(this, 49, 194, textureX, textureY); // Box 516
		bodyModel[455] = new ModelRendererTurbo(this, 113, 409, textureX, textureY); // Box 517
		bodyModel[456] = new ModelRendererTurbo(this, 110, 223, textureX, textureY); // Box 518
		bodyModel[457] = new ModelRendererTurbo(this, 106, 243, textureX, textureY); // Box 519
		bodyModel[458] = new ModelRendererTurbo(this, 110, 233, textureX, textureY); // Box 462
		bodyModel[459] = new ModelRendererTurbo(this, 106, 253, textureX, textureY); // Box 463
		bodyModel[460] = new ModelRendererTurbo(this, 104, 259, textureX, textureY); // Box 464
		bodyModel[461] = new ModelRendererTurbo(this, 193, 193, textureX, textureY); // Box 465
		bodyModel[462] = new ModelRendererTurbo(this, 195, 202, textureX, textureY); // Box 466
		bodyModel[463] = new ModelRendererTurbo(this, 236, 213, textureX, textureY); // Box 467
		bodyModel[464] = new ModelRendererTurbo(this, 239, 222, textureX, textureY); // Box 468
		bodyModel[465] = new ModelRendererTurbo(this, 273, 53, textureX, textureY); // Box 469
		bodyModel[466] = new ModelRendererTurbo(this, 141, 208, textureX, textureY); // Box 470
		bodyModel[467] = new ModelRendererTurbo(this, 141, 208, textureX, textureY); // Box 471
		bodyModel[468] = new ModelRendererTurbo(this, 141, 208, textureX, textureY); // Box 472
		bodyModel[469] = new ModelRendererTurbo(this, 284, 190, textureX, textureY); // Box 473
		bodyModel[470] = new ModelRendererTurbo(this, 284, 193, textureX, textureY); // Box 474
		bodyModel[471] = new ModelRendererTurbo(this, 284, 193, textureX, textureY); // Box 475
		bodyModel[472] = new ModelRendererTurbo(this, 393, 405, textureX, textureY); // Box 474
		bodyModel[473] = new ModelRendererTurbo(this, 399, 396, textureX, textureY); // Box 475
		bodyModel[474] = new ModelRendererTurbo(this, 393, 396, textureX, textureY); // Box 476
		bodyModel[475] = new ModelRendererTurbo(this, 393, 423, textureX, textureY); // Box 477
		bodyModel[476] = new ModelRendererTurbo(this, 393, 442, textureX, textureY); // Box 478
		bodyModel[477] = new ModelRendererTurbo(this, 393, 468, textureX, textureY); // Box 479
		bodyModel[478] = new ModelRendererTurbo(this, 393, 469, textureX, textureY); // Box 480
		bodyModel[479] = new ModelRendererTurbo(this, 393, 468, textureX, textureY); // Box 481
		bodyModel[480] = new ModelRendererTurbo(this, 393, 469, textureX, textureY); // Box 482
		bodyModel[481] = new ModelRendererTurbo(this, 393, 468, textureX, textureY); // Box 483
		bodyModel[482] = new ModelRendererTurbo(this, 393, 469, textureX, textureY); // Box 484
		bodyModel[483] = new ModelRendererTurbo(this, 393, 468, textureX, textureY); // Box 485
		bodyModel[484] = new ModelRendererTurbo(this, 393, 468, textureX, textureY); // Box 486
		bodyModel[485] = new ModelRendererTurbo(this, 393, 468, textureX, textureY); // Box 487
		bodyModel[486] = new ModelRendererTurbo(this, 393, 469, textureX, textureY); // Box 488
		bodyModel[487] = new ModelRendererTurbo(this, 393, 469, textureX, textureY); // Box 489
		bodyModel[488] = new ModelRendererTurbo(this, 393, 469, textureX, textureY); // Box 490
		bodyModel[489] = new ModelRendererTurbo(this, 353, 416, textureX, textureY); // Box 634
		bodyModel[490] = new ModelRendererTurbo(this, 353, 423, textureX, textureY); // Box 635
		bodyModel[491] = new ModelRendererTurbo(this, 208, 237, textureX, textureY,"ditch"); // ditch
		bodyModel[492] = new ModelRendererTurbo(this, 208, 237, textureX, textureY,"ditch"); // ditch
		bodyModel[493] = new ModelRendererTurbo(this, 438, 491, textureX, textureY); // Box 536
		bodyModel[494] = new ModelRendererTurbo(this, 464, 492, textureX, textureY); // Box 537
		bodyModel[495] = new ModelRendererTurbo(this, 429, 489, textureX, textureY); // Box 538
		bodyModel[496] = new ModelRendererTurbo(this, 438, 491, textureX, textureY); // Box 539
		bodyModel[497] = new ModelRendererTurbo(this, 464, 492, textureX, textureY); // Box 540
		bodyModel[498] = new ModelRendererTurbo(this, 92, 341, textureX, textureY); // Box 91
		bodyModel[499] = new ModelRendererTurbo(this, 441, 275, textureX, textureY); // Box 209

		bodyModel[0].addBox(0F, 0F, 0F, 126, 1, 22, 0F); // Box 1
		bodyModel[0].setRotationPoint(-63F, -2F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 105, 19, 14, 0F); // Box 2
		bodyModel[1].setRotationPoint(-41F, -21F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 138, 4, 12, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(-69F, -1.5F, -6F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 4
		bodyModel[3].setRotationPoint(-47F, 2F, -1F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 6
		bodyModel[4].setRotationPoint(45F, 2F, -1F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 48, 7, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 7
		bodyModel[5].setRotationPoint(-24F, 2.5F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 23, 4, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 8
		bodyModel[6].setRotationPoint(-22F, 4F, 9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 23, 6, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 9
		bodyModel[7].setRotationPoint(-22F, 3F, 8F);

		bodyModel[8].addBox(0F, -1.5F, -1.5F, 22, 3, 3, 0F); // Box 10
		bodyModel[8].setRotationPoint(-22F, 0.5F, -8.75F);
		bodyModel[8].rotateAngleX = -0.78539816F;

		bodyModel[9].addShapeBox(0F, 0F, 0F, 14, 6, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 11
		bodyModel[9].setRotationPoint(4F, 3F, 8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 14, 4, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 12
		bodyModel[10].setRotationPoint(4F, 4F, 9F);

		bodyModel[11].addBox(0F, -1.5F, -1.5F, 22, 3, 3, 0F); // Box 13
		bodyModel[11].setRotationPoint(4F, 0.5F, -8.75F);
		bodyModel[11].rotateAngleX = -0.78539816F;

		bodyModel[12].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 14
		bodyModel[12].setRotationPoint(0F, 0.5F, -9F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 15
		bodyModel[13].setRotationPoint(-0.5F, 2F, 10F);
		bodyModel[13].rotateAngleX = -0.78539816F;

		bodyModel[14].addBox(0F, 0F, 0F, 62, 1, 4, 0F); // Box 17
		bodyModel[14].setRotationPoint(-41F, -22.5F, -2F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 62, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 19
		bodyModel[15].setRotationPoint(-41F, -23F, 2F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 62, 1, 5, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 20
		bodyModel[16].setRotationPoint(-41F, -23F, -7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[17].setRotationPoint(42F, -23F, -2F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 32
		bodyModel[18].setRotationPoint(48.5F, -22F, -2F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 33
		bodyModel[19].setRotationPoint(54.5F, -22F, -2F);

		bodyModel[20].addBox(0F, 0F, 0F, 3, 2, 18, 0F); // Box 37
		bodyModel[20].setRotationPoint(-69F, -2F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[21].setRotationPoint(-69F, -1F, 9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[22].setRotationPoint(-66F, -1F, 9F);

		bodyModel[23].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 40
		bodyModel[23].setRotationPoint(-66F, 7F, 10F);

		bodyModel[24].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 41
		bodyModel[24].setRotationPoint(-69F, 7F, 10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 42
		bodyModel[25].setRotationPoint(-69F, 7F, 9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 49
		bodyModel[26].setRotationPoint(-69F, 4.5F, 9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 50
		bodyModel[27].setRotationPoint(-69F, 2F, 9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 51
		bodyModel[28].setRotationPoint(-69F, -0.5F, 9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 6, 18, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 53
		bodyModel[29].setRotationPoint(-69F, 0F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[30].setRotationPoint(-71F, 3.5F, -0.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // box
		bodyModel[31].setRotationPoint(-72F, 3F, -0.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[32].setRotationPoint(-72F, 3F, -1.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[33].setRotationPoint(-74F, 3F, -0.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[34].setRotationPoint(-73F, 3F, 0.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[35].setRotationPoint(-69.5F, 0.5F, -8.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[36].setRotationPoint(-69.5F, 0.5F, 1.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F); // Box 412
		bodyModel[37].setRotationPoint(-70.5F, 0.5F, -2F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 413
		bodyModel[38].setRotationPoint(-70.5F, 0.5F, 1F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 414
		bodyModel[39].setRotationPoint(-71.5F, 1.5F, -2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[40].setRotationPoint(-70F, 2.5F, -2F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[41].setRotationPoint(-71F, 3.49F, -2F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[42].setRotationPoint(-71F, 2.49F, -1F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[43].setRotationPoint(-71F, 2.49F, 0F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[44].setRotationPoint(-71F, 2.49F, 1F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[45].setRotationPoint(-71F, 4.5F, -2F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[46].setRotationPoint(-69F, 6F, -9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[47].setRotationPoint(-69F, 6F, 2F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[48].setRotationPoint(-69.25F, 2.5F, -7.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[49].setRotationPoint(-69.25F, 2.5F, 4.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 85
		bodyModel[50].setRotationPoint(-69F, 7F, -11F);

		bodyModel[51].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 86
		bodyModel[51].setRotationPoint(-69F, 7F, -11F);

		bodyModel[52].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 87
		bodyModel[52].setRotationPoint(-66F, 7F, -11F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[53].setRotationPoint(-66F, -1F, -10F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 89
		bodyModel[54].setRotationPoint(-69F, 4.5F, -10F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 90
		bodyModel[55].setRotationPoint(-69F, 2F, -10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 91
		bodyModel[56].setRotationPoint(-69F, -0.5F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[57].setRotationPoint(-69F, -1F, -10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 23, 4, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 95
		bodyModel[58].setRotationPoint(-22F, 4F, -11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 20, 4, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 96
		bodyModel[59].setRotationPoint(4F, 4F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 20, 6, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[60].setRotationPoint(4F, 3F, -9F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 23, 6, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[61].setRotationPoint(-22F, 3F, -9F);

		bodyModel[62].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Box 102
		bodyModel[62].setRotationPoint(-0.5F, 2F, -10F);
		bodyModel[62].rotateAngleX = 0.82030475F;

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, 0F, 1F, 0F); // Box 96
		bodyModel[63].setRotationPoint(64F, -23F, 1F);

		bodyModel[64].addBox(0F, 0F, 0F, 2, 20, 2, 0F); // Box 97
		bodyModel[64].setRotationPoint(64F, -22F, -1F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 98
		bodyModel[65].setRotationPoint(64F, -23F, -7F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[66].setRotationPoint(64F, -23F, -1F);

		bodyModel[67].addBox(0F, 0F, 0F, 2, 14, 4, 0F); // Box 103
		bodyModel[67].setRotationPoint(64F, -16F, 1F);

		bodyModel[68].addBox(0F, 0F, 0F, 2, 12, 1, 0F); // Box 104
		bodyModel[68].setRotationPoint(64F, -14F, 5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[69].setRotationPoint(64F, -14F, 6F);

		bodyModel[70].addBox(0F, 0F, 0F, 2, 14, 4, 0F); // Box 110
		bodyModel[70].setRotationPoint(64F, -16F, -5F);

		bodyModel[71].addBox(0F, 0F, 0F, 2, 12, 1, 0F); // Box 111
		bodyModel[71].setRotationPoint(64F, -14F, -6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[72].setRotationPoint(64F, -14F, -7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 121
		bodyModel[73].setRotationPoint(-71F, -2F, -8F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 122
		bodyModel[74].setRotationPoint(-71F, -2F, -9F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 123
		bodyModel[75].setRotationPoint(-71F, -2F, 8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[76].setRotationPoint(69F, -2F, -9F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[77].setRotationPoint(63F, -2F, -11F);

		bodyModel[78].addBox(0F, 0F, 0F, 3, 2, 18, 0F); // Box 126
		bodyModel[78].setRotationPoint(66F, -2F, -9F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[79].setRotationPoint(69F, -2F, -8F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[80].setRotationPoint(69F, -2F, 8F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[81].setRotationPoint(66F, -1F, -10F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 130
		bodyModel[82].setRotationPoint(66F, -0.25F, -10F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[83].setRotationPoint(69F, -1F, -10F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 132
		bodyModel[84].setRotationPoint(66F, 2.25F, -10F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 133
		bodyModel[85].setRotationPoint(66F, 4.75F, -10F);

		bodyModel[86].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 134
		bodyModel[86].setRotationPoint(66F, 7F, -11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 135
		bodyModel[87].setRotationPoint(66F, 7F, -11F);

		bodyModel[88].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 136
		bodyModel[88].setRotationPoint(69F, 7F, -11F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 139
		bodyModel[89].setRotationPoint(68.5F, 0.5F, -8.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 6, 18, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.75F, 0.5F, 0F); // Box 140
		bodyModel[90].setRotationPoint(68F, 0F, -9F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F); // Box 141
		bodyModel[91].setRotationPoint(69.5F, 0.5F, -2F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[92].setRotationPoint(70.5F, 1.5F, -2F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[93].setRotationPoint(69F, 2.5F, -2F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[94].setRotationPoint(70F, 3.49F, -2F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[95].setRotationPoint(70F, 2.49F, -1F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[96].setRotationPoint(70F, 2.49F, 0F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[97].setRotationPoint(70F, 2.49F, 1F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[98].setRotationPoint(70F, 4.5F, -2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 149
		bodyModel[99].setRotationPoint(72F, 3F, -1.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[100].setRotationPoint(73F, 3F, -0.5F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 151
		bodyModel[101].setRotationPoint(71F, 3F, -0.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 152
		bodyModel[102].setRotationPoint(71F, 3F, 0.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 153
		bodyModel[103].setRotationPoint(68.5F, 0.5F, 1.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 154
		bodyModel[104].setRotationPoint(69.25F, 2.7F, -7.38F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F); // Box 155
		bodyModel[105].setRotationPoint(68.25F, 2.5F, -7.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F); // Box 156
		bodyModel[106].setRotationPoint(68.25F, 2.5F, 4.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 157
		bodyModel[107].setRotationPoint(69.25F, 2.7F, 4.62F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Box 158
		bodyModel[108].setRotationPoint(68.75F, 2.7F, 4.62F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[109].setRotationPoint(66F, -1F, 9F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[110].setRotationPoint(69F, -1F, 9F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 161
		bodyModel[111].setRotationPoint(66F, -0.25F, 9F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 162
		bodyModel[112].setRotationPoint(66F, 2.25F, 9F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 163
		bodyModel[113].setRotationPoint(66F, 4.75F, 9F);

		bodyModel[114].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 164
		bodyModel[114].setRotationPoint(66F, 7F, 10F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 165
		bodyModel[115].setRotationPoint(66F, 7F, 9F);

		bodyModel[116].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 166
		bodyModel[116].setRotationPoint(69F, 7F, 10F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Box 173
		bodyModel[117].setRotationPoint(68.75F, 2.7F, -7.38F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[118].setRotationPoint(70F, 3.5F, -0.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 27, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[119].setRotationPoint(-7F, -22.75F, -2F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 187
		bodyModel[120].setRotationPoint(23F, -24.25F, -2.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[121].setRotationPoint(69.5F, 0.5F, 1F);

		bodyModel[122].addBox(0F, 0F, 0F, 16, 16, 1, 0F); // Box 194
		bodyModel[122].setRotationPoint(-57F, -18F, -11F);

		bodyModel[123].addBox(0F, 0F, 0F, 16, 16, 1, 0F); // Box 195
		bodyModel[123].setRotationPoint(-57F, -18F, 10F);

		bodyModel[124].addBox(0F, 0F, 0F, 16, 4, 20, 0F); // Box 196
		bodyModel[124].setRotationPoint(-57F, -6F, -10F);

		bodyModel[125].addBox(0F, 0F, 0F, 5, 4, 22, 0F); // Box 197
		bodyModel[125].setRotationPoint(-62F, -6F, -11F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 13, 3, 0F); // DFL
		bodyModel[126].setRotationPoint(-57F, -19F, -10F);

		bodyModel[127].addBox(-2F, 0F, -3F, 1, 13, 3, 0F); // DRR
		bodyModel[127].setRotationPoint(-40F, -19F, 10F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 13, 17, 0F); // Box 200
		bodyModel[128].setRotationPoint(-42F, -19F, -10F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 13, 3, 0F); // Box 201
		bodyModel[129].setRotationPoint(-57F, -19F, 7F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 3F, 0F, -3F); // Box 202
		bodyModel[130].setRotationPoint(-57F, -18F, -7F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 5, 1, 21, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 204
		bodyModel[131].setRotationPoint(-63F, -4.5F, -10.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 3, 4, 22, 0F,0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -3F, 0.01F, 0F, -3F, 0.01F, 0F, -3F, 0.01F, 0F, -3F, 0.01F); // Box 205
		bodyModel[132].setRotationPoint(-61F, -5F, -11F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 3, 4, 22, 0F,0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -3F, 0.01F, 0F, -3F, 0.01F, 0F, -3F, 0.01F, 0F, -3F, 0.01F); // Box 206
		bodyModel[133].setRotationPoint(-40F, -5F, -11F);

		bodyModel[134].addBox(0F, 0F, 0F, 5, 4, 22, 0F); // Box 208
		bodyModel[134].setRotationPoint(-41F, -6F, -11F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 209
		bodyModel[135].setRotationPoint(64.5F, -23F, -0.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[136].setRotationPoint(-69F, 7F, -2F);

		bodyModel[137].addBox(0F, 0F, 0F, 6, 11, 14, 0F); // Box 211
		bodyModel[137].setRotationPoint(-66F, -13F, -7F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 11, 12, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 212
		bodyModel[138].setRotationPoint(-67F, -13F, -6F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[139].setRotationPoint(-66F, -14.5F, -7F);

		bodyModel[140].addBox(0F, 0F, 0F, 7, 1, 4, 0F); // Box 214
		bodyModel[140].setRotationPoint(-67F, -14.5F, -2F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[141].setRotationPoint(-67F, -14.5F, -7F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 216
		bodyModel[142].setRotationPoint(-67F, -14.5F, 2F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[143].setRotationPoint(-66F, -14.5F, 2F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[144].setRotationPoint(-60F, -13F, -6F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[145].setRotationPoint(-60F, -14.5F, -2F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[146].setRotationPoint(-60F, -14.5F, 0F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[147].setRotationPoint(-60F, -14.5F, -6F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[148].setRotationPoint(-60F, -13F, -7F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -1F, -1F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[149].setRotationPoint(-60F, -14.5F, -7F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F,3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[150].setRotationPoint(-57F, -18F, -3F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 3, 10, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[151].setRotationPoint(-60F, -13F, 0F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[152].setRotationPoint(-60F, -14.5F, 2F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 655
		bodyModel[153].setRotationPoint(52F, -9F, 11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 241
		bodyModel[154].setRotationPoint(43F, -9F, 11F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 242
		bodyModel[155].setRotationPoint(34F, -9F, 11F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 243
		bodyModel[156].setRotationPoint(25F, -9F, 11F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 244
		bodyModel[157].setRotationPoint(16F, -9F, 11F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 245
		bodyModel[158].setRotationPoint(7F, -9F, 11F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 246
		bodyModel[159].setRotationPoint(-2F, -9F, 11F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 247
		bodyModel[160].setRotationPoint(-11F, -9F, 11F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 248
		bodyModel[161].setRotationPoint(-20F, -9F, 11F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 249
		bodyModel[162].setRotationPoint(-29F, -9F, 11F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[163].setRotationPoint(-41F, -14F, 10.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 4F, -0.5F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[164].setRotationPoint(-37F, -14F, 10.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 252
		bodyModel[165].setRotationPoint(-39F, -13F, 11F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 253
		bodyModel[166].setRotationPoint(-39F, -13F, -12F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F); // Box 254
		bodyModel[167].setRotationPoint(64.99F, 3.5F, -11F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 255
		bodyModel[168].setRotationPoint(65F, -1.5F, -12F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.51F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.51F, 0F, -0.5F); // Box 256
		bodyModel[169].setRotationPoint(65F, -8.5F, -11.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 257
		bodyModel[170].setRotationPoint(65F, -9.5F, -11.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 1F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, -1F, 0F, -0.5F, -1.5F, 0F, 0F, 1F, 0.5F, 0F, 0.5F, 0.5F, 0F, -1F, 0F, 0F, -1.5F); // Box 258
		bodyModel[171].setRotationPoint(63F, -10F, -10.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 96, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 259
		bodyModel[172].setRotationPoint(-33F, -10F, -11.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 260
		bodyModel[173].setRotationPoint(52F, -9F, -12F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 261
		bodyModel[174].setRotationPoint(43F, -9F, -12F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 262
		bodyModel[175].setRotationPoint(34F, -9F, -12F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 263
		bodyModel[176].setRotationPoint(25F, -9F, -12F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 264
		bodyModel[177].setRotationPoint(16F, -9F, -12F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 265
		bodyModel[178].setRotationPoint(7F, -9F, -12F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 266
		bodyModel[179].setRotationPoint(-2F, -9F, -12F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 267
		bodyModel[180].setRotationPoint(-11F, -9F, -12F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 268
		bodyModel[181].setRotationPoint(-20F, -9F, -12F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 269
		bodyModel[182].setRotationPoint(-29F, -9F, -12F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -0.5F, 0F, 0F, -0.5F); // Box 270
		bodyModel[183].setRotationPoint(-37F, -14F, -11.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 271
		bodyModel[184].setRotationPoint(-41F, -14F, -11.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 272
		bodyModel[185].setRotationPoint(-61F, -13F, 11F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.5F, -4.5F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, 1F, 0.5F, -4.5F, 0.5F, 0.5F, 4F, -1F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0.5F, 4F, 0.5F); // Box 273
		bodyModel[186].setRotationPoint(-65F, -14F, 9.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 274
		bodyModel[187].setRotationPoint(-66F, -9.5F, 10.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[188].setRotationPoint(-62F, -14F, 10.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[189].setRotationPoint(-66F, -9.5F, -11.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 284
		bodyModel[190].setRotationPoint(-62F, -14F, -11.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[191].setRotationPoint(-61F, -13F, -12F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 1F, 1F, 0F, 1F, 0.01F, 0F, 0.5F, -0.51F, 0F, 0.5F, -0.51F, 0F, -1F, 0.01F, 0F, -1F); // Box 286
		bodyModel[192].setRotationPoint(-69.5F, -8.5F, -10.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 287
		bodyModel[193].setRotationPoint(-69.51F, 3.5F, -10.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 288
		bodyModel[194].setRotationPoint(-69.5F, -1.5F, -11.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.5F, -4.5F, 0.5F, 0F, -0.5F, 1F, 0F, -0.5F, -1.5F, 0.5F, -4.5F, -1F, 0.5F, 4F, 0.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0.5F, 4F, -1F); // Box 290
		bodyModel[195].setRotationPoint(-65F, -14F, -10.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 291
		bodyModel[196].setRotationPoint(-71F, -9F, -7F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[197].setRotationPoint(-71F, -10F, -3F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[198].setRotationPoint(-71F, -10F, 1.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[199].setRotationPoint(-71F, -9F, 6F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 295
		bodyModel[200].setRotationPoint(-71F, -9.5F, -7F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 296
		bodyModel[201].setRotationPoint(-71F, -9.5F, -9F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[202].setRotationPoint(-70.5F, -9.5F, -9.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 298
		bodyModel[203].setRotationPoint(-71F, -9.5F, 7F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 299
		bodyModel[204].setRotationPoint(-70.5F, -9.5F, 8.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,1F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1.5F, 1F, 0F, -1.5F, 0.01F, 0F, -1F, -0.51F, 0F, -1F, -0.51F, 0F, 0.5F, 0.01F, 0F, 0.5F); // Box 300
		bodyModel[205].setRotationPoint(-69.5F, -8.5F, 9.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 301
		bodyModel[206].setRotationPoint(-69.5F, -1.5F, 10.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 302
		bodyModel[207].setRotationPoint(-69.51F, 3.5F, 9.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 303
		bodyModel[208].setRotationPoint(-71F, -9.5F, 2F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, -4F, 0F, -2.5F, -4F); // Box 304
		bodyModel[209].setRotationPoint(-70.75F, -9.5F, -2F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 305
		bodyModel[210].setRotationPoint(68.51F, 3.5F, 9.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 306
		bodyModel[211].setRotationPoint(69.5F, -9.5F, 8.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-1.5F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -0.51F, 0F, -1F, 0.01F, 0F, -1F, 0.01F, 0F, 0.5F, -0.51F, 0F, 0.5F); // Box 307
		bodyModel[212].setRotationPoint(68.5F, -8.5F, 9.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 308
		bodyModel[213].setRotationPoint(68.5F, -1.5F, 10.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 309
		bodyModel[214].setRotationPoint(70F, -9.5F, 7F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 310
		bodyModel[215].setRotationPoint(70F, -9.5F, 2F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 311
		bodyModel[216].setRotationPoint(70F, -9F, 6.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 312
		bodyModel[217].setRotationPoint(70F, -10F, 2F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 313
		bodyModel[218].setRotationPoint(70F, -10F, -2.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 314
		bodyModel[219].setRotationPoint(70F, -9.5F, -7F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 315
		bodyModel[220].setRotationPoint(70F, -9F, -7F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 316
		bodyModel[221].setRotationPoint(70F, -9.5F, -9F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 317
		bodyModel[222].setRotationPoint(69.5F, -9.5F, -9.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-1.5F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 1F, -1.5F, 0F, 1F, -0.51F, 0F, 0.5F, 0.01F, 0F, 0.5F, 0.01F, 0F, -1F, -0.51F, 0F, -1F); // Box 318
		bodyModel[223].setRotationPoint(68.5F, -8.5F, -10.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 319
		bodyModel[224].setRotationPoint(68.5F, -1.5F, -11.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 320
		bodyModel[225].setRotationPoint(68.51F, 3.5F, -10.5F);

		bodyModel[226].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 323
		bodyModel[226].setRotationPoint(-24F, 0.5F, -9F);

		bodyModel[227].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 324
		bodyModel[227].setRotationPoint(-24F, 0.5F, -8F);

		bodyModel[228].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 325
		bodyModel[228].setRotationPoint(27F, 0.5F, -8F);

		bodyModel[229].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 326
		bodyModel[229].setRotationPoint(26F, 0.5F, -9F);

		bodyModel[230].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 11
		bodyModel[230].setRotationPoint(-48F, -11F, 6F);

		bodyModel[231].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 11
		bodyModel[231].setRotationPoint(-50F, -12F, 4.5F);

		bodyModel[232].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 11
		bodyModel[232].setRotationPoint(-46F, -17F, 4.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[233].setRotationPoint(-56F, -12F, 8F);

		bodyModel[234].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 335
		bodyModel[234].setRotationPoint(-50F, -12F, -8.5F);

		bodyModel[235].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 336
		bodyModel[235].setRotationPoint(-48F, -11F, -7F);

		bodyModel[236].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 337
		bodyModel[236].setRotationPoint(-46F, -17F, -8.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[237].setRotationPoint(-63F, -12F, 6.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 339
		bodyModel[238].setRotationPoint(65.5F, -22.5F, -1.5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 340
		bodyModel[239].setRotationPoint(65.5F, -17.5F, -1.5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 341
		bodyModel[240].setRotationPoint(65.5F, -14F, -1.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 342
		bodyModel[241].setRotationPoint(65.5F, -10.5F, -1.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 343
		bodyModel[242].setRotationPoint(65.5F, -7F, -1.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[243].setRotationPoint(-57F, -20F, 10F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 348
		bodyModel[244].setRotationPoint(-57F, -22F, 8F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 16, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 349
		bodyModel[245].setRotationPoint(-57F, -23.5F, 3F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 16, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[246].setRotationPoint(-57F, -23.5F, -3F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 16, 1, 5, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[247].setRotationPoint(-57F, -23.5F, -8F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[248].setRotationPoint(-57F, -22F, -10F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[249].setRotationPoint(-57F, -20F, -11F);

		bodyModel[250].addBox(0F, 0F, 2F, 1, 2, 1, 0F); // DFL
		bodyModel[250].setRotationPoint(-57F, -21F, -10F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // DFL
		bodyModel[251].setRotationPoint(-57F, -21F, -10F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[252].setRotationPoint(-57F, -22F, -8F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[253].setRotationPoint(-42F, -21F, -10F);

		bodyModel[254].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 358
		bodyModel[254].setRotationPoint(-42F, -21F, -8F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[255].setRotationPoint(-42F, -22F, -8F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[256].setRotationPoint(-57F, -22F, 7F);

		bodyModel[257].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 361
		bodyModel[257].setRotationPoint(-57F, -21F, 7F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[258].setRotationPoint(-42F, -22F, 7F);

		bodyModel[259].addBox(-1F, 0F, -3F, 1, 2, 1, 0F); // DRR
		bodyModel[259].setRotationPoint(-41F, -21F, 10F);

		bodyModel[260].addShapeBox(-1F, 0F, -2F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // DRR
		bodyModel[260].setRotationPoint(-41F, -21F, 10F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[261].setRotationPoint(-57F, -21F, 8F);

		bodyModel[262].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 366
		bodyModel[262].setRotationPoint(-42F, -21F, -7F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[263].setRotationPoint(-42F, -23F, -3F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[264].setRotationPoint(-42F, -23F, -7F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[265].setRotationPoint(-42F, -23F, 3F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,2.6F, 0F, -3F, -2.6F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 2.6F, 0F, -3F, -2.6F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[266].setRotationPoint(-57F, -22F, -2F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2.6F, 0F, -3F, 2.6F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2.6F, 0F, -3F, 2.6F, 0F, -3F); // Box 371
		bodyModel[267].setRotationPoint(-57F, -22F, -7F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[268].setRotationPoint(-59.6F, -23.25F, -1F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.4F, -0.75F, 0F, -0.4F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 373
		bodyModel[269].setRotationPoint(-60F, -20F, 0F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.75F, 0F, 0.4F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[270].setRotationPoint(-60F, -20F, -1F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.8F, 0F, -1F, -0.8F, 0F, -1F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.75F, 0F, 0F); // Box 376
		bodyModel[271].setRotationPoint(-57F, -23F, -7F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 377
		bodyModel[272].setRotationPoint(-59F, -23F, -3F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 378
		bodyModel[273].setRotationPoint(-59F, -23F, 1F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1.75F, 0F, 0F, -1F, 0F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 1.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[274].setRotationPoint(-57F, -23F, 3F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, 0.6F, -0.5F, 0F, 0.6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.6F, -0.5F, 0F, 0.6F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 380
		bodyModel[275].setRotationPoint(-58.6F, -23.5F, -1F);

		bodyModel[276].addShapeBox(-0.5F, 0F, -8.25F, 1, 2, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // FNumL
		bodyModel[276].setRotationPoint(-60F, -21F, 1F);
		bodyModel[276].rotateAngleY = 0.40142573F;

		bodyModel[277].addShapeBox(0.25F, 0F, 0.4F, 1, 2, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // FNumR
		bodyModel[277].setRotationPoint(-60F, -21F, 1F);
		bodyModel[277].rotateAngleY = -0.40142573F;

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 470
		bodyModel[278].setRotationPoint(-60.5F, -21.15F, -1F);

		bodyModel[279].addShapeBox(0F, -0.5F, -3.5F, 1, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -1.1F, 0F, -1.1F, -1.1F); // LMRed
		bodyModel[279].setRotationPoint(-60.2F, -21.65F, 0F);
		bodyModel[279].rotateAngleY = 0.40142573F;

		bodyModel[280].addShapeBox(0F, -0.5F, -4.75F, 1, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -1.1F, 0F, -1.1F, -1.1F); // LMGreen
		bodyModel[280].setRotationPoint(-60.2F, -21.65F, 0F);
		bodyModel[280].rotateAngleY = 0.40142573F;

		bodyModel[281].addShapeBox(0F, -0.5F, -6F, 1, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -1.1F, 0F, -1.1F, -1.1F); // LMWhite
		bodyModel[281].setRotationPoint(-60.2F, -21.65F, 0F);
		bodyModel[281].rotateAngleY = 0.40142573F;

		bodyModel[282].addShapeBox(0F, -0.5F, 2.5F, 1, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -1.1F, 0F, -1.1F, -1.1F); // RMRed
		bodyModel[282].setRotationPoint(-60.2F, -21.65F, 0F);
		bodyModel[282].rotateAngleY = -0.40142573F;

		bodyModel[283].addShapeBox(0F, -0.5F, 5F, 1, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -1.1F, 0F, -1.1F, -1.1F); // RMWhite
		bodyModel[283].setRotationPoint(-60.2F, -21.65F, 0F);
		bodyModel[283].rotateAngleY = -0.40142573F;

		bodyModel[284].addShapeBox(0F, -0.5F, 3.75F, 1, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -1.1F, 0F, -1.1F, -1.1F); // RMGreen
		bodyModel[284].setRotationPoint(-60.2F, -21.65F, 0F);
		bodyModel[284].rotateAngleY = -0.40142573F;

		bodyModel[285].addBox(0F, 0F, 0F, 3, 7, 3, 0F); // Box 387
		bodyModel[285].setRotationPoint(-56F, -13F, 2F);
		bodyModel[285].rotateAngleY = -0.34906585F;

		bodyModel[286].addShapeBox(3F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 388
		bodyModel[286].setRotationPoint(-56F, -13F, 2F);
		bodyModel[286].rotateAngleY = -0.34906585F;

		bodyModel[287].addBox(4F, 0F, 0F, 2, 6, 2, 0F); // Box 389
		bodyModel[287].setRotationPoint(-56F, -12F, 2F);
		bodyModel[287].rotateAngleY = -0.34906585F;

		bodyModel[288].addBox(6F, 0F, 0F, 3, 9, 2, 0F); // Box 390
		bodyModel[288].setRotationPoint(-56F, -15F, 2F);
		bodyModel[288].rotateAngleY = -0.34906585F;

		bodyModel[289].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 391
		bodyModel[289].setRotationPoint(-56F, -15F, 2F);
		bodyModel[289].rotateAngleY = -0.34906585F;

		bodyModel[290].addShapeBox(0F, 0F, 3F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 392
		bodyModel[290].setRotationPoint(-56F, -13F, 2F);
		bodyModel[290].rotateAngleY = -0.34906585F;

		bodyModel[291].addShapeBox(1F, 0F, 3F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 393
		bodyModel[291].setRotationPoint(-56F, -12F, 2F);
		bodyModel[291].rotateAngleY = -0.34906585F;

		bodyModel[292].addShapeBox(0F, 0F, 4F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 394
		bodyModel[292].setRotationPoint(-56F, -13F, 2F);
		bodyModel[292].rotateAngleY = -1.13446401F;

		bodyModel[293].addBox(7F, 0F, 2F, 1, 2, 1, 0F); // Box 395
		bodyModel[293].setRotationPoint(-56F, -13F, 2F);
		bodyModel[293].rotateAngleY = -0.34906585F;

		bodyModel[294].addBox(6.5F, 0F, 2F, 2, 1, 1, 0F); // Box 396
		bodyModel[294].setRotationPoint(-56F, -11F, 2F);
		bodyModel[294].rotateAngleY = -0.34906585F;

		bodyModel[295].addShapeBox(7F, 0F, 3F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 397
		bodyModel[295].setRotationPoint(-56F, -13F, 2F);
		bodyModel[295].rotateAngleY = -0.34906585F;

		bodyModel[296].addShapeBox(6.5F, 0F, 3F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 398
		bodyModel[296].setRotationPoint(-56F, -11F, 2F);
		bodyModel[296].rotateAngleY = -0.34906585F;

		bodyModel[297].addShapeBox(0F, 0F, 0F, 0, 4, 8, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -4F, 0F, -2.5F, -4F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 430
		bodyModel[297].setRotationPoint(70.75F, -9.5F, -6F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		bodyModel[298].setRotationPoint(-49F, -18F, 10F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		bodyModel[299].setRotationPoint(-49F, -18F, -11F);

		bodyModel[300].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 435
		bodyModel[300].setRotationPoint(-47F, -1F, -11F);

		bodyModel[301].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 436
		bodyModel[301].setRotationPoint(45F, -1F, -11F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 440
		bodyModel[302].setRotationPoint(-67F, -14F, -6F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		bodyModel[303].setRotationPoint(-66F, -14F, -7F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[304].setRotationPoint(-60F, -14F, -7F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[305].setRotationPoint(-60F, -14F, -6F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[306].setRotationPoint(-60F, -14F, 0F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,3F, -0.5F, -3F, -3F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[307].setRotationPoint(-57F, -19F, -3F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -0.5F, -3F, -3F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 446
		bodyModel[308].setRotationPoint(-57F, -19F, -3F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 3F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, -3F, 3F, -0.5F, -3F); // Box 447
		bodyModel[309].setRotationPoint(-57F, -19F, -7F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, -3F, 3F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 3F, 0F, -3F); // Box 448
		bodyModel[310].setRotationPoint(-57F, -19F, -7F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,3F, -0.5F, -3F, -3F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		bodyModel[311].setRotationPoint(-57F, -15F, -3F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, -3F, 3F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 3F, 0F, -3F); // Box 450
		bodyModel[312].setRotationPoint(-57F, -15F, -7F);

		bodyModel[313].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 473
		bodyModel[313].setRotationPoint(69F, 3.5F, 2F);
		bodyModel[313].rotateAngleZ = 0.13962634F;

		bodyModel[314].addShapeBox(4F, 0F, 2.01F, 6, 18, 0, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -4F, -12F, 0F, -4F, -12F, 0F, 0F, -12F, 0F); // Box 463
		bodyModel[314].setRotationPoint(-56F, -12F, 2F);
		bodyModel[314].rotateAngleY = -0.34906585F;

		bodyModel[315].addShapeBox(0F, 0F, 2.01F, 36, 12, 0, 0F,0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -0.25F, -30F, -10F, -0.25F, -30F, -10F, 0.25F, 0F, -10F, 0.25F); // Box 464
		bodyModel[315].setRotationPoint(-56F, -15F, 2F);
		bodyModel[315].rotateAngleY = -0.34906585F;

		bodyModel[316].addBox(5.75F, 0F, 0F, 3, 1, 2, 0F); // Box 465
		bodyModel[316].setRotationPoint(-56F, -16F, 2F);
		bodyModel[316].rotateAngleY = -0.34906585F;

		bodyModel[317].addShapeBox(5.75F, 0F, 2.01F, 21, 7, 0, 0F,0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -18F, -6F, 0F, -18F, -6F, 0F, 0F, -6F, 0F); // Box 466
		bodyModel[317].setRotationPoint(-56F, -16F, 2F);
		bodyModel[317].rotateAngleY = -0.34906585F;

		bodyModel[318].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 468
		bodyModel[318].setRotationPoint(-56F, -13.75F, 5.5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 0, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -6F, 0F, -6F, -6F); // Box 469
		bodyModel[319].setRotationPoint(-54.99F, -13.75F, 5.5F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 478
		bodyModel[320].setRotationPoint(-24F, 4F, -11F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479
		bodyModel[321].setRotationPoint(-24F, 3F, -9F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 480
		bodyModel[322].setRotationPoint(-24F, 4F, 9F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 481
		bodyModel[323].setRotationPoint(-24F, 3F, 8F);

		bodyModel[324].addBox(0F, 0F, 0F, 5, 2, 0, 0F); // Box 486
		bodyModel[324].setRotationPoint(-49F, -1F, -11.01F);

		bodyModel[325].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 487
		bodyModel[325].setRotationPoint(-47F, 1F, -11.01F);

		bodyModel[326].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 488
		bodyModel[326].setRotationPoint(44F, -1F, -11.01F);

		bodyModel[327].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 489
		bodyModel[327].setRotationPoint(45F, 1F, -11.01F);

		bodyModel[328].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 490
		bodyModel[328].setRotationPoint(44F, -1F, 11.01F);

		bodyModel[329].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 491
		bodyModel[329].setRotationPoint(45F, 1F, 11.01F);

		bodyModel[330].addBox(0F, 0F, 0F, 5, 2, 0, 0F); // Box 492
		bodyModel[330].setRotationPoint(-49F, -1F, 11.01F);

		bodyModel[331].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 493
		bodyModel[331].setRotationPoint(-47F, 1F, 11.01F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 96, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[332].setRotationPoint(-33F, -10F, 10.5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 491
		bodyModel[333].setRotationPoint(61F, -9F, -12F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 492
		bodyModel[334].setRotationPoint(61F, -9F, 11F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 17, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 487
		bodyModel[335].setRotationPoint(-34F, -23F, -7F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.5F, 0F, 0F, -1.25F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, -1.25F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 560
		bodyModel[336].setRotationPoint(-70.9F, 7F, 4.6F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, 0F, -1.75F, 0F, 0F, -1.25F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 561
		bodyModel[337].setRotationPoint(-70.4F, 4F, 4.6F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, -0.25F, 1F, 0F, -0.25F); // Box 562
		bodyModel[338].setRotationPoint(-69.4F, 3F, 4.6F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1.25F, 0F, 0F, 0.5F, 0F, 0F); // Box 564
		bodyModel[339].setRotationPoint(-70.9F, 7F, -7.6F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.75F, 0F, 0F, 1F, 0F, 0F); // Box 565
		bodyModel[340].setRotationPoint(-70.4F, 4F, -7.6F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, 0F, 1F, 0F, 0F); // Box 566
		bodyModel[341].setRotationPoint(-69.4F, 3F, -7.6F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[342].setRotationPoint(-61.5F, -22.5F, -1F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Bell
		bodyModel[343].setRotationPoint(-62F, -22.24F, -1F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[344].setRotationPoint(-61.1F, -22.49F, -0.9F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 11
		bodyModel[345].setRotationPoint(-61.5F, -22F, -1F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 11
		bodyModel[346].setRotationPoint(-61.5F, -22F, 1F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[347].setRotationPoint(-61.5F, -22.5F, 1F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[348].setRotationPoint(-61.5F, -22.5F, -1F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.25F, 0F, 0.4F, -0.25F, 0F, 0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F); // Box 543
		bodyModel[349].setRotationPoint(-60F, -23F, 0F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.25F, 0F, 0.4F, -0.25F, 0F, 0.4F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 544
		bodyModel[350].setRotationPoint(-60F, -23F, -1F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Box 535
		bodyModel[351].setRotationPoint(-68.25F, -12.75F, -1F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, -0.75F, -0.4F, -0.1F); // Box 536
		bodyModel[352].setRotationPoint(-68F, -14.45F, -1F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Box 537
		bodyModel[353].setRotationPoint(-68.25F, -14.45F, -1F);

		bodyModel[354].addShapeBox(0F, -0.5F, 2.5F, 1, 2, 2, 0F,0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F); // Box 413
		bodyModel[354].setRotationPoint(-62F, -24.25F, -2.5F);

		bodyModel[355].addBox(0F, 0F, 1F, 1, 1, 1, 0F); // Box 414
		bodyModel[355].setRotationPoint(-62F, -24.25F, -1.75F);

		bodyModel[356].addShapeBox(0F, -0.5F, 0.5F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F); // Box 415
		bodyModel[356].setRotationPoint(-63F, -24.25F, -1.75F);

		bodyModel[357].addShapeBox(0F, -0.75F, 1.5F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F); // Box 416
		bodyModel[357].setRotationPoint(-60F, -24F, -3.5F);

		bodyModel[358].addBox(0F, 0F, 1F, 1, 1, 3, 0F); // Box 417
		bodyModel[358].setRotationPoint(-61F, -24.25F, -2.5F);

		bodyModel[359].addShapeBox(0F, 1F, 2F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[359].setRotationPoint(-61F, -24.5F, -2.5F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 34, 7, 0, 0F,-0.5F, 0F, 0F, -13.5F, 0F, 0F, -13.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F, -14F, -2.5F, 0F, -14F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 660
		bodyModel[360].setRotationPoint(-16F, -17F, -7.1F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 34, 7, 0, 0F,-14.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -14.5F, 0F, 0F, -14F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -14F, -2.5F, 0F); // Box 661
		bodyModel[361].setRotationPoint(19F, -17F, 7.1F);
		bodyModel[361].rotateAngleY = 3.14159265F;

		bodyModel[362].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 473
		bodyModel[362].setRotationPoint(64F, -16F, 5F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
		bodyModel[363].setRotationPoint(64F, -16F, 6F);

		bodyModel[364].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 475
		bodyModel[364].setRotationPoint(64F, -16F, -6F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 476
		bodyModel[365].setRotationPoint(64F, -16F, -7F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 478
		bodyModel[366].setRotationPoint(64F, -18F, 6F);

		bodyModel[367].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 479
		bodyModel[367].setRotationPoint(64F, -18F, 1F);

		bodyModel[368].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 480
		bodyModel[368].setRotationPoint(64F, -18F, 5F);

		bodyModel[369].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 481
		bodyModel[369].setRotationPoint(64F, -18F, -6F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 482
		bodyModel[370].setRotationPoint(64F, -18F, -7F);

		bodyModel[371].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 484
		bodyModel[371].setRotationPoint(64F, -18F, -5F);

		bodyModel[372].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Box 494
		bodyModel[372].setRotationPoint(64F, -21F, -5F);

		bodyModel[373].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 495
		bodyModel[373].setRotationPoint(64F, -21F, -6F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[374].setRotationPoint(64F, -21F, -7F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.33F, -0.17F, 0F, 0F, -0.17F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, 0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[375].setRotationPoint(65F, -22F, -5F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.33F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.17F, 0F, -0.66F, -0.17F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.66F, 0F, 0F); // Box 498
		bodyModel[376].setRotationPoint(64F, -22F, -6F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.33F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.33F, 0F, 0F); // Box 499
		bodyModel[377].setRotationPoint(64F, -22F, -7F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.33F, -0.33F, 0F, 1F, -0.33F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.33F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 500
		bodyModel[378].setRotationPoint(64F, -22F, 6F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.66F, -0.17F, 0F, 0F, -0.17F, 0F, 0F, -0.33F, 0F, -0.33F, -0.33F, 0F, -0.66F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, 0F); // Box 501
		bodyModel[379].setRotationPoint(64F, -22F, 5F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.17F, 0F, 0.33F, -0.17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.33F, 0F, 0F); // Box 502
		bodyModel[380].setRotationPoint(65F, -22F, 1F);

		bodyModel[381].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Box 503
		bodyModel[381].setRotationPoint(64F, -21F, 1F);

		bodyModel[382].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 504
		bodyModel[382].setRotationPoint(64F, -21F, 5F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 505
		bodyModel[383].setRotationPoint(64F, -21F, 6F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 128
		bodyModel[384].setRotationPoint(64.2F, -21F, -1F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Light_Rear_Right
		bodyModel[385].setRotationPoint(66.2F, -21F, -1F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Ditchlight_Right_Bottom_ble
		bodyModel[386].setRotationPoint(-70F, -1F, 5F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.4F, -0.1F, -0.5F, 0.4F, -0.1F, -0.5F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, -0.6F, -0.1F, -0.5F, -0.6F, -0.1F, -0.5F, -0.6F, -0.1F, 0F, -0.6F, -0.1F); // box
		bodyModel[387].setRotationPoint(-69.31F, -0.5F, 5F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Ditchlight_Left_Bottom_ble
		bodyModel[388].setRotationPoint(-70F, -1F, -7F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.4F, -0.1F, -0.5F, 0.4F, -0.1F, -0.5F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, -0.6F, -0.1F, -0.5F, -0.6F, -0.1F, -0.5F, -0.6F, -0.1F, 0F, -0.6F, -0.1F); // Ditchlight_Left_Bottom_ble
		bodyModel[389].setRotationPoint(-69.31F, -0.5F, -7F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.5F, -0.75F, -1F, 0.25F, -0.25F, -0.15F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.15F, 0.25F, 0F, 0F, 0.62F, 0F, 0F); // Box 556
		bodyModel[390].setRotationPoint(-70.25F, 4F, -8.5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0.25F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 557
		bodyModel[391].setRotationPoint(-70.25F, 6F, -8.5F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 558
		bodyModel[392].setRotationPoint(-70.25F, 6F, -0.5F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, -1F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F); // Box 559
		bodyModel[393].setRotationPoint(-70.25F, 6F, 0.5F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, -0.15F, -0.5F, -0.75F, -1F, 0.62F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.15F, 0.25F, 0F, -1F); // Box 563
		bodyModel[394].setRotationPoint(-70.25F, 4F, 2.5F);

		bodyModel[395].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 122
		bodyModel[395].setRotationPoint(-59F, -13F, -7F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, -0.9F, -0.45F, -0.45F, -0.9F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, -0.9F, -0.45F, -0.45F, -0.9F); // Box 122
		bodyModel[396].setRotationPoint(-60F, -14F, -7.1F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 546
		bodyModel[397].setRotationPoint(-49F, -24F, -0.25F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 625
		bodyModel[398].setRotationPoint(-67F, -13F, -6F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 626
		bodyModel[399].setRotationPoint(-67F, -6F, -6F);

		bodyModel[400].addBox(0F, 0F, 0F, 1, 2, 8, 0F); // Box 627
		bodyModel[400].setRotationPoint(-67F, -8F, -4F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 628
		bodyModel[401].setRotationPoint(-67F, -8F, -7F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 629
		bodyModel[402].setRotationPoint(-67F, -8F, 6F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.4F, -0.1F, -0.5F, 0.4F, -0.1F, -0.5F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, -0.6F, -0.1F, -0.5F, -0.6F, -0.1F, -0.5F, -0.6F, -0.1F, 0F, -0.6F, -0.1F); // Box 631
		bodyModel[403].setRotationPoint(-67F, -7.5F, -6F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.4F, -0.1F, -0.5F, 0.4F, -0.1F, -0.5F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, -0.6F, -0.1F, -0.5F, -0.6F, -0.1F, -0.5F, -0.6F, -0.1F, 0F, -0.6F, -0.1F); // Box 632
		bodyModel[404].setRotationPoint(-67F, -7.5F, 4F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 23, 5, 1, 0F,1F, 0.5F, 0F, -7F, 0.5F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -7F, 1F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 644
		bodyModel[405].setRotationPoint(-33F, -22.5F, 7F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 17, 5, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -4F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 1F, 0F, 1F, 1F, 0F); // Box 645
		bodyModel[406].setRotationPoint(-30F, -22.5F, -8F);

		bodyModel[407].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 446
		bodyModel[407].setRotationPoint(-44F, -1F, -11.01F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 180
		bodyModel[408].setRotationPoint(22F, -23.25F, 2F);

		bodyModel[409].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Box 181
		bodyModel[409].setRotationPoint(22F, -22.75F, -2F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 182
		bodyModel[410].setRotationPoint(22F, -23.25F, -6F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 459
		bodyModel[411].setRotationPoint(-71F, -5F, -6.5F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F); // Box 460
		bodyModel[412].setRotationPoint(-71.76F, -5F, -4.5F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 461
		bodyModel[413].setRotationPoint(71F, -5F, 2.5F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F); // Box 462
		bodyModel[414].setRotationPoint(70.76F, -5F, 2.5F);

		bodyModel[415].addBox(0F, 0F, 0F, 17, 0, 4, 0F); // Box 463
		bodyModel[415].setRotationPoint(-35F, -23.5F, -2F);

		bodyModel[416].addBox(0F, 0F, 0F, 0, 2, 4, 0F); // Box 464
		bodyModel[416].setRotationPoint(-35F, -23.5F, -2F);

		bodyModel[417].addBox(0F, 0F, 0F, 0, 2, 4, 0F); // Box 466
		bodyModel[417].setRotationPoint(-18F, -23.5F, -2F);

		bodyModel[418].addBox(0F, 0F, 0F, 0, 2, 4, 0F); // Box 467
		bodyModel[418].setRotationPoint(-24F, -23.5F, -2F);

		bodyModel[419].addBox(0F, 0F, 0F, 0, 2, 4, 0F); // Box 468
		bodyModel[419].setRotationPoint(-29F, -23.5F, -2F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 483
		bodyModel[420].setRotationPoint(66F, -2.5F, -10F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 484
		bodyModel[421].setRotationPoint(66F, -2.5F, 9F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, -1.5F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, 0.5F, 0F, -0.5F, 1F, 0F, 0F, -1.5F, 0.5F, 0F, -1F, 0.5F, 0F, 0.5F, 0F, 0F, 1F); // Box 485
		bodyModel[422].setRotationPoint(63F, -10F, 9.5F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 486
		bodyModel[423].setRotationPoint(65F, -9.5F, 10.5F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.51F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, 0F, -0.51F, 0F, 0F); // Box 487
		bodyModel[424].setRotationPoint(65F, -8.5F, 10.5F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 488
		bodyModel[425].setRotationPoint(65F, -1.5F, 11F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 489
		bodyModel[426].setRotationPoint(64.99F, 3.5F, 10F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 490
		bodyModel[427].setRotationPoint(-69F, -2.5F, -10F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 491
		bodyModel[428].setRotationPoint(-69F, -2.5F, 9F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 3, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[429].setRotationPoint(-66F, -2F, -11F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 493
		bodyModel[430].setRotationPoint(-65.99F, 3.5F, -11F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 1F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 494
		bodyModel[431].setRotationPoint(-66F, -1.5F, -12F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.01F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, -0.5F, 0.01F, 0F, -0.5F); // Box 495
		bodyModel[432].setRotationPoint(-66F, -8.5F, -11.5F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 496
		bodyModel[433].setRotationPoint(-65.99F, 3.5F, 10F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 497
		bodyModel[434].setRotationPoint(-66F, -1.5F, 11F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0.01F, 0F, -0.5F, -0.51F, 0F, -0.5F, -0.51F, 0F, 0F, 0.01F, 0F, 0F); // Box 498
		bodyModel[435].setRotationPoint(-66F, -8.5F, 10.5F);

		bodyModel[436].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 482
		bodyModel[436].setRotationPoint(-36F, -4F, 7F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 19, 1, 28, 0F,-0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -12F, -0.25F, 0F, -12F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -12F, -0.25F, 0F, -12F); // Box 94
		bodyModel[437].setRotationPoint(42F, -21.51F, -8F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 20, 1, 16, 0F,0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 699
		bodyModel[438].setRotationPoint(42F, -22F, -8F);

		bodyModel[439].addBox(0F, 0F, 0F, 24, 19, 15, 0F); // Box 500
		bodyModel[439].setRotationPoint(40F, -21F, -7.5F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 20, 3, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[440].setRotationPoint(42F, -21F, -9F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 20, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 21
		bodyModel[441].setRotationPoint(42F, -21F, 7F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		bodyModel[442].setRotationPoint(40F, -21F, -8.5F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F); // Box 505
		bodyModel[443].setRotationPoint(40F, -21F, 7.5F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F); // Box 506
		bodyModel[444].setRotationPoint(62F, -21F, 7.5F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507
		bodyModel[445].setRotationPoint(62F, -21F, -8.5F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 508
		bodyModel[446].setRotationPoint(62F, -23F, -7F);

		bodyModel[447].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 509
		bodyModel[447].setRotationPoint(62F, -22.5F, -1F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 510
		bodyModel[448].setRotationPoint(62F, -23F, 1F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 21, 1, 5, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 511
		bodyModel[449].setRotationPoint(21F, -23F, -7F);

		bodyModel[450].addBox(0F, 0F, 0F, 21, 1, 4, 0F); // Box 512
		bodyModel[450].setRotationPoint(21F, -22.5F, -2F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 21, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 513
		bodyModel[451].setRotationPoint(21F, -23F, 2F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 21, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 514
		bodyModel[452].setRotationPoint(21F, -23F, -7F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 16, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 515
		bodyModel[453].setRotationPoint(22F, -23.25F, -5F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 516
		bodyModel[454].setRotationPoint(40.25F, -24F, -6F);

		bodyModel[455].addBox(0F, 0F, 0F, 8, 2, 0, 0F); // Box 517
		bodyModel[455].setRotationPoint(49F, -1F, -11.01F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 518
		bodyModel[456].setRotationPoint(18F, 4F, 9F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 519
		bodyModel[457].setRotationPoint(18F, 3F, 8F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 462
		bodyModel[458].setRotationPoint(18F, 6F, 9F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 463
		bodyModel[459].setRotationPoint(18F, 6F, 8F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		bodyModel[460].setRotationPoint(18F, 2F, 8F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 465
		bodyModel[461].setRotationPoint(-24F, 4F, -11F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		bodyModel[462].setRotationPoint(-24F, 3F, -9F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 35, 4, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 467
		bodyModel[463].setRotationPoint(-11F, 4F, -11F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 35, 6, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		bodyModel[464].setRotationPoint(-11F, 3F, -9F);

		bodyModel[465].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Box 469
		bodyModel[465].setRotationPoint(-15.5F, 2F, -10F);
		bodyModel[465].rotateAngleX = 0.82030475F;

		bodyModel[466].addBox(0F, -1.5F, -1.5F, 22, 3, 3, 0F); // Box 470
		bodyModel[466].setRotationPoint(-37F, 0.5F, -8.75F);
		bodyModel[466].rotateAngleX = -0.78539816F;

		bodyModel[467].addBox(0F, -1.5F, -1.5F, 22, 3, 3, 0F); // Box 471
		bodyModel[467].setRotationPoint(-8F, 0.5F, -8.75F);
		bodyModel[467].rotateAngleX = -0.78539816F;

		bodyModel[468].addBox(0F, -1.5F, -1.5F, 22, 3, 3, 0F); // Box 472
		bodyModel[468].setRotationPoint(18F, 0.5F, -8.75F);
		bodyModel[468].rotateAngleX = -0.78539816F;

		bodyModel[469].addBox(0F, 0F, 0F, 81, 0, 1, 0F); // Box 473
		bodyModel[469].setRotationPoint(-39F, 0.5F, -9F);

		bodyModel[470].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 474
		bodyModel[470].setRotationPoint(-39F, 0.5F, -8F);

		bodyModel[471].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 475
		bodyModel[471].setRotationPoint(41F, 0.5F, -8F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 13, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 474
		bodyModel[472].setRotationPoint(43F, -12F, -7.6F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F); // Box 475
		bodyModel[473].setRotationPoint(41F, -10.5F, -7.6F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F); // Box 476
		bodyModel[474].setRotationPoint(41F, -6.5F, -7.6F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 11, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 477
		bodyModel[475].setRotationPoint(47F, -12F, 6.6F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 6, 15, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.9F, 0F, -5F, -0.9F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 478
		bodyModel[476].setRotationPoint(58F, -12F, 6.6F);

		bodyModel[477].addBox(0F, 0F, 0F, 1, 0, 6, 0F); // Box 479
		bodyModel[477].setRotationPoint(45.25F, -22F, 2F);

		bodyModel[478].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 480
		bodyModel[478].setRotationPoint(45.25F, -22F, 8F);

		bodyModel[479].addBox(0F, 0F, 0F, 1, 0, 6, 0F); // Box 481
		bodyModel[479].setRotationPoint(57.75F, -22F, 2F);

		bodyModel[480].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 482
		bodyModel[480].setRotationPoint(57.75F, -22F, 8F);

		bodyModel[481].addBox(0F, 0F, 0F, 1, 0, 6, 0F); // Box 483
		bodyModel[481].setRotationPoint(51.5F, -22F, 2F);

		bodyModel[482].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 484
		bodyModel[482].setRotationPoint(51.5F, -22F, 8F);

		bodyModel[483].addBox(0F, 0F, 0F, 1, 0, 6, 0F); // Box 485
		bodyModel[483].setRotationPoint(57.75F, -22F, -8F);

		bodyModel[484].addBox(0F, 0F, 0F, 1, 0, 6, 0F); // Box 486
		bodyModel[484].setRotationPoint(51.5F, -22F, -8F);

		bodyModel[485].addBox(0F, 0F, 0F, 1, 0, 6, 0F); // Box 487
		bodyModel[485].setRotationPoint(45.25F, -22F, -8F);

		bodyModel[486].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 488
		bodyModel[486].setRotationPoint(57.75F, -22F, -8F);

		bodyModel[487].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 489
		bodyModel[487].setRotationPoint(51.5F, -22F, -8F);

		bodyModel[488].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 490
		bodyModel[488].setRotationPoint(45.25F, -22F, -8F);

		bodyModel[489].addBox(0F, 0F, 0F, 18, 5, 0, 0F); // Box 634
		bodyModel[489].setRotationPoint(-1F, -15F, -7.1F);

		bodyModel[490].addBox(0F, 0F, 0F, 18, 5, 0, 0F); // Box 635
		bodyModel[490].setRotationPoint(17F, -15F, 7.09999999999999F);
		bodyModel[490].rotateAngleY = 3.14159265F;

		bodyModel[491].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // ditch
		bodyModel[491].setRotationPoint(-67.69F, -8F, -6F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // ditch
		bodyModel[492].setRotationPoint(-67.69F, -8F, 4F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 1, 4, 9, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, -3.5F, -1F, 0F, 2.75F, -1F, 0F, 1.25F, 0F, -1F, -2F, 0F, -1F, -5F, 0F, 0F, 4.25F, 0F, 0F); // Box 536
		bodyModel[493].setRotationPoint(-69.6F, 5F, -11F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,1.25F, 1F, 0F, -2F, 1F, 0F, -3.5F, -3F, 0F, 2.75F, -3F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -3.5F, 1F, 0F, 2.75F, 1F, 0F); // Box 537
		bodyModel[494].setRotationPoint(-69.6F, 3F, -11F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.75F, 0F, 0F); // Box 538
		bodyModel[495].setRotationPoint(-73.1F, 6F, -2F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 1, 4, 9, 0F,2.75F, -1F, 0F, -3.5F, -1F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 4.25F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, -1F, 1.25F, 0F, -1F); // Box 539
		bodyModel[496].setRotationPoint(-69.6F, 5F, 2F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,2.75F, -3F, 0F, -3.5F, -3F, 0F, -2F, 1F, 0F, 1.25F, 1F, 0F, 2.75F, 1F, 0F, -3.5F, 1F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 540
		bodyModel[497].setRotationPoint(-69.6F, 3F, 2F);

		bodyModel[498].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 91
		bodyModel[498].setRotationPoint(-61.25F, -24.01F, -1.5F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F); // Box 209
		bodyModel[499].setRotationPoint(-62.25F, -25.11F, -2.3F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 443, 239, textureX, textureY); // Box 209
		bodyModel[501] = new ModelRendererTurbo(this, 475, 311, textureX, textureY); // Box 209
		bodyModel[502] = new ModelRendererTurbo(this, 457, 190, textureX, textureY); // Box 209
		bodyModel[503] = new ModelRendererTurbo(this, 489, 356, textureX, textureY); // Box 209
		bodyModel[504] = new ModelRendererTurbo(this, 457, 190, textureX, textureY); // Box 558
		bodyModel[505] = new ModelRendererTurbo(this, 457, 190, textureX, textureY); // Box 559
		bodyModel[506] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 95
		bodyModel[507] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 100
		bodyModel[508] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 101
		bodyModel[509] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 102
		bodyModel[510] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 106
		bodyModel[511] = new ModelRendererTurbo(this, 161, 65, textureX, textureY,"lamp"); // RMR
		bodyModel[512] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 108
		bodyModel[513] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 109
		bodyModel[514] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 113
		bodyModel[515] = new ModelRendererTurbo(this, 1, 73, textureX, textureY,"lamp"); // RML
		bodyModel[516] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // RNumR
		bodyModel[517] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // RNumL
		bodyModel[518] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 11
		bodyModel[519] = new ModelRendererTurbo(this, 489, 97, textureX, textureY,"lamp"); // LR
		bodyModel[520] = new ModelRendererTurbo(this, 25, 105, textureX, textureY,"lamp"); // LR
		bodyModel[521] = new ModelRendererTurbo(this, 489, 493, textureX, textureY); // Box 601
		bodyModel[522] = new ModelRendererTurbo(this, 489, 493, textureX, textureY); // Box 602
		bodyModel[523] = new ModelRendererTurbo(this, 489, 493, textureX, textureY); // Box 603
		bodyModel[524] = new ModelRendererTurbo(this, 489, 493, textureX, textureY); // Box 604
		bodyModel[525] = new ModelRendererTurbo(this, 489, 493, textureX, textureY); // Box 605
		bodyModel[526] = new ModelRendererTurbo(this, 191, 262, textureX, textureY); // Box 659
		bodyModel[527] = new ModelRendererTurbo(this, 477, 423, textureX, textureY); // Box 660
		bodyModel[528] = new ModelRendererTurbo(this, 144, 281, textureX, textureY); // Box 661
		bodyModel[529] = new ModelRendererTurbo(this, 130, 319, textureX, textureY); // Box 662
		bodyModel[530] = new ModelRendererTurbo(this, 370, 281, textureX, textureY); // Box 664
		bodyModel[531] = new ModelRendererTurbo(this, 355, 294, textureX, textureY); // Box 665
		bodyModel[532] = new ModelRendererTurbo(this, 408, 309, textureX, textureY); // Box 666
		bodyModel[533] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Box 667
		bodyModel[534] = new ModelRendererTurbo(this, 393, 384, textureX, textureY); // Box 668
		bodyModel[535] = new ModelRendererTurbo(this, 408, 327, textureX, textureY); // Box 669
		bodyModel[536] = new ModelRendererTurbo(this, 191, 262, textureX, textureY); // Box 537
		bodyModel[537] = new ModelRendererTurbo(this, 107, 394, textureX, textureY); // Box 492
		bodyModel[538] = new ModelRendererTurbo(this, 107, 394, textureX, textureY); // Box 493
		bodyModel[539] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // box
		bodyModel[540] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // box
		bodyModel[541] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 82
		bodyModel[542] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 83
		bodyModel[543] = new ModelRendererTurbo(this, 386, 399, textureX, textureY); // Box 543
		bodyModel[544] = new ModelRendererTurbo(this, 386, 399, textureX, textureY); // Box 544
		bodyModel[545] = new ModelRendererTurbo(this, 380, 399, textureX, textureY); // Box 545
		bodyModel[546] = new ModelRendererTurbo(this, 380, 399, textureX, textureY); // Box 546
		bodyModel[547] = new ModelRendererTurbo(this, 10, 477, textureX, textureY); // Box 679
		bodyModel[548] = new ModelRendererTurbo(this, 10, 477, textureX, textureY); // Box 682
		bodyModel[549] = new ModelRendererTurbo(this, 58, 417, textureX, textureY); // Box 683
		bodyModel[550] = new ModelRendererTurbo(this, 58, 417, textureX, textureY); // Box 684
		bodyModel[551] = new ModelRendererTurbo(this, 58, 395, textureX, textureY); // Box 551
		bodyModel[552] = new ModelRendererTurbo(this, 58, 395, textureX, textureY); // Box 552
		bodyModel[553] = new ModelRendererTurbo(this, 58, 374, textureX, textureY); // Box 554
		bodyModel[554] = new ModelRendererTurbo(this, 58, 374, textureX, textureY); // Box 555
		bodyModel[555] = new ModelRendererTurbo(this, 58, 353, textureX, textureY); // Box 556
		bodyModel[556] = new ModelRendererTurbo(this, 58, 353, textureX, textureY); // Box 557
		bodyModel[557] = new ModelRendererTurbo(this, 258, 374, textureX, textureY,"ditch"); // ditch
		bodyModel[558] = new ModelRendererTurbo(this, 244, 375, textureX, textureY); // Box 622
		bodyModel[559] = new ModelRendererTurbo(this, 258, 374, textureX, textureY,"ditch"); // ditch
		bodyModel[560] = new ModelRendererTurbo(this, 244, 375, textureX, textureY); // Box 624
		bodyModel[561] = new ModelRendererTurbo(this, 351, 459, textureX, textureY); // Box 561
		bodyModel[562] = new ModelRendererTurbo(this, 351, 459, textureX, textureY); // Box 562
		bodyModel[563] = new ModelRendererTurbo(this, 273, 209, textureX, textureY); // box
		bodyModel[564] = new ModelRendererTurbo(this, 265, 200, textureX, textureY); // box
		bodyModel[565] = new ModelRendererTurbo(this, 265, 200, textureX, textureY); // Box 472
		bodyModel[566] = new ModelRendererTurbo(this, 265, 200, textureX, textureY); // Box 473
		bodyModel[567] = new ModelRendererTurbo(this, 273, 209, textureX, textureY); // Box 474
		bodyModel[568] = new ModelRendererTurbo(this, 265, 200, textureX, textureY); // Box 475

		bodyModel[500].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.15F, -0.15F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.15F, -0.15F); // Box 209
		bodyModel[500].setRotationPoint(-63.25F, -25.36F, -1F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[501].setRotationPoint(-62.25F, -24.86F, -0.5F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F); // Box 209
		bodyModel[502].setRotationPoint(-62.25F, -25.11F, 0.3F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 209
		bodyModel[503].setRotationPoint(-61.25F, -23.01F, -0.5F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.5F, -0.5F); // Box 558
		bodyModel[504].setRotationPoint(-62.25F, -23.86F, -0.25F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.5F, -0.5F); // Box 559
		bodyModel[505].setRotationPoint(-62.25F, -23.86F, -1.75F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[506].setRotationPoint(65F, -17F, 1F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[507].setRotationPoint(64F, -21F, -7F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[508].setRotationPoint(64F, -21F, 1F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 102
		bodyModel[509].setRotationPoint(65F, -17F, 6F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-2F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[510].setRotationPoint(64F, -16F, 5F);

		bodyModel[511].addShapeBox(-0.5F, 0F, 0.9F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // RMR
		bodyModel[511].setRotationPoint(66F, -15.5F, 5F);
		bodyModel[511].rotateAngleY = 0.78539816F;

		bodyModel[512].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0.5F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[512].setRotationPoint(65F, -17F, -7F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,1F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[513].setRotationPoint(65F, -17F, -6F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, -0.5F, -2F, 0F, 0F); // Box 113
		bodyModel[514].setRotationPoint(64F, -16F, -7F);

		bodyModel[515].addShapeBox(-1.2F, 0F, -1.1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // RML
		bodyModel[515].setRotationPoint(66F, -15.5F, -6F);
		bodyModel[515].rotateAngleY = -0.78539816F;

		bodyModel[516].addShapeBox(-0.5F, 0F, 1.1F, 1, 2, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // RNumR
		bodyModel[516].setRotationPoint(66F, -20F, 0F);
		bodyModel[516].rotateAngleY = 0.33161256F;

		bodyModel[517].addShapeBox(-0.5F, 0F, -7.1F, 1, 2, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // RNumL
		bodyModel[517].setRotationPoint(66F, -20F, 0F);
		bodyModel[517].rotateAngleY = -0.33161256F;

		bodyModel[518].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.4F, -0.1F, -0.75F, -0.4F, -0.1F, -0.75F, -0.4F, -0.1F, 0F, -0.4F, -0.1F); // Box 11
		bodyModel[518].setRotationPoint(66F, -21F, -1F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // LR
		bodyModel[519].setRotationPoint(66.25F, -21F, -1F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // LR
		bodyModel[520].setRotationPoint(66.25F, -19.3F, -1F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 601
		bodyModel[521].setRotationPoint(65.5F, -7F, -5F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 602
		bodyModel[522].setRotationPoint(65.5F, -10.5F, -5F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 603
		bodyModel[523].setRotationPoint(65.5F, -14F, -5F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 604
		bodyModel[524].setRotationPoint(65.5F, -17.5F, -5F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 605
		bodyModel[525].setRotationPoint(64F, -21.5F, -5F);
		bodyModel[525].rotateAngleY = -0.31415927F;

		bodyModel[526].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -0.5F, -0.75F, -1F, 0.25F, -0.25F, -0.15F, 0.25F, 0F, 0F, 0.62F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.15F); // Box 659
		bodyModel[526].setRotationPoint(69.25F, 4F, 2.5F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, 0F); // Box 660
		bodyModel[527].setRotationPoint(69.25F, 6F, 0.5F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 661
		bodyModel[528].setRotationPoint(69.25F, 6F, -0.5F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0.5F, 0F, 0F, 0.25F, 0F, -1F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 662
		bodyModel[529].setRotationPoint(69.25F, 6F, -8.5F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1.75F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.25F, -1.75F, 0F, -0.25F); // Box 664
		bodyModel[530].setRotationPoint(68.4F, 3F, 4.6F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1.75F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, -0.25F, -1.25F, 0F, -0.25F); // Box 665
		bodyModel[531].setRotationPoint(69.4F, 4F, 4.6F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Box 666
		bodyModel[532].setRotationPoint(69.9F, 7F, 4.6F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, 0F, -1.75F, 0F, 0F); // Box 667
		bodyModel[533].setRotationPoint(68.4F, 3F, -7.6F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 1F, 0F, 0F, -1.75F, 0F, 0F); // Box 668
		bodyModel[534].setRotationPoint(69.4F, 4F, -7.6F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, -1.25F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, -1.25F, 0F, 0F); // Box 669
		bodyModel[535].setRotationPoint(69.9F, 7F, -7.6F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0.25F, -0.25F, -0.15F, -0.5F, -0.75F, -1F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.15F, 0.25F, 0F, -1F, 0.62F, 0F, 0F, 0.25F, 0F, 0F); // Box 537
		bodyModel[536].setRotationPoint(69.25F, 4F, -8.5F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 492
		bodyModel[537].setRotationPoint(-72F, -4F, -2.5F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[538].setRotationPoint(71F, -4F, -2.5F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F); // box
		bodyModel[539].setRotationPoint(-70.25F, 2.7F, -7.62F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[540].setRotationPoint(-69.75F, 2.7F, -7.62F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[541].setRotationPoint(-69.75F, 2.7F, 4.38F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 83
		bodyModel[542].setRotationPoint(-70.25F, 2.7F, 4.38F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F); // Box 543
		bodyModel[543].setRotationPoint(41.5F, -6.5F, 6.6F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F); // Box 544
		bodyModel[544].setRotationPoint(44.5F, -6.5F, 6.6F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F); // Box 545
		bodyModel[545].setRotationPoint(44.5F, -10.5F, 6.6F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F); // Box 546
		bodyModel[546].setRotationPoint(41.5F, -10.5F, 6.6F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 5, 5, 14, 0F,-0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F); // Box 679
		bodyModel[547].setRotationPoint(35.5F, -20.5F, -7F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 5, 5, 14, 0F,-0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F); // Box 682
		bodyModel[548].setRotationPoint(31F, -20.5F, -7F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 5, 5, 14, 0F,-0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F); // Box 683
		bodyModel[549].setRotationPoint(31F, -16F, -7F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 5, 5, 14, 0F,-0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F); // Box 684
		bodyModel[550].setRotationPoint(35.5F, -16F, -7F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 5, 5, 14, 0F,-0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F); // Box 551
		bodyModel[551].setRotationPoint(-21F, -15.5F, -7F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 5, 5, 14, 0F,-0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F); // Box 552
		bodyModel[552].setRotationPoint(-25.5F, -15.5F, -7F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 5, 5, 14, 0F,-0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F); // Box 554
		bodyModel[553].setRotationPoint(-21F, -11.5F, -7F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 5, 5, 14, 0F,-0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F); // Box 555
		bodyModel[554].setRotationPoint(-25.5F, -11.5F, -7F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 5, 5, 14, 0F,-0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F); // Box 556
		bodyModel[555].setRotationPoint(-21F, -7.5F, -7F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 5, 5, 14, 0F,-0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F); // Box 557
		bodyModel[556].setRotationPoint(-25.5F, -7.5F, -7F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // ditch
		bodyModel[557].setRotationPoint(-70F, -1F, -9F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.4F, -0.1F, -0.5F, 0.4F, -0.1F, -0.5F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, -0.6F, -0.1F, -0.5F, -0.6F, -0.1F, -0.5F, -0.6F, -0.1F, 0F, -0.6F, -0.1F); // Box 622
		bodyModel[558].setRotationPoint(-69.31F, -0.5F, -9F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // ditch
		bodyModel[559].setRotationPoint(-70F, -1F, 7F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.4F, -0.1F, -0.5F, 0.4F, -0.1F, -0.5F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, -0.6F, -0.1F, -0.5F, -0.6F, -0.1F, -0.5F, -0.6F, -0.1F, 0F, -0.6F, -0.1F); // Box 624
		bodyModel[560].setRotationPoint(-69.31F, -0.5F, 7F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 20, 4, 0, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 561
		bodyModel[561].setRotationPoint(-11F, -17.5F, -7.1F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 20, 4, 0, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 562
		bodyModel[562].setRotationPoint(9F, -17.5F, 7.1F);
		bodyModel[562].rotateAngleY = 3.14159265F;

		bodyModel[563].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.25F, 0F, -1F, -1.25F, 0F, -1F, 0.5F, 0F, -1F, 0.5F); // box
		bodyModel[563].setRotationPoint(-51.5F, -18.4F, 10.75F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, -1F, -1.25F, 0F, -1F, -1.25F, 0F, -1F, 0.5F, -2F, -1F, 0.5F); // box
		bodyModel[564].setRotationPoint(-53.5F, -18.4F, 10.75F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.25F, -2F, -1F, -1.25F, -2F, -1F, 0.5F, 0F, -1F, 0.5F); // Box 472
		bodyModel[565].setRotationPoint(-46.5F, -18.4F, 10.75F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, -1.25F, -2F, -1F, -1.25F); // Box 473
		bodyModel[566].setRotationPoint(-53.5F, -18.4F, -11.75F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, -1.25F, 0F, -1F, -1.25F); // Box 474
		bodyModel[567].setRotationPoint(-51.5F, -18.4F, -11.75F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0.5F, -2F, -1F, 0.5F, -2F, -1F, -1.25F, 0F, -1F, -1.25F); // Box 475
		bodyModel[568].setRotationPoint(-46.5F, -18.4F, -11.75F);
	}

	DofascoTruck bogieFront = new DofascoTruck();
	DofascoTruckR bogieRear = new DofascoTruckR();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 1 || entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 2
		) {
			Tessellator.bindTexture(new ResourceLocation(wwcp.common.library.Info.modID, "textures/bogies/Dofasco_Truck_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-2.9f, -0.0, 0);//front & rear
			bogieFront.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(5.75f, 0, 0);//rear
			bogieRear.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.modID, "textures/bogies/Dofasco_Truck.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-2.9f, -0.0, 0);//front & rear
			bogieFront.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(5.75f, 0, 0);//rear
			bogieRear.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}

	}

}