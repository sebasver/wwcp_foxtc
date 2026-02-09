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
import wwcp.client.render.rollingstock.locomotives.diesels.DSBMzIV;
import wwcp.common.core.handler.Transport;

import java.util.ArrayList;

public class EntityMZIV extends DieselTrain
{
    public EntityMZIV(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "");

    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 6.8F, 0.375f, -0.25f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 2.31F;
    }

    @Override
    public String transportCountry() {
        return Transport.MZIV().country;
    }

    @Override
    public String transportYear() {
        return Transport.MZIV().year;
    }

    public String getInventoryName() {
        return Transport.MZIV().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.MZIV().fictional;
    }

    //EMD_16_645E3_Notch3
    //Replaced with a similar sounding idle engine sound that makes more sense
    public final SoundRecord sound = new SoundRecord(this.getClass(), "MZHorn", 1.0F, "EMD_20_645E3_Notch8", 0.45F, 28, "EMD_20_645E3_Idle", 0.45F, 30, false, "", 0,
            new String[]{""});
    public SoundRecord getSoundRecord() {
        return sound;
    }

    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityMZIV.class, new DSBMzIV(),
                        "DSB MZ IV",
                        new float[] { -2.74f,0.15F,0.0F },
                        new float[] { 0F, 180F, 180F },
                        null,
                        "smoke",
                        new ArrayList<double[]>() {
                            {
                                add(new double[]{0.1D, 1.35D, 0.0D});
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
                                texturePath = "textures/locomotive/Diesel/MZ/MZIV/MzIVDSB";
                                break;
                            case "red":
                                texturePath = "textures/locomotive/Diesel/MZ/MZIV/MzIVRDK";
                                break;
                            case "green":
                                texturePath = "textures/locomotive/Diesel/MZ/MZIV/MzIVRSC";
                                break;
                            case "magenta":
                                texturePath = "textures/locomotive/Diesel/MZ/MZIV/MzIVDBCSC";
                                break;
                            case "brown":
                                texturePath = "textures/locomotive/Diesel/MZ/MZIV/MzIVDBCSC1459";
                                break;
                            case "blue":
                                texturePath = "textures/locomotive/Diesel/MZ/MZIV/NRFAB-TMZIV";
                                break;

                        }

                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
