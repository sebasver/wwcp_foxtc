package wwcp.common.entity.locomotives.diesels;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.sounds.SoundRecord;
import wwcp.client.render.rollingstock.locomotives.diesels.C630;
import wwcp.client.render.rollingstock.locomotives.diesels.SD90MACH;
import wwcp.common.core.handler.Transport;

import static wwcp.common.library.WWCPItems.C630M;

public class EntityC630M extends DieselTrain
{
    public EntityC630M(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "CP Action Red");
        InsertTexture(1, "PGE Green");
        InsertTexture(2, "BCOL Early Green");
        InsertTexture(3, "BCOL Striped Green");
        InsertTexture(4, "BCRAIL Social Credit");
        InsertTexture(5, "CN Striped");
    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 6.0F, 0.25f, -0.3f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1.5F;
    }

    @Override
    public String transportCountry() {
        return Transport.C630M().country;
    }

    @Override
    public String transportYear() {
        return Transport.C630M().year;
    }

    public String getInventoryName() {
        return Transport.C630M().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.C630M().fictional;
    }

    public final SoundRecord sound = new SoundRecord(this.getClass(), " ", 1.0F, "ALCO_16_251E_Notch8", 0.65F, 28, "ALCO_16_251E_Idle", 0.65F, 30, false, "alco_bronzebell_3", 18,
            new String[]{"nathan_m3h_1","nathan_m3h_4","nathan_m3h_4","nathan_m3h_4","nathan_m3h_4","nathan_m3h_2"});
    public SoundRecord getSoundRecord() {
        return sound;
    }

    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityC630M.class, new C630(),
                        "C630M",
                        new float[] { -3.0f,0.15F,0.0F },
                        new float[] { 0F, 180F, 180F },
                        null)
                {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString)
                    {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase())
                        {
                            case "red":
                                texturePath = "textures/locomotive/Diesel/C630/C630M_CP";
                                break;
                            case "black":
                                texturePath = "textures/locomotive/Diesel/C630/C630M_PGE";
                                break;
                            case "green":
                                texturePath = "textures/locomotive/Diesel/C630/C630M_BCOL";
                                break;
                            case "lime":
                                texturePath = "textures/locomotive/Diesel/C630/C630M_BCOL_Stripe";
                                break;
                            case "blue":
                                texturePath = "textures/locomotive/Diesel/C630/C630M_BCRAIL";
                                break;
                            case "white":
                                texturePath = "textures/locomotive/Diesel/C630/C630M_CN";
                                break;

                        }

                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
