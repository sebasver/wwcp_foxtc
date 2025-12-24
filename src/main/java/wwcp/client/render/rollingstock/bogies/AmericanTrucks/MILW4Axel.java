package wwcp.client.render.rollingstock.bogies.AmericanTrucks;


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class MILW4Axel extends ModelConverter
{
	int textureX = 512;
	int textureY = 512;

	public MILW4Axel() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[195];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Wheel
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Wheel
		bodyModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 589
		bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 591
		bodyModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 592
		bodyModel[5] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 593
		bodyModel[6] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 594
		bodyModel[7] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 595
		bodyModel[8] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 596
		bodyModel[9] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Wheel
		bodyModel[10] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 598
		bodyModel[11] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Wheel
		bodyModel[12] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Wheel
		bodyModel[13] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 601
		bodyModel[14] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Wheel
		bodyModel[15] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 603
		bodyModel[16] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 605
		bodyModel[17] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 606
		bodyModel[18] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 607
		bodyModel[19] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 609
		bodyModel[20] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 610
		bodyModel[21] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 611
		bodyModel[22] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 614
		bodyModel[23] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 615
		bodyModel[24] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 616
		bodyModel[25] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 617
		bodyModel[26] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 618
		bodyModel[27] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 619
		bodyModel[28] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 620
		bodyModel[29] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 621
		bodyModel[30] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 622
		bodyModel[31] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 623
		bodyModel[32] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 624
		bodyModel[33] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 625
		bodyModel[34] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 626
		bodyModel[35] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 627
		bodyModel[36] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 628
		bodyModel[37] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 629
		bodyModel[38] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 630
		bodyModel[39] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 631
		bodyModel[40] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 632
		bodyModel[41] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 633
		bodyModel[42] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 634
		bodyModel[43] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 635
		bodyModel[44] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 636
		bodyModel[45] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 637
		bodyModel[46] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 638
		bodyModel[47] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 639
		bodyModel[48] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 640
		bodyModel[49] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 641
		bodyModel[50] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 642
		bodyModel[51] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 643
		bodyModel[52] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 644
		bodyModel[53] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 645
		bodyModel[54] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 646
		bodyModel[55] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 647
		bodyModel[56] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 648
		bodyModel[57] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 650
		bodyModel[58] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 651
		bodyModel[59] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 653
		bodyModel[60] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 654
		bodyModel[61] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 655
		bodyModel[62] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 656
		bodyModel[63] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 657
		bodyModel[64] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 658
		bodyModel[65] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 659
		bodyModel[66] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 660
		bodyModel[67] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 661
		bodyModel[68] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 662
		bodyModel[69] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 663
		bodyModel[70] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 664
		bodyModel[71] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // box
		bodyModel[72] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // box
		bodyModel[73] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // box
		bodyModel[74] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // box
		bodyModel[75] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // box
		bodyModel[76] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 670
		bodyModel[77] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 663
		bodyModel[78] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 664
		bodyModel[79] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 665
		bodyModel[80] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 666
		bodyModel[81] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 667
		bodyModel[82] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 668
		bodyModel[83] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 669
		bodyModel[84] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 670
		bodyModel[85] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 671
		bodyModel[86] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 672
		bodyModel[87] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 673
		bodyModel[88] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 674
		bodyModel[89] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 675
		bodyModel[90] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 676
		bodyModel[91] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 677
		bodyModel[92] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 678
		bodyModel[93] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 679
		bodyModel[94] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 680
		bodyModel[95] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 683
		bodyModel[96] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 684
		bodyModel[97] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 685
		bodyModel[98] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 686
		bodyModel[99] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 687
		bodyModel[100] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 688
		bodyModel[101] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 689
		bodyModel[102] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 690
		bodyModel[103] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Wheel
		bodyModel[104] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 692
		bodyModel[105] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Wheel
		bodyModel[106] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 691
		bodyModel[107] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 692
		bodyModel[108] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 693
		bodyModel[109] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 694
		bodyModel[110] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 695
		bodyModel[111] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 696
		bodyModel[112] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 698
		bodyModel[113] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 699
		bodyModel[114] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 700
		bodyModel[115] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 701
		bodyModel[116] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 702
		bodyModel[117] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 703
		bodyModel[118] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 704
		bodyModel[119] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 705
		bodyModel[120] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 706
		bodyModel[121] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 160
		bodyModel[122] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 161
		bodyModel[123] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 162
		bodyModel[124] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 164
		bodyModel[125] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 165
		bodyModel[126] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 166
		bodyModel[127] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 167
		bodyModel[128] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 168
		bodyModel[129] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 169
		bodyModel[130] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 170
		bodyModel[131] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 171
		bodyModel[132] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 173
		bodyModel[133] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 174
		bodyModel[134] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 175
		bodyModel[135] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 176
		bodyModel[136] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 178
		bodyModel[137] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 179
		bodyModel[138] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 180
		bodyModel[139] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 181
		bodyModel[140] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 182
		bodyModel[141] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 183
		bodyModel[142] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 184
		bodyModel[143] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 185
		bodyModel[144] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 186
		bodyModel[145] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 187
		bodyModel[146] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 188
		bodyModel[147] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 189
		bodyModel[148] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 191
		bodyModel[149] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 192
		bodyModel[150] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 193
		bodyModel[151] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 195
		bodyModel[152] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 196
		bodyModel[153] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 197
		bodyModel[154] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 198
		bodyModel[155] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 199
		bodyModel[156] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 200
		bodyModel[157] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 201
		bodyModel[158] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 202
		bodyModel[159] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 203
		bodyModel[160] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 204
		bodyModel[161] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 205
		bodyModel[162] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 206
		bodyModel[163] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 207
		bodyModel[164] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 208
		bodyModel[165] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 209
		bodyModel[166] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 210
		bodyModel[167] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 211
		bodyModel[168] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 212
		bodyModel[169] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 213
		bodyModel[170] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 214
		bodyModel[171] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 215
		bodyModel[172] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 216
		bodyModel[173] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 217
		bodyModel[174] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 218
		bodyModel[175] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 180
		bodyModel[176] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 181
		bodyModel[177] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 182
		bodyModel[178] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 183
		bodyModel[179] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 184
		bodyModel[180] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 185
		bodyModel[181] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 186
		bodyModel[182] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 187
		bodyModel[183] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 188
		bodyModel[184] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 189
		bodyModel[185] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 190
		bodyModel[186] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 191
		bodyModel[187] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 192
		bodyModel[188] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 193
		bodyModel[189] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 194
		bodyModel[190] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 195
		bodyModel[191] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 196
		bodyModel[192] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 197
		bodyModel[193] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 231
		bodyModel[194] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 232

		bodyModel[0].addBox(-6F, -6F, 0F, 12, 12, 0, 0F); // Wheel
		bodyModel[0].setRotationPoint(-9.5F, 4F, -5.95F);

		bodyModel[1].addBox(-6F, -6F, 0F, 12, 12, 0, 0F); // Wheel
		bodyModel[1].setRotationPoint(-9.5F, 4F, 5.75F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F); // Box 589
		bodyModel[2].setRotationPoint(-10.5F, 3F, -10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 591
		bodyModel[3].setRotationPoint(-12F, 2.25F, -9F);

		bodyModel[4].addBox(0F, 0F, 0F, 57, 1, 2, 0F); // Box 592
		bodyModel[4].setRotationPoint(-13.5F, 1.25F, -9F);

		bodyModel[5].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 593
		bodyModel[5].setRotationPoint(-12.5F, 6.25F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 594
		bodyModel[6].setRotationPoint(-8F, 2.25F, -9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 595
		bodyModel[7].setRotationPoint(-13.25F, 5.25F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 596
		bodyModel[8].setRotationPoint(-6.75F, 5.25F, -9F);

		bodyModel[9].addBox(-6F, -6F, 0F, 12, 12, 0, 0F); // Wheel
		bodyModel[9].setRotationPoint(10.5F, 4F, -5.95F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F); // Box 598
		bodyModel[10].setRotationPoint(9.5F, 3F, -10F);

		bodyModel[11].addBox(-6F, -6F, 0F, 12, 12, 0, 0F); // Wheel
		bodyModel[11].setRotationPoint(10.5F, 4F, 5.75F);

		bodyModel[12].addBox(-6F, -6F, 0F, 12, 12, 0, 0F); // Wheel
		bodyModel[12].setRotationPoint(26.5F, 4F, -5.95F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F); // Box 601
		bodyModel[13].setRotationPoint(25.5F, 3F, -10F);

		bodyModel[14].addBox(-6F, -6F, 0F, 12, 12, 0, 0F); // Wheel
		bodyModel[14].setRotationPoint(26.5F, 4F, 5.75F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 603
		bodyModel[15].setRotationPoint(8F, 2.25F, -9F);

		bodyModel[16].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 605
		bodyModel[16].setRotationPoint(7.5F, 6.25F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 606
		bodyModel[17].setRotationPoint(12F, 2.25F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 607
		bodyModel[18].setRotationPoint(24F, 2.25F, -9F);

		bodyModel[19].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 609
		bodyModel[19].setRotationPoint(23.5F, 6.25F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 610
		bodyModel[20].setRotationPoint(28F, 2.25F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 611
		bodyModel[21].setRotationPoint(13.25F, 5.25F, -9F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 614
		bodyModel[22].setRotationPoint(-10F, -1.75F, -9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 615
		bodyModel[23].setRotationPoint(-14F, -1.75F, -9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 616
		bodyModel[24].setRotationPoint(-14F, -1.75F, -9.25F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 617
		bodyModel[25].setRotationPoint(-9F, -1.75F, -9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F); // Box 618
		bodyModel[26].setRotationPoint(-5F, -1.75F, -9.25F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 619
		bodyModel[27].setRotationPoint(6F, -1.75F, -9F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 620
		bodyModel[28].setRotationPoint(10F, -1.75F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 621
		bodyModel[29].setRotationPoint(11F, -1.75F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F); // Box 622
		bodyModel[30].setRotationPoint(6F, -1.75F, -9.25F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 623
		bodyModel[31].setRotationPoint(15F, -1.75F, -9.25F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 624
		bodyModel[32].setRotationPoint(31F, -1.25F, -9.25F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 625
		bodyModel[33].setRotationPoint(27F, -1.75F, -9F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 626
		bodyModel[34].setRotationPoint(26F, -1.75F, -9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 627
		bodyModel[35].setRotationPoint(22F, -1.75F, -9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 628
		bodyModel[36].setRotationPoint(22F, -1.75F, -9.25F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 629
		bodyModel[37].setRotationPoint(18F, 3.25F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 630
		bodyModel[38].setRotationPoint(19F, 2.75F, -9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 631
		bodyModel[39].setRotationPoint(15F, 2.75F, -9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 632
		bodyModel[40].setRotationPoint(18F, 1.75F, -9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 633
		bodyModel[41].setRotationPoint(2F, 7.25F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 634
		bodyModel[42].setRotationPoint(-5F, 7.25F, -9F);

		bodyModel[43].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 635
		bodyModel[43].setRotationPoint(-1F, 7.25F, -9F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 636
		bodyModel[44].setRotationPoint(-1F, 6.25F, -9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 637
		bodyModel[45].setRotationPoint(-14.5F, 2.25F, -9F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 638
		bodyModel[46].setRotationPoint(17F, -0.25F, -9F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 639
		bodyModel[47].setRotationPoint(2F, 2.25F, -9F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 640
		bodyModel[48].setRotationPoint(-3F, 2.25F, -9F);

		bodyModel[49].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 641
		bodyModel[49].setRotationPoint(-2F, 3.25F, -10F);

		bodyModel[50].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 642
		bodyModel[50].setRotationPoint(-2F, 2.75F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 643
		bodyModel[51].setRotationPoint(29.25F, 5.25F, -9F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 644
		bodyModel[52].setRotationPoint(33.5F, 2.25F, -9F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 645
		bodyModel[53].setRotationPoint(-17.5F, 1.25F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 646
		bodyModel[54].setRotationPoint(-17.5F, 5.25F, -9F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F); // Box 647
		bodyModel[55].setRotationPoint(-18.5F, 0.25F, -9F);

		bodyModel[56].addBox(0F, 0F, 0F, 17, 3, 1, 0F); // Box 648
		bodyModel[56].setRotationPoint(-35.5F, 0.25F, -9F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F); // Box 650
		bodyModel[57].setRotationPoint(-26.5F, 3.25F, -9F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 651
		bodyModel[58].setRotationPoint(-40.5F, 1.25F, -9F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F); // Box 653
		bodyModel[59].setRotationPoint(-26.5F, 3.25F, 8F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 654
		bodyModel[60].setRotationPoint(-17.5F, 5.25F, 7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 655
		bodyModel[61].setRotationPoint(-17.5F, 1.25F, 7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 656
		bodyModel[62].setRotationPoint(-12F, 2.25F, 7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 657
		bodyModel[63].setRotationPoint(-13.25F, 5.25F, 7F);

		bodyModel[64].addBox(0F, 0F, 0F, 57, 1, 2, 0F); // Box 658
		bodyModel[64].setRotationPoint(-13.5F, 1.25F, 7F);

		bodyModel[65].addBox(0F, 0F, 0F, 17, 3, 1, 0F); // Box 659
		bodyModel[65].setRotationPoint(-35.5F, 0.25F, 8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F); // Box 660
		bodyModel[66].setRotationPoint(-18.5F, 0.25F, 7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 661
		bodyModel[67].setRotationPoint(-36.5F, 0.25F, -9F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 662
		bodyModel[68].setRotationPoint(-36.5F, 0.25F, 8F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 663
		bodyModel[69].setRotationPoint(-41.5F, 1.25F, -3F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 664
		bodyModel[70].setRotationPoint(-40.5F, 3.25F, -3F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[71].setRotationPoint(-42.5F, 3.5F, -0.5F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // box
		bodyModel[72].setRotationPoint(-43.5F, 3F, -0.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[73].setRotationPoint(-43.5F, 3F, -1.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[74].setRotationPoint(-45.5F, 3F, -0.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[75].setRotationPoint(-44.5F, 3F, 0.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 670
		bodyModel[76].setRotationPoint(-41.5F, 2.25F, -8F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 663
		bodyModel[77].setRotationPoint(-41.5F, 2.25F, 5F);

		bodyModel[78].addBox(0F, 0F, 0F, 21, 1, 16, 0F); // Box 664
		bodyModel[78].setRotationPoint(-39.5F, 1.25F, -8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 665
		bodyModel[79].setRotationPoint(-41F, 0.5F, -8F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 666
		bodyModel[80].setRotationPoint(-41.5F, 0.25F, 0F);

		bodyModel[81].addBox(0F, 0F, 0F, 5, 2, 6, 0F); // Box 667
		bodyModel[81].setRotationPoint(-38.5F, -0.75F, -3F);

		bodyModel[82].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 668
		bodyModel[82].setRotationPoint(-39.5F, 3.25F, -10F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 669
		bodyModel[83].setRotationPoint(-36.5F, 2.25F, -10F);

		bodyModel[84].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 670
		bodyModel[84].setRotationPoint(-39.5F, 7.25F, -10F);

		bodyModel[85].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 671
		bodyModel[85].setRotationPoint(-39.5F, 5.25F, -10F);

		bodyModel[86].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 672
		bodyModel[86].setRotationPoint(-39.5F, 3.25F, -10F);

		bodyModel[87].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 673
		bodyModel[87].setRotationPoint(-39.5F, 3.25F, 9F);

		bodyModel[88].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 674
		bodyModel[88].setRotationPoint(-39.5F, 3.25F, 9F);

		bodyModel[89].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 675
		bodyModel[89].setRotationPoint(-39.5F, 5.25F, 9F);

		bodyModel[90].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 676
		bodyModel[90].setRotationPoint(-39.5F, 7.25F, 9F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 677
		bodyModel[91].setRotationPoint(-36.5F, 2.25F, 9F);

		bodyModel[92].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 678
		bodyModel[92].setRotationPoint(-39.5F, 1.25F, -9F);

		bodyModel[93].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 679
		bodyModel[93].setRotationPoint(-39.5F, 1.25F, 8F);

		bodyModel[94].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 680
		bodyModel[94].setRotationPoint(-41.5F, 3.25F, -3F);
		bodyModel[94].rotateAngleZ = -0.17453293F;

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.75F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -1F, -1.75F, 0F, -1F); // Box 683
		bodyModel[95].setRotationPoint(-43F, 5.75F, 0F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 1.85F, -0.5F, -0.5F, -2.6F, -0.5F, -0.5F, -1.3F, 0F, 0F, 0.55F, 0F, 0F, 2F, 0F, 0F, -2.75F, 0F, 0F); // Box 684
		bodyModel[96].setRotationPoint(-43F, 3.75F, 3F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,-2.75F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 0.25F, 0F, 0F); // Box 685
		bodyModel[97].setRotationPoint(-43F, 5.75F, -11F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-2.6F, -0.5F, -0.5F, 1.85F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -2.75F, 0F, 0F, 2F, 0F, 0F, 0.55F, 0F, 0F, -1.3F, 0F, 0F); // Box 686
		bodyModel[98].setRotationPoint(-43F, 3.75F, -11F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 687
		bodyModel[99].setRotationPoint(41.5F, 6.5F, -9F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 688
		bodyModel[100].setRotationPoint(41.5F, 4.5F, -9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,1F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 689
		bodyModel[101].setRotationPoint(39.5F, 4.5F, -9F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 690
		bodyModel[102].setRotationPoint(41.5F, 4F, -9F);

		bodyModel[103].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Wheel
		bodyModel[103].setRotationPoint(40.5F, 6F, -5.95F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 692
		bodyModel[104].setRotationPoint(39.5F, 8F, -9F);

		bodyModel[105].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Wheel
		bodyModel[105].setRotationPoint(40.5F, 6F, 5.75F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 691
		bodyModel[106].setRotationPoint(39.5F, 5F, -10F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 692
		bodyModel[107].setRotationPoint(37.5F, 6.5F, -9F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 693
		bodyModel[108].setRotationPoint(37.5F, 4.5F, -9F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 694
		bodyModel[109].setRotationPoint(38.5F, 4F, -9F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 695
		bodyModel[110].setRotationPoint(43.5F, 6.5F, -9F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 2, 16, 0F); // Box 696
		bodyModel[111].setRotationPoint(44.5F, 6.5F, -8F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 698
		bodyModel[112].setRotationPoint(34.5F, 6.5F, -9F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 699
		bodyModel[113].setRotationPoint(34.5F, 7.5F, -8F);

		bodyModel[114].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 700
		bodyModel[114].setRotationPoint(37.5F, 2.25F, -9F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 5, 2, 0F); // Box 701
		bodyModel[115].setRotationPoint(42.5F, 2.25F, -9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 702
		bodyModel[116].setRotationPoint(38.5F, 3.5F, -9F);

		bodyModel[117].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 703
		bodyModel[117].setRotationPoint(31F, 7.75F, -9F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 704
		bodyModel[118].setRotationPoint(32.5F, 0.25F, -10F);

		bodyModel[119].addBox(0F, -1F, -1F, 4, 2, 2, 0F); // Box 705
		bodyModel[119].setRotationPoint(33.5F, 0.75F, -9.5F);
		bodyModel[119].rotateAngleX = -0.78539816F;

		bodyModel[120].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 706
		bodyModel[120].setRotationPoint(37.5F, 0.25F, -10F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 160
		bodyModel[121].setRotationPoint(-10F, -1.75F, 7F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[122].setRotationPoint(-9F, -1.75F, 7F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 162
		bodyModel[123].setRotationPoint(-14F, -1.75F, 7F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[124].setRotationPoint(-14.5F, 2.25F, 7F);

		bodyModel[125].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 165
		bodyModel[125].setRotationPoint(-12.5F, 6.25F, 7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 166
		bodyModel[126].setRotationPoint(-8F, 2.25F, 7F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[127].setRotationPoint(-6.75F, 5.25F, 7F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 168
		bodyModel[128].setRotationPoint(-3F, 2.25F, 7F);

		bodyModel[129].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 169
		bodyModel[129].setRotationPoint(-2F, 2.75F, 8F);

		bodyModel[130].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 170
		bodyModel[130].setRotationPoint(-2F, 3.25F, 7F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 171
		bodyModel[131].setRotationPoint(2F, 2.25F, 7F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 173
		bodyModel[132].setRotationPoint(-5F, 7.25F, 7F);

		bodyModel[133].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 174
		bodyModel[133].setRotationPoint(-1F, 7.25F, 7F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[134].setRotationPoint(2F, 7.25F, 7F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[135].setRotationPoint(-1F, 6.25F, 7F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 178
		bodyModel[136].setRotationPoint(6F, -1.75F, 7F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 179
		bodyModel[137].setRotationPoint(10F, -1.75F, 7F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[138].setRotationPoint(11F, -1.75F, 7F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 181
		bodyModel[139].setRotationPoint(8F, 2.25F, 7F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 182
		bodyModel[140].setRotationPoint(12F, 2.25F, 7F);

		bodyModel[141].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 183
		bodyModel[141].setRotationPoint(7.5F, 6.25F, 7F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[142].setRotationPoint(13.25F, 5.25F, 7F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[143].setRotationPoint(18F, 3.25F, 7F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 186
		bodyModel[144].setRotationPoint(15F, 2.75F, 7F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[145].setRotationPoint(19F, 2.75F, 7F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[146].setRotationPoint(18F, 1.75F, 7F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 189
		bodyModel[147].setRotationPoint(17F, -0.25F, 7F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 191
		bodyModel[148].setRotationPoint(22F, -1.75F, 7F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 192
		bodyModel[149].setRotationPoint(26F, -1.75F, 7F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[150].setRotationPoint(27F, -1.75F, 7F);

		bodyModel[151].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 195
		bodyModel[151].setRotationPoint(32.5F, 0.25F, 7F);

		bodyModel[152].addBox(0F, -1F, -1F, 4, 2, 2, 0F); // Box 196
		bodyModel[152].setRotationPoint(33.5F, 0.75F, 9.5F);
		bodyModel[152].rotateAngleX = -0.78539816F;

		bodyModel[153].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 197
		bodyModel[153].setRotationPoint(37.5F, 0.25F, 7F);

		bodyModel[154].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 198
		bodyModel[154].setRotationPoint(37.5F, 2.25F, 8F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F); // Box 199
		bodyModel[155].setRotationPoint(34.5F, 6.5F, 8F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0.25F, 0F, 0.5F, 0.25F); // Box 200
		bodyModel[156].setRotationPoint(37.5F, 6.5F, 8F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 201
		bodyModel[157].setRotationPoint(37.5F, 4.5F, 8F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 202
		bodyModel[158].setRotationPoint(38.5F, 3.5F, 8F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 203
		bodyModel[159].setRotationPoint(39.5F, 4.5F, 8F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 204
		bodyModel[160].setRotationPoint(41.5F, 4.5F, 8F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -2F, 0.25F); // Box 205
		bodyModel[161].setRotationPoint(41.5F, 6.5F, 8F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.25F); // Box 206
		bodyModel[162].setRotationPoint(43.5F, 6.5F, 8F);

		bodyModel[163].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 207
		bodyModel[163].setRotationPoint(31F, 7.75F, 7F);

		bodyModel[164].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 208
		bodyModel[164].setRotationPoint(33.5F, 2.25F, 7F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 209
		bodyModel[165].setRotationPoint(28F, 2.25F, 7F);

		bodyModel[166].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 210
		bodyModel[166].setRotationPoint(23.5F, 6.25F, 7F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 211
		bodyModel[167].setRotationPoint(24F, 2.25F, 7F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[168].setRotationPoint(29.25F, 5.25F, 7F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[169].setRotationPoint(38.5F, 4F, 8F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[170].setRotationPoint(39.5F, 8F, 8F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[171].setRotationPoint(41.5F, 4F, 8F);

		bodyModel[172].addBox(0F, 0F, 0F, 1, 5, 2, 0F); // Box 216
		bodyModel[172].setRotationPoint(42.5F, 2.25F, 7F);

		bodyModel[173].addBox(0F, 0F, 0F, 46, 4, 8, 0F); // Box 217
		bodyModel[173].setRotationPoint(-14.5F, 2F, -4F);

		bodyModel[174].addBox(0F, 0F, 0F, 4, 5, 4, 0F); // Box 218
		bodyModel[174].setRotationPoint(-1.5F, -3F, -2F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 180
		bodyModel[175].setRotationPoint(-14F, -1.75F, -7.75F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F); // Box 181
		bodyModel[176].setRotationPoint(-5F, -1.75F, -7.75F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F); // Box 182
		bodyModel[177].setRotationPoint(6F, -1.75F, -7.75F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 183
		bodyModel[178].setRotationPoint(15F, -1.75F, -7.75F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 184
		bodyModel[179].setRotationPoint(22F, -1.75F, -7.75F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 185
		bodyModel[180].setRotationPoint(31F, -1.25F, -7.75F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 186
		bodyModel[181].setRotationPoint(-14F, -1.75F, 8.25F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 187
		bodyModel[182].setRotationPoint(-14F, -1.75F, 6.75F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F); // Box 188
		bodyModel[183].setRotationPoint(-5F, -1.75F, 6.75F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F); // Box 189
		bodyModel[184].setRotationPoint(-5F, -1.75F, 8.25F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F); // Box 190
		bodyModel[185].setRotationPoint(6F, -1.75F, 6.75F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F); // Box 191
		bodyModel[186].setRotationPoint(6F, -1.75F, 8.25F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 192
		bodyModel[187].setRotationPoint(15F, -1.75F, 6.75F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 193
		bodyModel[188].setRotationPoint(15F, -1.75F, 8.25F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 194
		bodyModel[189].setRotationPoint(22F, -1.75F, 6.75F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 195
		bodyModel[190].setRotationPoint(22F, -1.75F, 8.25F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 196
		bodyModel[191].setRotationPoint(31F, -1.25F, 6.75F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 197
		bodyModel[192].setRotationPoint(31F, -1.25F, 8.25F);

		bodyModel[193].addBox(0F, 0F, 0F, 21, 1, 16, 0F); // Box 231
		bodyModel[193].setRotationPoint(-39.5F, 2.25F, -8F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 21, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[194].setRotationPoint(-39.5F, 3.25F, -4F);
	}
}