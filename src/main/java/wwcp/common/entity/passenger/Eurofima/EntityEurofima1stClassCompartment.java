package wwcp.common.entity.passenger.Eurofima;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.core.util.TraincraftUtil;
import wwcp.client.render.rollingstock.passengerStock.Eurofima.EurofimaCompartment1;
import wwcp.common.core.handler.Transport;

public class EntityEurofima1stClassCompartment extends AbstractPassengerCar {

    public EntityEurofima1stClassCompartment(World world) {
        super(world);
        InsertTexture(0, "Eurofima 1st Class Compartment");
        InsertTexture(1, "Eurofima 1st Class Compartment");
        InsertTexture(2, "Eurofima 1st Class Compartment");
        InsertTexture(3, "Eurofima 1st Class Compartment");
        InsertTexture(4, "Eurofima 1st Class Compartment");
        InsertTexture(5, "Eurofima 1st Class Compartment");
    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 0.8f, -0.1f, 0f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 6.5F;
    }

    @Override
    public String transportCountry() {
        return Transport.EurofimaCompartment1().country;
    }

    @Override
    public String transportYear() {
        return Transport.EurofimaCompartment1().year;
    }

    public String getInventoryName() {
        return Transport.EurofimaCompartment1().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.EurofimaCompartment1().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityEurofima1stClassCompartment.class, new EurofimaCompartment1(),
                        "Eurofima1stClassCompartment",
                        new float[]{0f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "yellow":
                                texturePath = "textures/passengerstock/Eurofima/EurofimaCompartment/Class1/C1_2Years";
                                break;
                            case "orange":
                                texturePath = "textures/passengerstock/Eurofima/EurofimaCompartment/Class1/C1_BaseLivery";
                                break;
                            case "red":
                                texturePath = "textures/passengerstock/Eurofima/EurofimaCompartment/Class1/C1_BRFictional";
                                break;
                            case "purple":
                                texturePath = "textures/passengerstock/Eurofima/EurofimaCompartment/Class1/C1_IC";
                                break;
                            case "black":
                                texturePath = "textures/passengerstock/Eurofima/EurofimaCompartment/Class1/C1_RER";
                                break;
                            case "grey":
                                texturePath = "textures/passengerstock/Eurofima/EurofimaCompartment/Class1/C1_TramsIM";
                                break;
                            case "lightgrey":
                                texturePath = "textures/passengerstock/Eurofima/EurofimaCompartment/Class1/C1_WWCP_Branding";
                                break;
                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
