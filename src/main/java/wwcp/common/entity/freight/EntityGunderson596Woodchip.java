package wwcp.common.entity.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;
import wwcp.client.render.rollingstock.freight.Gunderson596Woodchip;
import wwcp.client.render.rollingstock.freight.GundersonWoodchips;
import wwcp.common.core.handler.Transport;
import wwcp.common.library.Info;

public class EntityGunderson596Woodchip extends AbstractStandardFreightCar {

    public EntityGunderson596Woodchip(World world) {
        super(world);
    }

    @Override
    public CargoManager setupCargoManager()
    {
        return new CargoManager(new CargoSpecification[][]
                {
                        { new CargoSpecification(GundersonWoodchips.class,
                                Info.modID, "freightskins/Gunderson596Woodchip/596_Gunderson_Woodchip_NP", "Woodchips",
                                new CargoSpecification.RenderParameters().setOffset(0,1.25,0)) },
                });
    }


    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "NP");
        InsertTexture(1, "BN Patch");

    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 4.175F;
    }

    @Override
    public String transportCountry() {
        return Transport.Gunderson596Woodchip().country;
    }

    @Override
    public String transportYear() {
        return Transport.Gunderson596Woodchip().year;
    }

    public String getInventoryName() {
        return Transport.Gunderson596Woodchip().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.Gunderson596Woodchip().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(Info.modID,
                        EntityGunderson596Woodchip.class, new Gunderson596Woodchip(),
                        "Gunderson596Woodchip",
                        new float[]{-0.0f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "black":
                                texturePath = "textures/freightskins/Gunderson596Woodchip/596_Gunderson_Woodchip_NP";
                                break;
                            case "red":
                                texturePath = "textures/freightskins/Gunderson596Woodchip/596_Gunderson_Woodchip_BNPatch";
                                break;

                        }
                        texturePath += ".png";

                        return new ResourceLocation(Info.modID, texturePath);
                    }
                });
    }
}
