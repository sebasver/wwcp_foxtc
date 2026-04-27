package wwcp.common.core.handler;

import train.common.Traincraft;
import train.common.library.register.TrainRecord;
import wwcp.common.entity.freight.*;
import wwcp.common.entity.locomotives.diesels.*;
import wwcp.common.entity.locomotives.electrics.*;
import wwcp.common.entity.locomotives.steam.EntityChristmasBR01;
import wwcp.common.entity.locomotives.steam.*;
import wwcp.common.entity.locomotives.tenders.EntityT32ChristmasTender;
import wwcp.common.entity.passenger.Christmas.*;
import wwcp.common.entity.passenger.EntitySLRVC;
import wwcp.common.entity.passenger.Eurofima.*;
import wwcp.common.entity.passenger.Rheingold1928.*;
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
                                1.1, -6.2, 5000),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.DSBFII.item,
                        new TrainRecord(WWCPItems.DSBFII.name(), EntityDSBFII.class, WWCPItems.DSBFII.item,
                                Transport.DSBFII().additionalText2, Transport.DSBFII().weightinKGs,
                                new String[] {"black","brown"}, 5, 0, 1.1, (int)Transport.DSBFII().topSpeed,
                                (int)Transport.DSBFII().metric_horsepower, 30, 200,
                                0.8, -2f, 8000),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.DSBFIII.item,
                        new TrainRecord(WWCPItems.DSBFIII.name(), EntityDSBFIII.class, WWCPItems.DSBFIII.item,
                                Transport.DSBFIII().additionalText2, Transport.DSBFIII().weightinKGs,
                                new String[] {"black"}, 5, 0, 1.1, (int)Transport.DSBFIII().topSpeed,
                                (int)Transport.DSBFIII().metric_horsepower, 30, 200,
                                0.8, -2f, 8000),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.DBBR01.item,
                        new TrainRecord(WWCPItems.DBBR01.name(), EntityDBBR01.class, WWCPItems.DBBR01.item,
                                Transport.DBBR01().additionalText2, Transport.DBBR01().weightinKGs,
                                new String[] {"Black","Red","Green","Brown","Blue","Purple"}, 5, 0, 1.1, (int)Transport.DBBR01().topSpeed,
                                (int)Transport.DBBR01().metric_horsepower, 50, 200,
                                0.8, -6.2f, 5000),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.DBBR01_henschel.item,
                        new TrainRecord(WWCPItems.DBBR01_henschel.name(), EntityDBBR01_henschel.class, WWCPItems.DBBR01_henschel.item,
                                Transport.DBBR01Henschel().additionalText2, Transport.DBBR01Henschel().weightinKGs,
                                new String[] {"Black"}, 5, 0, 1.1, (int)Transport.DBBR01Henschel().topSpeed,
                                (int)Transport.DBBR01Henschel().metric_horsepower, 50, 200,
                                0.8, -6.2f, 5000),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.DBBR01_neubaukessel.item,
                        new TrainRecord(WWCPItems.DBBR01_neubaukessel.name(), EntityDBBR01_neubaukessel.class, WWCPItems.DBBR01_neubaukessel.item,
                                Transport.DBBR01NeuKessel().additionalText2, Transport.DBBR01NeuKessel().weightinKGs,
                                new String[] {"Black","Red","Green","Brown"}, 5, 0, 1.1, (int)Transport.DBBR01NeuKessel().topSpeed,
                                (int)Transport.DBBR01NeuKessel().metric_horsepower, 50, 200,
                                0.8, -6.2f, 5000),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.DBBR01_11.item,
                        new TrainRecord(WWCPItems.DBBR01_11.name(), EntityDBBR01_11.class, WWCPItems.DBBR01_11.item,
                                Transport.DBBR01_11().additionalText2, Transport.DBBR01_11().weightinKGs,
                                new String[] {"Black","Red","Green","Brown","Blue","Purple"}, 5, 0, 1.1, (int)Transport.DBBR01_11().topSpeed,
                                (int)Transport.DBBR01_11().metric_horsepower, 50, 200,
                                0.8, -6.2f, 5000),
                        Instance()
                );

        /**
         * TENDERS
         */

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.T32TenderChristmas.item,
                        new TrainRecord(WWCPItems.T32TenderChristmas.name(), EntityT32ChristmasTender.class, WWCPItems.T32TenderChristmas.item,
                                Transport.T32TenderChristmas().additionalText2, Transport.T32TenderChristmas().weightinKGs,
                                new String[] {"Yellow"}, 5, 2, 0, 0,
                                0, 0, 0,
                                0, 0, 30000),
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
                                new String[] {"Black","Red","Green","Brown","Blue","Purple","Cyan"}, 8, 0, .95, 164,
                                3000, 60, 160,
                                0.65, -5f, 10000),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.C630M.item,
                        new TrainRecord(WWCPItems.C630M.name(), EntityC630M.class, WWCPItems.C630M.item,
                                "Freight Locomotive", 1,
                                new String[] {"Red","Black","Green","Lime","Blue","White"}, 8, 0, .95, 164,
                                3000, 60, 160,
                                0.65, -6f, 10000),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.M630.item,
                        new TrainRecord(WWCPItems.M630.name(), EntityM630.class, WWCPItems.M630.item,
                                "Freight Locomotive", 1,
                                new String[] {"Red","Black","Green"}, 8, 0, .95, 164,
                                3000, 60, 160,
                                0.65, -6f, 10000),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.M640.item,
                        new TrainRecord(WWCPItems.M640.name(), EntityM640.class, WWCPItems.M640.item,
                                "Freight Locomotive", 1,
                                new String[] {"Red","Black"}, 8, 0, .95, 164,
                                4000, 60, 160,
                                0.65, -6f, 10000),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.F7A.item,
                        new TrainRecord(WWCPItems.F7A.name(), EntityF7A.class, WWCPItems.F7A.item,
                                "Freight Locomotive", 1,
                                new String[] {"Black","Orange","Yellow","Blue","Red","Green","Brown","Purple","Cyan","LightGrey","Grey","Magenta","Lime","LightBlue","Pink","White"}, 10, 0, .95, 164,
                                2250, 60, 160,
                                //FRONT TRUCK Relative to rear truck pos set in entity file
                                0.65, -4.3f, 10000),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.GP30.item,
                        new TrainRecord(WWCPItems.GP30.name(), EntityGP30.class, WWCPItems.GP30.item,
                                "Freight Locomotive", 1,
                                new String[] {"Black","Orange","Yellow","Blue","Red","Green","Brown","Purple","Cyan","LightGrey","Grey","Magenta","Lime","LightBlue","Pink","White","Skin16"}, 10, 0, .95, 164,
                                2250, 60, 160,
                                0.65, -4.05f, 10000),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.GP35.item,
                        new TrainRecord(WWCPItems.GP35.name(), EntityGP35.class, WWCPItems.GP35.item,
                                "Freight Locomotive", 1,
                                new String[] {"Black","Red","Green","Brown","Blue","Purple"}, 10, 0, .95, 164,
                                2500, 60, 160,
                                0.65, -4.05f, 10000),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.GP60M.item,
                        new TrainRecord(WWCPItems.GP60M.name(), EntityGP60M.class, WWCPItems.GP60M.item,
                                "Freight Locomotive", 1,
                                new String[] {"Black","Red","Green","Brown"}, 10, 0, .95, 164,
                                3800, 60, 160,
                                0.65, -4.05f, 10000),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.RS10.item,
                        new TrainRecord(WWCPItems.RS10.name(), EntityRS10.class, WWCPItems.RS10.item,
                                "Freight Locomotive", 1,
                                new String[] {"Red","Black"}, 10, 0, .95, 164,
                                1600, 60, 160,
                                0.65, -4.25, 10000),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.RS18.item,
                        new TrainRecord(WWCPItems.RS18.name(), EntityRS18.class, WWCPItems.RS18.item,
                                "Freight Locomotive", 1,
                                new String[] {"Red","Black","Green","Brown","Blue","Purple"}, 10, 0, .95, 164,
                                1800, 60, 160,
                                0.65, -4.25, 10000),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.RS18C.item,
                        new TrainRecord(WWCPItems.RS18C.name(), EntityRS18C.class, WWCPItems.RS18C.item,
                                "Freight Locomotive", 1,
                                new String[] {"Red","Black","Green","Brown"}, 10, 0, .95, 164,
                                1800, 60, 160,
                                0.65, -4.25, 10000),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.C424.item,
                        new TrainRecord(WWCPItems.C424.name(), EntityC424.class, WWCPItems.C424.item,
                                "Freight Locomotive", 1,
                                new String[] {"Black","Red","Green","Brown"}, 10, 0, .95, 164,
                                2400, 60, 160,
                                0.65, -4.25, 10000),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.C425.item,
                        new TrainRecord(WWCPItems.C425.name(), EntityC425.class, WWCPItems.C425.item,
                                "Freight Locomotive", 1,
                                new String[] {"Black","Red","Green","Brown","Blue","Purple","Cyan"}, 10, 0, .95, 164,
                                2500, 60, 160,
                                0.65, -4.125f, 10000),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.SD45.item,
                        new TrainRecord(WWCPItems.SD45.name(), EntitySD45.class, WWCPItems.SD45.item,
                                "Freight Locomotive", 1,
                                new String[] {"Black","Red","Green","Magenta","Brown","Blue","Purple","Cyan","LightGrey","Grey","Pink","Lime","Yellow","LightBlue","Orange","White","Skin16","Skin17"}, 8, 0, .95, 164,
                                3600, 60, 160,
                                0.65, -5f, 10000),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.SD45X.item,
                        new TrainRecord(WWCPItems.SD45X.name(), EntitySD45X.class, WWCPItems.SD45X.item,
                                "Freight Locomotive", 1,
                                new String[] {"Black","Red","Green","Brown"}, 8, 0, .95, 164,
                                4200, 60, 160,
                                0.65, -5.5f, 10000),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.SD70M.item,
                        new TrainRecord(WWCPItems.SD70M.name(), EntitySD70M.class, WWCPItems.SD70M.item,
                                "Freight Locomotive", 1,
                                new String[] {"Skin16","Green","Brown","Blue","Skin17"}, 8, 0, .95, 164,
                                4000, 60, 160,
                                0.65, -5.9f, 10000),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.SD75M.item,
                        new TrainRecord(WWCPItems.SD75M.name(), EntitySD75M.class, WWCPItems.SD75M.item,
                                "Freight Locomotive", 1,
                                new String[] {"Black","Red","Skin18","Skin19","Green"}, 8, 0, .95, 164,
                                4300, 60, 160,
                                0.65, -5.9f, 10000),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.SD75I.item,
                        new TrainRecord(WWCPItems.SD75I.name(), EntitySD75I.class, WWCPItems.SD75I.item,
                                "Freight Locomotive", 1,
                                new String[] {"Black","Red","Skin18","Green"}, 8, 0, .95, 164,
                                4300, 60, 160,
                                0.65, -5.9f, 10000),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.C408W.item,
                        new TrainRecord(WWCPItems.C408W.name(), EntityC408W.class, WWCPItems.C408W.item,
                                "Freight Locomotive", 1,
                                new String[] {"Black","Red","Green","Brown","Blue","Purple","Cyan","LightGrey","Grey","Pink","Lime","Yellow","LightBlue","Orange","White"}, 8, 0, .95, 164,
                                4000, 60, 160,
                                0.65, -5.5f, 10000),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.G322.item,
                        new TrainRecord(Transport.ClassMK().name, EntityG322.class, WWCPItems.G322.item,
                                Transport.ClassMK().additionalText2, Transport.ClassMK().weightinKGs,
                                new String[] {"Black","Red","Green","Brown","Blue","White","Lime","Magenta","LightGrey","Grey","Pink"},
                                5, 2, 0.95, (int)Transport.ClassMK().topSpeed,
                                (int)Transport.ClassMK().metric_horsepower, 20, 80,
                                0.95, -2, 1000),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.MZIV.item,
                        new TrainRecord(Transport.MZIV().name, EntityMZIV.class, WWCPItems.MZIV.item,
                                Transport.MZIV().additionalText2, Transport.MZIV().weightinKGs,
                                new String[] {"Black","Red","Green","Brown","Magenta","Blue"},
                                5, 2, 1.75, (int)Transport.MZIV().topSpeed,
                                (int)Transport.MZIV().metric_horsepower, 60, 180,
                                0.65, -6.9f, 10000),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.MZIII.item,
                        new TrainRecord(Transport.MZIII().name, EntityMZIII.class, WWCPItems.MZIII.item,
                                Transport.MZIII().additionalText2, Transport.MZIII().weightinKGs,
                                new String[] {"Black","Red","Green"},
                                5, 2, 1.75, (int)Transport.MZIII().topSpeed,
                                (int)Transport.MZIII().metric_horsepower, 60, 160,
                                0.65, -6.9f, 10000),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.DSBMH.item,
                        new TrainRecord(Transport.ClassMH().name, EntityDSBMH.class, WWCPItems.DSBMH.item,
                                Transport.ClassMH().additionalText2, Transport.ClassMH().weightinKGs,
                                new String[] {"Black","Red","Green"},
                                5, 2, 0.95, (int)Transport.ClassMH().topSpeed,
                                (int)Transport.ClassMH().metric_horsepower, 20, 80,
                                0.95, -2f, 1000),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.MZI.item,
                        new TrainRecord(Transport.MZI().name, EntityMZI.class, WWCPItems.MZI.item,
                                Transport.MZI().additionalText2, Transport.MZI().weightinKGs,
                                new String[] {"Black","Red","Green","Brown","Blue","Purple","Cyan","Lightgrey","Grey"},
                                5, 2, 1.75, (int)Transport.MZI().topSpeed,
                                (int)Transport.MZI().metric_horsepower, 60, 180,
                                0.65, -6.8f, 10000),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.MZII.item,
                        new TrainRecord(Transport.MZII().name, EntityMZII.class, WWCPItems.MZII.item,
                                Transport.MZII().additionalText2, Transport.MZII().weightinKGs,
                                new String[] {"Black","Red","Green","Brown","Blue","Yellow","Cyan","Lightgrey","Grey"},
                                5, 2, 1.75, (int)Transport.MZII().topSpeed,
                                (int)Transport.MZII().metric_horsepower, 60, 180,
                                0.65, -6.8f, 10000),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.ME.item,
                        new TrainRecord(Transport.ClassME().name, EntityME.class, WWCPItems.ME.item,
                                Transport.ClassME().additionalText2, Transport.ClassME().weightinKGs,
                                new String[] {"Black","Red","Green","Blue","Brown","Cyan","Purple"},
                                5, 2, 1.75, (int)Transport.ClassME().topSpeed,
                                (int)Transport.ClassME().metric_horsepower, 60, 180,
                                0.65, -6.9f, 10000),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.BR215.item,
                        new TrainRecord(Transport.V163().name, EntityBR215.class, WWCPItems.BR215.item,
                                Transport.V163().additionalText2, Transport.V163().weightinKGs,
                                new String[] {"Black","Red","Green","Blue","Brown"},
                                5, 2, 1.75, (int)Transport.V163().topSpeed,
                                (int)Transport.V163().metric_horsepower, 50, 160,
                                0.65, -5.2f, 2700),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.BR217.item,
                        new TrainRecord(Transport.V162().name, EntityBR217.class, WWCPItems.BR217.item,
                                Transport.V162().additionalText2, Transport.V162().weightinKGs,
                                new String[] {"Black","Red","Green","Blue"},
                                5, 2, 1.75, (int)Transport.V162().topSpeed,
                                (int)Transport.V162().metric_horsepower, 60, 160,
                                0.65, -5.2f, 3150),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.BR218.item,
                        new TrainRecord(Transport.V164_TB11().name, EntityBR218_1.class, WWCPItems.BR218.item,
                                Transport.V164_TB11().additionalText2, Transport.V164_TB11().weightinKGs,
                                new String[] {"Black","Red","Green","Magenta","Brown","Blue","Purple","Cyan","LightGrey","Grey","Pink","Lime"},
                                5, 2, 1.75, (int)Transport.V164_TB11().topSpeed,
                                (int)Transport.V164_TB11().metric_horsepower, 60, 160,
                                0.65, -5.9f, 3150),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.BR218_2.item,
                        new TrainRecord(Transport.V164_TB10().name, EntityBR218_2.class, WWCPItems.BR218_2.item,
                                Transport.V164_TB10().additionalText2, Transport.V164_TB10().weightinKGs,
                                new String[] {"Black","Red","Green","Magenta","Brown","Blue","Purple","Cyan","LightGrey","Grey","Pink","Lime"},
                                5, 2, 1.75, (int)Transport.V164_TB10().topSpeed,
                                (int)Transport.V164_TB10().metric_horsepower, 50, 160,
                                0.65, -5.9f, 2975),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.FrichsArdelt.item,
                        new TrainRecord(Transport.FrichsArdelt().name, EntityFrichsArdelt.class, WWCPItems.FrichsArdelt.item,
                                Transport.FrichsArdelt().additionalText2, Transport.FrichsArdelt().weightinKGs,
                                new String[] {"Black","Red","Green"},
                                5, 2, 0.95, (int)Transport.FrichsArdelt().topSpeed,
                                (int)Transport.FrichsArdelt().metric_horsepower, 20, 80,
                                0.95, -1.65f, 1000),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.FrichsKoef.item,
                        new TrainRecord(Transport.FrichsKoef().name, EntityFrichsKoef.class, WWCPItems.FrichsKoef.item,
                                Transport.FrichsKoef().additionalText2, Transport.FrichsKoef().weightinKGs,
                                new String[] {"Green","Black","Red","Orange"},
                                5, 2, 0.95, (int)Transport.FrichsKoef().topSpeed,
                                (int)Transport.FrichsKoef().metric_horsepower, 50, 30,
                                0.95, -1.175f, 1000),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.DSBMT.item,
                        new TrainRecord(Transport.ClassMT().name, EntityDSBMT.class, WWCPItems.DSBMT.item,
                                Transport.ClassMT().additionalText2, Transport.ClassMT().weightinKGs,
                                new String[] {"Green","Red"},
                                5, 2, 0.95, (int)Transport.ClassMT().topSpeed,
                                (int)Transport.ClassMT().metric_horsepower, 50, 60,
                                0.95, -2.0f, 2000),
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
                                0.95, -8, 0),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.F140AC1.item,
                        new TrainRecord(Transport.F140AC1().name, EntityTRAXXF140AC1.class, WWCPItems.F140AC1.item,
                                Transport.F140AC1().additionalText2, Transport.F140AC1().weightinKGs,
                                new String[] {"Yellow"}, 5, 0, 0.95, (int)Transport.F140AC1().topSpeed,
                                (int)Transport.F140AC1().metric_horsepower, 40, 0,
                                0.95, -8, 0),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.BR145.item,
                        new TrainRecord(Transport.BR145().name, EntityBR145.class, WWCPItems.BR145.item,
                                Transport.BR145().additionalText2, Transport.BR145().weightinKGs,
                                new String[] {"Yellow"}, 5, 0, 0.95, (int)Transport.BR145().topSpeed,
                                (int)Transport.BR145().metric_horsepower, 40, 0,
                                0.95, -8, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.TraxxF140MS2.item,
                        new TrainRecord(Transport.F140MS2().name, EntityTRAXXF140MS2.class, WWCPItems.TraxxF140MS2.item,
                                Transport.F140MS2().additionalText2, Transport.F140MS2().weightinKGs,
                                new String[] {"Black","Red","Green","Magenta","Brown","Blue","Purple","Cyan","LightGrey","Grey","Pink","Lime","Yellow","LightBlue","Orange","White","Skin16","Skin17"},
                                5, 0, 0.95, (int)Transport.F140MS2().topSpeed,
                                (int)Transport.F140MS2().metric_horsepower, 40, 0,
                                0.95, -7, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.ES64U2.item,
                        new TrainRecord(Transport.ES64U2().name, EntityES64U2.class, WWCPItems.ES64U2.item,
                                Transport.ES64U2().additionalText2, Transport.ES64U2().weightinKGs,
                                new String[] {"Black", "Grey"},
                                5, 0, 1, (int)Transport.ES64U2().topSpeed,
                                (int)Transport.ES64U2().metric_horsepower, 40, 0,
                                0.95, -5, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.ES64U4.item,
                        new TrainRecord(Transport.ES64U4().name, EntityES64U4.class, WWCPItems.ES64U4.item,
                                Transport.ES64U4().additionalText2, Transport.ES64U4().weightinKGs,
                                new String[] {"Black", "Grey", "LightGrey"},
                                5, 0, 1, (int)Transport.ES64U4().topSpeed,
                                (int)Transport.ES64U4().metric_horsepower, 40, 0,
                                0.95, -7.5, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.E94.item,
                        new TrainRecord(Transport.E94().name, EntityE94.class, WWCPItems.E94.item,
                                Transport.E94().additionalText2, Transport.E94().weightinKGs,
                                new String[] {"Black"},
                                5, 0, 1, (int)Transport.E94().topSpeed,
                                (int)Transport.E94().metric_horsepower, 40, 0,
                                0.95, -7, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.E44.item,
                        new TrainRecord(Transport.E44DB().name, EntityE44.class, WWCPItems.E44.item,
                                Transport.E44DB().additionalText2, Transport.E44DB().weightinKGs,
                                new String[] {"Black"},
                                5, 0, 1, (int)Transport.E44DB().topSpeed,
                                (int)Transport.E44DB().metric_horsepower, 40, 0,
                                0.95, -3.5, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.EF4.item,
                        new TrainRecord(Transport.EF4().name, EntityEF4.class, WWCPItems.EF4.item,
                                Transport.EF4().additionalText2, Transport.EF4().weightinKGs,
                                new String[] {"Red","Orange"}, 7, 0, 2.00, (int)Transport.EF4().topSpeed,
                                (int)Transport.EF4().metric_horsepower, 40, 0,
                                0.95, -8, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.EP3.item,
                        new TrainRecord(Transport.EP3().name, EntityEP3.class, WWCPItems.EP3.item,
                                Transport.EP3().additionalText2, Transport.EP3().weightinKGs,
                                new String[] {"Red","Yellow","Orange"}, 7, 0, 2.00, (int)Transport.EP3().topSpeed,
                                (int)Transport.EP3().metric_horsepower, 40, 0,
                                0.95, -8, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.ES2.item,
                        new TrainRecord(Transport.ES2().name, EntityES2.class, WWCPItems.ES2.item,
                                Transport.ES2().additionalText2, Transport.ES2().weightinKGs,
                                new String[] {"Red","Orange","Yellow","Blue"}, 10, 0, 0.95, (int)Transport.ES2().topSpeed,
                                (int)Transport.ES2().metric_horsepower, 40, 0,
                                0.95, -3, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.EP2.item,
                        new TrainRecord(Transport.EP2().name, EntityEP2.class, WWCPItems.EP2.item,
                                Transport.EP2().additionalText2, Transport.EP2().weightinKGs,
                                new String[] {"Black","Red","Green","Brown","Blue","Purple","Cyan","LightGrey","Pink","Lime"}, 10, 0, 2.00, (int)Transport.EP2().topSpeed,
                                (int)Transport.EP2().metric_horsepower, 40, 0,
                                0.95, -3, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.SLRV.item,
                        new TrainRecord(Transport.SLRV().name, EntitySLRV.class, WWCPItems.SLRV.item,
                                Transport.SLRV().additionalText2, Transport.SLRV().weightinKGs,
                                new String[] {"Black","Red"}, 10, 0, 0.95, (int)Transport.SLRV().topSpeed,
                                (int)Transport.SLRV().metric_horsepower, 40, 0,
                                0.95, -3.5f, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.DSBEA.item,
                        new TrainRecord(Transport.DSBClassEA().name, EntityDSBEA.class, WWCPItems.DSBEA.item,
                                Transport.DSBClassEA().additionalText2, Transport.DSBClassEA().weightinKGs,
                                new String[] {"Black","Red","Green","Blue","Brown","Cyan"},
                                5, 0, 0.95, (int)Transport.DSBClassEA().topSpeed,
                                (int)Transport.DSBClassEA().metric_horsepower, 40, 60,
                                0.95, -7, 0),
                        Instance()
                );

        /**
         * Passenger Stock
         */

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.SLRVC.item,
                        new TrainRecord(Transport.SLRVC().name, EntitySLRVC.class, WWCPItems.SLRVC.item,
                                Transport.SLRVC().additionalText2, Transport.SLRVC().weightinKGs,
                                new String[] {"Black"}, 10, 0, 0, 0,
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
                                new String[] {"Yellow","Red"}, 5, 0, 0, 0,
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
                .RegisterRollingStockEntity(WWCPItems.EurofimaPresidentiale.item,
                        new TrainRecord(Transport.EurofimaPresidentiale().name, EntityEurofimaPresidentiale.class, WWCPItems.EurofimaPresidentiale.item,
                                Transport.EurofimaPresidentiale().additionalText2, Transport.EurofimaPresidentiale().weightinKGs,
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

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.RheingoldSalon1.item,
                        new TrainRecord(WWCPItems.RheingoldSalon1.name(), Entity1stClassRheingoldSalon.class, WWCPItems.RheingoldSalon1.item,
                                Transport.RheingoldSalon1().additionalText2, Transport.RheingoldSalon1().weightinKGs,
                                new String[] {"Yellow"}, 5, 1, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.RheingoldSalon2.item,
                        new TrainRecord(WWCPItems.RheingoldSalon2.name(), Entity2ndClassRheingoldSalon.class, WWCPItems.RheingoldSalon2.item,
                                Transport.RheingoldSalon2().additionalText2, Transport.RheingoldSalon2().weightinKGs,
                                new String[] {"Yellow"}, 5, 1, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.RheingoldKitchen1.item,
                        new TrainRecord(WWCPItems.RheingoldKitchen1.name(), Entity1stClassRheingoldKitchen.class, WWCPItems.RheingoldKitchen1.item,
                                Transport.RheingoldKitchen1().additionalText2, Transport.RheingoldKitchen1().weightinKGs,
                                new String[] {"Yellow"}, 5, 1, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.RheingoldKitchen2.item,
                        new TrainRecord(WWCPItems.RheingoldKitchen2.name(), Entity2ndClassRheingoldKitchen.class, WWCPItems.RheingoldKitchen2.item,
                                Transport.RheingoldKitchen2().additionalText2, Transport.RheingoldKitchen2().weightinKGs,
                                new String[] {"Yellow"}, 5, 1, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.RheingoldBagage.item,
                        new TrainRecord(WWCPItems.RheingoldBagage.name(), EntityRheingoldBaggage.class, WWCPItems.RheingoldBagage.item,
                                Transport.RheingoldBaggage().additionalText2, Transport.RheingoldBaggage().weightinKGs,
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
                                new String[] {"Brown","Green","Blue","Lime"}, 10, 32, 0, 0,
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
                                new String[] {"Black","Red","Green","Brown","Blue","Purple","Cyan","LightGrey"}, 10, 32, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.AAR40ft.item,
                        new TrainRecord(WWCPItems.AAR40ft.name(), EntityAAR40ft.class, WWCPItems.AAR40ft.item,
                                Transport.AAR40ft().additionalText2, Transport.AAR40ft().weightinKGs,
                                new String[] {"Black","Red","Green","Brown","Blue","Purple","Cyan","LightGrey","Pink","Lime"}, 10, 32, 0, 0,
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
                                new String[] {"Black","Red","Green","Brown","Blue"}, 5, 50, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.Habbiins_14.item,
                        new TrainRecord(WWCPItems.Habbiins_14.name(), EntityHabbiins14.class, WWCPItems.Habbiins_14.item,
                                Transport.Habbiins_14().additionalText2, Transport.Habbiins_14().weightinKGs,
                                new String[] {"Black","Red","Green"}, 5, 50, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.Habiins_12.item,
                        new TrainRecord(WWCPItems.Habiins_12.name(), EntityHabiins12.class, WWCPItems.Habiins_12.item,
                                Transport.Habiins_12().additionalText2, Transport.Habiins_12().weightinKGs,
                                new String[] {"Black","Red","Green","Blue"}, 5, 56, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.Hbbillns.item,
                        new TrainRecord(WWCPItems.Hbbillns.name(), EntityHbbillns.class, WWCPItems.Hbbillns.item,
                                Transport.Hbbillns().additionalText2, Transport.Hbbins().weightinKGs,
                                new String[] {"Black","Red","Green","Brown"}, 5, 32, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );

        //32, 18, 9
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.EP2_Center.item,
                        new TrainRecord(WWCPItems.EP2_Center.name(), EntityEP2_Center.class, WWCPItems.EP2_Center.item,
                                Transport.EP2_Center().additionalText2, Transport.EP2_Center().weightinKGs,
                                new String[] {"Black","Red","Green","Brown","Blue"}, 10, 9, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.Paccar64Woodchip.item,
                        new TrainRecord(WWCPItems.Paccar64Woodchip.name(), EntityPaccar64Woodchip.class, WWCPItems.Paccar64Woodchip.item,
                                Transport.Paccar64Woodchip().additionalText2, Transport.Paccar64Woodchip().weightinKGs,
                                new String[] {"Black","Red"}, 8, 32, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.Gunderson596Woodchip.item,
                        new TrainRecord(WWCPItems.Gunderson596Woodchip.name(), EntityGunderson596Woodchip.class, WWCPItems.Gunderson596Woodchip.item,
                                Transport.Gunderson596Woodchip().additionalText2, Transport.Gunderson596Woodchip().weightinKGs,
                                new String[] {"Black","Red"}, 8, 32, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.Lgns.item,
                        new TrainRecord(WWCPItems.Lgns.name(), EntityLgns.class, WWCPItems.Lgns.item,
                                Transport.Lgns().additionalText2, Transport.Lgns().weightinKGs,
                                new String[] {"Black","Red","Green","Brown","Blue","Purple","Cyan","LightGrey","Pink","Lime","Magenta"}, 5, 32, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );
      
        Traincraft.traincraftRegistry                                        
                .RegisterRollingStockEntity(WWCPItems.SGNSS60.item,
                        new TrainRecord(WWCPItems.SGNSS60.name(), EntitySGNSS60.class, WWCPItems.SGNSS60.item,
                                Transport.SGNSS60().additionalText2, Transport.SGNSS60().weightinKGs,
                                new String[] {"Black","Grey","LightGrey","Purple"}, 5, 54, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.GS.item,
                        new TrainRecord(WWCPItems.GS.name(), EntityGS.class, WWCPItems.GS.item,
                                Transport.GSVan().additionalText2, Transport.GSVan().weightinKGs,
                                new String[] {"Black","Red","Green","Brown","Blue"}, 5, 32, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.DSB735.item,
                        new TrainRecord(WWCPItems.DSB735.name(), EntityDSB735.class, WWCPItems.DSB735.item,
                                Transport.DSB735Tanker().additionalText2, Transport.DSB735Tanker().weightinKGs,
                                new String[] {"Black"}, 5, 32, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.DSBZE.item,
                        new TrainRecord(WWCPItems.DSBZE.name(), EntityDSBZETanker.class, WWCPItems.DSBZE.item,
                                Transport.DSBZETanker().additionalText2, Transport.DSBZETanker().weightinKGs,
                                new String[] {"Black"}, 5, 32, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.DSBE.item,
                        new TrainRecord(WWCPItems.DSBE.name(), EntityDSBEHopper.class, WWCPItems.DSBE.item,
                                Transport.DSBCarE().additionalText2, Transport.DSBCarE().weightinKGs,
                                new String[] {"Black"}, 5, 32, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.R_Flatcars.item,
                        new TrainRecord(WWCPItems.R_Flatcars.name(), EntityR_Flatcars.class, WWCPItems.R_Flatcars.item,
                                Transport.R_Flatcars().additionalText2, Transport.R_Flatcars().weightinKGs,
                                new String[] {"Black","Red","Green"}, 5, 56, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );

    }
}
