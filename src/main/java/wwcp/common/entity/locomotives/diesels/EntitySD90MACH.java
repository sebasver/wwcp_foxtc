package wwcp.common.entity.locomotives.diesels;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumTrains;
import train.common.library.sounds.SoundRecord;
import wwcp.client.render.rollingstock.passenger.locomotives.diesels.SD90MACH;

public class EntitySD90MACH extends DieselTrain
{
    public EntitySD90MACH(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "SD 90 Mach");
    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 3.2F, 0.45f, -0.15f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1.5F;
    }

    @Override
    public String transportCountry() {
        return "US";
    }

    @Override
    public String transportYear() {
        return "2012-";
    }

    public String getInventoryName() {
        return "SD90MACH";
    }

    @Override
    public boolean isFictional() {
        return false;
    }

    public final SoundRecord sound = new SoundRecord(this.getClass(), " ", 1.0F, "EMD_12_567B_Notch8", 0.45F, 28, "EMD_12_567B_Idle", 0.45F, 30, false, "alco_bronzebell_3", 18,
            new String[]{"nathan_m3_5", "generic_horn_2", "nathan_m3_5"});
    public SoundRecord getSoundRecord() {
        return sound;
    }

    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntitySD90MACH.class, new SD90MACH(),
                        "SD90MACH",
                        new float[] { -6f,0.15F,0.0F },
                        new float[] { 0F, 0F, 180F },
                        null)
                {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString)
                    {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase())
                        {
                            case "yellow":
                                texturePath = "textures/locomotive/Diesel/SD90MACH/SD90MACH_UP";
                                break;
                            case "orange":
                                texturePath = "textures/locomotive/Diesel/SD90MACH/SD90MACH_UP_Wings";
                                break;
                            case "red":
                                texturePath = "textures/locomotive/Diesel/SD90MACH/SD90MACH_CP";
                                break;
                        }

                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
