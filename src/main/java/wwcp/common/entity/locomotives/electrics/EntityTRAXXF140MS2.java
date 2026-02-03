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
import wwcp.client.render.rollingstock.locomotives.electrics.Traxx.TraxxFirstGen;
import wwcp.client.render.rollingstock.locomotives.electrics.Traxx.TraxxSecondGen;
import wwcp.common.core.handler.Transport;

public class EntityTRAXXF140MS2 extends ElectricTrain {

    public EntityTRAXXF140MS2(World world) {
        super(world);    
        InsertTexture(0, "F140MS2");
        InsertTexture(1, "F140MS2");
        InsertTexture(2, "F140MS2");
        InsertTexture(3, "F140MS2");
        InsertTexture(4, "F140MS2");
        InsertTexture(5, "F140MS2");
        InsertTexture(6, "F140MS2");
        InsertTexture(7, "F140MS2");
        InsertTexture(8, "F140MS2");
        InsertTexture(9, "F140MS2");
        InsertTexture(10, "F140MS2");
        InsertTexture(11, "F140MS2");
        InsertTexture(12, "F140MS2");
        InsertTexture(13, "F140MS2");
        InsertTexture(14, "F140MS2");
        InsertTexture(15, "F140MS2");
        InsertTexture(16, "F140MS2");
        InsertTexture(17, "F140MS2");
    }
    
    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 7.65f, 0f, -0.2f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 0.5F;
    }

    @Override
    public String transportCountry() {
        return Transport.F140MS2().country;
    }

    @Override
    public String transportYear() {
        return Transport.F140MS2().year;
    }

    public String getInventoryName() {
        return Transport.F140MS2().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.F140MS2().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityTRAXXF140MS2.class, new TraxxSecondGen(),
                        "F140MS2",
                        new float[]{-4f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "black":
                                texturePath = "textures/locomotive/Electric/TraxxFamily/F140MS2/SBBCargo";
                                break;
                            case "red":
                                texturePath = "textures/locomotive/Electric/TraxxFamily/F140MS2/TraxxT1";
                                break;
                            case "green":
                                texturePath = "textures/locomotive/Electric/TraxxFamily/F140MS2/TraxxT2";
                                break;
                            case "magenta":
                                texturePath = "textures/locomotive/Electric/TraxxFamily/F140MS2/TraxxT3";
                                break;
                            case "brown":
                                texturePath = "textures/locomotive/Electric/TraxxFamily/F140MS2/TraxxT4";
                                break;
                            case "blue":
                                texturePath = "textures/locomotive/Electric/TraxxFamily/F140MS2/TraxxT5";
                                break;
                            case "purple":
                                texturePath = "textures/locomotive/Electric/TraxxFamily/F140MS2/TraxxT6";
                                break;
                            case "cyan":
                                texturePath = "textures/locomotive/Electric/TraxxFamily/F140MS2/TraxxT7";
                                break;
                            case "lightgrey":
                                texturePath = "textures/locomotive/Electric/TraxxFamily/F140MS2/TraxxT8";
                                break;
                            case "grey":
                                texturePath = "textures/locomotive/Electric/TraxxFamily/F140MS2/TraxxT9";
                                break;
                            case "pink":
                                texturePath = "textures/locomotive/Electric/TraxxFamily/F140MS2/TraxxT10";
                                break;
                            case "lime":
                                texturePath = "textures/locomotive/Electric/TraxxFamily/F140MS2/TraxxT11";
                                break;
                            case "yellow":
                                texturePath = "textures/locomotive/Electric/TraxxFamily/F140MS2/TraxxT12";
                                break;
                            case "lightblue":
                                texturePath = "textures/locomotive/Electric/TraxxFamily/F140MS2/TraxxT13";
                                break;
                            case "orange":
                                texturePath = "textures/locomotive/Electric/TraxxFamily/F140MS2/TraxxT14";
                                break;
                            case "white":
                                texturePath = "textures/locomotive/Electric/TraxxFamily/F140MS2/TraxxT15";
                                break;
                            case "skin16":
                                texturePath = "textures/locomotive/Electric/TraxxFamily/F140MS2/TraxxT16";
                                break;
                            case "skin17":
                                texturePath = "textures/locomotive/Electric/TraxxFamily/F140MS2/TraxxT17";
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
