package wwcp.common.entity.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;
import wwcp.client.render.rollingstock.freight.OpenTriLevelAutorack;
import wwcp.client.render.rollingstock.freight.TriLevelCars;
import wwcp.common.core.handler.Transport;
import wwcp.common.library.Info;

public class EntityOpenTriLevelAutorack extends AbstractStandardFreightCar {

    public EntityOpenTriLevelAutorack(World world) {
        super(world);
    }

    @Override
    public CargoManager setupCargoManager()
    {
        return new CargoManager(new CargoSpecification[][]
                {
                        { new CargoSpecification(TriLevelCars.class,
                                Info.modID, "freightskins/OpenTriLevelAutorack/OpenTriLevelAutorack_MILW", "Sedans",
                                new CargoSpecification.RenderParameters().setOffset(0,2.625,0)) },
                });
    }


    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "MILW");
        InsertTexture(1, "ATSF");

    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 6.1F;
    }

    @Override
    public String transportCountry() {
        return Transport.OpenTriLevelAutorack().country;
    }

    @Override
    public String transportYear() {
        return Transport.OpenTriLevelAutorack().year;
    }

    public String getInventoryName() {
        return Transport.OpenTriLevelAutorack().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.Paccar64Woodchip().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(Info.modID,
                        EntityOpenTriLevelAutorack.class, new OpenTriLevelAutorack(),
                        "OpenTriLevelAutorack",
                        new float[]{-0.0f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "black":
                                texturePath = "textures/freightskins/OpenTriLevelAutorack/OpenTriLevelAutorack_MILW";
                                break;
                            case "red":
                                texturePath = "textures/freightskins/OpenTriLevelAutorack/OpenTriLevelAutorack_ATSF";
                                break;


                        }
                        texturePath += ".png";

                        return new ResourceLocation(Info.modID, texturePath);
                    }
                });
    }
}
