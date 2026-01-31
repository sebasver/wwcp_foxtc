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
import wwcp.client.render.rollingstock.locomotives.diesels.RS18C;
import wwcp.common.core.handler.Transport;

import java.util.ArrayList;

public class EntityRS18C extends DieselTrain
{
    public EntityRS18C(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "PGE As Delivered");
        InsertTexture(1, "PGE Dark Green & Orange, Large Letters");
        InsertTexture(2, "PGE Dark Green & Orange");
        InsertTexture(3, "BCOL Lightning Stripe");

    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 3.6F, 0.25f, -0.3f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1.6F;
    }

    @Override
    public String transportCountry() {
        return Transport.RS18C().country;
    }

    @Override
    public String transportYear() {
        return Transport.RS18C().year;
    }

    public String getInventoryName() {
        return Transport.RS18C().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.RS18C().fictional;
    }

    public final SoundRecord sound = new SoundRecord(this.getClass(), " ", 1.0F, "ALCO_16_251C_Notch8", 0.45F, 28, "ALCO_16_251C_Idle", 0.45F, 30, false, "alco_bronzebell_3", 18,
            new String[]{"nathan_m3h_2","nathan_m3h_2","nathan_k5l_3","nathan_k5l_3"});
    public SoundRecord getSoundRecord() {
        return sound;
    }

    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityRS18C.class, new RS18C(),
                        "RS18C",
                        new float[] { -2.15f,0.15F,0.0F },
                        new float[] { 0F, 180F, 180F },
                        null,
                        "smoke",
                        new ArrayList<double[]>() {
                            {
                                add(new double[]{0.75D, 1.25D, 0.0D});
                            }},
                        "", null, 10, 2)
                {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString)
                    {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase())
                        {
                            case "red":
                                texturePath = "textures/locomotive/Diesel/RS18/RS18M_PGE_Y";
                                break;
                            case "black":
                                texturePath = "textures/locomotive/Diesel/RS18/RS18M_PGE_L";
                                break;
                            case "green":
                                texturePath = "textures/locomotive/Diesel/RS18/RS18M_PGE";
                                break;
                            case "brown":
                                texturePath = "textures/locomotive/Diesel/RS18/RS18M_BCOL_Striped";
                                break;

                        }

                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
