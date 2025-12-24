package wwcp.client.render.rollingstock.bogies.AmericanTrucks;


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Joe_4Axel_FWD extends ModelConverter
{
	int textureX = 512;
	int textureY = 512;

	public Joe_4Axel_FWD() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[139];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // box
		bodyModel[1] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // box
		bodyModel[2] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // box
		bodyModel[3] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // box
		bodyModel[4] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // box
		bodyModel[5] = new ModelRendererTurbo(this, 377, 193, textureX, textureY); // Box 561
		bodyModel[6] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 670
		bodyModel[7] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Box 663
		bodyModel[8] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Box 683
		bodyModel[9] = new ModelRendererTurbo(this, 281, 177, textureX, textureY); // Box 684
		bodyModel[10] = new ModelRendererTurbo(this, 305, 177, textureX, textureY); // Box 685
		bodyModel[11] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Box 686
		bodyModel[12] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 587
		bodyModel[13] = new ModelRendererTurbo(this, 489, 193, textureX, textureY); // Box 588
		bodyModel[14] = new ModelRendererTurbo(this, 65, 201, textureX, textureY); // Box 589
		bodyModel[15] = new ModelRendererTurbo(this, 25, 201, textureX, textureY); // Box 597
		bodyModel[16] = new ModelRendererTurbo(this, 97, 209, textureX, textureY); // Box 598
		bodyModel[17] = new ModelRendererTurbo(this, 153, 217, textureX, textureY); // Box 599
		bodyModel[18] = new ModelRendererTurbo(this, 153, 209, textureX, textureY); // Box 580
		bodyModel[19] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Box 588
		bodyModel[20] = new ModelRendererTurbo(this, 385, 185, textureX, textureY); // Box 589
		bodyModel[21] = new ModelRendererTurbo(this, 321, 209, textureX, textureY); // Box 592
		bodyModel[22] = new ModelRendererTurbo(this, 353, 209, textureX, textureY); // Box 593
		bodyModel[23] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Box 594
		bodyModel[24] = new ModelRendererTurbo(this, 489, 209, textureX, textureY); // Box 595
		bodyModel[25] = new ModelRendererTurbo(this, 153, 217, textureX, textureY); // Box 596
		bodyModel[26] = new ModelRendererTurbo(this, 177, 217, textureX, textureY); // Box 597
		bodyModel[27] = new ModelRendererTurbo(this, 409, 185, textureX, textureY); // Box 599
		bodyModel[28] = new ModelRendererTurbo(this, 233, 217, textureX, textureY); // Box 626
		bodyModel[29] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 627
		bodyModel[30] = new ModelRendererTurbo(this, 257, 217, textureX, textureY); // Box 628
		bodyModel[31] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 704
		bodyModel[32] = new ModelRendererTurbo(this, 281, 217, textureX, textureY); // Box 705
		bodyModel[33] = new ModelRendererTurbo(this, 281, 177, textureX, textureY); // Box 706
		bodyModel[34] = new ModelRendererTurbo(this, 377, 177, textureX, textureY); // Box 637
		bodyModel[35] = new ModelRendererTurbo(this, 297, 217, textureX, textureY); // Box 638
		bodyModel[36] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 639
		bodyModel[37] = new ModelRendererTurbo(this, 417, 177, textureX, textureY); // Box 640
		bodyModel[38] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 145
		bodyModel[39] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Box 52
		bodyModel[40] = new ModelRendererTurbo(this, 497, 185, textureX, textureY); // Box 52
		bodyModel[41] = new ModelRendererTurbo(this, 321, 217, textureX, textureY); // Box 453
		bodyModel[42] = new ModelRendererTurbo(this, 329, 217, textureX, textureY); // Box 645
		bodyModel[43] = new ModelRendererTurbo(this, 377, 217, textureX, textureY); // Box 646
		bodyModel[44] = new ModelRendererTurbo(this, 385, 217, textureX, textureY); // Box 647
		bodyModel[45] = new ModelRendererTurbo(this, 401, 217, textureX, textureY); // Box 648
		bodyModel[46] = new ModelRendererTurbo(this, 425, 217, textureX, textureY); // Box 649
		bodyModel[47] = new ModelRendererTurbo(this, 433, 217, textureX, textureY); // Box 650
		bodyModel[48] = new ModelRendererTurbo(this, 137, 225, textureX, textureY); // Box 651
		bodyModel[49] = new ModelRendererTurbo(this, 97, 201, textureX, textureY); // Box 652
		bodyModel[50] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 653
		bodyModel[51] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Box 654
		bodyModel[52] = new ModelRendererTurbo(this, 441, 217, textureX, textureY); // Box 655
		bodyModel[53] = new ModelRendererTurbo(this, 185, 225, textureX, textureY); // Box 656
		bodyModel[54] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Box 3
		bodyModel[55] = new ModelRendererTurbo(this, 273, 225, textureX, textureY); // Box 659
		bodyModel[56] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 680
		bodyModel[57] = new ModelRendererTurbo(this, 17, 225, textureX, textureY); // Box 661
		bodyModel[58] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 662
		bodyModel[59] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Box 663
		bodyModel[60] = new ModelRendererTurbo(this, 217, 225, textureX, textureY); // Box 664
		bodyModel[61] = new ModelRendererTurbo(this, 497, 177, textureX, textureY); // Box 665
		bodyModel[62] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Box 666
		bodyModel[63] = new ModelRendererTurbo(this, 305, 185, textureX, textureY); // Box 667
		bodyModel[64] = new ModelRendererTurbo(this, 409, 233, textureX, textureY); // Box 708
		bodyModel[65] = new ModelRendererTurbo(this, 225, 233, textureX, textureY); // Box 709
		bodyModel[66] = new ModelRendererTurbo(this, 353, 241, textureX, textureY); // Box 732
		bodyModel[67] = new ModelRendererTurbo(this, 177, 241, textureX, textureY); // Box 742
		bodyModel[68] = new ModelRendererTurbo(this, 473, 241, textureX, textureY); // Box 743
		bodyModel[69] = new ModelRendererTurbo(this, 481, 241, textureX, textureY); // Box 744
		bodyModel[70] = new ModelRendererTurbo(this, 497, 241, textureX, textureY); // Box 745
		bodyModel[71] = new ModelRendererTurbo(this, 505, 241, textureX, textureY); // Box 746
		bodyModel[72] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 747
		bodyModel[73] = new ModelRendererTurbo(this, 17, 249, textureX, textureY); // Box 748
		bodyModel[74] = new ModelRendererTurbo(this, 249, 249, textureX, textureY); // DLL
		bodyModel[75] = new ModelRendererTurbo(this, 265, 249, textureX, textureY); // box
		bodyModel[76] = new ModelRendererTurbo(this, 273, 249, textureX, textureY); // DLR
		bodyModel[77] = new ModelRendererTurbo(this, 281, 249, textureX, textureY); // box
		bodyModel[78] = new ModelRendererTurbo(this, 289, 249, textureX, textureY); // box
		bodyModel[79] = new ModelRendererTurbo(this, 297, 249, textureX, textureY); // Ditchlight_Right_Top_sp
		bodyModel[80] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Box 590
		bodyModel[81] = new ModelRendererTurbo(this, 313, 209, textureX, textureY); // Box 591
		bodyModel[82] = new ModelRendererTurbo(this, 201, 217, textureX, textureY); // Box 598
		bodyModel[83] = new ModelRendererTurbo(this, 137, 161, textureX, textureY); // Box 600
		bodyModel[84] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 601
		bodyModel[85] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 602
		bodyModel[86] = new ModelRendererTurbo(this, 25, 169, textureX, textureY); // Box 603
		bodyModel[87] = new ModelRendererTurbo(this, 57, 169, textureX, textureY); // Box 604
		bodyModel[88] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Box 605
		bodyModel[89] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 606
		bodyModel[90] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 607
		bodyModel[91] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 608
		bodyModel[92] = new ModelRendererTurbo(this, 385, 193, textureX, textureY); // Box 609
		bodyModel[93] = new ModelRendererTurbo(this, 153, 169, textureX, textureY); // Box 610
		bodyModel[94] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 611
		bodyModel[95] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Box 612
		bodyModel[96] = new ModelRendererTurbo(this, 49, 201, textureX, textureY); // Box 613
		bodyModel[97] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Box 614
		bodyModel[98] = new ModelRendererTurbo(this, 65, 201, textureX, textureY); // Box 615
		bodyModel[99] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Box 616
		bodyModel[100] = new ModelRendererTurbo(this, 257, 169, textureX, textureY); // Box 617
		bodyModel[101] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 618
		bodyModel[102] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); // Box 619
		bodyModel[103] = new ModelRendererTurbo(this, 49, 209, textureX, textureY); // Box 620
		bodyModel[104] = new ModelRendererTurbo(this, 321, 177, textureX, textureY); // Box 621
		bodyModel[105] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Box 622
		bodyModel[106] = new ModelRendererTurbo(this, 97, 209, textureX, textureY); // Box 623
		bodyModel[107] = new ModelRendererTurbo(this, 353, 177, textureX, textureY); // Box 624
		bodyModel[108] = new ModelRendererTurbo(this, 233, 217, textureX, textureY); // Box 625
		bodyModel[109] = new ModelRendererTurbo(this, 385, 233, textureX, textureY); // Box 710
		bodyModel[110] = new ModelRendererTurbo(this, 353, 225, textureX, textureY); // Box 711
		bodyModel[111] = new ModelRendererTurbo(this, 433, 233, textureX, textureY); // Box 712
		bodyModel[112] = new ModelRendererTurbo(this, 457, 225, textureX, textureY); // Box 713
		bodyModel[113] = new ModelRendererTurbo(this, 449, 233, textureX, textureY); // Box 714
		bodyModel[114] = new ModelRendererTurbo(this, 481, 233, textureX, textureY); // Box 715
		bodyModel[115] = new ModelRendererTurbo(this, 497, 233, textureX, textureY); // Box 716
		bodyModel[116] = new ModelRendererTurbo(this, 489, 225, textureX, textureY); // Box 717
		bodyModel[117] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 718
		bodyModel[118] = new ModelRendererTurbo(this, 17, 241, textureX, textureY); // Box 719
		bodyModel[119] = new ModelRendererTurbo(this, 33, 241, textureX, textureY); // Box 720
		bodyModel[120] = new ModelRendererTurbo(this, 65, 241, textureX, textureY); // Box 721
		bodyModel[121] = new ModelRendererTurbo(this, 81, 241, textureX, textureY); // Box 722
		bodyModel[122] = new ModelRendererTurbo(this, 113, 241, textureX, textureY); // Box 723
		bodyModel[123] = new ModelRendererTurbo(this, 129, 241, textureX, textureY); // Box 724
		bodyModel[124] = new ModelRendererTurbo(this, 145, 241, textureX, textureY); // Box 725
		bodyModel[125] = new ModelRendererTurbo(this, 161, 241, textureX, textureY); // Box 726
		bodyModel[126] = new ModelRendererTurbo(this, 233, 241, textureX, textureY); // Box 727
		bodyModel[127] = new ModelRendererTurbo(this, 249, 241, textureX, textureY); // Box 728
		bodyModel[128] = new ModelRendererTurbo(this, 265, 241, textureX, textureY); // Box 729
		bodyModel[129] = new ModelRendererTurbo(this, 321, 241, textureX, textureY); // Box 730
		bodyModel[130] = new ModelRendererTurbo(this, 9, 209, textureX, textureY); // Box 734
		bodyModel[131] = new ModelRendererTurbo(this, 73, 209, textureX, textureY); // Box 735
		bodyModel[132] = new ModelRendererTurbo(this, 105, 209, textureX, textureY); // Box 736
		bodyModel[133] = new ModelRendererTurbo(this, 273, 209, textureX, textureY); // Box 737
		bodyModel[134] = new ModelRendererTurbo(this, 9, 225, textureX, textureY); // Box 738
		bodyModel[135] = new ModelRendererTurbo(this, 425, 241, textureX, textureY); // Box 739
		bodyModel[136] = new ModelRendererTurbo(this, 441, 241, textureX, textureY); // Box 740
		bodyModel[137] = new ModelRendererTurbo(this, 457, 241, textureX, textureY); // Box 741
		bodyModel[138] = new ModelRendererTurbo(this, 25, 249, textureX, textureY); // Box 749

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[0].setRotationPoint(-44.25F, 3.5F, -0.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // box
		bodyModel[1].setRotationPoint(-45.25F, 3F, -0.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[2].setRotationPoint(-45.25F, 3F, -1.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[3].setRotationPoint(-47.25F, 3F, -0.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[4].setRotationPoint(-46.25F, 3F, 0.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 31, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 561
		bodyModel[5].setRotationPoint(-42.75F, 0.5F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F); // Box 670
		bodyModel[6].setRotationPoint(-43.75F, 1.25F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 663
		bodyModel[7].setRotationPoint(-43.75F, 1.25F, 5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.75F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -1F, -1.75F, 0F, -1F); // Box 683
		bodyModel[8].setRotationPoint(-45.25F, 5.75F, 0F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,-0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 1.35F, -0.5F, -0.5F, -2.1F, -0.5F, -0.5F, -1.3F, 0F, 0F, 0.55F, 0F, 0F, 2F, 0F, 0F, -2.75F, 0F, 0F); // Box 684
		bodyModel[9].setRotationPoint(-45.25F, 2.75F, 3F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,-2.75F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 0.25F, 0F, 0F); // Box 685
		bodyModel[10].setRotationPoint(-45.25F, 5.75F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,-2.1F, -0.5F, -0.5F, 1.35F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -2.75F, 0F, 0F, 2F, 0F, 0F, 0.55F, 0F, 0F, -1.3F, 0F, 0F); // Box 686
		bodyModel[11].setRotationPoint(-45.25F, 2.75F, -11F);

		bodyModel[12].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // Box 587
		bodyModel[12].setRotationPoint(-6.25F, 5F, -5.95F);

		bodyModel[13].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // Box 588
		bodyModel[13].setRotationPoint(-6.25F, 5F, 5.75F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 589
		bodyModel[14].setRotationPoint(-7.25F, 4F, -10F);

		bodyModel[15].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // Box 597
		bodyModel[15].setRotationPoint(8.75F, 5F, -5.95F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F); // Box 598
		bodyModel[16].setRotationPoint(7.75F, 4F, -10F);

		bodyModel[17].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // Box 599
		bodyModel[17].setRotationPoint(8.75F, 5F, 5.75F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 58, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 580
		bodyModel[18].setRotationPoint(-11.75F, 0.5F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 588
		bodyModel[19].setRotationPoint(-17.75F, 2.5F, -9F);

		bodyModel[20].addBox(0F, 0F, 0F, 9, 2, 2, 0F); // Box 589
		bodyModel[20].setRotationPoint(-16.75F, 2.5F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F); // Box 592
		bodyModel[21].setRotationPoint(36.75F, 4F, -10F);

		bodyModel[22].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // Box 593
		bodyModel[22].setRotationPoint(37.75F, 5F, -5.95F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 594
		bodyModel[23].setRotationPoint(21.75F, 4F, -10F);

		bodyModel[24].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // Box 595
		bodyModel[24].setRotationPoint(22.75F, 5F, -5.95F);

		bodyModel[25].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // Box 596
		bodyModel[25].setRotationPoint(37.75F, 5F, 5.75F);

		bodyModel[26].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // Box 597
		bodyModel[26].setRotationPoint(22.75F, 5F, 5.75F);

		bodyModel[27].addBox(0F, 0F, 0F, 7, 2, 2, 0F); // Box 599
		bodyModel[27].setRotationPoint(39.25F, 2.5F, -9F);

		bodyModel[28].addBox(0F, 0F, 0F, 2, 4, 14, 0F); // Box 626
		bodyModel[28].setRotationPoint(44.25F, 0.5F, -7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 58, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 627
		bodyModel[29].setRotationPoint(-11.75F, 0.5F, 7F);

		bodyModel[30].addBox(0F, 0F, 0F, 7, 2, 2, 0F); // Box 628
		bodyModel[30].setRotationPoint(39.25F, 2.5F, 7F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 704
		bodyModel[31].setRotationPoint(-15.75F, 2.5F, -10.5F);

		bodyModel[32].addBox(0F, -1F, -1F, 4, 2, 2, 0F); // Box 705
		bodyModel[32].setRotationPoint(-14.75F, 3F, -10F);
		bodyModel[32].rotateAngleX = -0.78539816F;

		bodyModel[33].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 706
		bodyModel[33].setRotationPoint(-10.75F, 2.5F, -10.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 637
		bodyModel[34].setRotationPoint(13.25F, 2.5F, -10.5F);

		bodyModel[35].addBox(0F, -1F, -1F, 4, 2, 2, 0F); // Box 638
		bodyModel[35].setRotationPoint(14.25F, 3F, -10F);
		bodyModel[35].rotateAngleX = -0.78539816F;

		bodyModel[36].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 639
		bodyModel[36].setRotationPoint(18.25F, 2.5F, -10.5F);

		bodyModel[37].addBox(-1F, -1F, 0F, 2, 2, 1, 0F); // Box 640
		bodyModel[37].setRotationPoint(-7.75F, 0.5F, -10F);
		bodyModel[37].rotateAngleZ = 0.78539816F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[38].setRotationPoint(-42.75F, -7.5F, 8.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[39].setRotationPoint(-43.25F, -6.5F, 3.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F); // Box 52
		bodyModel[40].setRotationPoint(-43.25F, -7.5F, 3.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 453
		bodyModel[41].setRotationPoint(-41.75F, -6.5F, 9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 645
		bodyModel[42].setRotationPoint(-33.75F, -6.5F, 9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 646
		bodyModel[43].setRotationPoint(-43.25F, -6.5F, -4.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 647
		bodyModel[44].setRotationPoint(-43.25F, -7.5F, -9.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 648
		bodyModel[45].setRotationPoint(-42.75F, -7.5F, -9.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 649
		bodyModel[46].setRotationPoint(-41.75F, -6.5F, -10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 650
		bodyModel[47].setRotationPoint(-33.75F, -6.5F, -10F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 0, 3, 9, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, -1.25F, -1F); // Box 651
		bodyModel[48].setRotationPoint(-43.25F, -6.5F, -4.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 652
		bodyModel[49].setRotationPoint(-43.25F, -1F, -8F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 653
		bodyModel[50].setRotationPoint(-43.25F, -1F, -8.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 654
		bodyModel[51].setRotationPoint(-43.25F, -1F, 7.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 655
		bodyModel[52].setRotationPoint(-43.25F, -1F, 4F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 656
		bodyModel[53].setRotationPoint(-42.75F, 2.5F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[54].setRotationPoint(-43.75F, 2.5F, -1.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 659
		bodyModel[55].setRotationPoint(-42.75F, 4.5F, -4F);

		bodyModel[56].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 680
		bodyModel[56].setRotationPoint(-42.75F, 3.25F, -3F);
		bodyModel[56].rotateAngleZ = -0.50614548F;

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 661
		bodyModel[57].setRotationPoint(-42.75F, -2.5F, 0F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F); // Box 662
		bodyModel[58].setRotationPoint(-43.25F, -2F, 0.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F); // Box 663
		bodyModel[59].setRotationPoint(-43.25F, -6F, 1.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 664
		bodyModel[60].setRotationPoint(-42.75F, -6.5F, 1F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F); // Box 665
		bodyModel[61].setRotationPoint(-43.25F, -4.5F, 1.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F); // Box 666
		bodyModel[62].setRotationPoint(-43.25F, -3F, 1.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F); // Box 667
		bodyModel[63].setRotationPoint(-43.25F, -1.6F, 1.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 9, 2, 2, 0F); // Box 708
		bodyModel[64].setRotationPoint(-16.75F, 2.5F, 7F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 709
		bodyModel[65].setRotationPoint(-17.75F, 2.5F, 7F);

		bodyModel[66].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 732
		bodyModel[66].setRotationPoint(-28.75F, 2F, -1F);

		bodyModel[67].addBox(-1F, -1F, 0F, 2, 2, 1, 0F); // Box 742
		bodyModel[67].setRotationPoint(-7.75F, 0.5F, 9F);
		bodyModel[67].rotateAngleZ = 0.78539816F;

		bodyModel[68].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 743
		bodyModel[68].setRotationPoint(-10.75F, 2.5F, 8.5F);

		bodyModel[69].addBox(0F, -1F, -1F, 4, 2, 2, 0F); // Box 744
		bodyModel[69].setRotationPoint(-14.75F, 3F, 10F);
		bodyModel[69].rotateAngleX = -0.78539816F;

		bodyModel[70].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 745
		bodyModel[70].setRotationPoint(-15.75F, 2.5F, 8.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 746
		bodyModel[71].setRotationPoint(13.25F, 2.5F, 8.5F);

		bodyModel[72].addBox(0F, -1F, -1F, 4, 2, 2, 0F); // Box 747
		bodyModel[72].setRotationPoint(14.25F, 3F, 10F);
		bodyModel[72].rotateAngleX = -0.78539816F;

		bodyModel[73].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 748
		bodyModel[73].setRotationPoint(18.25F, 2.5F, 8.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // DLL
		bodyModel[74].setRotationPoint(-42.85F, -2.4F, -7.75F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0.35F, -0.1F, -0.5F, 0.35F, -0.1F, -0.5F, 0.35F, -0.1F, 0F, 0.35F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F); // box
		bodyModel[75].setRotationPoint(-42F, -2F, -7.75F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // DLR
		bodyModel[76].setRotationPoint(-42.85F, -2.4F, 5.75F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0.35F, -0.1F, -0.5F, 0.35F, -0.1F, -0.5F, 0.35F, -0.1F, 0F, 0.35F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F); // box
		bodyModel[77].setRotationPoint(-42F, -2F, 5.75F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F); // box
		bodyModel[78].setRotationPoint(-42.75F, -2.4F, -7.75F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F); // Ditchlight_Right_Top_sp
		bodyModel[79].setRotationPoint(-42.75F, -2.4F, 5.75F);

		bodyModel[80].addBox(0F, 0F, 0F, 12, 2, 2, 0F); // Box 590
		bodyModel[80].setRotationPoint(-4.75F, 2.5F, -9F);

		bodyModel[81].addBox(0F, 0F, 0F, 11, 2, 2, 0F); // Box 591
		bodyModel[81].setRotationPoint(10.25F, 2.5F, -9F);

		bodyModel[82].addBox(0F, 0F, 0F, 12, 2, 2, 0F); // Box 598
		bodyModel[82].setRotationPoint(24.25F, 2.5F, -9F);

		bodyModel[83].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 600
		bodyModel[83].setRotationPoint(36.25F, 2.5F, -9F);

		bodyModel[84].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 601
		bodyModel[84].setRotationPoint(21.25F, 2.5F, -9F);

		bodyModel[85].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 602
		bodyModel[85].setRotationPoint(7.25F, 2.5F, -9F);

		bodyModel[86].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 603
		bodyModel[86].setRotationPoint(-7.75F, 2.5F, -9F);

		bodyModel[87].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 604
		bodyModel[87].setRotationPoint(-7.75F, 3.5F, -10F);

		bodyModel[88].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 605
		bodyModel[88].setRotationPoint(7.25F, 3.5F, -10F);

		bodyModel[89].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 606
		bodyModel[89].setRotationPoint(21.25F, 3.5F, -10F);

		bodyModel[90].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 607
		bodyModel[90].setRotationPoint(36.25F, 3.5F, -10F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 608
		bodyModel[91].setRotationPoint(-9.75F, 4.5F, -9F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 609
		bodyModel[92].setRotationPoint(-4.75F, 4.5F, -9F);

		bodyModel[93].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 610
		bodyModel[93].setRotationPoint(-7.75F, 6.5F, -9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 611
		bodyModel[94].setRotationPoint(0.25F, 4.5F, -9F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F); // Box 612
		bodyModel[95].setRotationPoint(-3.75F, 4.5F, -8.75F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 613
		bodyModel[96].setRotationPoint(10.25F, 4.5F, -9F);

		bodyModel[97].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 614
		bodyModel[97].setRotationPoint(7.25F, 6.5F, -9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 615
		bodyModel[98].setRotationPoint(5.25F, 4.5F, -9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F); // Box 616
		bodyModel[99].setRotationPoint(2.25F, 4.5F, -8.75F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F); // Box 617
		bodyModel[100].setRotationPoint(25.25F, 4.5F, -8.75F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 618
		bodyModel[101].setRotationPoint(29.25F, 4.5F, -9F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F); // Box 619
		bodyModel[102].setRotationPoint(31.25F, 4.5F, -8.75F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 620
		bodyModel[103].setRotationPoint(34.25F, 4.5F, -9F);

		bodyModel[104].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 621
		bodyModel[104].setRotationPoint(36.25F, 6.5F, -9F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 622
		bodyModel[105].setRotationPoint(39.25F, 4.5F, -9F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 623
		bodyModel[106].setRotationPoint(24.25F, 4.5F, -9F);

		bodyModel[107].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 624
		bodyModel[107].setRotationPoint(21.25F, 6.5F, -9F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 625
		bodyModel[108].setRotationPoint(19.25F, 4.5F, -9F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 710
		bodyModel[109].setRotationPoint(-9.75F, 4.5F, 7F);

		bodyModel[110].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 711
		bodyModel[110].setRotationPoint(-7.75F, 6.5F, 7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 712
		bodyModel[111].setRotationPoint(-4.75F, 4.5F, 7F);

		bodyModel[112].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 713
		bodyModel[112].setRotationPoint(-7.75F, 2.5F, 7F);

		bodyModel[113].addBox(0F, 0F, 0F, 12, 2, 2, 0F); // Box 714
		bodyModel[113].setRotationPoint(-4.75F, 2.5F, 7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 715
		bodyModel[114].setRotationPoint(0.25F, 4.5F, 7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 716
		bodyModel[115].setRotationPoint(5.25F, 4.5F, 7F);

		bodyModel[116].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 717
		bodyModel[116].setRotationPoint(7.25F, 2.5F, 7F);

		bodyModel[117].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 718
		bodyModel[117].setRotationPoint(7.25F, 6.5F, 7F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 719
		bodyModel[118].setRotationPoint(10.25F, 4.5F, 7F);

		bodyModel[119].addBox(0F, 0F, 0F, 11, 2, 2, 0F); // Box 720
		bodyModel[119].setRotationPoint(10.25F, 2.5F, 7F);

		bodyModel[120].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 721
		bodyModel[120].setRotationPoint(21.25F, 2.5F, 7F);

		bodyModel[121].addBox(0F, 0F, 0F, 12, 2, 2, 0F); // Box 722
		bodyModel[121].setRotationPoint(24.25F, 2.5F, 7F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 723
		bodyModel[122].setRotationPoint(24.25F, 4.5F, 7F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 724
		bodyModel[123].setRotationPoint(19.25F, 4.5F, 7F);

		bodyModel[124].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 725
		bodyModel[124].setRotationPoint(21.25F, 6.5F, 7F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 726
		bodyModel[125].setRotationPoint(29.25F, 4.5F, 7F);

		bodyModel[126].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 727
		bodyModel[126].setRotationPoint(36.25F, 2.5F, 7F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 728
		bodyModel[127].setRotationPoint(39.25F, 4.5F, 7F);

		bodyModel[128].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 729
		bodyModel[128].setRotationPoint(36.25F, 6.5F, 7F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 730
		bodyModel[129].setRotationPoint(34.25F, 4.5F, 7F);

		bodyModel[130].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 734
		bodyModel[130].setRotationPoint(7.25F, 3.5F, 9F);

		bodyModel[131].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 735
		bodyModel[131].setRotationPoint(-7.75F, 3.5F, 9F);

		bodyModel[132].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 736
		bodyModel[132].setRotationPoint(21.25F, 3.5F, 9F);

		bodyModel[133].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 737
		bodyModel[133].setRotationPoint(36.25F, 3.5F, 9F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F); // Box 738
		bodyModel[134].setRotationPoint(-3.75F, 4.5F, 7.75F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F); // Box 739
		bodyModel[135].setRotationPoint(2.25F, 4.5F, 7.75F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F); // Box 740
		bodyModel[136].setRotationPoint(25.25F, 4.5F, 7.75F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F); // Box 741
		bodyModel[137].setRotationPoint(31.25F, 4.5F, 7.75F);

		bodyModel[138].addBox(0F, 0F, 0F, 56, 2, 4, 0F); // Box 749
		bodyModel[138].setRotationPoint(-11.75F, 2.5F, -2F);
	}
}