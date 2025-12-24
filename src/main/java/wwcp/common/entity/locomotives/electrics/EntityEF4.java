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
import wwcp.client.render.rollingstock.locomotives.electrics.EF4;
import wwcp.client.render.rollingstock.locomotives.electrics.EP3;
import wwcp.common.core.handler.Transport;

public class EntityEF4 extends ElectricTrain {

    public EntityEF4(World world) {
        super(world);
        InsertTexture(0, "EF4 Orange & Maroon");
        InsertTexture(1, "EF4 Orange & Black");
    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 7.55f, 0.25f, -0.3f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1.8F;
    }

    @Override
    public String transportCountry() {
        return Transport.EF4().country;
    }

    @Override
    public String transportYear() {
        return Transport.EF4().year;
    }

    public String getInventoryName() {
        return Transport.EF4().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.EF4().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityEF4.class, new EF4(),
                        "EF4",
                        new float[]{-4f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "red":
                                texturePath = "textures/locomotive/Electric/EF4/EF4_Orange_Maroon";
                                break;
                            case "orange":
                                texturePath = "textures/locomotive/Electric/EF4/EF4_Orange";
                                break;
                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }

    public final SoundRecord sound = new SoundRecord(this.getClass(), " ", 1.0F, "MILW_Notch8", 0.45F, 28, "MILW_Idle", 0.45F, 30, false, "alco_bronzebell_3", 18,
            new String[]{"wabco_e2_1","wabco_e2_1"});

    public SoundRecord getSoundRecord() {
        return sound;
    }
}
