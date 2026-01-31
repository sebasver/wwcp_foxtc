package wwcp.common.entity.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import wwcp.client.render.rollingstock.freight.PS2Early3Bay;
import wwcp.common.core.handler.Transport;

public class EntityPS2Early3Bay extends AbstractStandardFreightCar {

    public EntityPS2Early3Bay(World world) {
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
        InsertTexture(0, "Northern Pacific");
        InsertTexture(1, "Rock Island");
        InsertTexture(1, "DRGW");
        InsertTexture(1, "BN");
        InsertTexture(1, "ATSF Early");
        InsertTexture(1, "ATSF");
        InsertTexture(2, "Generic");
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 3.5F;
    }

    @Override
    public String transportCountry() {
        return Transport.PS2Early3Bay().country;
    }

    @Override
    public String transportYear() {
        return Transport.PS2Early3Bay().year;
    }

    public String getInventoryName() {
        return Transport.PS2Early3Bay().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.PS2Early3Bay().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityPS2Early3Bay.class, new PS2Early3Bay(),
                        "PS2Early3Bay",
                        new float[]{-0.0f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "black":
                                texturePath = "textures/freightskins/PS2Early3Bay/PS2CD3Bay_NP";
                                break;
                            case "red":
                                texturePath = "textures/freightskins/PS2Early3Bay/PS2CD3Bay_RI";
                                break;
                            case "green":
                                texturePath = "textures/freightskins/PS2Early3Bay/PS2CD3Bay_Generic";
                                break;
                            case "brown":
                                texturePath = "textures/freightskins/PS2Early3Bay/PS2CD3Bay_DRGW";
                                break;
                            case "blue":
                                texturePath = "textures/freightskins/PS2Early3Bay/PS2CD3Bay_BN";
                                break;
                            case "purple":
                                texturePath = "textures/freightskins/PS2Early3Bay/PS2CD3Bay_ATSF_Early";
                                break;
                            case "cyan":
                                texturePath = "textures/freightskins/PS2Early3Bay/PS2CD3Bay_ATSF_Late";
                                break;
                            case "lightgrey":
                                texturePath = "textures/freightskins/PS2Early3Bay/PS2CD3Bay_UP";
                                break;

                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
