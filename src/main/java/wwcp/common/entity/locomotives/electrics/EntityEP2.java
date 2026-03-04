package wwcp.common.entity.locomotives.electrics;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.sounds.SoundRecord;
import wwcp.client.render.rollingstock.locomotives.electrics.EP2;
import wwcp.client.render.rollingstock.locomotives.electrics.ES2;
import wwcp.common.core.handler.Transport;

public class EntityEP2 extends ElectricTrain {

    public EntityEP2(World world) {
        super(world);    
        InsertTexture(0, "MILW Black Early B");
        InsertTexture(1, "MILW Black Early A");
        InsertTexture(2, "MILW Black Late B");
        InsertTexture(3, "MILW Black Late A");
        InsertTexture(4, "MILW Hiawatha Early B");
        InsertTexture(5, "MILW Hiawatha Early A");
        InsertTexture(6, "MILW Hiawatha B");
        InsertTexture(7, "MILW Hiawatha A");
        InsertTexture(8, "MILW Orange & Maroon B");
        InsertTexture(9, "MILW Orange & Maroon A");
    }
    
    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, -0.25f, 0.25f, -0.3f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 0.85F;
    }

    @Override
    public String transportCountry() {
        return Transport.EP2().country;
    }

    @Override
    public String transportYear() {
        return Transport.EP2().year;
    }

    public String getInventoryName() {
        return Transport.EP2().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.EP2().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityEP2.class, new EP2(),
                        "EP2",
                        new float[]{-2.0f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "black":
                                texturePath = "textures/locomotive/Electric/EP2/EP2 Black Early B";
                                break;
                            case "red":
                                texturePath = "textures/locomotive/Electric/EP2/EP2 Black Early A";
                                break;
                            case "green":
                                texturePath = "textures/locomotive/Electric/EP2/EP2 Black Late B";
                                break;
                            case "brown":
                                texturePath = "textures/locomotive/Electric/EP2/EP2 Black Late A";
                                break;
                            case "blue":
                                texturePath = "textures/locomotive/Electric/EP2/EP2 Hiawatha Early B";
                                break;
                            case "purple":
                                texturePath = "textures/locomotive/Electric/EP2/EP2 Hiawatha Early A";
                                break;
                            case "cyan":
                                texturePath = "textures/locomotive/Electric/EP2/EP2 Hiawatha B";
                                break;
                            case "lightgrey":
                                texturePath = "textures/locomotive/Electric/EP2/EP2 Hiawatha A";
                                break;
                            case "pink":
                                texturePath = "textures/locomotive/Electric/EP2/EP2 Orange_Maroon B";
                                break;
                            case "lime":
                                texturePath = "textures/locomotive/Electric/EP2/EP2 Orange_Maroon A";
                                break;
                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }


    public final SoundRecord sound = new SoundRecord(this.getClass(), " ", 1.0F, "MILW_Notch8", 0.45F, 28, "MILW_Idle", 0.45F, 30, false, "alco_bronzebell_3", 18,
            new String[]{"wabco_e2_1","wabco_e2_1","wabco_e2_1","wabco_e2_1","wabco_e2_1","wabco_e2_1","wabco_e2_1","wabco_e2_1","wabco_e2_1","wabco_e2_1"});
    public SoundRecord getSoundRecord() {
        return sound;
    }
}
