package wwcp.common.entity.passenger.Rheingold1928;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.core.util.TraincraftUtil;
import wwcp.client.render.rollingstock.passengerStock.Rheingold.Rheingold19282Salon;
import wwcp.client.render.rollingstock.passengerStock.Rheingold.Rheingold1928Kitchen2;
import wwcp.common.core.handler.Transport;

public class Entity2ndClassRheingoldKitchen extends AbstractPassengerCar {

    public Entity2ndClassRheingoldKitchen(World world) {
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
        return Transport.RheingoldKitchen2().country;
    }

    @Override
    public String transportYear() {
        return Transport.RheingoldKitchen2().year;
    }

    public String getInventoryName() {
        return Transport.RheingoldKitchen2().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.RheingoldKitchen2().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        Entity2ndClassRheingoldKitchen.class, new Rheingold1928Kitchen2(),
                        "RheingoldKitchen2",
                        new float[]{-0.1f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "yellow":
                                texturePath = "textures/passengerstock/RheingoldSet/Speise2";
                                break;
                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
