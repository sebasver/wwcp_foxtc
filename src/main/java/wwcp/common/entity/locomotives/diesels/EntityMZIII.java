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
import wwcp.client.render.rollingstock.locomotives.diesels.DSBMzIII;
import wwcp.common.core.handler.Transport;

import java.util.ArrayList;

public class EntityMZIII extends DieselTrain
{
    public EntityMZIII(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "DSB MZ III 1980s-2000s");
        InsertTexture(1, "DSB Mz III 1972-1980s");
        InsertTexture(2, "NEG Niebüll GMBH Mz III");

    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 6.97F, 0.375f, -0.25f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 2.31F;
    }

    @Override
    public String transportCountry() {
        return Transport.MZIII().country;
    }

    @Override
    public String transportYear() {
        return Transport.MZIII().year;
    }

    public String getInventoryName() {
        return Transport.MZIII().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.MZIII().fictional;
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
                        EntityMZIII.class, new DSBMzIII(),
                        "DSB MZ III",
                        new float[] { -2.74f,0.15F,0.0F },
                        new float[] { 0F, 180F, 180F },
                        null,
                        "smoke",
                        new ArrayList<double[]>() {
                            {
                                add(new double[]{-0.15D, 1.5D, 0.0D});
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
                                texturePath = "textures/locomotive/Diesel/MZ/MZIII/MzIIIDSB1980s-2000s";
                                break;
                            case "red":
                                texturePath = "textures/locomotive/Diesel/MZ/MZIII/MzIIIDSB1972-1980s";
                                break;
                            case "green":
                                texturePath = "textures/locomotive/Diesel/MZ/MZIII/NEGMZ1439";
                                break;

                        }

                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
