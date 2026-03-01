package wwcp.common.entity.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFixedFreightCar;
import wwcp.client.render.rollingstock.freight.DSBCarE;
import wwcp.client.render.rollingstock.freight.DSBCarE;
import wwcp.common.core.handler.Transport;

public class EntityDSBEHopper extends AbstractStandardFixedFreightCar {

    public EntityDSBEHopper(World world) {
        super(world);
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "DSB");

    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 2.6F;
    }

    @Override
    public String transportCountry() {
        return Transport.DSBCarE().country;
    }

    @Override
    public String transportYear() {
        return Transport.DSBCarE().year;
    }

    public String getInventoryName() {
        return Transport.DSBCarE().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.DSBCarE().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityDSBEHopper.class, new DSBCarE(),
                        "DSBE",
                        new float[]{-0.14F, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "black":
                                texturePath = "textures/freightskins/DSBE/DSBEI";
                                break;

                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
