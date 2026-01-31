package wwcp.common.core.handler;

import train.common.Traincraft;
import train.common.library.register.TrainRecord;
import wwcp.common.entity.freight.*;
import wwcp.common.entity.locomotives.diesels.*;
import wwcp.common.entity.locomotives.electrics.*;
import wwcp.common.entity.locomotives.steam.EntityChristmasBR01;
import wwcp.common.entity.locomotives.tenders.EntityT32ChristmasTender;
import wwcp.common.entity.passenger.Christmas.*;
import wwcp.common.entity.passenger.EntitySLRVC;
import wwcp.common.entity.passenger.Eurofima.*;
import wwcp.common.library.WWCPItems;
import wwcp.common.wwcp;

public class WWCPEntityHandler
{
    private Object Instance()
    {
        return wwcp.instance;
    }

    public WWCPEntityHandler()
    {
        /* Sample

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartPassengerBlue.item,
                                new TrainRecord("Passenger Blue", EntityPassengerBlue.class, ItemIDs.minecartPassengerBlue.item, EnumTrainType.Passenger, 1,
                                        new String[]{"Blue", "Red", "Green", "White", "Black", "Cyan", "Orange", "Grey", "LightGrey", "LightBlue"},
                                        18),
                                Instance() // don't touch this line
                        );
         */

        // Put Calls to RegisterRollingStockEntity below this.
        /**
         * STEAM LOCOMOTIVES
         */

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.ChristmasBR01.item,
                        new TrainRecord(WWCPItems.ChristmasBR01.name(), EntityChristmasBR01.class, WWCPItems.ChristmasBR01.item,
                                Transport.DRBR01WitteChristmas().additionalText2, Transport.DRBR01WitteChristmas().weightinKGs,
                                new String[] {"Yellow"}, 5, 0, 1.1, (int)Transport.DRBR01WitteChristmas().topSpeed,
                                (int)Transport.DRBR01WitteChristmas().metric_horsepower, 40, 200,
                                1.1, 6.2, 50000),
                        Instance()
                );
        /**
         * TENDERS
         */

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.T32TenderChristmas.item,
                        new TrainRecord(WWCPItems.T32TenderChristmas.name(), EntityT32ChristmasTender.class, WWCPItems.T32TenderChristmas.item,
                                Transport.T32TenderChristmas().additionalText2, Transport.T32TenderChristmas().weightinKGs,
                                new String[] {"Yellow"}, 5, 0, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );

        /**
         * DIESEL TRAINS
         */
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.WWCPShopShunter.item,
                        new TrainRecord(WWCPItems.WWCPShopShunter.name(), EntityWWCPShopShunter.class, WWCPItems.WWCPShopShunter.item,
                                "Freight Locomotive", 1,
                                new String[] {"Red", "Blue"}, 18, 0, .95, 164,
                                1000, 60, 160,
                                0.65, -1.5, 10000),
                        Instance()
                );
//        Traincraft.traincraftRegistry
//                .RegisterRollingStockEntity(WWCPItems.SD90MACH.item,
//                        new TrainRecord(WWCPItems.SD90MACH.name(), EntitySD90MACH.class, WWCPItems.SD90MACH.item,
//                                "Freight Locomotive", 1,
//                                new String[] {"Yellow", "Orange", "Red"}, 5, 0, .95, 164,
//                                4120, 60, 160,
//                                0.65, 7, 10000),
//                        Instance()
//                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.C430.item,
                        new TrainRecord(WWCPItems.C430.name(), EntityC430.class, WWCPItems.C430.item,
                                "Freight Locomotive", 1,
                                new String[] {"Black","Red","Green","Brown","Blue","Purple","Cyan"}, 5, 0, .95, 164,
                                3000, 60, 160,
                                0.65, 5f, 10000),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.C630M.item,
                        new TrainRecord(WWCPItems.C630M.name(), EntityC630M.class, WWCPItems.C630M.item,
                                "Freight Locomotive", 1,
                                new String[] {"Red","Black","Green","Lime","Blue","White"}, 5, 0, .95, 164,
                                3000, 60, 160,
                                0.65, 6f, 10000),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.M630.item,
                        new TrainRecord(WWCPItems.M630.name(), EntityM630.class, WWCPItems.M630.item,
                                "Freight Locomotive", 1,
                                new String[] {"Red","Black","Green"}, 5, 0, .95, 164,
                                3000, 60, 160,
                                0.65, 6f, 10000),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.M640.item,
                        new TrainRecord(WWCPItems.M640.name(), EntityM640.class, WWCPItems.M640.item,
                                "Freight Locomotive", 1,
                                new String[] {"Red","Black"}, 5, 0, .95, 164,
                                4000, 60, 160,
                                0.65, 6f, 10000),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.GP30.item,
                        new TrainRecord(WWCPItems.GP30.name(), EntityGP30.class, WWCPItems.GP30.item,
                                "Freight Locomotive", 1,
                                new String[] {"Black","Orange","Yellow","Blue","Red","Green","Brown","Purple","Cyan","LightGrey","Grey","Magenta","Lime","LightBlue","Pink","White","Skin16"}, 5, 0, .95, 164,
                                2250, 60, 160,
                                0.65, 4.05f, 10000),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.GP35.item,
                        new TrainRecord(WWCPItems.GP35.name(), EntityGP35.class, WWCPItems.GP35.item,
                                "Freight Locomotive", 1,
                                new String[] {"Black","Red","Green"}, 5, 0, .95, 164,
                                2500, 60, 160,
                                0.65, 4.05f, 10000),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.RS10.item,
                        new TrainRecord(WWCPItems.RS10.name(), EntityRS10.class, WWCPItems.RS10.item,
                                "Freight Locomotive", 1,
                                new String[] {"Red","Black"}, 5, 0, .95, 164,
                                1600, 60, 160,
                                0.65, 4.25, 10000),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.RS18.item,
                        new TrainRecord(WWCPItems.RS18.name(), EntityRS18.class, WWCPItems.RS18.item,
                                "Freight Locomotive", 1,
                                new String[] {"Red","Black","Green","Brown","Blue","Purple"}, 5, 0, .95, 164,
                                1800, 60, 160,
                                0.65, 4.25, 10000),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.RS18C.item,
                        new TrainRecord(WWCPItems.RS18C.name(), EntityRS18C.class, WWCPItems.RS18C.item,
                                "Freight Locomotive", 1,
                                new String[] {"Red","Black","Green","Brown"}, 5, 0, .95, 164,
                                1800, 60, 160,
                                0.65, 4.25, 10000),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.C424.item,
                        new TrainRecord(WWCPItems.C424.name(), EntityC424.class, WWCPItems.C424.item,
                                "Freight Locomotive", 1,
                                new String[] {"Black","Red","Green","Brown"}, 5, 0, .95, 164,
                                2400, 60, 160,
                                0.65, 4.25, 10000),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.C425.item,
                        new TrainRecord(WWCPItems.C425.name(), EntityC425.class, WWCPItems.C425.item,
                                "Freight Locomotive", 1,
                                new String[] {"Black","Red","Green","Brown","Blue","Purple","Cyan"}, 5, 0, .95, 164,
                                2500, 60, 160,
                                0.65, 4.125f, 10000),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.SD45.item,
                        new TrainRecord(WWCPItems.SD45.name(), EntitySD45.class, WWCPItems.SD45.item,
                                "Freight Locomotive", 1,
                                new String[] {"Black","Red","Green","Magenta","Brown","Blue","Purple","Cyan","LightGrey","Grey","Pink","Lime","Yellow","LightBlue","Orange","White","Skin16","Skin17"}, 5, 0, .95, 164,
                                3600, 60, 160,
                                0.65, 5f, 10000),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.SD45X.item,
                        new TrainRecord(WWCPItems.SD45X.name(), EntitySD45X.class, WWCPItems.SD45X.item,
                                "Freight Locomotive", 1,
                                new String[] {"Black","Red","Green","Brown"}, 5, 0, .95, 164,
                                4200, 60, 160,
                                0.65, 5.5f, 10000),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.C408W.item,
                        new TrainRecord(WWCPItems.C408W.name(), EntityC408W.class, WWCPItems.C408W.item,
                                "Freight Locomotive", 1,
                                new String[] {"Black","Red","Green","Brown","Blue","Purple","Cyan","LightGrey","Grey","Pink","Lime","Yellow","LightBlue"}, 5, 0, .95, 164,
                                4000, 60, 160,
                                0.65, 5.5f, 10000),
                        Instance()
                );


        /**
         * ELECTRIC LOCOMOTIVES
         */

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.BR103.item,
                        new TrainRecord(WWCPItems.BR103.name(), EntityBR103.class, WWCPItems.BR103.item,
                                Transport.BR103().additionalText2, Transport.BR103().weightinKGs,
                                new String[] {"Yellow", "Orange", "Red", "Blue"}, 5, 0, 0.95, (int)Transport.BR103().topSpeed,
                                (int)Transport.BR103().metric_horsepower, 40, 0,
                                0.95, 8, 0),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.F140AC1.item,
                        new TrainRecord(Transport.F140AC1().name, EntityTRAXXF140AC1.class, WWCPItems.F140AC1.item,
                                Transport.F140AC1().additionalText2, Transport.F140AC1().weightinKGs,
                                new String[] {"Yellow"}, 5, 0, 0.95, (int)Transport.F140AC1().topSpeed,
                                (int)Transport.F140AC1().metric_horsepower, 40, 0,
                                0.95, 8, 0),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.BR145.item,
                        new TrainRecord(Transport.BR145().name, EntityBR145.class, WWCPItems.BR145.item,
                                Transport.BR145().additionalText2, Transport.BR145().weightinKGs,
                                new String[] {"Yellow"}, 5, 0, 0.95, (int)Transport.BR145().topSpeed,
                                (int)Transport.BR145().metric_horsepower, 40, 0,
                                0.95, 8, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.EF4.item,
                        new TrainRecord(Transport.EF4().name, EntityEF4.class, WWCPItems.EF4.item,
                                Transport.EF4().additionalText2, Transport.EF4().weightinKGs,
                                new String[] {"Red","Orange"}, 5, 0, 0.95, (int)Transport.EF4().topSpeed,
                                (int)Transport.EF4().metric_horsepower, 40, 0,
                                0.95, 8, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.EP3.item,
                        new TrainRecord(Transport.EP3().name, EntityEP3.class, WWCPItems.EP3.item,
                                Transport.EP3().additionalText2, Transport.EP3().weightinKGs,
                                new String[] {"Red","Yellow","Orange"}, 5, 0, 0.95, (int)Transport.EP3().topSpeed,
                                (int)Transport.EP3().metric_horsepower, 40, 0,
                                0.95, 8, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.ES2.item,
                        new TrainRecord(Transport.ES2().name, EntityES2.class, WWCPItems.ES2.item,
                                Transport.ES2().additionalText2, Transport.ES2().weightinKGs,
                                new String[] {"Red","Orange","Yellow","Blue"}, 5, 0, 0.95, (int)Transport.ES2().topSpeed,
                                (int)Transport.ES2().metric_horsepower, 40, 0,
                                0.95, 3, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.EP2.item,
                        new TrainRecord(Transport.EP2().name, EntityEP2.class, WWCPItems.EP2.item,
                                Transport.EP2().additionalText2, Transport.EP2().weightinKGs,
                                new String[] {"Black","Red","Green","Brown","Blue","Purple","Cyan","LightGrey","Pink","Lime"}, 5, 0, 0.95, (int)Transport.EP2().topSpeed,
                                (int)Transport.EP2().metric_horsepower, 40, 0,
                                0.95, 3, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.SLRV.item,
                        new TrainRecord(Transport.SLRV().name, EntitySLRV.class, WWCPItems.SLRV.item,
                                Transport.SLRV().additionalText2, Transport.SLRV().weightinKGs,
                                new String[] {"Black","Red"}, 5, 0, 0.95, (int)Transport.SLRV().topSpeed,
                                (int)Transport.SLRV().metric_horsepower, 40, 0,
                                0.95, 3.5f, 0),
                        Instance()
                );

        /**
         * Passenger Stock
         */

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.SLRVC.item,
                        new TrainRecord(Transport.SLRVC().name, EntitySLRVC.class, WWCPItems.SLRVC.item,
                                Transport.SLRVC().additionalText2, Transport.SLRVC().weightinKGs,
                                new String[] {"Black"}, 5, 0, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );
        Traincraft.traincraftRegistry
            .RegisterRollingStockEntity(WWCPItems.EurofimaOpen1.item,
                    new TrainRecord(Transport.EurofimaOpen1().name, EntityEurofima1stClass.class, WWCPItems.EurofimaOpen1.item,
                            Transport.EurofimaOpen1().additionalText2, Transport.EurofimaOpen1().weightinKGs,
                            new String[] {"Yellow", "Orange"}, 5, 0, 0, 0,
                            0, 0, 0,
                            0, 0, 0),
                    Instance()
            );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.EurofimaCompartment1.item,
                        new TrainRecord(Transport.EurofimaCompartment1().name, EntityEurofima1stClassCompartment.class, WWCPItems.EurofimaCompartment1.item,
                                Transport.EurofimaCompartment1().additionalText2, Transport.EurofimaCompartment1().weightinKGs,
                                new String[] {"Yellow", "Orange", "Red", "Purple", "Black", "Grey", "LightGrey"}, 5, 0, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.EurofimaCompartment1_2.item,
                        new TrainRecord(Transport.EurofimaCompartment1_2().name, EntityEurofima1st2ndClassCompartment.class, WWCPItems.EurofimaCompartment1_2.item,
                                Transport.EurofimaCompartment1_2().additionalText2, Transport.EurofimaCompartment1_2().weightinKGs,
                                new String[] {"Yellow"}, 5, 0, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.EurofimaPanorama.item,
                        new TrainRecord(Transport.EurofimaPanorama().name, EntityEurofimaPanorama.class, WWCPItems.EurofimaPanorama.item,
                                Transport.EurofimaPanorama().additionalText2, Transport.EurofimaPanorama().weightinKGs,
                                new String[] {"Yellow"}, 5, 0, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.RheingoldSalon1Christmas.item,
                        new TrainRecord(Transport.RheingoldSalon1Christmas().name, Entity1stClassRheingoldChristmas.class, WWCPItems.RheingoldSalon1Christmas.item,
                                Transport.RheingoldSalon1Christmas().additionalText2, Transport.RheingoldSalon1Christmas().weightinKGs,
                                new String[] {"Yellow"}, 5, 0, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.RheingoldSalon2Christmas.item,
                        new TrainRecord(WWCPItems.RheingoldSalon2Christmas.name(), Entity2ndClassRheingoldChristmas.class, WWCPItems.RheingoldSalon2Christmas.item,
                                Transport.RheingoldSalon2Christmas().additionalText2, Transport.RheingoldSalon2Christmas().weightinKGs,
                                new String[] {"Yellow"}, 5, 0, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.RheingoldSpeise1Christmas.item,
                        new TrainRecord(WWCPItems.RheingoldSpeise1Christmas.name(), Entity1stClassRheingoldKitchenChristmas.class, WWCPItems.RheingoldSpeise1Christmas.item,
                                Transport.RheingoldKitchen1Christmas().additionalText2, Transport.RheingoldKitchen1Christmas().weightinKGs,
                                new String[] {"Yellow"}, 5, 1, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.RheingoldSpeise2Christmas.item,
                        new TrainRecord(WWCPItems.RheingoldSpeise2Christmas.name(), Entity2ndClassRheingoldKitchenChristmas.class, WWCPItems.RheingoldSpeise2Christmas.item,
                                Transport.RheingoldKitchen2Christmas().additionalText2, Transport.RheingoldKitchen2Christmas().weightinKGs,
                                new String[] {"Yellow"}, 5, 1, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );
        /**
         * Rolling Stock
         */

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.XM4A.item,
                        new TrainRecord(WWCPItems.XM4A.name(), EntityXM4A.class, WWCPItems.XM4A.item,
                                Transport.XM4A().additionalText2, Transport.XM4A().weightinKGs,
                                new String[] {"Brown","Green","Blue","Lime"}, 5, 32, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.OpenTriLevelAutorack.item,
                        new TrainRecord(WWCPItems.OpenTriLevelAutorack.name(), EntityOpenTriLevelAutorack.class, WWCPItems.OpenTriLevelAutorack.item,
                                Transport.OpenTriLevelAutorack().additionalText2, Transport.OpenTriLevelAutorack().weightinKGs,
                                new String[] {"Black","Red"}, 5, 32, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.VertAPacAutorack.item,
                        new TrainRecord(WWCPItems.VertAPacAutorack.name(), EntityVertAPacAutorack.class, WWCPItems.VertAPacAutorack.item,
                                Transport.VertAPacAutorack().additionalText2, Transport.VertAPacAutorack().weightinKGs,
                                new String[] {"Black","Red"}, 5, 32, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.PS2Early3Bay.item,
                        new TrainRecord(WWCPItems.PS2Early3Bay.name(), EntityPS2Early3Bay.class, WWCPItems.PS2Early3Bay.item,
                                Transport.PS2Early3Bay().additionalText2, Transport.PS2Early3Bay().weightinKGs,
                                new String[] {"Black","Red","Green","Brown","Blue","Purple","Cyan","LightGrey"}, 5, 32, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.AAR40ft.item,
                        new TrainRecord(WWCPItems.AAR40ft.name(), EntityAAR40ft.class, WWCPItems.AAR40ft.item,
                                Transport.AAR40ft().additionalText2, Transport.AAR40ft().weightinKGs,
                                new String[] {"Black","Red","Green","Brown","Blue","Purple","Cyan","LightGrey","Pink","Lime"}, 5, 32, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.Hbbins.item,
                        new TrainRecord(WWCPItems.Hbbins.name(), EntityHbbins.class, WWCPItems.Hbbins.item,
                                Transport.Hbbins().additionalText2, Transport.Hbbins().weightinKGs,
                                new String[] {"Black","Red","Green","Brown","Blue","Purple","Cyan","LightGrey","Pink"}, 5, 32, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.Habbiins_17.item,
                        new TrainRecord(WWCPItems.Habbiins_17.name(), EntityHabbiins17.class, WWCPItems.Habbiins_17.item,
                                Transport.Habbiins_17().additionalText2, Transport.Habbiins_17().weightinKGs,
                                new String[] {"Black","Red","Green","Brown","Blue"}, 5, 32, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );

        //32, 18, 9
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.EP2_Center.item,
                        new TrainRecord(WWCPItems.EP2_Center.name(), EntityEP2_Center.class, WWCPItems.EP2_Center.item,
                                Transport.EP2_Center().additionalText2, Transport.EP2_Center().weightinKGs,
                                new String[] {"Black","Red","Green","Brown","Blue"}, 5, 9, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.Paccar64Woodchip.item,
                        new TrainRecord(WWCPItems.Paccar64Woodchip.name(), EntityPaccar64Woodchip.class, WWCPItems.Paccar64Woodchip.item,
                                Transport.Paccar64Woodchip().additionalText2, Transport.Paccar64Woodchip().weightinKGs,
                                new String[] {"Black","Red"}, 5, 32, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.Gunderson596Woodchip.item,
                        new TrainRecord(WWCPItems.Gunderson596Woodchip.name(), EntityGunderson596Woodchip.class, WWCPItems.Gunderson596Woodchip.item,
                                Transport.Gunderson596Woodchip().additionalText2, Transport.Gunderson596Woodchip().weightinKGs,
                                new String[] {"Black","Red"}, 5, 32, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );


    }
}
