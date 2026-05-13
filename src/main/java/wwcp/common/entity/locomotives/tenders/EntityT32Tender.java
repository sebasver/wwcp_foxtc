package wwcp.common.entity.locomotives.tenders;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.Tender;
import wwcp.client.render.rollingstock.tenders.ChristmasTenderT32;
import wwcp.client.render.rollingstock.tenders.germanTenders.T32;
import wwcp.common.core.handler.Transport;

public class EntityT32Tender extends Tender {

    public EntityT32Tender(World world) {
        super(world, LiquidManager.WATER_FILTER);
        InsertTexture(0, "T32 DB");
        InsertTexture(1, "T32 DR");

    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 2F;
    }

    @Override
    public String transportCountry() {
        return Transport.T32().country;
    }

    @Override
    public String transportYear() {
        return Transport.T32().year;
    }

    public String getInventoryName() {
        return Transport.T32().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.T32().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityT32Tender.class, new T32(),
                        "TenderT32",
                        new float[]{-0.50f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "yellow":
                                texturePath = "textures/tenders/germanTenders/T32DB";
                                break;
                            case "black":
                                texturePath = "textures/tenders/germanTenders/T32DR";
                                break;
                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
