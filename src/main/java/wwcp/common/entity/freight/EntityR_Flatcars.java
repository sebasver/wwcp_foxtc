package wwcp.common.entity.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;
import wwcp.client.render.rollingstock.freight.R_Flatcars_BlockLoad;
import wwcp.client.render.rollingstock.freight.R_Flatcars;
import wwcp.client.render.rollingstock.freight.R_Flatcars_SlabLoad;
import wwcp.client.render.rollingstock.freight.R_Flatcars_WoodLoad;
import wwcp.common.core.handler.Transport;
import wwcp.common.library.Info;

public class EntityR_Flatcars extends AbstractStandardFreightCar {

    public EntityR_Flatcars(World world) {
        super(world);
    }

    @Override
    public CargoManager setupCargoManager()
    {
        return new CargoManager(new CargoSpecification[][]
                {
                        //Block load
                        { new CargoSpecification(R_Flatcars_BlockLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Blockload/LoadStoneSlabs", "Stone Slabs",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_BlockLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Blockload/LoadStoneBricks", "Stone Bricks",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_BlockLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Blockload/LoadCarvStoneBricks", "Carved Stone Bricks",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_BlockLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Blockload/LoadMossStoneBricks", "Mossy Stone Bricks",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_BlockLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Blockload/LoadCobbleStone", "Cobblestone",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_BlockLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Blockload/LoadMossCobbleStone", "Mossy Cobblestone",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_BlockLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Blockload/LoadBricks", "Bricks",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_BlockLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Blockload/LoadNetherBricks", "Nether Bricks",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_BlockLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Blockload/LoadSandstone", "Sandstone",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_BlockLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Blockload/LoadChizSandStone", "Chiseled Sandstone",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_BlockLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Blockload/LoadCutSandStone", "Cut Sandstone",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_BlockLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Blockload/LoadRedSandStone", "Red Sandstone",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_BlockLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Blockload/LoadRedChizSandStone", "Chiseled Red Sandstone",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_BlockLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Blockload/LoadRedCutSandStone", "Cut Red Sandstone",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_BlockLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Blockload/LoadIron", "Iron",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_BlockLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Blockload/LoadGold", "Gold",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_BlockLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Blockload/LoadDiamond", "Diamond",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },

                        //Slab load
                        { new CargoSpecification(R_Flatcars_SlabLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Blockload/LoadStoneSlabs", "Stone Slabs",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_SlabLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Blockload/LoadStoneBricks", "Stone Bricks",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_SlabLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Blockload/LoadMossStoneBricks", "Mossy Stone Bricks",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_SlabLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Blockload/LoadCobbleStone", "Cobblestone",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_SlabLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Blockload/LoadMossCobbleStone", "Mossy Cobblestone",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_SlabLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Blockload/LoadBricks", "Bricks",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_SlabLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Blockload/LoadNetherBricks", "Nether Bricks",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_SlabLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Blockload/LoadSandstone", "Sandstone",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_SlabLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Blockload/LoadCutSandStone", "Cut Sandstone",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_SlabLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Blockload/LoadRedSandStone", "Red Sandstone",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_SlabLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Blockload/LoadRedCutSandStone", "Cut Red Sandstone",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },

                        //Wood load
                        { new CargoSpecification(R_Flatcars_WoodLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Woodload/LoadAcacia", "Acacia Logs",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_WoodLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Woodload/LoadAcaciaPlanks", "Acacia Planks",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_WoodLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Woodload/LoadBirch", "Birch Logs",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_WoodLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Woodload/LoadBirchPlanks", "Birch Planks",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_WoodLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Woodload/LoadDarkOak", "Dark Oak Logs",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_WoodLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Woodload/LoadDarkOakPlanks", "Dark Oak Planks",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_WoodLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Woodload/LoadJungle", "Jungle Logs",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_WoodLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Woodload/LoadJunglePlanks", "Jungle Planks",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_WoodLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Woodload/LoadOak", "Oak Logs",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_WoodLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Woodload/LoadOakPlanks", "Oak Planks",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_WoodLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Woodload/LoadSpruce", "Spruce Logs",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                        { new CargoSpecification(R_Flatcars_WoodLoad.class,
                                Info.modID, "freightskins/R-Flatcars/Woodload/LoadSprucePlanks", "Spruce Planks",
                                new CargoSpecification.RenderParameters().setOffset(0,3.0,0)) },
                });
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "RES-X Brown");
        InsertTexture(1, "RNS-U Brown");
        InsertTexture(2, "RS Brown");
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 4.94F;
    }

    @Override
    public String transportCountry() {
        return Transport.R_Flatcars().country;
    }

    @Override
    public String transportYear() {
        return Transport.R_Flatcars().year;
    }

    public String getInventoryName() {
        return Transport.R_Flatcars().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.R_Flatcars().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityR_Flatcars.class, new R_Flatcars(),
                        "RES-X",
                        new float[]{-0.0f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "black":
                                texturePath = "textures/freightskins/R-Flatcars/RES-X/RES_Brown";
                                break;
                            case "red":
                                texturePath = "textures/freightskins/R-Flatcars/RNS-U/RNS_Brown";
                                break;
                            case "green":
                                texturePath = "textures/freightskins/R-Flatcars/RS/RS_Brown";
                                break;

                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
