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
import wwcp.client.render.rollingstock.locomotives.diesels.DSBME;
import wwcp.common.core.handler.Transport;

import java.util.ArrayList;

public class EntityME extends DieselTrain
{
    public EntityME(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "DSB ME Red/Black Early");
        InsertTexture(1, "DSB ME Red/Black Late");
        InsertTexture(2, "DSB ME Red Old");
        InsertTexture(3, "DSB ME Blue");
        InsertTexture(4, "DSB ME Red New");
        InsertTexture(5, "Nordic Re-Finance TME");
        InsertTexture(6, "WWCP Special ME");

    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 6.97F, 0.125f, -0.25f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 2.31F;
    }

    @Override
    public String transportCountry() {
        return Transport.ClassME().country;
    }

    @Override
    public String transportYear() {
        return Transport.ClassME().year;
    }

    public String getInventoryName() {
        return Transport.ClassME().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.ClassME().fictional;
    }

    //EMD_16_645E3_Notch3
    //Replaced with a similar sounding idle engine sound that makes more sense
    public final SoundRecord sound = new SoundRecord(this.getClass(), "wwcp:MZHorn", 1.0F, "EMD_16_645E3_Notch8", 0.45F, 2, "EMD_16_645E3_Idle", 0.45F, 2, false, "", 0,
            new String[]{""});
    public SoundRecord getSoundRecord() {
        return sound;
    }

    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityME.class, new DSBME(),
                        "DSB ME",
                        new float[] { -2.74f,0.15F,0.0F },
                        new float[] { 0F, 180F, 180F },
                        null,
                        "smoke",
                        new ArrayList<double[]>() {
                            {
                                add(new double[]{4.15D, 1.5D, 0.0D});
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
                                texturePath = "textures/locomotive/Diesel/DSBMe/MeDSBRedBlack1";
                                break;
                            case "red":
                                texturePath = "textures/locomotive/Diesel/DSBMe/MeDSBRedBlack2";
                                break;
                            case "green":
                                texturePath = "textures/locomotive/Diesel/DSBMe/MeDSBRed1";
                                break;
                            case "blue":
                                texturePath = "textures/locomotive/Diesel/DSBMe/MeDSBBlue";
                                break;
                            case "brown":
                                texturePath = "textures/locomotive/Diesel/DSBMe/MeDSBRed2";
                                break;
                            case "cyan":
                                texturePath = "textures/locomotive/Diesel/DSBMe/NRFABTME";
                                break;
                            case "purple":
                                texturePath = "textures/locomotive/Diesel/DSBMe/WWCPME";
                                break;

                        }

                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
