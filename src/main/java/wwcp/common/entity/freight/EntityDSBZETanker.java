package wwcp.common.entity.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFixedFreightCar;
import wwcp.client.render.rollingstock.freight.DSBZETanker;
import wwcp.common.core.handler.Transport;

public class EntityDSBZETanker extends AbstractStandardFixedFreightCar {

    public EntityDSBZETanker(World world) {
        super(world);
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "Aarhus Oliefabrik A/S");

    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 2.17F;
    }

    @Override
    public String transportCountry() {
        return Transport.DSBZETanker().country;
    }

    @Override
    public String transportYear() {
        return Transport.DSBZETanker().year;
    }

    public String getInventoryName() {
        return Transport.DSBZETanker().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.DSBZETanker().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityDSBZETanker.class, new DSBZETanker(),
                        "DSBZETanker",
                        new float[]{-0.0f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "black":
                                texturePath = "textures/freightskins/DSBZETanker/ArOf";
                                break;

                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
