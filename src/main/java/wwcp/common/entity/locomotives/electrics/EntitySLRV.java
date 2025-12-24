package wwcp.common.entity.locomotives.electrics;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;
import wwcp.client.render.rollingstock.locomotives.electrics.ES2;
import wwcp.client.render.rollingstock.locomotives.electrics.SLRV;
import wwcp.common.core.handler.Transport;

public class EntitySLRV extends ElectricTrain {

    public EntitySLRV(World world) {
        super(world);    
        InsertTexture(0, "Standard Yellow B Car");
        InsertTexture(1, "Standard Yellow A Car");
    }
    
    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 5.05f, -0.25f, 0.0f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 0.25F;
    }

    @Override
    public String transportCountry() {
        return Transport.SLRV().country;
    }

    @Override
    public String transportYear() {
        return Transport.SLRV().year;
    }

    public String getInventoryName() {
        return Transport.SLRV().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.SLRV().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntitySLRV.class, new SLRV(),
                        "SLRV",
                        new float[]{-2.85f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "black":
                                texturePath = "textures/locomotive/Electric/SLRV/SLRV_B_DART";
                                break;
                            case "red":
                                texturePath = "textures/locomotive/Electric/SLRV/SLRV_A_DART";
                                break;
                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }

    @Override
    public SoundRecord getSoundRecord() {
        return EnumSounds.locoElectricBR185;
    }
}
