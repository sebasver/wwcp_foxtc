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
import wwcp.client.render.rollingstock.locomotives.diesels.C4245;
import wwcp.common.core.handler.Transport;

import java.util.ArrayList;

public class EntityC425 extends DieselTrain
{
    public EntityC425(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "BCOL Two Tone");
        InsertTexture(1, "SP&S Yellow");
        InsertTexture(2,"BN");
        InsertTexture(3,"NH");
        InsertTexture(4,"PC");
        InsertTexture(5,"N&W");
        InsertTexture(6,"CNW");
    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 4.5F, 0.1f, -0.3f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1.7F;
    }

    @Override
    public String transportCountry() {
        return Transport.C425().country;
    }

    @Override
    public String transportYear() {
        return Transport.C425().year;
    }

    public String getInventoryName() {
        return Transport.C425().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.C425().fictional;
    }

    public final SoundRecord sound = new SoundRecord(this.getClass(), " ", 1.0F, "ALCO_16_251C_Notch8", 0.65F, 28, "ALCO_16_251C_Idle", 0.65F, 30, false, "alco_bronzebell_3", 18,
            new String[]{"nathan_k5l_3","nathan_m3r_1","nathan_m3r_1","leslie_a125_1","leslie_a125_1","nathan_m3_6","leslie_s3l_2"});
    public SoundRecord getSoundRecord() {
        return sound;
    }

    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityC425.class, new C4245(),
                        "C425",
                        new float[] { -2.15f,0.15F,0.0F },
                        new float[] { 0F, 180F, 180F },
                        null,
                        "smoke",
                        new ArrayList<double[]>() {
                            {
                                add(new double[]{0.9D, 1.25D, 0.0D});
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
                                texturePath = "textures/locomotive/Diesel/C4245/C425_BCOL";
                                break;
                            case "red":
                                texturePath = "textures/locomotive/Diesel/C4245/C425_SPS";
                                break;
                            case "green":
                                texturePath = "textures/locomotive/Diesel/C4245/C425_BN";
                                break;
                            case "brown":
                                texturePath = "textures/locomotive/Diesel/C4245/C425_NH";
                                break;
                            case "blue":
                                texturePath = "textures/locomotive/Diesel/C4245/C425_PC";
                                break;
                            case "purple":
                                texturePath = "textures/locomotive/Diesel/C4245/C425_NandW";
                                break;
                            case "cyan":
                                texturePath = "textures/locomotive/Diesel/C4245/C425_CNW";
                                break;

                        }

                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
