package wwcp.common.entity.passenger.Rheingold1928;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.core.util.TraincraftUtil;
import wwcp.client.render.rollingstock.passengerStock.Rheingold.Rheingold19281Salon;
import wwcp.client.render.rollingstock.passengerStock.Rheingold.Rheingold1928Kitchen1;
import wwcp.common.core.handler.Transport;

public class Entity1stClassRheingoldKitchen extends AbstractPassengerCar {

    public Entity1stClassRheingoldKitchen(World world) {
        super(world);
        InsertTexture(0, "Rheingold 1928");
    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 0.2f, 0f, -0.25f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 5.8F;
    }

    @Override
    public String transportCountry() {
        return Transport.RheingoldKitchen1().country;
    }

    @Override
    public String transportYear() {
        return Transport.RheingoldKitchen1().year;
    }

    public String getInventoryName() {
        return Transport.RheingoldKitchen1().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.RheingoldKitchen1().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        Entity1stClassRheingoldKitchen.class, new Rheingold1928Kitchen1(),
                        "RheingoldKitchen1",
                        new float[]{-0.1f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "yellow":
                                texturePath = "textures/passengerstock/RheingoldSet/Speise1";
                                break;
                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
