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
import wwcp.client.render.rollingstock.locomotives.electrics.EP3;
import wwcp.client.render.rollingstock.locomotives.electrics.ES2;
import wwcp.common.core.handler.Transport;

public class EntityES2 extends ElectricTrain {

    public EntityES2(World world) {
        super(world);    
        InsertTexture(0, "ES2 Black");
        InsertTexture(1, "ES2 Orange & Maroon");
        InsertTexture(2, "ES2 Orange Early");
        InsertTexture(3, "ES2 Orange Late");
    }
    
    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 1.5f, 0.225f, -0.3f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1.3F;
    }

    @Override
    public String transportCountry() {
        return Transport.ES2().country;
    }

    @Override
    public String transportYear() {
        return Transport.ES2().year;
    }

    public String getInventoryName() {
        return Transport.ES2().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.ES2().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityES2.class, new ES2(),
                        "ES2",
                        new float[]{-1.5f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "red":
                                texturePath = "textures/locomotive/Electric/ES2/ES2_Black";
                                break;
                            case "orange":
                                texturePath = "textures/locomotive/Electric/ES2/ES2_Orange_Maroon";
                                break;
                            case "yellow":
                                texturePath = "textures/locomotive/Electric/ES2/ES2_Orange";
                                break;
                            case "blue":
                                texturePath = "textures/locomotive/Electric/ES2/ES2_Orange_Black";
                                break;
                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }


    public final SoundRecord sound = new SoundRecord(this.getClass(), " ", 1.0F, "MILW_Notch8", 0.45F, 28, "MILW_Idle", 0.45F, 30, false, "alco_bronzebell_3", 18,
            new String[]{"wabco_e2_1","wabco_e2_1","wabco_e2_1","wabco_e2_1"});
    public SoundRecord getSoundRecord() {
        return sound;
    }
}
