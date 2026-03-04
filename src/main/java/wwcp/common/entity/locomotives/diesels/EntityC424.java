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

public class EntityC424 extends DieselTrain
{
    public EntityC424(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "SP&S Yellow");
        InsertTexture(1, "Wabash");
        InsertTexture(2,"CN Noodle");
        InsertTexture(3,"CP Late");


    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 4.5F, 0.1f, -0.3f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1.7F;
    }

    @Override
    public String transportCountry() {
        return Transport.C424().country;
    }

    @Override
    public String transportYear() {
        return Transport.C424().year;
    }

    public String getInventoryName() {
        return Transport.C424().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.C424().fictional;
    }

    public final SoundRecord sound = new SoundRecord(this.getClass(), " ", 1.0F, "ALCO_16_251C_Notch8", 0.65F, 28, "ALCO_16_251C_Idle", 0.65F, 30, false, "alco_bronzebell_3", 18,
            new String[]{"nathan_m3r_1","nathan_m3r_1","nathan_m3h_1","nathan_m3h_1"});
    public SoundRecord getSoundRecord() {
        return sound;
    }

    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityC424.class, new C4245(),
                        "C424",
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
                                texturePath = "textures/locomotive/Diesel/C4245/C424_SPS";
                                break;
                            case "red":
                                texturePath = "textures/locomotive/Diesel/C4245/C424_WAB";
                                break;
                            case "green":
                                texturePath = "textures/locomotive/Diesel/C4245/C424_CN";
                                break;
                            case "brown":
                                texturePath = "textures/locomotive/Diesel/C4245/C424_CPLate";
                                break;

                        }

                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
