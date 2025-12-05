package wwcp.common.entity.locomotives;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumTrains;
import train.common.library.Info;
import train.common.library.sounds.SoundRecord;
import wwcp.client.render.rollingstock.passenger.WWCPFictional.WWCPShopShunter;

public class EntityWWCPShopShunter extends DieselTrain
{
    public EntityWWCPShopShunter(World world) {
        super(world, EnumTrains.CEE4ED172T_E.getTankCapacity(), LiquidManager.dieselFilter());
        InsertTexture(0, "WWCP Shop shunter");
    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, -0F, 0, 0);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1.3F;
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
                        EntityWWCPShopShunter.class, new WWCPShopShunter(),
                        "WWCPShopShunter",
                        new float[] { -1.5f,0.15F,0.0F },
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
                        }

                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
