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
import wwcp.client.render.rollingstock.locomotives.diesels.V160_164;
import wwcp.common.core.handler.Transport;

import java.util.ArrayList;

import static wwcp.common.core.handler.EnumSoundsWWCP.locoDieselBR215;


public class EntityBR215 extends DieselTrain
{
    public EntityBR215(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "DB Altrot");
        InsertTexture(1, "DB Ozeanblau Beige");
        InsertTexture(2, "DB Orientrot");
        InsertTexture(3, "DB Verkehrsrot");
        InsertTexture(4, "DB Verkehrsrot Sylt Shuttle");

    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 6.0F, 0.16f, -0.25f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1.025F;
    }

    @Override
    public String transportCountry() {
        return Transport.V160().country;
    }

    @Override
    public String transportYear() {
        return Transport.V160().year;
    }

    public String getInventoryName() {
        return Transport.V160().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.V160().fictional;
    }

    public SoundRecord getSoundRecord() {
        return locoDieselBR215;
    }

    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityBR215.class, new V160_164(),
                        "DB BR 215",
                        new float[] { -2.99F,0.15F,0.0F },
                        new float[] { 0F, 180F, 180F },
                        null,
                        "smoke",
                        new ArrayList<double[]>() {
                            {
                                add(new double[]{4.7D, 1.5D, 0.125D});
                            }
                            {
                                add(new double[]{4.7D, 1.5D, -0.125D});
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
                                texturePath = "textures/locomotive/Diesel/V160/215/BR215AR";
                                break;
                            case "red":
                                texturePath = "textures/locomotive/Diesel/V160/215/BR215OB";
                                break;
                            case "green":
                                texturePath = "textures/locomotive/Diesel/V160/215/BR215OR";
                                break;
                            case "blue":
                                texturePath = "textures/locomotive/Diesel/V160/215/BR215VR";
                                break;
                            case "brown":
                                texturePath = "textures/locomotive/Diesel/V160/215/BR215VRSS";
                                break;

                        }

                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
