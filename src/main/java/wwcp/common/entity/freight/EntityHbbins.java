package wwcp.common.entity.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFixedFreightCar;
import wwcp.client.render.rollingstock.freight.AAR40ftStandardBoxcar;
import wwcp.client.render.rollingstock.freight.Hbbins;
import wwcp.common.core.handler.Transport;

public class EntityHbbins extends AbstractStandardFixedFreightCar {

    public EntityHbbins(World world) {
        super(world);
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "WP");
        InsertTexture(1, "WP Feather");
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 3.65F;
    }

    @Override
    public String transportCountry() {
        return Transport.Hbbins().country;
    }

    @Override
    public String transportYear() {
        return Transport.Hbbins().year;
    }

    public String getInventoryName() {
        return Transport.Hbbins().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.Hbbins().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityHbbins.class, new Hbbins(),
                        "Hbbins",
                        new float[]{-0.0f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "black":
                                texturePath = "textures/freightskins/Hbbins/AtaCitrus";
                                break;
                            case "red":
                                texturePath = "textures/freightskins/Hbbins/BrownGrey";
                                break;
                            case "green":
                                texturePath = "textures/freightskins/Hbbins/DSB";
                                break;
                            case "brown":
                                texturePath = "textures/freightskins/Hbbins/GreyRed";
                                break;
                            case "blue":
                                texturePath = "textures/freightskins/Hbbins/Persil";
                                break;
                            case "purple":
                                texturePath = "textures/freightskins/Hbbins/SeaRail";
                                break;
                            case "cyan":
                                texturePath = "textures/freightskins/Hbbins/SJ";
                                break;
                            case "lightgrey":
                                texturePath = "textures/freightskins/Hbbins/TWABrown";
                                break;
                            case "pink":
                                texturePath = "textures/freightskins/Hbbins/TWAGrey";
                                break;
                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
