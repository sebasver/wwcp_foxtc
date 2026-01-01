package wwcp.common.entity.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import wwcp.client.render.rollingstock.freight.XM4A;
import wwcp.common.core.handler.Transport;

public class EntityXM4A extends AbstractStandardFreightCar {

    public EntityXM4A(World world) {
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
        InsertTexture(0, "XM4A Northern Pacific Brown");
        InsertTexture(1, "XM4A Burlington Northern Green");
        InsertTexture(2, "XM4A Great Northern Blue");
        InsertTexture(3, "XM4A Great Northern Green");
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 3.7F;
    }

    @Override
    public String transportCountry() {
        return Transport.XM4A().country;
    }

    @Override
    public String transportYear() {
        return Transport.XM4A().year;
    }

    public String getInventoryName() {
        return Transport.XM4A().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.XM4A().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityXM4A.class, new XM4A(),
                        "XM4A",
                        new float[]{-0.0f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "brown":
                                texturePath = "textures/freightskins/XM4A/XM4A_NPB";
                                break;
                            case "green":
                                texturePath = "textures/freightskins/XM4A/XM4A_BNG";
                                break;
                            case "blue":
                                texturePath = "textures/freightskins/XM4A/XM4A_GNBSB";
                                break;
                            case "lime":
                                texturePath = "textures/freightskins/XM4A/XM4A_GNA";
                                break;
                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
