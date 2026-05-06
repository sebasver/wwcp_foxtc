package wwcp.common.entity.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFixedFreightCar;
import wwcp.client.render.rollingstock.freight.DSB735;
import wwcp.common.core.handler.Transport;

public class EntityDSB735 extends AbstractStandardFixedFreightCar {

    public EntityDSB735(World world) {
        super(world);
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "Kommune Kemi");

    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 2.70F;
    }

    @Override
    public String transportCountry() {
        return Transport.DSB735Tanker().country;
    }

    @Override
    public String transportYear() {
        return Transport.DSB735Tanker().year;
    }

    public String getInventoryName() {
        return Transport.DSB735Tanker().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.DSB735Tanker().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityDSB735.class, new DSB735(),
                        "GS",
                        new float[]{-0.0f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "black":
                                texturePath = "textures/freightskins/DSB735Tanker/KK735";
                                break;

                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
