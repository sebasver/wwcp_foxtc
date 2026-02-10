package wwcp.common.entity.passenger.Rheingold1928;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.api.AbstractWorkCart;
import train.common.core.util.TraincraftUtil;
import wwcp.client.render.rollingstock.passengerStock.Rheingold.Rheingold1928Baggage;
import wwcp.client.render.rollingstock.passengerStock.Rheingold.Rheingold1928Kitchen1;
import wwcp.common.core.handler.Transport;

public class EntityRheingoldBaggage extends AbstractWorkCart {

    public EntityRheingoldBaggage(World world) {
        super(world);
        InsertTexture(0, "Rheingold 1928");
    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 0.2f, 0f, -0.25f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 4.7F;
    }

    @Override
    public String transportCountry() {
        return Transport.RheingoldBaggage().country;
    }

    @Override
    public String transportYear() {
        return Transport.RheingoldBaggage().year;
    }

    public String getInventoryName() {
        return Transport.RheingoldBaggage().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.RheingoldBaggage().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityRheingoldBaggage.class, new Rheingold1928Baggage(),
                        "RheingoldBaggage",
                        new float[]{0f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "yellow":
                                texturePath = "textures/passengerstock/RheingoldSet/Baggage";
                                break;
                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
