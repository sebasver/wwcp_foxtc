package wwcp.common.entity.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import wwcp.client.render.rollingstock.freight.VertAPacAutorack;
import wwcp.common.core.handler.Transport;

public class EntityVertAPacAutorack extends AbstractStandardFreightCar {

    public EntityVertAPacAutorack(World world) {
        super(world);
    }

    @Override
    public CargoManager setupCargoManager()
    {
        return null;
    }


    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "MP");
        InsertTexture(1, "SCL");
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 6.1F;
    }

    @Override
    public String transportCountry() {
        return Transport.VertAPacAutorack().country;
    }

    @Override
    public String transportYear() {
        return Transport.VertAPacAutorack().year;
    }

    public String getInventoryName() {
        return Transport.VertAPacAutorack().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.VertAPacAutorack().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityVertAPacAutorack.class, new VertAPacAutorack(),
                        "VertAPacAutorack",
                        new float[]{-0.0f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "black":
                                texturePath = "textures/freightskins/VertAPacAutorack/VertAPac_MP";
                                break;
                            case "red":
                                texturePath = "textures/freightskins/VertAPacAutorack/VertAPac_SCL";
                                break;

                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
