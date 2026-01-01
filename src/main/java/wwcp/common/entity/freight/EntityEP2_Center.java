package wwcp.common.entity.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import wwcp.client.render.rollingstock.freight.EP2_Center;
import wwcp.common.core.handler.Transport;

public class EntityEP2_Center extends AbstractStandardFreightCar {

    public EntityEP2_Center(World world) {
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
        InsertTexture(0, "MILW Black Early");
        InsertTexture(1, "MILW Black Late");
        InsertTexture(2, "MILW Hiawatha Early");
        InsertTexture(3, "MILW Hiawatha");
        InsertTexture(4, "MILW Orange & Maroon");
    ;
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1.1F;
    }

    @Override
    public String transportCountry() {
        return Transport.EP2_Center().country;
    }

    @Override
    public String transportYear() {
        return Transport.EP2_Center().year;
    }

    public String getInventoryName() {
        return Transport.EP2_Center().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.EP2_Center().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityEP2_Center.class, new EP2_Center(),
                        "EntityEP2_Center",
                        new float[]{-0.0f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "black":
                                texturePath = "textures/locomotive/Electric/EP2/EP2 Black Early Center";
                                break;
                            case "red":
                                texturePath = "textures/locomotive/Electric/EP2/EP2 Black Late Center";
                                break;
                            case "green":
                                texturePath = "textures/locomotive/Electric/EP2/EP2 Hiawatha Early Center";
                                break;
                            case "brown":
                                texturePath = "textures/locomotive/Electric/EP2/EP2 Hiawatha Center";
                                break;
                            case "blue":
                                texturePath = "textures/locomotive/Electric/EP2/EP2 Orange_Maroon Center";
                                break;

                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
