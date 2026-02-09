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
import wwcp.client.render.rollingstock.locomotives.diesels.SD75M;
import wwcp.common.core.handler.Transport;

import java.util.ArrayList;

public class EntitySD70M extends DieselTrain
{
    public EntitySD70M(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "SP");
        InsertTexture(1, "CSX YN2");
        InsertTexture(2, "UP as Delivered");

    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 6.15F, 0.375f, -0.3f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1.75F;
    }

    @Override
    public String transportCountry() {
        return Transport.SD70M().country;
    }

    @Override
    public String transportYear() {
        return Transport.SD70M().year;
    }

    public String getInventoryName() {
        return Transport.SD70M().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.SD70M().fictional;
    }

    public final SoundRecord sound = new SoundRecord(this.getClass(), " ", 1.0F, "EMD_20_710G3B_Notch8", 0.9F, 28, "EMD_16_710G3B_Idle", 0.65F, 30, false, "emd_steelbell_3", 18,
            new String[]{"nathan_m3_6","leslie_s3l_1","nathan_m3_6"});
    public SoundRecord getSoundRecord() {
        return sound;
    }

    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntitySD70M.class, new SD75M(),
                        "SD70M",
                        new float[] { -2.95f,0.15F,0.0F },
                        new float[] { 0F, 180F, 180F },
                        null,
                        "smoke",
                        new ArrayList<double[]>() {
                            {
                                add(new double[]{3.45D, 1.36D, 0.0D});
                            }},
                        "", null, 10, 2)
                {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString)
                    {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase())
                        {
                            case "skin16":
                                texturePath = "textures/locomotive/Diesel/SD70M/SD70M_SP";
                                break;
                            case "green":
                                texturePath = "textures/locomotive/Diesel/SD70M/SD70M_CSXYN2";
                                break;
                            case "skin17":
                                texturePath = "textures/locomotive/Diesel/SD70M/SD70M_UP";
                                break;

                        }

                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
