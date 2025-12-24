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
import wwcp.client.render.rollingstock.locomotives.diesels.GP35;
import wwcp.client.render.rollingstock.locomotives.diesels.SD45;
import wwcp.common.core.handler.Transport;

public class EntitySD45 extends DieselTrain
{
    public EntitySD45(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "SP Bloody Nose");
        InsertTexture(1, "SP w/ Elephant Ears");
        InsertTexture(2, "SP Rebuild Bloody Nose");
        InsertTexture(3, "SP Kodachrome");
        InsertTexture(4, "DRGW Early");
        InsertTexture(5, "DRGW Late");
        InsertTexture(6, "DRGW Late Weathered");
        InsertTexture(7, "CB&Q Green");
        InsertTexture(8, "BN Green");
        InsertTexture(9, "MILW Early");
        InsertTexture(10, "NP Yellow & Black");
        InsertTexture(11, "SLSF");
        InsertTexture(12, "SLSF Nose Logo");
        InsertTexture(13, "SLSF Mars Light");
        InsertTexture(14, "ICG Orange & White");
        InsertTexture(15, "PC");
        InsertTexture(16, "PC Red Logo");
        InsertTexture(17, "UP");

    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 5.0F, 0.25f, -0.3f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1.75F;
    }

    @Override
    public String transportCountry() {
        return Transport.SD45().country;
    }

    @Override
    public String transportYear() {
        return Transport.SD45().year;
    }

    public String getInventoryName() {
        return Transport.SD45().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.SD45().fictional;
    }

    public final SoundRecord sound = new SoundRecord(this.getClass(), " ", 1.0F, "EMD_16_645E3_Notch8", 0.45F, 28, "EMD_16_645E3_Notch3", 0.45F, 30, false, "emd_steelbell_3", 18,
            new String[]{"nathan_m3_6","nathan_m3_6","nathan_m3_6","nathan_m3_6","nathan_m3_6","nathan_m3_6","nathan_m3_6","nathan_m3_6","nathan_m3_6","nathan_m3_6","nathan_m3_6","nathan_m3_6","nathan_m3_6","nathan_m3_6","nathan_m3_6","nathan_m3_6","nathan_m3_6"});
    public SoundRecord getSoundRecord() {
        return sound;
    }

    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntitySD45.class, new SD45(),
                        "SD45",
                        new float[] { -2.5f,0.15F,0.0F },
                        new float[] { 0F, 180F, 180F },
                        null)
                {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString)
                    {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase())
                        {
                            case "black":
                                texturePath = "textures/locomotive/Diesel/SD45/SD45_SP";
                                break;
                            case "red":
                                texturePath = "textures/locomotive/Diesel/SD45/SD45_SP_Elephant";
                                break;
                            case "green":
                                texturePath = "textures/locomotive/Diesel/SD45/SD45R_SP";
                                break;
                            case "magenta":
                                texturePath = "textures/locomotive/Diesel/SD45/SD45R_SPKodachrome";
                                break;
                            case "brown":
                                texturePath = "textures/locomotive/Diesel/SD45/SD45_DRGW_Early";
                                break;
                            case "blue":
                                texturePath = "textures/locomotive/Diesel/SD45/SD45_DRGW_Late";
                                break;
                            case "purple":
                                texturePath = "textures/locomotive/Diesel/SD45/SD45_DRGW_Late_W";
                                break;
                            case "cyan":
                                texturePath = "textures/locomotive/Diesel/SD45/SD45_CBQ";
                                break;
                            case "lightgrey":
                                texturePath = "textures/locomotive/Diesel/SD45/SD45_BN";
                                break;
                            case "grey":
                                texturePath = "textures/locomotive/Diesel/SD45/SD45_MILW_Early";
                                break;
                            case "pink":
                                texturePath = "textures/locomotive/Diesel/SD45/SD45_NP";
                                break;
                            case "lime":
                                texturePath = "textures/locomotive/Diesel/SD45/SD45_SLSF_1";
                                break;
                            case "yellow":
                                texturePath = "textures/locomotive/Diesel/SD45/SD45_SLSF_2";
                                break;
                            case "lightblue":
                                texturePath = "textures/locomotive/Diesel/SD45/SD45_SLSF_3";
                                break;
                            case "orange":
                                texturePath = "textures/locomotive/Diesel/SD45/SD45_ICG";
                                break;
                            case "white":
                                texturePath = "textures/locomotive/Diesel/SD45/SD45_PC";
                                break;
                            case "skin16":
                                texturePath = "textures/locomotive/Diesel/SD45/SD45_PC_R";
                                break;
                            case "skin17":
                                texturePath = "textures/locomotive/Diesel/SD45/SD45_UP_Early2";
                                break;

                        }

                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
