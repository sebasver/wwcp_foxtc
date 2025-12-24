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
import wwcp.client.render.rollingstock.locomotives.diesels.GP35;
import wwcp.common.core.handler.Transport;

public class EntityGP35 extends DieselTrain
{
    public EntityGP35(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "SLSF Stripes");
        InsertTexture(1, "CP Action Red");
        InsertTexture(2,"CSX Ghost Blue");

    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 3.85F, 0.15f, -0.3f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1.6F;
    }

    @Override
    public String transportCountry() {
        return Transport.GP35().country;
    }

    @Override
    public String transportYear() {
        return Transport.GP35().year;
    }

    public String getInventoryName() {
        return Transport.GP35().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.GP35().fictional;
    }

    public final SoundRecord sound = new SoundRecord(this.getClass(), " ", 1.0F, "EMD_16_567D3_Notch8", 0.45F, 28, "EMD_16_567D3_Idle", 0.45F, 30, false, "emd_steelbell_3", 18,
            new String[]{"nathan_m3_6","nathan_m3h_1","nathan_m3_6"});
    public SoundRecord getSoundRecord() {
        return sound;
    }

    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityGP35.class, new GP35(),
                        "GP35",
                        new float[] { -2.0f,0.15F,0.0F },
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
                                texturePath = "textures/locomotive/Diesel/GP35/GP35_SLSF";
                                break;
                            case "red":
                                texturePath = "textures/locomotive/Diesel/GP35/GP35_CP";
                                break;
                            case "green":
                                texturePath = "textures/locomotive/Diesel/GP35/GP35_CSXGB";
                                break;

                        }

                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
