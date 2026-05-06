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
import wwcp.client.render.rollingstock.locomotives.diesels.DSBMzI;
import wwcp.common.core.handler.Transport;

import java.util.ArrayList;

public class EntityMZI extends DieselTrain
{
    public EntityMZI(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "DSB MZ I 1990s-2020s");
        InsertTexture(1, "DSB Mz I 1980-1990s");
        InsertTexture(2, "Railion Denmark MZ I");
        InsertTexture(3, "DSB Brown MZ I");
        InsertTexture(4, "3T TMZ 1407");
        InsertTexture(5, "WWCP Special MZ I");
        InsertTexture(6, "TGOJ TMZ 1410");
        InsertTexture(7, "3T TMZ 1409");
        InsertTexture(8, "BLSR TMZ I");

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
                        EntityMZI.class, new DSBMzI(),
                        "DSB MZ I",
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
                                texturePath = "textures/locomotive/Diesel/MZ/MZI/MzIDSB1990-2020s";
                                break;
                            case "red":
                                texturePath = "textures/locomotive/Diesel/MZ/MZI/MzIDSB1980-1990s";
                                break;
                            case "green":
                                texturePath = "textures/locomotive/Diesel/MZ/MZI/MzIRDK";
                                break;
                            case "brown":
                                texturePath = "textures/locomotive/Diesel/MZ/MZI/MzIBrown";
                                break;
                            case "blue":
                                texturePath = "textures/locomotive/Diesel/MZ/MZI/3TTMZ1407";
                                break;
                            case "purple":
                                texturePath = "textures/locomotive/Diesel/MZ/MZI/MzIWWCP";
                                break;
                            case "cyan":
                                texturePath = "textures/locomotive/Diesel/MZ/MZI/TGOJTMZ1410";
                                break;
                            case "lightgrey":
                                texturePath = "textures/locomotive/Diesel/MZ/MZI/3TTMZ1409";
                                break;
                            case "grey":
                                texturePath = "textures/locomotive/Diesel/MZ/MZI/BLSRTMZI";
                                break;

                        }

                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
