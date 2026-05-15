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
import wwcp.client.render.rollingstock.locomotives.electrics.E44DB;
import wwcp.client.render.rollingstock.locomotives.electrics.E94;
import wwcp.common.core.handler.Transport;

public class EntityE44 extends ElectricTrain {

    public EntityE44(World world) {
        super(world);    
        InsertTexture(0, "E94");
    }
    
    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 3.7f, 0.15f, -0.3f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1.97F;
    }

    @Override
    public String transportCountry() {
        return Transport.E44DB().country;
    }

    @Override
    public String transportYear() {
        return Transport.E44DB().year;
    }

    public String getInventoryName() {
        return Transport.E44DB().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.E44DB().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityE44.class, new E44DB(),
                        "E44",
                        new float[]{-1.75f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "black":
                                texturePath = "textures/locomotive/Electric/E44/BR_E44";
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
