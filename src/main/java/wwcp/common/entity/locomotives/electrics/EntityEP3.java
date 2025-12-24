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
import wwcp.client.render.rollingstock.locomotives.electrics.BR103;
import wwcp.client.render.rollingstock.locomotives.electrics.EP3;
import wwcp.common.core.handler.Transport;

public class EntityEP3 extends ElectricTrain {

    public EntityEP3(World world) {
        super(world);    
        InsertTexture(0, "EP3 Black w/ White Lines");
        InsertTexture(1, "EP3 Black");
        InsertTexture(2, "EP3 Orange & Maroon");
    }
    
    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 8.55f, 0.2f, -0.3f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1.7F;
    }

    @Override
    public String transportCountry() {
        return Transport.EP3().country;
    }

    @Override
    public String transportYear() {
        return Transport.EP3().year;
    }

    public String getInventoryName() {
        return Transport.EP3().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.EP3().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityEP3.class, new EP3(),
                        "EP3",
                        new float[]{-4f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "red":
                                texturePath = "textures/locomotive/Electric/EP3/EP3_Black_WhiteLines";
                                break;
                            case "yellow":
                                texturePath = "textures/locomotive/Electric/EP3/EP3_Black";
                                break;
                            case "orange":
                                texturePath = "textures/locomotive/Electric/EP3/EP3_Orange";
                                break;
                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }


    public final SoundRecord sound = new SoundRecord(this.getClass(), " ", 1.0F, "MILW_Notch8", 0.45F, 28, "MILW_Idle", 0.45F, 30, false, "alco_bronzebell_3", 18,
            new String[]{"wabco_e2_1","wabco_e2_1","wabco_e2_1"});
    public SoundRecord getSoundRecord() {
        return sound;
    }
}
