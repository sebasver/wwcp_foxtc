package wwcp.common.entity.passenger.Eurofima;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.core.util.TraincraftUtil;
import wwcp.client.render.rollingstock.passengerStock.Eurofima.EurofimaPanoramaExpress;
import wwcp.client.render.rollingstock.passengerStock.Eurofima.EurofimaPresidentiale;
import wwcp.common.core.handler.Transport;

public class EntityEurofimaPresidentiale extends AbstractPassengerCar {

    public EntityEurofimaPresidentiale(World world) {
        super(world);
        InsertTexture(0, "Eurofima Panorama");
    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 0.8f, 0.1f, 0f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 6.5F;
    }

    @Override
    public String transportCountry() {
        return Transport.EurofimaPresidentiale().country;
    }

    @Override
    public String transportYear() {
        return Transport.EurofimaPresidentiale().year;
    }

    public String getInventoryName() {
        return Transport.EurofimaPresidentiale().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.EurofimaPresidentiale().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityEurofimaPresidentiale.class, new EurofimaPresidentiale(),
                        "EurofimaPresidentiale",
                        new float[]{0f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "yellow":
                                texturePath = "textures/passengerstock/Eurofima/Presidentiale/el_presidentiale";
                                break;
                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
