package wwcp.common.entity.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFixedFreightCar;
import wwcp.client.render.rollingstock.freight.Habbiins_14;
import wwcp.common.core.handler.Transport;

public class EntityHabbiins14 extends AbstractStandardFixedFreightCar {

    public EntityHabbiins14(World world) {
        super(world);
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "SJ");
        InsertTexture(1, "Transwagon Brown");
        InsertTexture(2, "Transwagon Grey");
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
                        EntityHabbiins14.class, new Habbiins_14(),
                        "Habbiins_14",
                        new float[]{-0.0f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "black":
                                texturePath = "textures/freightskins/Habbiins_14/SJ";
                                break;
                            case "red":
                                texturePath = "textures/freightskins/Habbiins_14/TWA_Brown";
                                break;
                            case "green":
                                texturePath = "textures/freightskins/Habbiins_14/TWA_Grey";
                                break;

                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
