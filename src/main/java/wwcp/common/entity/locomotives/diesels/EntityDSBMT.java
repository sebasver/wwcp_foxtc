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
import wwcp.client.render.rollingstock.locomotives.diesels.DSBMT;
import wwcp.common.core.handler.Transport;

import java.util.ArrayList;

import static wwcp.common.core.handler.EnumSoundsWWCP.locoDieselDSBMT;


public class EntityDSBMT extends DieselTrain
{
    public EntityDSBMT(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "DSB Green");
        InsertTexture(1, "DSB Red/Black");

    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 0.55F, 0.2f, -0.3f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 2.4F;
    }

    @Override
    public String transportCountry() {
        return Transport.ClassMT().country;
    }

    @Override
    public String transportYear() {
        return Transport.ClassMT().year;
    }

    public String getInventoryName() {
        return Transport.ClassMT().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.ClassMT().fictional;
    }

    public SoundRecord getSoundRecord() {
        return locoDieselDSBMT;
    }

    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityDSBMT.class, new DSBMT(),
                        "DSB MT",
                        new float[] { -0.59F,0.15F,0.0F },
                        new float[] { 0F, 180F, 180F },
                        null,
                        "smoke",
                        new ArrayList<double[]>() {
                            {
                                add(new double[]{1.72D, 1.3D, 0D});
                            }},
                        "", null, 10, 2)
                {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString)
                    {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase())
                        {
                            case "green":
                                texturePath = "textures/locomotive/Diesel/DSBMT/DSBGreen";
                                break;
                            case "red":
                                texturePath = "textures/locomotive/Diesel/DSBMT/DSBRedBlack";
                                break;

                        }

                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
