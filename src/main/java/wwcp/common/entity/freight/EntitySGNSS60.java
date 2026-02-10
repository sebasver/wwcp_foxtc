package wwcp.common.entity.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFixedFreightCar;
import wwcp.client.render.rollingstock.freight.SGGNS60;
import wwcp.common.core.handler.Transport;

public class EntitySGNSS60 extends AbstractStandardFixedFreightCar {

    public EntitySGNSS60(World world) {
        super(world);
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "Hamburg Containers");
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 4.8F;
    }

    @Override
    public String transportCountry() {
        return Transport.SGNSS60().country;
    }

    @Override
    public String transportYear() {
        return Transport.SGNSS60().year;
    }

    public String getInventoryName() {
        return Transport.SGNSS60().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.SGNSS60().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntitySGNSS60.class, new SGGNS60(),
                        "SGGNS60",
                        new float[]{-0.05f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "black":
                                texturePath = "textures/freightskins/SGNSS60/1";
                                break;
                            case "grey":
                                texturePath = "textures/freightskins/SGNSS60/2";
                                break;
                            case "lightgrey":
                                texturePath = "textures/freightskins/SGNSS60/3";
                                break;
                            case "purple":
                                texturePath = "textures/freightskins/SGNSS60/4";
                                break;
                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
