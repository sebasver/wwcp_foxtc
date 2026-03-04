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
import wwcp.client.render.rollingstock.locomotives.diesels.C430;
import wwcp.common.core.handler.Transport;

import java.util.ArrayList;

public class EntityC430 extends DieselTrain
{
    public EntityC430(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "Conrail Blue");
        InsertTexture(1, "NYC Black");
        InsertTexture(2, "PC");
        InsertTexture(3, "Reading");
        InsertTexture(4, "Reading CR Patch");
        InsertTexture(5, "SCL");
        InsertTexture(6, "GBW");

    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 5.0F, 0.1f, -0.3f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1.675F;
    }

    @Override
    public String transportCountry() {
        return Transport.C430().country;
    }

    @Override
    public String transportYear() {
        return Transport.C430().year;
    }

    public String getInventoryName() {
        return Transport.C430().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.C430().fictional;
    }

    public final SoundRecord sound = new SoundRecord(this.getClass(), " ", 1.0F, "ALCO_16_251C_Notch8", 0.65F, 28, "ALCO_16_251C_Idle", 0.65F, 30, false, "alco_bronzebell_3", 18,
            new String[]{"leslie_a200_dual_1","leslie_a200_dual_1","leslie_a200_dual_1","leslie_a200_dual_1","leslie_a200_dual_1","leslie_s3l_1","leslie_s3l_1"});
    public SoundRecord getSoundRecord() {
        return sound;
    }

    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityC430.class, new C430(),
                        "C430",
                        new float[] { -2.5f,0.15F,0.0F },
                        new float[] { 0F, 180F, 180F },
                        null,
                        "smoke",
                        new ArrayList<double[]>() {
                            {
                                add(new double[]{1.0D, 1.25D, 0.0D});
                            }},
                        "", null, 10, 2)
                {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString)
                    {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "black":
                                texturePath = "textures/locomotive/Diesel/C430/C430_CR";
                                break;
                            case "red":
                                texturePath = "textures/locomotive/Diesel/C430/C430_NYC";
                                break;
                            case "green":
                                texturePath = "textures/locomotive/Diesel/C430/C430_PC";
                                break;
                            case "brown":
                                texturePath = "textures/locomotive/Diesel/C430/C430_Reading";
                                break;
                            case "blue":
                                texturePath = "textures/locomotive/Diesel/C430/C430_CRPatch";
                                break;
                            case "purple":
                                texturePath = "textures/locomotive/Diesel/C430/C430_SCL";
                                break;
                            case "cyan":
                                texturePath = "textures/locomotive/Diesel/C430/C430_GBW";
                                break;
                        }

                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
