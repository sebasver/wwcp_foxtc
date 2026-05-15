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
import wwcp.client.render.rollingstock.locomotives.electrics.E94;
import wwcp.client.render.rollingstock.locomotives.electrics.ES64U4;
import wwcp.common.core.handler.Transport;

public class EntityE94 extends ElectricTrain {

    public EntityE94(World world) {
        super(world);    
        InsertTexture(0, "E94");
    }
    
    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 5.7f, 0.15f, -0.3f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1.075F;
    }

    @Override
    public String transportCountry() {
        return Transport.E94().country;
    }

    @Override
    public String transportYear() {
        return Transport.E94().year;
    }

    public String getInventoryName() {
        return Transport.E94().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.E94().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityE94.class, new E94(),
                        "E94",
                        new float[]{-3.5f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "black":
                                texturePath = "textures/locomotive/Electric/E94/E94";
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
