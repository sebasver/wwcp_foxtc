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
import wwcp.client.render.rollingstock.locomotives.diesels.DSBMzII;
import wwcp.common.core.handler.Transport;

import java.util.ArrayList;

public class EntityMZII extends DieselTrain
{
    public EntityMZII(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "DSB MZ II 1990s-2020s");
        InsertTexture(1, "DSB Mz II 1980-1990s");
        InsertTexture(2, "Railion Denmark MZ II");
        InsertTexture(3, "DSB Brown MZ II");
        InsertTexture(4, "DSB MZ II 1411");
        InsertTexture(5, "Jernbaneverket MZ 1415");
        InsertTexture(6, "STT TMZ 1413");
        InsertTexture(7, "BLSR TMZ II");
        InsertTexture(8, "Baneservice TMZ 1411");

    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 6.97F, 0.375f, -0.25f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 2.3F;
    }

    @Override
    public String transportCountry() {
        return Transport.MZI().country;
    }

    @Override
    public String transportYear() {
        return Transport.MZI().year;
    }

    public String getInventoryName() {
        return Transport.MZI().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.MZI().fictional;
    }

    //EMD_16_645E3_Notch3
    //Replaced with a similar sounding idle engine sound that makes more sense
    public final SoundRecord sound = new SoundRecord(this.getClass(), "MZHorn", 1.0F, "EMD_16_645E3_Notch8", 0.45F, 2, "EMD_16_645E3_Idle", 0.45F, 2, false, "", 0,
            new String[]{""});
    public SoundRecord getSoundRecord() {
        return sound;
    }

    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityMZII.class, new DSBMzII(),
                        "DSB MZ II",
                        new float[] { -2.74f,0.15F,0.0F },
                        new float[] { 0F, 180F, 180F },
                        null,
                        "smoke",
                        new ArrayList<double[]>() {
                            {
                                add(new double[]{0.65D, 1.5D, 0.0D});
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
                                texturePath = "textures/locomotive/Diesel/MZ/MZII/MzIIDSB1990-2020s";
                                break;
                            case "red":
                                texturePath = "textures/locomotive/Diesel/MZ/MZII/MzIIDSB1980-1990s";
                                break;
                            case "green":
                                texturePath = "textures/locomotive/Diesel/MZ/MZII/MzIIRDK";
                                break;
                            case "brown":
                                texturePath = "textures/locomotive/Diesel/MZ/MZII/MzIIBrown";
                                break;
                            case "blue":
                                texturePath = "textures/locomotive/Diesel/MZ/MZII/MzIIDSB_1411";
                                break;
                            case "yellow":
                                texturePath = "textures/locomotive/Diesel/MZ/MZII/JBVMZ1415";
                                break;
                            case "cyan":
                                texturePath = "textures/locomotive/Diesel/MZ/MZII/STTTMZ1413";
                                break;
                            case "lightgrey":
                                texturePath = "textures/locomotive/Diesel/MZ/MZII/BLSRTMZII";
                                break;
                            case "grey":
                                texturePath = "textures/locomotive/Diesel/MZ/MZII/NRFABTMZ1411";
                                break;

                        }

                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
