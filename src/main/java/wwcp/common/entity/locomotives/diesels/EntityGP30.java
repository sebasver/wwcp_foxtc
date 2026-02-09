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
import wwcp.client.render.rollingstock.locomotives.diesels.GP30;
import wwcp.common.core.handler.Transport;

import java.util.ArrayList;

public class EntityGP30 extends DieselTrain
{
    public EntityGP30(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "NYC Black");
        InsertTexture(1, "MILW Orange");
        InsertTexture(2,"DRGW Early");
        InsertTexture(3,"DRGW Late");
        InsertTexture(4,"SP Bloody Nose");
        InsertTexture(5,"SSW");
        InsertTexture(6,"KCS Red");
        InsertTexture(7,"IC Orange & White");
        InsertTexture(8,"CP Action Red");
        InsertTexture(9,"C&O Blue & Yellow");
        InsertTexture(10,"Chessie C&O");
        InsertTexture(11,"CSX Patched Chessie");
        InsertTexture(12,"CSX Ghost Blue");
        InsertTexture(13,"CSX YN Ghost Blue");
        InsertTexture(14,"CSX Slug Ghost");
        InsertTexture(15,"CSX Slug YN Ghost");
        InsertTexture(16,"BN Whiteface GP39V");

    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 3.85F, 0.15f, -0.3f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1.6F;
    }

    @Override
    public String transportCountry() {
        return Transport.GP30().country;
    }

    @Override
    public String transportYear() {
        return Transport.GP30().year;
    }

    public String getInventoryName() {
        return Transport.GP30().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.GP30().fictional;
    }

    public final SoundRecord sound = new SoundRecord(this.getClass(), " ", 1.0F, "EMD_16_567D3_Notch8", 0.45F, 28, "EMD_16_567D3_Idle", 0.45F, 30, false, "emd_steelbell_3", 18,
            new String[]{"leslie_a200_dual_1", "leslie_a200_dual_1","leslie_s3l_1","leslie_s3l_1","leslie_s3l_1","leslie_s3l_1","leslie_s3l_2","leslie_s3l_2","nathan_m3h_2","leslie_s3l_2","leslie_s3l_2","leslie_s3l_2","leslie_s3l_2","leslie_s3l_2","leslie_s3l_2","leslie_s3l_2","leslie_s3l_1"});
    public SoundRecord getSoundRecord() {
        return sound;
    }

    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityGP30.class, new GP30(),
                        "GP30",
                        new float[] { -2.0f,0.15F,0.0F },
                        new float[] { 0F, 180F, 180F },
                        null,
                        "smoke",
                        new ArrayList<double[]>() {
                            {
                                add(new double[]{2.3D, 1.25D, 0.0D});
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
                                texturePath = "textures/locomotive/Diesel/GP30/GP30_NYC";
                                break;
                            case "orange":
                                texturePath = "textures/locomotive/Diesel/GP30/GP30_MILW";
                                break;
                            case "yellow":
                                texturePath = "textures/locomotive/Diesel/GP30/GP30_DRGW_Early";
                                break;
                            case "blue":
                                texturePath = "textures/locomotive/Diesel/GP30/GP30_DRGW";
                                break;
                            case "red":
                                texturePath = "textures/locomotive/Diesel/GP30/GP30_SP";
                                break;
                            case "green":
                                texturePath = "textures/locomotive/Diesel/GP30/GP30_SSW";
                                break;
                            case "brown":
                                texturePath = "textures/locomotive/Diesel/GP30/GP30_KCSR";
                                break;
                            case "purple":
                                texturePath = "textures/locomotive/Diesel/GP30/GP30_IC";
                                break;
                            case "cyan":
                                texturePath = "textures/locomotive/Diesel/GP30/GP30_CP";
                                break;
                            case "lightgrey":
                                texturePath = "textures/locomotive/Diesel/GP30/GP30_CO";
                                break;
                            case "grey":
                                texturePath = "textures/locomotive/Diesel/GP30/GP30_Chessie";
                                break;
                            case "magenta":
                                texturePath = "textures/locomotive/Diesel/GP30/GP30_ChessieCSX";
                                break;
                            case "lime":
                                texturePath = "textures/locomotive/Diesel/GP30/GP30_CSXGB";
                                break;
                            case "lightblue":
                                texturePath = "textures/locomotive/Diesel/GP30/GP30_CSXYN";
                                break;
                            case "pink":
                                texturePath = "textures/locomotive/Diesel/GP30/GP30_Slug_CSXG";
                                break;
                            case "white":
                                texturePath = "textures/locomotive/Diesel/GP30/GP30_Slug_CSXYN";
                                break;
                            case "skin16":
                                texturePath = "textures/locomotive/Diesel/GP30/GP39E_BN";
                                break;




                        }

                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
