package wwcp.common.entity.passenger.Eurofima;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.core.util.TraincraftUtil;
import wwcp.client.render.rollingstock.passengerStock.Eurofima.EurofimaCompartment1_2;
import wwcp.common.core.handler.Transport;

public class EntityEurofima1st2ndClassCompartment extends AbstractPassengerCar {

    public EntityEurofima1st2ndClassCompartment(World world) {
        super(world);
        InsertTexture(0, "Eurofima factory paint");
    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 0.8f, -0.1f, 0f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 6.5F;
    }

    @Override
    public String transportCountry() {
        return Transport.EurofimaCompartment1_2().country;
    }

    @Override
    public String transportYear() {
        return Transport.EurofimaCompartment1_2().year;
    }

    public String getInventoryName() {
        return Transport.EurofimaCompartment1_2().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.EurofimaCompartment1_2().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityEurofima1st2ndClassCompartment.class, new EurofimaCompartment1_2(),
                        "Eurofima1_2_Compartment",
                        new float[]{0f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "yellow":
                                texturePath = "textures/passengerstock/Eurofima/EurofimaCompartment/Class1_2/C1_2_BaseLivery";
                                break;
                            case "red":
                                texturePath = "textures/passengerstock/Eurofima/EurofimaCompartment/Class1_2/C1_2_CD";
                                break;
                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
