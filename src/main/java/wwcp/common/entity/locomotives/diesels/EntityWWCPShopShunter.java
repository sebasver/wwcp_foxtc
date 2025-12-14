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

public class EntityWWCPShopShunter extends DieselTrain
{
    public EntityWWCPShopShunter(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "WWCP Shop shunter");
    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, -0.2F, 0, 0);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1F;
    }

    @Override
    public String transportCountry() {
        return "EU";
    }

    @Override
    public String transportYear() {
        return "2012-";
    }

    public String getInventoryName() {
        return "WWCPShopShunter";
    }

    @Override
    public boolean isFictional() {
        return true;
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
                        EntityWWCPShopShunter.class, new SD90MACH(),
                        "WWCPShopShunter",
                        new float[] { -1.25f,0.15F,0.0F },
                        new float[] { 0F, 180F, 180F },
                        null)
                {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString)
                    {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase())
                        {
                            case "red":
                                texturePath = "textures/WWCPFictional/WWCPShopShunter";
                                break;
                            case "blue":
                                texturePath = "textures/locomotive/Diesel/SD90MACH/SD90MACH_CP";
                                break;
                        }

                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
