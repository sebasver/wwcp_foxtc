package wwcp.common.entity.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFixedFreightCar;
import wwcp.client.render.rollingstock.freight.Lgns;
import wwcp.common.core.handler.Transport;

public class EntityLgns extends AbstractStandardFixedFreightCar {

    public EntityLgns(World world) {
        super(world);
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "DSB Brown");
        InsertTexture(1, "DSB Grey");
        InsertTexture(2, "Transwaggon Brown");
        InsertTexture(3, "Transwaggon Grey");
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 3.65F;
    }

    @Override
    public String transportCountry() {
        return Transport.Lgns().country;
    }

    @Override
    public String transportYear() {
        return Transport.Lgns().year;
    }

    public String getInventoryName() {
        return Transport.Lgns().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.Lgns().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityLgns.class, new Lgns(),
                        "Lgns",
                        new float[]{-0.0f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "black":
                                texturePath = "textures/freightskins/Lgns/LGNS_40MRSK";
                                break;
                            case "red":
                                texturePath = "textures/freightskins/Lgns/LGNS_40MRSKW";
                                break;
                            case "green":
                                texturePath = "textures/freightskins/Lgns/LGNS_40SMSK";
                                break;
                            case "brown":
                                texturePath = "textures/freightskins/Lgns/LGNS_EmptyB";
                                break;
                            case "blue":
                                texturePath = "textures/freightskins/Lgns/LGNS_EmptyG";
                                break;
                            case "purple":
                                texturePath = "textures/freightskins/Lgns/LGNS_EmptyR";
                                break;
                            case "cyan":
                                texturePath = "textures/freightskins/Lgns/LGNS_40Red";
                                break;
                            case "lightgrey":
                                texturePath = "textures/freightskins/Lgns/LGNS_40Blue";
                                break;
                            case "pink":
                                texturePath = "textures/freightskins/Lgns/LGNS_40HBGS";
                                break;
                            case "lime":
                                texturePath = "textures/freightskins/Lgns/LGNS_20MSC-MRSK";
                                break;
                            case "magenta":
                                texturePath = "textures/freightskins/Lgns/LGNS_20PO-EVRG";
                                break;

                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
