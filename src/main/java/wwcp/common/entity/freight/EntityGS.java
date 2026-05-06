package wwcp.common.entity.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFixedFreightCar;
import wwcp.client.render.rollingstock.freight.GSVan;
import wwcp.client.render.rollingstock.freight.GSVan;
import wwcp.common.core.handler.Transport;

public class EntityGS extends AbstractStandardFixedFreightCar {

    public EntityGS(World world) {
        super(world);
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "GS DB");
        InsertTexture(1, "GS DB2");
        InsertTexture(2, "GS DSB");
        InsertTexture(3, "GS DSB2");
        InsertTexture(4, "GS DSB Tjeneste");
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 2.70F;
    }

    @Override
    public String transportCountry() {
        return Transport.GSVan().country;
    }

    @Override
    public String transportYear() {
        return Transport.GSVan().year;
    }

    public String getInventoryName() {
        return Transport.GSVan().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.GSVan().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityGS.class, new GSVan(),
                        "GS",
                        new float[]{-0.0f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "black":
                                texturePath = "textures/freightskins/GS/GS_DB";
                                break;
                            case "red":
                                texturePath = "textures/freightskins/GS/GS_DB2";
                                break;
                            case "green":
                                texturePath = "textures/freightskins/GS/GS_DSB";
                                break;
                            case "brown":
                                texturePath = "textures/freightskins/GS/GS_DSB2";
                                break;
                            case "blue":
                                texturePath = "textures/freightskins/GS/GS_DSBT";
                                break;

                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
