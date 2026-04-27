package wwcp.common.entity.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFixedFreightCar;
import wwcp.client.render.rollingstock.freight.Habiins_12;
import wwcp.common.core.handler.Transport;

public class EntityHabiins12 extends AbstractStandardFixedFreightCar {

    public EntityHabiins12(World world) {
        super(world);
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "Transwagon Brown");
        InsertTexture(1, "Transwagon Grey");
        InsertTexture(2, "Transwagon Brown/Grey");
        InsertTexture(3, "Märklin");
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 5.80F;
    }

    @Override
    public String transportCountry() {
        return Transport.Habbiins_14().country;
    }

    @Override
    public String transportYear() {
        return Transport.Habbiins_14().year;
    }

    public String getInventoryName() {
        return Transport.Habbiins_14().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.Habbiins_14().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityHabiins12.class, new Habiins_12(),
                        "Habbiins_14",
                        new float[]{-0.0f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "black":
                                texturePath = "textures/freightskins/Habiins_12/TWA_Brown";
                                break;
                            case "red":
                                texturePath = "textures/freightskins/Habiins_12/TWA_Grey";
                                break;
                            case "green":
                                texturePath = "textures/freightskins/Habiins_12/TWA_BrownGrey";
                                break;
                            case "blue":
                                texturePath = "textures/freightskins/Habiins_12/Märklin";
                                break;

                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
