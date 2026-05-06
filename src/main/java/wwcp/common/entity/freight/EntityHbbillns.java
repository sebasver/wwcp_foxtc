package wwcp.common.entity.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFixedFreightCar;
import wwcp.client.render.rollingstock.freight.Hbbillns;
import wwcp.common.core.handler.Transport;

public class EntityHbbillns extends AbstractStandardFixedFreightCar {

    public EntityHbbillns(World world) {
        super(world);
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "DSB Brown");
        InsertTexture(1, "DSB Grey");
        InsertTexture(2, "Transwaggon Brown");
        InsertTexture(3, "Transwaggon Grey");
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 3.65F;
    }

    @Override
    public String transportCountry() {
        return Transport.Hbbillns().country;
    }

    @Override
    public String transportYear() {
        return Transport.Hbbillns().year;
    }

    public String getInventoryName() {
        return Transport.Hbbillns().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.Hbbillns().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityHbbillns.class, new Hbbillns(),
                        "Hbbillns",
                        new float[]{-0.0f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "black":
                                texturePath = "textures/freightskins/Hbbillns/DSB_Hbbillns_Brown";
                                break;
                            case "red":
                                texturePath = "textures/freightskins/Hbbillns/DSB_Hbbillns_Grey";
                                break;
                            case "green":
                                texturePath = "textures/freightskins/Hbbillns/TWA_Hbbillns_Brown";
                                break;
                            case "brown":
                                texturePath = "textures/freightskins/Hbbillns/TWA_Hbbillns_Grey";
                                break;

                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
