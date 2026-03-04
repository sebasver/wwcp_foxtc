package wwcp.common.entity.locomotives.diesels;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.sounds.SoundRecord;
import wwcp.client.render.rollingstock.locomotives.diesels.F7A;
import wwcp.common.core.handler.Transport;

import java.util.ArrayList;

public class EntityF7A extends DieselTrain
{
    public EntityF7A(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "BN Cascade Green");
        InsertTexture(1, "GN");
        InsertTexture(2, "BN Early, GN Patch");
        InsertTexture(3, "NP");
        InsertTexture(4, "MILW Early");
        InsertTexture(5, "MILW");
        InsertTexture(6, "MILW Late");
        InsertTexture(7, "KCS Ghost");
        InsertTexture(8, "MP Jenks Blue");
        InsertTexture(9, "T&P Jenks Blue");
        InsertTexture(10, "CGW Maroon");
        InsertTexture(11, "ATSF Bluebonnet");
        InsertTexture(12, "RI Short Stripe");
        InsertTexture(13, "RI Short Stripe, Block Letters");
        InsertTexture(14, "RI Yellow Wings");
        InsertTexture(15, "Amtrak Phase 1");

    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 3.85F, 0.0f, -0.3f);
    }

    //Just click build to see updated doesn't need game restart
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.1F;
    }

    @Override
    public String transportCountry() {
        return Transport.F7A().country;
    }

    @Override
    public String transportYear() {
        return Transport.F7A().year;
    }

    public String getInventoryName() {
        return Transport.F7A().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.F7A().fictional;
    }

    public final SoundRecord sound = new SoundRecord(this.getClass(), " ", 1.0F, "EMD_16_567B_Notch8", 0.45F, 28, "EMD_16_567B_Idle", 0.45F, 30, false, "emd_steelbell_3", 18,
            new String[]{"leslie_a200_dual_1", "leslie_a200_dual_1","leslie_a200_dual_1","leslie_a200_dual_1","leslie_a200_dual_1","leslie_a200_dual_1","leslie_a200_dual_1","leslie_rs5t_1","leslie_a200_dual_1","leslie_a200_dual_1","leslie_a200_dual_1","leslie_a200_dual_1","leslie_rs5t","leslie_rs5t","leslie_rs5t","leslie_a200_dual_1"});
    public SoundRecord getSoundRecord() {
        return sound;
    }

    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityF7A.class, new F7A(),
                        "F7A",
                        //REAR Truck relative to model, 0 is center of model, -2 is further back
                        new float[] { -2.1f,0.15F,0.0F },
                        //I think this is the model itself which has to be flipped
                        new float[] { 0F, 180F, 180F },
                        null,
                        "smoke",
                        new ArrayList<double[]>() {
                            {
                                //Smoke relative to rear truck pos
                                add(new double[]{0.65D, 1.25D, 0.0D});
                                add(new double[]{1.675D, 1.25D, 0.0D});
                            }},
                        "", null, 10, 2)
                {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString)
                    {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase())
                        {
                            case "black":
                                texturePath = "textures/locomotive/Diesel/F7A/BN_F7A_Cascade_Green";
                                break;
                            case "orange":
                                texturePath = "textures/locomotive/Diesel/F7A/F7A_GNS";
                                break;
                            case "yellow":
                                texturePath = "textures/locomotive/Diesel/F7A/F7A_BNEarly";
                                break;
                            case "blue":
                                texturePath = "textures/locomotive/Diesel/F7A/F7A_NP";
                                break;
                            case "red":
                                texturePath = "textures/locomotive/Diesel/F7A/F7A_MILW";
                                break;
                            case "green":
                                texturePath = "textures/locomotive/Diesel/F7A/F7A_MILW2";
                                break;
                            case "brown":
                                texturePath = "textures/locomotive/Diesel/F7A/F7A_MILW3";
                                break;
                            case "purple":
                                texturePath = "textures/locomotive/Diesel/F7A/F7A_KCSG";
                                break;
                            case "cyan":
                                texturePath = "textures/locomotive/Diesel/F7A/MP_F7A_Jenks_Blue";
                                break;
                            case "lightgrey":
                                texturePath = "textures/locomotive/Diesel/F7A/TP_F7A_Jenks_Blue";
                                break;
                            case "grey":
                                texturePath = "textures/locomotive/Diesel/F7A/CGW_F7A_Maroon";
                                break;
                            case "magenta":
                                texturePath = "textures/locomotive/Diesel/F7A/ATSF_Freight_F7";
                                break;
                            case "lime":
                                texturePath = "textures/locomotive/Diesel/F7A/RI_F7A_Maroon_Short_Stripe";
                                break;
                            case "lightblue":
                                texturePath = "textures/locomotive/Diesel/F7A/RI_F7A_Maroon_Short_Stripe_Block_Letters";
                                break;
                            case "pink":
                                texturePath = "textures/locomotive/Diesel/F7A/RI_F7A_Yellow_Wings";
                                break;
                            case "white":
                                texturePath = "textures/locomotive/Diesel/F7A/Amtrak_F7A_Ph1";
                                break;

                        }

                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
