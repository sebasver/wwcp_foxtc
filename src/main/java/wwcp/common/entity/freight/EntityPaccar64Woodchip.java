package wwcp.common.entity.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;
import wwcp.client.render.rollingstock.freight.Paccar64Woodchip;
import wwcp.client.render.rollingstock.freight.PaccarWoodchips;
import wwcp.common.core.handler.Transport;
import wwcp.common.library.Info;

public class EntityPaccar64Woodchip extends AbstractStandardFreightCar {

    public EntityPaccar64Woodchip(World world) {
        super(world);
    }

    @Override
    public CargoManager setupCargoManager()
    {
        return new CargoManager(new CargoSpecification[][]
                {
                        { new CargoSpecification(PaccarWoodchips.class,
                                Info.modID, "freightskins/Paccar64Woodchip/Paccar64Woodchip_ATSF", "Woodchips",
                                new CargoSpecification.RenderParameters().setOffset(0,1.1,0)) },
                });
    }


    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "ATSF");
        InsertTexture(1, "SP");

    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 4.25F;
    }

    @Override
    public String transportCountry() {
        return Transport.Paccar64Woodchip().country;
    }

    @Override
    public String transportYear() {
        return Transport.Paccar64Woodchip().year;
    }

    public String getInventoryName() {
        return Transport.Paccar64Woodchip().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.Paccar64Woodchip().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityPaccar64Woodchip.class, new Paccar64Woodchip(),
                        "Paccar64Woodchip",
                        new float[]{-0.0f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "black":
                                texturePath = "textures/freightskins/Paccar64Woodchip/Paccar64Woodchip_ATSF";
                                break;
                            case "red":
                                texturePath = "textures/freightskins/Paccar64Woodchip/Paccar64Woodchip_SP";
                                break;

                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
