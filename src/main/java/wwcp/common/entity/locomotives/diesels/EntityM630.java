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
import wwcp.client.render.rollingstock.locomotives.diesels.M630;
import wwcp.common.core.handler.Transport;

import java.util.ArrayList;

public class EntityM630 extends DieselTrain
{
    public EntityM630(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "CP Action Red");
        InsertTexture(1, "BC Rail Hockey Stick");
        InsertTexture(2, "BC Rail Social Credit");

    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 6.0F, 0.25f, -0.3f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1.525F;
    }

    @Override
    public String transportCountry() {
        return Transport.M630().country;
    }

    @Override
    public String transportYear() {
        return Transport.M630().year;
    }

    public String getInventoryName() {
        return Transport.M630().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.M630().fictional;
    }

    public final SoundRecord sound = new SoundRecord(this.getClass(), " ", 1.0F, "ALCO_16_251C_Notch8", 0.65F, 28, "ALCO_16_251C_Idle", 0.65F, 30, false, "alco_bronzebell_3", 18,
            new String[]{"nathan_m3h_2","nathan_k5l_3","nathan_k5l_3"});
    public SoundRecord getSoundRecord() {
        return sound;
    }

    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityM630.class, new M630(),
                        "M630",
                        new float[] { -3.0f,0.15F,0.0F },
                        new float[] { 0F, 180F, 180F },
                        null,
                        "smoke",
                        new ArrayList<double[]>() {
                            {
                                add(new double[]{1.5D, 1.475D, 0.0D});
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
                                texturePath = "textures/locomotive/Diesel/M630/M630_CP";
                                break;
                            case "red":
                                texturePath = "textures/locomotive/Diesel/M630/M630_BCRAIL_Hockey";
                                break;
                            case "green":
                                texturePath = "textures/locomotive/Diesel/M630/M630_BCRAIL";
                                break;


                        }

                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
