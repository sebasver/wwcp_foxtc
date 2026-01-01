package wwcp.common.entity.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFixedFreightCar;
import wwcp.client.render.rollingstock.freight.Habbiins_17;
import wwcp.client.render.rollingstock.freight.Hbbins;
import wwcp.common.core.handler.Transport;

public class EntityHabbiins17 extends AbstractStandardFixedFreightCar {

    public EntityHabbiins17(World world) {
        super(world);
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "WP");
        InsertTexture(1, "WP Feather");
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 5.80F;
    }

    @Override
    public String transportCountry() {
        return Transport.Habbiins_17().country;
    }

    @Override
    public String transportYear() {
        return Transport.Habbiins_17().year;
    }

    public String getInventoryName() {
        return Transport.Habbiins_17().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.Habbiins_17().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityHabbiins17.class, new Habbiins_17(),
                        "Habbiins_17",
                        new float[]{-0.0f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "black":
                                texturePath = "textures/freightskins/Habbiins_17/DB";
                                break;
                            case "red":
                                texturePath = "textures/freightskins/Habbiins_17/DSB_Grey";
                                break;
                            case "green":
                                texturePath = "textures/freightskins/Habbiins_17/SJ";
                                break;
                            case "brown":
                                texturePath = "textures/freightskins/Habbiins_17/TWA_Brown";
                                break;
                            case "blue":
                                texturePath = "textures/freightskins/Habbiins_17/TWA_Grey";
                                break;
                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
