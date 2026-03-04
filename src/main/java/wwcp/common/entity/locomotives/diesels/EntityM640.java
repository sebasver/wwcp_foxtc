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
import wwcp.client.render.rollingstock.locomotives.diesels.M640;
import wwcp.common.core.handler.Transport;

import java.util.ArrayList;

public class EntityM640 extends DieselTrain
{
    public EntityM640(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "CP Action Red");
        InsertTexture(1, "AC Traction Rebuild, CP Action Red");
    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 6.0F, 0.1f, -0.3f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1.525F;
    }

    @Override
    public String transportCountry() {
        return Transport.M640().country;
    }

    @Override
    public String transportYear() {
        return Transport.M640().year;
    }

    public String getInventoryName() {
        return Transport.M640().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.M640().fictional;
    }

    public final SoundRecord sound = new SoundRecord(this.getClass(), " ", 1.0F, "ALCO_8_251F_Notch8", 0.95F, 28, "ALCO_8_251F_Idle", 0.95F, 30, false, "alco_bronzebell_3", 18,
            new String[]{"nathan_m3h_2","nathan_m3h_2"});
    public SoundRecord getSoundRecord() {
        return sound;
    }

    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityM640.class, new M640(),
                        "M640",
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
                            case "red":
                                texturePath = "textures/locomotive/Diesel/M640/M640_CP";
                                break;
                            case "black":
                                texturePath = "textures/locomotive/Diesel/M640/M640_CP_AC";
                                break;

                        }

                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
