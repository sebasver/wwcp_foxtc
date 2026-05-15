package wwcp.common.entity.passenger.Eurofima;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.core.util.TraincraftUtil;
import wwcp.client.render.rollingstock.passengerStock.Eurofima.EurofimaOpen1;
import wwcp.common.core.handler.Transport;

public class EntityEurofima1stClass extends AbstractPassengerCar {

    public EntityEurofima1stClass(World world) {
        super(world);
        InsertTexture(0, "Eurofima factory paint");
        InsertTexture(1, "SSB");
    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 0.8f, -0.1f, 0f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 6.5F;
    }

    @Override
    public String transportCountry() {
        return Transport.EurofimaOpen1().country;
    }

    @Override
    public String transportYear() {
        return Transport.EurofimaOpen1().year;
    }

    public String getInventoryName() {
        return Transport.EurofimaOpen1().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.EurofimaOpen1().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityEurofima1stClass.class, new EurofimaOpen1(),
                        "Eurofima1stClass",
                        new float[]{0f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "yellow":
                                texturePath = "textures/passengerstock/Eurofima/EurofimaOpen/Class1/O1Base";
                                break;
                            case "orange":
                                texturePath = "textures/passengerstock/Eurofima/EurofimaOpen/Class1/O1SBB";
                                break;
                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
