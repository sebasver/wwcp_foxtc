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
import wwcp.client.render.rollingstock.locomotives.diesels.GP35;
import wwcp.client.render.rollingstock.locomotives.diesels.GP60M;
import wwcp.common.core.handler.Transport;

import java.util.ArrayList;

public class EntityGP60M extends DieselTrain
{
    public EntityGP60M(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "ATSF Wabonnet");
        InsertTexture(1, "BNSF Early Large Letters");
        InsertTexture(2,"BNSF Early Small Letters");
        InsertTexture(3,"BNSF H2");
    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 4.35F, 0.1f, -0.3f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1.79F;
    }

    @Override
    public String transportCountry() {
        return Transport.GP60M().country;
    }

    @Override
    public String transportYear() {
        return Transport.GP60M().year;
    }

    public String getInventoryName() {
        return Transport.GP60M().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.GP60M().fictional;
    }

    public final SoundRecord sound = new SoundRecord(this.getClass(), " ", 1.0F, "EMD_20_710G3B_Notch8", 0.45F, 28, "EMD_16_710G3B_Idle", 0.45F, 30, false, "emd_steelbell_3", 18,
            new String[]{"nathan_k3la_4","nathan_k3la_4","nathan_k3la_4","nathan_k3la_4"});
    public SoundRecord getSoundRecord() {
        return sound;
    }

    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityGP60M.class, new GP60M(),
                        "GP60M",
                        new float[] { -2.0f,0.15F,0.0F },
                        new float[] { 0F, 180F, 180F },
                        null,
                        "smoke",
                        new ArrayList<double[]>() {
                            {
                                add(new double[]{2.5D, 1.25D, 0.0D});
                            }},
                        "", null, 10, 2)
                {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString)
                    {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase())
                        {
                            case "black":
                                texturePath = "textures/locomotive/Diesel/GP60M/GP60M_ATSF";
                                break;
                            case "red":
                                texturePath = "textures/locomotive/Diesel/GP60M/GP60M_BNSF_Early";
                                break;
                            case "green":
                                texturePath = "textures/locomotive/Diesel/GP60M/GP60M_BNSF_Early2";
                                break;
                            case "brown":
                                texturePath = "textures/locomotive/Diesel/GP60M/GP60M_BNSF_H2";
                                break;
                        }

                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
