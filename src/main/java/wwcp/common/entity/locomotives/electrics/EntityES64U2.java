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
import wwcp.client.render.rollingstock.locomotives.electrics.ES64U2;
import wwcp.client.render.rollingstock.locomotives.electrics.Traxx.TraxxSecondGen;
import wwcp.common.core.handler.Transport;

public class EntityES64U2 extends ElectricTrain {

    public EntityES64U2(World world) {
        super(world);    
        InsertTexture(0, "ES64U2");
    }
    
    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 6.2f, 0.1f, -0.2f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 2F;
    }

    @Override
    public String transportCountry() {
        return Transport.ES64U2().country;
    }

    @Override
    public String transportYear() {
        return Transport.ES64U2().year;
    }

    public String getInventoryName() {
        return Transport.ES64U2().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.ES64U2().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityES64U2.class, new ES64U2(),
                        "ES64U2",
                        new float[]{-2.5f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "black":
                                texturePath = "textures/locomotive/Electric/Taurus/TaurusU2OBB";
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
