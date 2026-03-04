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
import wwcp.client.render.rollingstock.locomotives.diesels.SD45X;
import wwcp.common.core.handler.Transport;

import java.util.ArrayList;

public class EntitySD45X extends DieselTrain
{
    public EntitySD45X(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "SP Bloody Nose");
        InsertTexture(1, "SP Ex Demo");
        InsertTexture(2, "SP Bloody Nose Early");
        InsertTexture(3, "SP Bloody Nose Early w/ Elephant Ears");


    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 5.5F, 0.1f, -0.3f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1.825F;
    }

    @Override
    public String transportCountry() {
        return Transport.SD45X().country;
    }

    @Override
    public String transportYear() {
        return Transport.SD45X().year;
    }

    public String getInventoryName() {
        return Transport.SD45X().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.SD45X().fictional;
    }

    //EMD_16_645E3_Notch3
    //Replaced with a similar sounding idle engine sound that makes more sense
    public final SoundRecord sound = new SoundRecord(this.getClass(), " ", 1.0F, "EMD_16_645E3_Notch8", 0.45F, 28, "EMD_16_567D3_Idle", 0.45F, 30, false, "emd_steelbell_3", 18,
            new String[]{"leslie_s3l_1","leslie_s3l_1","leslie_s3l_1","leslie_s3l_1"});
    public SoundRecord getSoundRecord() {
        return sound;
    }

    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntitySD45X.class, new SD45X(),
                        "SD45X",
                        new float[] { -2.75f,0.15F,0.0F },
                        new float[] { 0F, 180F, 180F },
                        null,
                        "smoke",
                        new ArrayList<double[]>() {
                            {
                                add(new double[]{3.9D, 1.35D, 0.0D});
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
                                texturePath = "textures/locomotive/Diesel/SD45X/SD45X_SP";
                                break;
                            case "red":
                                texturePath = "textures/locomotive/Diesel/SD45X/SD45X_SP_Demo";
                                break;
                            case "green":
                                texturePath = "textures/locomotive/Diesel/SD45X/SD45X_SP_Early";
                                break;
                            case "brown":
                                texturePath = "textures/locomotive/Diesel/SD45X/SD45X_SP_Ears";
                                break;

                        }

                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
