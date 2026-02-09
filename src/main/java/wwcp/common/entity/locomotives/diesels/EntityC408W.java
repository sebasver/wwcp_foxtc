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
import wwcp.client.render.rollingstock.locomotives.diesels.C408W;
import wwcp.common.core.handler.Transport;

import java.util.ArrayList;

public class EntityC408W extends DieselTrain
{
    public EntityC408W(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "ATSF Warbonnet");
        InsertTexture(1, "BNSF Warbonnet 1");
        InsertTexture(2, "BNSF Warbonned 2");
        InsertTexture(3, "BNSF Warbonnet 3");
        InsertTexture(4, "BNSF H2");
        InsertTexture(5, "Conrail");
        InsertTexture(6, "Conrail Quality");
        InsertTexture(7, "LMS Leasing");
        InsertTexture(8, "CSX YN2");
        InsertTexture(9, "CSX YN2 Ex CR");
        InsertTexture(10, "CSX YN2 Ex CR Rebuilt");
        InsertTexture(11, "CSX YN3");
        InsertTexture(12, "NS");
        InsertTexture(13, "NS Whiteface");
        InsertTexture(14, "NS Late");
    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 5.75F, 0.4f, -0.25f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1.8F;
    }

    @Override
    public String transportCountry() {
        return Transport.C408W().country;
    }

    @Override
    public String transportYear() {
        return Transport.C408W().year;
    }

    public String getInventoryName() {
        return Transport.C408W().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.C408W().fictional;
    }


    public final SoundRecord sound = new SoundRecord(this.getClass(), " ", 1.0F, "GE_7FDL_16_Notch8", 0.85F, 28, "GE_7FDL_16_Idle", 0.85F, 30, false, "alco_bronzebell_3", 18,
            new String[]{"leslie_s3l_1","leslie_s3l_1","leslie_s3l_1","leslie_s3l_1","leslie_s3l_1","leslie_s3l_1","leslie_s3l_1","leslie_s3l_1","leslie_s3l_1","leslie_s3l_1","leslie_s3l_1","leslie_s3l_1","leslie_s3l_1","leslie_s3l_1","leslie_s3l_1"});
    public SoundRecord getSoundRecord() {
        return sound;
    }

    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityC408W.class, new C408W(),
                        "C408W",
                        new float[] { -2.75f,0.15F,0.0F },
                        new float[] { 0F, 180F, 180F },
                        null,
                        "smoke",
                        new ArrayList<double[]>() {
                            {
                                add(new double[]{1.25D, 1.35D, 0.0D});
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
                                texturePath = "textures/locomotive/Diesel/C408W/C408W_ATSF";
                                break;
                            case "red":
                                texturePath = "textures/locomotive/Diesel/C408W/C408W_BNSF_Patch_S";
                                break;
                            case "green":
                                texturePath = "textures/locomotive/Diesel/C408W/C408W_BNSF_Patch";
                                break;
                            case "brown":
                                texturePath = "textures/locomotive/Diesel/C408W/C408W_BNSF_Patch_L";
                                break;
                            case "blue":
                                texturePath = "textures/locomotive/Diesel/C408W/C408W_BNSF";
                                break;
                            case "purple":
                                texturePath = "textures/locomotive/Diesel/C408W/C408W_CR";
                                break;
                            case "cyan":
                                texturePath = "textures/locomotive/Diesel/C408W/C408W_CR_Quality";
                                break;
                            case "lightgrey":
                                texturePath = "textures/locomotive/Diesel/C408W/C408W_LMS";
                                break;
                            case "grey":
                                texturePath = "textures/locomotive/Diesel/C408W/C408W_CSX_YN2";
                                break;
                            case "pink":
                                texturePath = "textures/locomotive/Diesel/C408W/C408W_CSX_YN2_CR";
                                break;
                            case "lime":
                                texturePath = "textures/locomotive/Diesel/C408W/C408W_CSX_YN2_CR2";
                                break;
                            case "yellow":
                                texturePath = "textures/locomotive/Diesel/C408W/C408W_CSX_YN3";
                                break;
                            case "lightblue":
                                texturePath = "textures/locomotive/Diesel/C408W/C408W_NS";
                                break;
                            case "orange":
                                texturePath = "textures/locomotive/Diesel/C408W/C408W_NS_W";
                                break;
                            case "white":
                                texturePath = "textures/locomotive/Diesel/C408W/C408W_NS_M";
                                break;

                        }

                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
