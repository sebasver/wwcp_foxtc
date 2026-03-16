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
import wwcp.client.render.rollingstock.locomotives.electrics.DSBClassEA;
import wwcp.common.core.handler.Transport;

public class EntityDSBEA extends ElectricTrain {

    public EntityDSBEA(World world) {
        super(world);    
        InsertTexture(0, "DSB EA Red/Black");
        InsertTexture(1, "DSB EA Blue");
        InsertTexture(2, "DSB EA Red");
        InsertTexture(3, "Railion EA");
        InsertTexture(4, "Bulmarket Class 86");
        InsertTexture(5, "Bulmarket Class 86 DB Schenker");
    }
    
    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 7.65f, 0f, -0.2f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 0.5F;
    }

    @Override
    public String transportCountry() {
        return Transport.DSBClassEA().country;
    }

    @Override
    public String transportYear() {
        return Transport.DSBClassEA().year;
    }

    public String getInventoryName() {
        return Transport.BR145().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.DSBClassEA().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityDSBEA.class, new DSBClassEA(),
                        "BR145",
                        new float[]{-4f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "black":
                                texturePath = "textures/locomotive/Electric/DSBClassEA/EA_DSB1";
                                break;
                            case "red":
                                texturePath = "textures/locomotive/Electric/DSBClassEA/EA_DSB2";
                                break;
                            case "green":
                                texturePath = "textures/locomotive/Electric/DSBClassEA/EA_DSB3";
                                break;
                            case "blue":
                                texturePath = "textures/locomotive/Electric/DSBClassEA/EA_RDK";
                                break;
                            case "brown":
                                texturePath = "textures/locomotive/Electric/DSBClassEA/86_DB1";
                                break;
                            case "cyan":
                                texturePath = "textures/locomotive/Electric/DSBClassEA/86_DB2";
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
