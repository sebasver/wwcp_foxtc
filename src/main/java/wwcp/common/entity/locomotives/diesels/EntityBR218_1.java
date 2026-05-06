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

import static wwcp.common.core.handler.EnumSoundsWWCP.locoDieselBR218_1;


public class EntityBR218_1 extends DieselTrain
{
    public EntityBR218_1(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "DB Altrot");
        InsertTexture(1, "DB Ozeanblau Beige");
        InsertTexture(2, "DB Orientrot");
        InsertTexture(3, "DB Rheingold");
        InsertTexture(4, "DB Verkehrsrot");
        InsertTexture(5, "DB Verkehrsrot SyltShuttle");
        InsertTexture(6, "DB Ozeanblau Beige Skirt");
        InsertTexture(7, "DB Orientrot Skirt");
        InsertTexture(8, "DB Verkehrsrot Skirt");
        InsertTexture(9, "Pressnitztalbahn");
        InsertTexture(10, "Pressnitztalbahn Skirt");
        InsertTexture(11, "218 497");

    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 6.0F, 0.16f, -0.25f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1.025F;
    }

    @Override
    public String transportCountry() {
        return Transport.V164_TB11().country;
    }

    @Override
    public String transportYear() {
        return Transport.V164_TB11().year;
    }

    public String getInventoryName() {
        return Transport.V164_TB11().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.V164_TB11().fictional;
    }

    public SoundRecord getSoundRecord() {
        return locoDieselBR218_1;
    }

    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityBR218_1.class, new V160_164(),
                        "DB BR 218",
                        new float[] { -2.99F,0.15F,0.0F },
                        new float[] { 0F, 180F, 180F },
                        null,
                        "smoke",
                        new ArrayList<double[]>() {
                            {
                                add(new double[]{4.7D, 1.7D, 0.195D});
                            }
                            {
                                add(new double[]{4.7D, 1.7D, -0.195D});
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
                                texturePath = "textures/locomotive/Diesel/V160/218/BR218AR1";
                                break;
                            case "red":
                                texturePath = "textures/locomotive/Diesel/V160/218/BR218OB1";
                                break;
                            case "green":
                                texturePath = "textures/locomotive/Diesel/V160/218/BR218OR1";
                                break;
                            case "magenta":
                                texturePath = "textures/locomotive/Diesel/V160/218/BR218RB1";
                                break;
                            case "brown":
                                texturePath = "textures/locomotive/Diesel/V160/218/BR218VR1";
                                break;
                            case "blue":
                                texturePath = "textures/locomotive/Diesel/V160/218/BR218VR1SS";
                                break;
                            case "purple":
                                texturePath = "textures/locomotive/Diesel/V160/218/BR218OB1P";
                                break;
                            case "cyan":
                                texturePath = "textures/locomotive/Diesel/V160/218/BR218OR1P";
                                break;
                            case "lightgrey":
                                texturePath = "textures/locomotive/Diesel/V160/218/BR218VR1P";
                                break;
                            case "grey":
                                texturePath = "textures/locomotive/Diesel/V160/218/BR218PB1";
                                break;
                            case "pink":
                                texturePath = "textures/locomotive/Diesel/V160/218/BR218PB1P";
                                break;
                            case "lime":
                                texturePath = "textures/locomotive/Diesel/V160/218/BR218497";
                                break;

                        }

                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
