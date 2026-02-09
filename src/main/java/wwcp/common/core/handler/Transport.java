package wwcp.common.core.handler;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Transport {

    public static String era = "wwcp.era";
    public static String nick = "wwcp.nick";
    public static String type = "wwcp.type";
    public static String aditional = "wwcp.aditional";

    /**
     * Backspeed has to be known
     */
    public static class LocomotiveWithBackspeed {
        public String name;
        public String country;
        public String year;
        public String fuel;
        public String additionalTextTitle;
        public String additionalText;
        public String additionalTextTitle2;
        public String additionalText2;
        public int rows;
        public float tractive_effort;
        public float metric_horsepower;
        public double weightinKGs;
        public float topSpeed;
        public float backTopSpeed;
        public boolean fictional;
        public boolean reinforced;

        public LocomotiveWithBackspeed(String Name, String Country, String Year, String Fuel, String AditionalTextTitle, String AditionalText, String AditionalText2Title, String AditionalText2,
                                       float TractiveEffort, float MetricHorsepower, float WeightinTons, float TopSpeed, float BackTopSpeed, boolean Fictional, boolean Reinforced, int MaxRows) {
            name = Name;
            country = Country;
            year = Year;
            fuel = Fuel;
            additionalTextTitle = AditionalTextTitle;
            additionalText = AditionalText;
            additionalTextTitle2 = AditionalText2Title;
            additionalText2 = AditionalText2;
            tractive_effort = TractiveEffort;
            double weight = WeightinTons/10;
            BigDecimal bd = new BigDecimal(Double.toString(weight));
            bd = bd.setScale(1, RoundingMode.HALF_UP);
            weightinKGs = bd.doubleValue();
            topSpeed = TopSpeed;
            metric_horsepower = MetricHorsepower;
            backTopSpeed = BackTopSpeed;
            fictional = Fictional;
            reinforced = Reinforced;
            rows = MaxRows;
        }


    }

    /**
     * This is for Trains with no defined backspeed, Backspeed simply equals Topspeed
     */
    public static class LocomotiveNoBackspeed {
        public String name;
        public String country;
        public String year;
        public String fuel;
        public String additionalTextTitle;
        public String additionalText;
        public String additionalTextTitle2;
        public String additionalText2;
        public int rows;
        public float tractive_effort;
        public float metric_horsepower;
        public double weightinKGs;
        public float topSpeed;
        public float backTopSpeed;
        public boolean fictional;
        public boolean reinforced;

        public LocomotiveNoBackspeed(String Name, String Country, String Year, String Fuel, String AditionalTextTitle, String AditionalText, String AditionalText2Title, String AditionalText2,
                                     float TractiveEffort, float MetricHorsepower, float WeightinTons, float TopSpeed, boolean Fictional, boolean Reinforced, int MaxRows) {
            name = Name;
            country = Country;
            year = Year;
            fuel = Fuel;
            additionalTextTitle = AditionalTextTitle;
            additionalText = AditionalText;
            additionalTextTitle2 = AditionalText2Title;
            additionalText2 = AditionalText2;
            tractive_effort = TractiveEffort;
            double weight = WeightinTons/10;
            BigDecimal bd = new BigDecimal(Double.toString(weight));
            bd = bd.setScale(1, RoundingMode.HALF_UP);
            weightinKGs = bd.doubleValue();
            topSpeed = TopSpeed;
            metric_horsepower = MetricHorsepower;
            backTopSpeed = TopSpeed;
            reinforced = Reinforced;
            fictional = Fictional;
            rows = MaxRows;
        }


    }

    /**
     * This is for rolingstock with a defined topspeed or with no topspeed "0"
     */
    public static class Rollingstock {
        public String name;
        public String country;
        public String year;
        public String additionalTextTitle;
        public String additionalText;
        public String additionalTextTitle2;
        public String additionalText2;
        public int rows;
        public double weightinKGs;
        public float topSpeed;
        public float backTopSpeed;
        public boolean fictional;
        public boolean reinforced;

        public Rollingstock(String Name, String Country, String Year, String AditionalTextTitle, String AditionalText, String AditionalText2Title,
                            String AditionalText2, float WeightinTons, float TopSpeed, boolean Fictional, boolean Reinforced, int MaxRows) {
            name = Name;
            country = Country;
            year = Year;
            additionalTextTitle = AditionalTextTitle;
            additionalText = AditionalText;
            additionalTextTitle2 = AditionalText2Title;
            additionalText2 = AditionalText2;
            double weight = WeightinTons/10;
            BigDecimal bd = new BigDecimal(Double.toString(weight));
            bd = bd.setScale(1, RoundingMode.HALF_UP);
            weightinKGs = bd.doubleValue();
            topSpeed = TopSpeed;
            fictional = Fictional;
            backTopSpeed = TopSpeed;
            reinforced = Reinforced;
            rows = MaxRows;
        }
    }

    /**
     * this is for tank cars
     */
    public static class TankCars {
        public String name;
        public String country;
        public String year;
        public String additionalTextTitle;
        public String additionalText;
        public String additionalTextTitle2;
        public String additionalText2;
        public int rows;
        public int tankcapacity;
        public double weightinKGs;
        public float topSpeed;
        public float backTopSpeed;
        public boolean fictional;
        public boolean reinforced;

        public TankCars(String Name, String Country, String Year, String AditionalTextTitle, String AditionalText, String AditionalText2Title,
                        String AditionalText2, float WeightinTons, float TopSpeed, boolean Fictional, boolean Reinforced, int MaxRows, int Capacity) {
            name = Name;
            country = Country;
            year = Year;
            additionalTextTitle = AditionalTextTitle;
            additionalText = AditionalText;
            additionalTextTitle2 = AditionalText2Title;
            additionalText2 = AditionalText2;
            double weight = WeightinTons/10;
            BigDecimal bd = new BigDecimal(Double.toString(weight));
            bd = bd.setScale(1, RoundingMode.HALF_UP);
            weightinKGs = bd.doubleValue();
            topSpeed = TopSpeed;
            fictional = Fictional;
            backTopSpeed = TopSpeed;
            reinforced = Reinforced;
            rows = MaxRows;
            tankcapacity = Capacity;
        }
    }

    //BR01
    public static LocomotiveWithBackspeed DBBR01() {
        return new LocomotiveWithBackspeed("DBBR01", "Germany", "1945-1973", "Steam",
                "", "", type, " Passenger Locomotive",
                39566f, 2240f, 108.9f, 130f, 50f, false, true, 0);
    }

    public static LocomotiveWithBackspeed DBBR01NeuKessel() {
        return new LocomotiveWithBackspeed("DBBR01NeuKessel", "Germany", "1957-1973", "Steam",
                "", "", type, " Passenger Locomotive",
                33721f, 2330f, 111.1f, 130f, 50f, false, true, 0);
    }

    public static LocomotiveWithBackspeed DBBR01NeuKesselOil() {
        return new LocomotiveWithBackspeed("DBBR01NeuKesselOil", "Germany", "1957-1973", "Steam (Oil)",
                "", "", type, " Passenger Locomotive",
                33721f, 1330f, 111.1f, 130f, 50f, false, true, 0);
    }

    public static LocomotiveWithBackspeed DBBR01_10Streamlined() {
        return new LocomotiveWithBackspeed("DBBR01_10Streamlined", "Germany", "1945-1953", "Steam (Oil)",
                "", "", type, " Passenger Locomotive",
                35070f, 2120f, 114.3f, 150f, 50f, false, true, 0);
    }

    public static LocomotiveWithBackspeed DBBR01Umbau() {
        return new LocomotiveWithBackspeed("DBBR01Umbau", "Germany", "1950-1968", "Steam",
                "", "", type, " Passenger Locomotive",
                33721f, 2450f, 111.2f, 130f, 50f, false, true, 0);
    }

    public static LocomotiveWithBackspeed DBBR012() {
        return new LocomotiveWithBackspeed("DBBR01_10", "Germany", "1945-1953", "Steam",
                "", "", type, " Passenger Locomotive",
                35070f, 2120f, 114.3f, 140f, 50f, false, true, 0);
    }

    public static LocomotiveWithBackspeed DBBR012Oil() {
        return new LocomotiveWithBackspeed("DBBR01_10Oil", "Germany", "1945-1953", "Steam (Oil)",
                "", "", type, " Passenger Locomotive",
                35070f, 2120f, 114.3f, 140f, 50f, false, true, 0);
    }

    public static LocomotiveWithBackspeed DBBR012NeuKessel() {
        return new LocomotiveWithBackspeed("DBBR01_10NeuKessel", "Germany", "1953-1975", "Steam",
                "", "", type, " Passenger Locomotive",
                35070f, 2350f, 110.8f, 140f, 50f, false, true, 0);
    }

    public static LocomotiveWithBackspeed DBBR012NeuKesselOil() {
        return new LocomotiveWithBackspeed("DBBR01_10NeuKesselOil", "Germany", "1953-1975", "Steam (Oil)",
                "", "", type, " Passenger Locomotive",
                35070f, 2740f, 111.6f, 140f, 50f, false, true, 0);
    }

    //DR BR01's
    public static LocomotiveWithBackspeed DRBR01() {
        return new LocomotiveWithBackspeed("DRBR01", "Germany", "1945-1982", "Steam",
                "", "", type, " Passenger Locomotive",
                33721f, 2240f, 108.9f, 130f, 50f, false, true, 0);
    }

    public static LocomotiveWithBackspeed DRBR01_5() {
        return new LocomotiveWithBackspeed("DRBR01_5", "Germany", "1961-1991", "Steam",
                "", "", type, " Passenger Locomotive",
                33721f, 2500f, 111f, 130f, 50f, false, true, 0);
    }

    public static LocomotiveWithBackspeed DRBR01_5SD() {
        return new LocomotiveWithBackspeed("DRBR01_5SD", "Germany", "1961-1991", "Steam",
                "", "", type, " Passenger Locomotive",
                33721f, 2500f, 111f, 130f, 50f, false, true, 0);
    }

    public static LocomotiveWithBackspeed DRBR01_5Oil() {
        return new LocomotiveWithBackspeed("DRBR01_5Oil", "Germany", "1961-1991", "Steam (Oil)",
                "", "", type, " Passenger Locomotive",
                33721f, 2500f, 111f, 130f, 50f, false, true, 0);
    }

    //DRG BR01's
    public static LocomotiveWithBackspeed DRGBR01() {
        return new LocomotiveWithBackspeed("DRGBR01", "Germany", "1926-1945", "Steam",
                "", "", type, " Passenger Locomotive",
                33721f, 2210f, 108.9f, 130f, 50f, false, true, 0);
    }

    public static LocomotiveWithBackspeed DRGBR01_850mm() {
        return new LocomotiveWithBackspeed("DRGBR01(850mm)", "Germany", "1926-1945", "Steam",
                "", "", type, " Passenger Locomotive",
                39566f, 2210f, 108.9f, 130f, 50f, false, true, 0);
    }

    public static LocomotiveWithBackspeed DRGBR01_10Streamlined() {
        return new LocomotiveWithBackspeed("DRGBR01_10Streamlined", "Germany", "1937-1945", "Steam",
                "", "", type, " Passenger Locomotive",
                35070f, 2120f, 114.3f, 150f, 50f, false, true, 0);
    }

    public static LocomotiveWithBackspeed DRGBR01_10UnStreamlined() {
        return new LocomotiveWithBackspeed("DRGBR01_10UnStreamlined", "Germany", "1937-1945", "Steam",
                "", "", type, " Passenger Locomotive",
                35070f, 2120f, 114.3f, 140f, 50f, false, true, 0);
    }

    //BR01 Witte Christmas
    public static LocomotiveWithBackspeed DRBR01WitteChristmas() {
        return new LocomotiveWithBackspeed("ChristmasBR01Witte", "Germany", "1926-1982", "Steam",
                "", "", type, " Passenger Locomotive",
                0.0f, 2210f, 108.9f, 130f, 50f, false, true, 0);
    }

    //BR50
    public static LocomotiveWithBackspeed DBBR50() {
        return new LocomotiveWithBackspeed("DBBR50", "Germany", "1939-1987", "Steam",
                "", "", type, " Freight Locomotive",
                48109f, 1625f, 86.9f, 80f, 80f, false, true, 0);
    }

    public static LocomotiveWithBackspeed DBBR50_40() {
        return new LocomotiveWithBackspeed("DBBR50_40", "Germany", "1954-1967", "Steam",
                "", "", type, " Freight Locomotive",
                48109f, 1520f, 90.6f, 80f, 80f, false, true, 0);
    }//noted in KN Tractive effort.

    public static LocomotiveWithBackspeed DRBR50() {
        return new LocomotiveWithBackspeed("DRBR50", "Germany", "1939-1987", "Steam",
                "", "", type, " Freight Locomotive",
                48109f, 1625f, 86.9f, 80f, 80f, false, true, 0);
    }
    public static LocomotiveWithBackspeed DRBR50_35() {
        return new LocomotiveWithBackspeed("DRBR50_35", "Germany", "1956-1989", "Steam",
                "", "", type, " Freight Locomotive",
                48109f, 1760f, 88.2f, 80f, 80f, false, true, 0);
    }
    public static LocomotiveWithBackspeed DRBR50_40() {
        return new LocomotiveWithBackspeed("DRBR50_40", "Germany", "1956-1980", "Steam",
                "", "", type, " Freight Locomotive",
                48109f, 1760f, 85.9f, 80f, 80f, false, true, 0);
    }
    public static LocomotiveWithBackspeed DRBR50_50() {
        return new LocomotiveWithBackspeed("DRBR50_50", "Germany", "1966-1981", "Steam (Oil)",
                "", "", type, " Freight Locomotive",
                48109f, 1760f, 88.2f, 80f, 80f, false, true, 0);
    }
    public static LocomotiveWithBackspeed DRGBR50() {
        return new LocomotiveWithBackspeed("DRGBR50", "Germany", "1939-1987", "Steam",
                "", "", type, " Freight Locomotive",
                48109f, 1625f, 86.9f, 80f, 80f, false, true, 0);
    }
    public static LocomotiveWithBackspeed DRGBR50Kriegslok() {
        return new LocomotiveWithBackspeed("DRGBR50kriegslok", "Germany", "1939-1960", "Steam",
                "", "", type, " Freight Locomotive",
                48109f, 1760f, 80.9f, 80f, 80f, false, true, 0);
    }

    //BR 798 / VT 98
    public static LocomotiveNoBackspeed BR798() {
        return new LocomotiveNoBackspeed("VT98", "Germany", "1953-2000", "Diesel",
                nick, " VT 98", type, " Passenger Railbus",
                0f, 299.12f, 18.9f, 90f, false, true, 0);
    }

    //BR 798 / VT 98
    public static LocomotiveNoBackspeed BR798Ads() {
        return new LocomotiveNoBackspeed("BR798Advertising", "Germany", "1953-2000", "Diesel",
                nick, " VT 98", type, " Passenger Railbus",
                0f, 299.12f, 18.9f, 90f, false, true, 0);
    }

    //todo Stats Steeple
    public static LocomotiveNoBackspeed SteepleCab() {
        return new LocomotiveNoBackspeed("SteepleCab", "Switzerland", "1961-1999", "Electric",
                nick, "RABe EC", type, " Passenger Multiple Unit Locomotive",
                18300f, 3100f, 51.8f, 160f, false, true, 0);
    }

    //class 87
    public static LocomotiveNoBackspeed Class87() {
        return new LocomotiveNoBackspeed("Class87", "United Kingdom", "1973-Present", "Electric",
                nick, "", type, " Passenger Locomotive",
                58000f, 5000f, 81f, 180f, false, true, 0);
    }

    //todo class 76
    public static LocomotiveNoBackspeed Class76() {
        return new LocomotiveNoBackspeed("Class76", "United Kingdom", "1973-Present", "Electric",
                nick, "", type, " Passenger Locomotive",
                58000f, 5000f, 81f, 180f, false, true, 0);
    }


    public static LocomotiveNoBackspeed TEERAeSteurWagen() {
        return new LocomotiveNoBackspeed("RaeTEEIISteuer", "Switzerland", "1961-1999", "Electric",
                nick, "RABe EC", type, " Passenger Multiple Unit Locomotive",
                18300f, 3100f, 51.8f, 160f, false, true, 0);
    }

    //todo TEE bar car
    public static Rollingstock TEESchweizzBarCar() {
        return new Rollingstock("TEESchweizzBarCar", "Europe", "1977-Present", "",
                "", type, " Passenger", 45f, 200f, false, true, 0);
    }

    public static LocomotiveNoBackspeed V200() {
        return new LocomotiveNoBackspeed("V200", "Germany", "1953-Present", "Diesel",
                nick, " Taurus", type, " Universal Locomotive",
                39791f, 2170f, 80.0f, 140f, false, true, 0);
    }

    //Class 37
    public static LocomotiveNoBackspeed Class37() {
        return new LocomotiveNoBackspeed("Class37", "United Kingdom", "1960-Present", "Diesel",
                nick, " Tractors", type, " Universal Locomotive",
                55000f, 1750f, 102f, 140f, false, true, 0);
    }

    //CR C812 "CRClass812"
    public static LocomotiveNoBackspeed CR812() {
        return new LocomotiveNoBackspeed("Class812", "United Kingdom", "1899-1963", "Steam",
                nick, " Jumbos", type, " Universal Locomotive",
                20170f, 0f, 46.38f, 88.51f, false, true, 0);
    }

    //todo CR C812 "CRClass812"
    public static LocomotiveNoBackspeed RoyalScot() {
        return new LocomotiveNoBackspeed("RoyalScot", "United Kingdom", "1899-1963", "Steam",
                nick, " Jumbos", type, " Universal Locomotive",
                20170f, 0f, 46.38f, 88.51f, false, true, 0);
    }

    //todo BO LE 1 unit
    public static LocomotiveNoBackspeed BO_LE_1_FirstUnit() {
        return new LocomotiveNoBackspeed("BO LE 1 First", "Germany", "1932-1991", "Electric",
                nick, "", type, " Passenger Locomotive",
                44062.5f, 2528.9f, 78.0f, 90f, false, true, 0);
    }

    //todo BO LE
    public static LocomotiveNoBackspeed BO_LE_1_SecondUnit() {
        return new LocomotiveNoBackspeed("BO LE 1 Second", "Germany", "1932-1991", "Electric",
                nick, "", type, " Passenger Locomotive",
                44062.5f, 2528.9f, 78.0f, 90f, false, true, 0);
    }

    //E44
    public static LocomotiveNoBackspeed E44DB() {
        return new LocomotiveNoBackspeed("E44DB", "Germany", "1932-1991", "Electric",
                nick, "", type, " Passenger Locomotive",
                44062.5f, 2528.9f, 78.0f, 90f, false, true, 0);
    }

    //E94
    public static LocomotiveNoBackspeed E94() {
        return new LocomotiveNoBackspeed("E94", "Europe", "1940-1995", "Electric",
                nick, " Green Crocodile", type, " Freight Locomotive",
                40000.0f, 4429.0f, 118.5f, 100f, false, true, 0);
    }

    //E94
    public static LocomotiveNoBackspeed BR103() {
        return new LocomotiveNoBackspeed("BR103", "Germany", "1970-2003", "Electric",
                nick, "", type, " Passenger Locomotive",
                70000f, 9980f, 114f, 200f, false, true, 0);
    }

    public static LocomotiveNoBackspeed ES64U2() {
        return new LocomotiveNoBackspeed("ES64U2", "Europe", "2000-Present", "Electric",
                nick, " Taurus", type, " Universal Locomotive",
                67000.0f, 8600.0f, 86.0f, 230f, false, true, 0);
    }

    public static LocomotiveNoBackspeed ES64U4() {
        return new LocomotiveNoBackspeed("ES64U4", "Europe", "2005-Present", "Electric",
                nick, " Taurus", type, " Universal Locomotive",
                67000.0f, 8600.0f, 87.0f, 230f, false, true, 0);
    }

    public static LocomotiveNoBackspeed ES64U4Record() {
        return new LocomotiveNoBackspeed("ES64U4", "Europe", "2006-Present", "Electric",
                nick, " World Speed Record Taurus", type, " Universal Locomotive",
                67000.0f, 8600.0f, 87.0f, 357f, false, true, 0);
    }

    public static LocomotiveNoBackspeed ES64F4() {
        return new LocomotiveNoBackspeed("ES64F4", "Europe", "2003-Present", "Electric",
                "", "", type, " Freight Locomotive",
                67000.0f, 8600.0f, 87.0f, 140f, false, true, 0);
    }

    public static LocomotiveNoBackspeed DSBClassEA() {
        return new LocomotiveNoBackspeed("Class EA", "DenmarkBulgariaRomainia", "1984-", "Electric",
                "", "", type, " Universal Locomotive",
                45000.0f, 5030.0f, 84.0f, 175f, false, true, 0);
    }

    public static LocomotiveNoBackspeed F40ph() {
        return new LocomotiveNoBackspeed("F40PH", "America", "1949-Present", "Diesel",
                nick, "", type, " Freight Locomotive",
                40000f, 1500f, 123.7f, 105f, false, true, 0);
    }

    //BL2
    public static LocomotiveNoBackspeed BL2() {
        return new LocomotiveNoBackspeed("BL2", "America", "1948-Present", "Diesel",
                nick, "", type, " Universal Locomotive",
                56200f, 1500f, 104.32f, 105f, false, true, 0);
    }

    //CPA-16-4
    public static LocomotiveNoBackspeed CPA164() {
        return new LocomotiveNoBackspeed("CPA-16-4", "Canada", "1955-1975", "Diesel",
                nick, "", type, " Freight Locomotive",
                50000f, 1600f, 120.7f, 105f, false, true, 0);
    }

    //CFA-16-4
    public static LocomotiveNoBackspeed CFA164() {
        return new LocomotiveNoBackspeed("CFA-16-4", "America", "1955-1975", "Diesel",
                nick, "", type, " Freight Locomotive",
                50000f, 1600f, 120.7f, 105f, false, true, 0);
    }

    //F7A
    public static LocomotiveNoBackspeed F7A() {
        return new LocomotiveNoBackspeed("F7A", "America", "1949-Present", "Diesel",
                nick, "", type, " Freight Locomotive",
                40000f, 1500f, 123.7f, 105f, false, true, 0);
    }

    public static LocomotiveNoBackspeed FP7A() {
        return new LocomotiveNoBackspeed("FP7A", "America", "1949-Present", "Diesel",
                nick, "", type, " Freight Locomotive",
                40000f, 1500f, 123.7f, 105f, false, true, 0);
    }

    //F7B
    public static TankCars F7B() {
        return new TankCars("F7B", "America", "1949-Present", "",
                "", type, " B-Unit", 114f, 105f, false, true, 0, 60000);
    }

    //CR C812 Tender "Mcintosh3000Gallon"
    public static TankCars Mcintosh3000Galon() {
        return new TankCars("Class812Tender", "United_Kingdom", "1899-1963", "",
                "", type, " Tender", 19.5f, 0f, false, true, 0, 300000);
    }

    //todo fix these stats
    public static TankCars FowlerTender() {
        return new TankCars("Fowlertender", "United_Kingdom", "1899-1963", "",
                "", type, " Tender", 19.5f, 0f, false, true, 0, 300000);
    }

    //todo G4200
    public static TankCars G4200() {
        return new TankCars("G4200", "United_Kingdom", "1899-1963", "",
                "", type, " Tender", 19.5f, 0f, false, true, 0, 300000);
    }

    //todo vanderbuilt
    public static TankCars VanderBuilt() {
        return new TankCars("VanderBuilt", "Canada", "1899-1963", "",
                "", type, " Tender", 19.5f, 0f, false, true, 0, 300000);
    }

    //CR C812 Tender "Mcintosh3000Gallon"
    public static TankCars MakeshiftTender() {
        return new TankCars("MakeshiftTender", "United_Kingdom", "1899-1963", "",
                "", type, " Tender", 19.5f, 0f, false, true, 0, 300000);
    }

    //todo U1F
    public static LocomotiveNoBackspeed U1F() {
        return new LocomotiveNoBackspeed("U1F", "Canada", "1956-1993", "Diesel",
                "", "", type, " Road Switcher",
                53000f, 1800f, 124f, 80f, false, true, 0);
    }

    //RS3
    public static LocomotiveNoBackspeed RS3() {
        return new LocomotiveNoBackspeed("RS3", "America", "1950-Present", "Diesel",
                "", "", type, " Road Switcher",
                61775f, 1600f, 123.6f, 120f, false, true, 0);
    }
    //RS23
    public static LocomotiveNoBackspeed RS23() {
        return new LocomotiveNoBackspeed("RS23", "Canada", "1959-Present", "Diesel",
                "", "", type, " Road Switcher",
                53000f, 1000f, 123.3f, 120f, false, true, 0);
    }

    //RS10
    public static LocomotiveNoBackspeed RS10() {
        return new LocomotiveNoBackspeed("RS10", "CA", "1954-1984", "Diesel",
                "", "", type, " Road Switcher",
                50875f, 1600f, 124f, 120f, false, true, 0);
    }

    //RS18
    public static LocomotiveNoBackspeed RS18() {
        return new LocomotiveNoBackspeed("RS18", "CA", "1956-1993", "Diesel",
                "", "", type, " Road Switcher",
                53000f, 1800f, 124f, 120f, false, true, 0);
    }

    //RS18C
    public static LocomotiveNoBackspeed RS18C() {
        return new LocomotiveNoBackspeed("RS18C", "CA", "1956-1993", "Diesel",
                "", "", type, " Road Switcher",
                53000f, 1800f, 120f, 120f, false, true, 0);
    }

    //Highliner
    public static LocomotiveNoBackspeed HiglinerLocomotive() {
        return new LocomotiveNoBackspeed("Highliner Locomotive", "America", "1971-2016", "Electric",
                "", "", type, " Cab Car",
                25000f, 1800f, 70.5f, 130f, false, true, 0);
    }

    //AEM-7
    public static LocomotiveNoBackspeed AEM7() {
        return new LocomotiveNoBackspeed("AEM7", "America", "1966-", "Electric",
                "", "", type, " Passenger Locomotive",
                28100f, 7000f, 92f, 125f, false, true, 0);
    }

    //U33B
    public static LocomotiveNoBackspeed U33B() {
        return new LocomotiveNoBackspeed("U33B", "America", "1966-2005", "Diesel",
                "", "", type, "Universal locomotive",
                64000f, 3300f, 127.4f, 112.6f, false, true, 0);
    }

    //B30-7a Highood
    public static LocomotiveNoBackspeed B307a() {
        return new LocomotiveNoBackspeed("B307a", "America", "1977-Present", "Diesel",
                "", "", type, "Road Diesel",
                63250f, 3000f, 129.4f, 112.6f, false, true, 0);
    }

    //B30-7
    public static LocomotiveNoBackspeed B307() {
        return new LocomotiveNoBackspeed("B307", "America", "1977-Present", "Diesel",
                "", "", type, "Road Diesel",
                63250f, 3000f, 129.4f, 112.6f, false, true, 0);
    }

    //B40-8
    public static LocomotiveNoBackspeed B408() {
        return new LocomotiveNoBackspeed("B408", "America", "1988-Present", "Diesel",
                "", "", type, "Road Diesel",
                68000f, 4000f, 140f, 112.6f, false, true, 0);
    }

    //B39-8
    public static LocomotiveNoBackspeed B398() {
        return new LocomotiveNoBackspeed("B398", "America", "1984-Present", "Diesel",
                "", "", type, "Road Diesel",
                68000f, 3900f, 140f, 112.6f, false, true, 0);
    }

    //MK5000C
    public static LocomotiveNoBackspeed MK5000C() {
        return new LocomotiveNoBackspeed("MK5000C", "America", "1985-Present", "Diesel",
                "", "", type, "Road Diesel",
                55000f, 5000f, 210f, 112.6f, false, true, 0);
    }


    //PA
    public static LocomotiveNoBackspeed AlcoPA() {
        return new LocomotiveNoBackspeed("AlcoPA", "America", "1946-1981", "Diesel",
                "", "", type, " Passenger Locomotive",
                51000f, 2000f, 139f, 188f, false, true, 0);
    }

    //PB
    public static LocomotiveNoBackspeed AlcoPB() {
        return new LocomotiveNoBackspeed("AlcoPB", "America", "1946-1970", "Diesel",
                "", "", type, " Booster Unit",
                51000f, 2000f, 139f, 188f, false, true, 0);
    }

    //GP50
    public static LocomotiveNoBackspeed GP50() {
        return new LocomotiveNoBackspeed("GP50", "America", "1980-", "Diesel",
                "", "", type, "General Purpose Locomotive",
                62400f, 3600f, 125f, 65f, false, true, 0);
    }

    //SD70MAC
    public static LocomotiveNoBackspeed SD70Mac() {
        return new LocomotiveNoBackspeed("SD70Mac", "America", "1993-", "Diesel",
                "", "", type, "Special Duty Locomotive",
                145000f, 4400f, 193f, 112f, false, true, 0);
    }

    //SD70ACU
    public static LocomotiveNoBackspeed SD70ACU() {
        return new LocomotiveNoBackspeed("SD70ACU", "America", "2015-Present", "Diesel",
                "", "", type, "Special Duty Locomotive",
                155000f, 4500f, 193f, 120.7f, false, true, 0);
    }

    //SD90MAC-H
    public static LocomotiveNoBackspeed SD90MACH() {
        return new LocomotiveNoBackspeed("SD90MACH", "America", "1996-2012", "Diesel",
                "", "", type, "Special Duty Locomotive",
                165000f, 6000f, 212f, 120.7f, false, true, 0);
    }

    //SD60MAC
    public static LocomotiveNoBackspeed SD60Mac() {
        return new LocomotiveNoBackspeed("SD60Mac", "America", "1993-", "Diesel",
                "", "", type, "Special Duty Locomotive",
                145000f, 4400f, 193f, 112f, false, true, 0);
    }

    //AC4400CW
    public static LocomotiveNoBackspeed GEAC4400CW() {
        return new LocomotiveNoBackspeed("AC4400CW", "America", "1993-Present", "Diesel",
                "", "", type, " Mainline Freight Locomotive",
                145000f, 4400f, 193f, 112f, false, true, 0);
    }

    //HS4000
    public static LocomotiveNoBackspeed HS4000() {
        return new LocomotiveNoBackspeed("HS4000", "America", "1949-Present", "Diesel",
                nick, "", type, " Freight Locomotive",
                40000f, 1500f, 123f, 105f, false, true, 0);
    }

    //SLRV
    public static LocomotiveNoBackspeed SLRV() {
        return new LocomotiveNoBackspeed("SLRV", "US", "1996-Present", "Electric",
                nick, "", type, " Light Rail",
                14300f, 750f, 70f, 116f, false, true, 0);
    }

    //EF4
    public static LocomotiveNoBackspeed EF4() {
        return new LocomotiveNoBackspeed("EF4", "US", "1948-1974", "Electric",
                nick, "Little Joe", type, " Freight Electric",
                75700f, 5110, 247.5f, 112f, false, true, 0);
    }

    //EP3
    public static LocomotiveNoBackspeed EP3() {
        return new LocomotiveNoBackspeed("EP3", "US", "1919-1957", "Electric",
                nick, "Quill", type, " Passenger Electric",
                105000f, 3396, 300f, 106f, false, true, 0);
    }

    //ES2
    public static LocomotiveNoBackspeed ES2() {
        return new LocomotiveNoBackspeed("ES2", "US", "1916-1974", "Electric",
                nick, "", type, " Steeplecab",
                34000f, 475, 82f, 56f, false, true, 0);
    }

    //EP2
    public static LocomotiveNoBackspeed EP2() {
        return new LocomotiveNoBackspeed("EP2", "US", "1919-1953", "Electric",
                nick, "Bipolar", type, " Passenger Electric",
                58000, 2220, 120, 140f, false, true, 0);
    }

    //C424
    public static LocomotiveNoBackspeed C424() {
        return new LocomotiveNoBackspeed("C424", "US", "1963-Present", "Diesel",
                nick, "", type, " Road Diesel",
                47000f, 2400f, 130f, 105f, false, true, 0);
    }

    //C425
    public static LocomotiveNoBackspeed C425() {
        return new LocomotiveNoBackspeed("C425", "US", "1964-Present", "Diesel",
                nick, "", type, " Road Diesel",
                50000f, 2500f, 130f, 105f, false, true, 0);
    }

    //C430
    public static LocomotiveNoBackspeed C430() {
        return new LocomotiveNoBackspeed("C430", "US", "1966-Present", "Diesel",
                nick, "", type, " Road Diesel",
                57200f, 3000f, 136f, 105f, false, true, 0);
    }

    //C630M
    public static LocomotiveNoBackspeed C630M() {
        return new LocomotiveNoBackspeed("C630M", "CA", "1965-Present", "Diesel",
                nick, "", type, " Road Diesel",
                79500f, 3000f, 197f, 105f, false, true, 0);
    }

    //M630
    public static LocomotiveNoBackspeed M630() {
        return new LocomotiveNoBackspeed("M630", "CA", "1969-Present", "Diesel",
                nick, "", type, " Road Diesel",
                77100f, 3000f, 197f, 105f, false, true, 0);
    }

    //M640
    public static LocomotiveNoBackspeed M640() {
        return new LocomotiveNoBackspeed("M640", "CA", "1971-1992", "Diesel",
                nick, "", type, " Road Diesel",
                93000f, 4000f, 198f, 105f, false, true, 0);
    }

    //C408W
    public static LocomotiveNoBackspeed C408W() {
        return new LocomotiveNoBackspeed("C408W", "US", "1989-Present", "Diesel",
                nick, "", type, " Road Diesel",
                108600, 4000f, 196f, 113f, false, true, 0);
    }

    //GP7
    public static LocomotiveNoBackspeed GP7() {
        return new LocomotiveNoBackspeed("GP7", "America", "1949-Present", "Diesel",
                nick, "", type, " General Purpose Locomotive",
                40000f, 1500f, 123f, 105f, false, true, 0);
    }

    //GP7R RI
    public static LocomotiveNoBackspeed GP7RRI() {
        return new LocomotiveNoBackspeed("GP7R RI", "America", "1952-2014", "Diesel",
                nick, "", type, " General Purpose Locomotive",
                40000f, 1500f, 123f, 105f, false, true, 0);
    }

    //GP9R
    public static LocomotiveNoBackspeed GP9R() {
        return new LocomotiveNoBackspeed("GP9R", "America", "1992-Present", "Diesel",
                nick, "", type, " General Purpose Locomotive",
                44600f, 1750f, 130f, 105f, false, true, 0);
    }

    //SD7
    public static LocomotiveNoBackspeed SD7() {
        return new LocomotiveNoBackspeed("SD7", "America", "1951-Present", "Diesel",
                nick, "", type, " Special Duty Locomotive",
                77250f, 1500f, 154.5f, 105f, false, true, 0);
    }

    //TEBC6
    public static LocomotiveNoBackspeed TEBC6() {
        return new LocomotiveNoBackspeed("TEBC6", "America", "1993-Present", "Diesel",
                nick, "", type, " Slug",
                77250f, 1500f, 154.5f, 105f, false, true, 0);
    }

    //SD45-2
    public static LocomotiveNoBackspeed SD452() {
        return new LocomotiveNoBackspeed("SD45-2", "America", "1972-Present", "Diesel",
                nick, "", type, " Special Duty Locomotive",
                82100f, 3600f, 184f, 112f, false, true, 0);
    }

    //SD45
    public static LocomotiveNoBackspeed SD45() {
        return new LocomotiveNoBackspeed("SD45", "US", "1965-Present", "Diesel",
                nick, "", type, " Special Duty Locomotive",
                82100f, 3600f, 184f, 112f, false, true, 0);
    }

    //SD45X
    public static LocomotiveNoBackspeed SD45X() {
        return new LocomotiveNoBackspeed("SD45X", "US", "1971-1980", "Diesel",
                nick, "", type, " Special Duty Locomotive",
                92000f, 4200f, 184f, 112f, false, true, 0);
    }

    //SD40-2 Snoot
    public static LocomotiveNoBackspeed SD402Snoot() {
        return new LocomotiveNoBackspeed("SD402Snoot", "America", "1972-Present", "Diesel",
                nick, "", type, " Special Duty Locomotive",
                82100f, 3000f, 184f, 112f, false, true, 0);
    }

    //SD50
    public static LocomotiveNoBackspeed SD50() {
        return new LocomotiveNoBackspeed("SD50", "America", "1980-Present", "Diesel",
                nick, "", type, " Special Duty Locomotive",
                82100f, 3500f, 184f, 112f, false, true, 0);
    }

    //SD60
    public static LocomotiveNoBackspeed SD60() {
        return new LocomotiveNoBackspeed("SD60", "America", "1984-Present", "Diesel",
                nick, "", type, " Special Duty Locomotive",
                100000f, 3800f, 184f, 112f, false, true, 0);
    }

    //JT26C
    public static LocomotiveNoBackspeed JT26C() {
        return new LocomotiveNoBackspeed("JT26C", "Australia", "1984-Present", "Diesel",
                nick, "", type, " Road Diesel",
                82100f, 3000f, 184f, 112f, false, true, 0);
    }

    //SD60M2
    public static LocomotiveNoBackspeed SD60M2() {
        return new LocomotiveNoBackspeed("SD60M2", "America", "1991-Present", "Diesel",
                nick, "", type, " Special Duty Locomotive",
                100000f, 3800f, 184f, 112f, false, true, 0);
    }

    //SD70
    public static LocomotiveNoBackspeed SD70() {
        return new LocomotiveNoBackspeed("SD70", "America", "1992-Present", "Diesel",
                nick, "", type, " Special Duty Locomotive",
                109000f, 4000f, 197f, 121f, false, true, 0);
    }

    //SD70MP2
    public static LocomotiveNoBackspeed SD70MP2() {
        return new LocomotiveNoBackspeed("SD70MP2", "America", "1992-Present", "Diesel",
                nick, "", type, " Special Duty Locomotive",
                109000f, 4000f, 197f, 121f, false, true, 0);
    }

    //SD70M
    public static LocomotiveNoBackspeed SD70M() {
        return new LocomotiveNoBackspeed("SD70M", "US", "1992-Present", "Diesel",
                nick, "", type, " Special Duty Locomotive",
                113100f, 4000f, 197f, 121f, false, true, 0);
    }

    //SD75M
    public static LocomotiveNoBackspeed SD75M() {
        return new LocomotiveNoBackspeed("SD75M", "US", "1994-Present", "Diesel",
                nick, "", type, " Special Duty Locomotive",
                137000f, 4300f, 197f, 121f, false, true, 0);
    }

    //SD75I
    public static LocomotiveNoBackspeed SD75I() {
        return new LocomotiveNoBackspeed("SD75I", "US", "1996-Present", "Diesel",
                nick, "", type, " Special Duty Locomotive",
                137000f, 4300f, 197f, 121f, false, true, 0);
    }

    //SD38-2
    public static LocomotiveNoBackspeed SD382() {
        return new LocomotiveNoBackspeed("SD38-2", "America", "1972-Present", "Diesel",
                nick, "", type, " Special Duty Locomotive",
                82100f, 2000f, 184f, 112f, false, true, 0);
    }

    //SD40-2W
    public static LocomotiveNoBackspeed SD402W() {
        return new LocomotiveNoBackspeed("SD40-2W", "Canada", "1972-Present", "Diesel",
                nick, "", type, " Special Duty Locomotive",
                82100f, 3000f, 184f, 112f, false, true, 0);
    }

    //GP40-2LW
    public static LocomotiveNoBackspeed GP402LW() {
        return new LocomotiveNoBackspeed("GP40-2LW", "Canada", "1972-Present", "Diesel",
                nick, "", type, " General Purpose Locomotive",
                54700f, 3000f, 125f, 112f, false, true, 0);
    }

    //GP30
    public static LocomotiveNoBackspeed GP30() {
        return new LocomotiveNoBackspeed("GP30", "US", "1961-Present", "Diesel",
                nick, "", type, " General Purpose Locomotive",
                50000f, 2250f, 130f, 112f, false, true, 0);
    }

    //GP35
    public static LocomotiveNoBackspeed GP35() {
        return new LocomotiveNoBackspeed("GP35", "US", "1963-Present", "Diesel",
                nick, "", type, " General Purpose Locomotive",
                50000f, 2500f, 130f, 112f, false, true, 0);
    }

    public static LocomotiveNoBackspeed GP7HighHood() {
        return new LocomotiveNoBackspeed("GP7HighHood", "America", "1949-Present", "Diesel",
                nick, "", type, " Freight Locomotive",
                40000f, 1500f, 123f, 105f, false, true, 0);
    }
    //todo j38
    public static LocomotiveNoBackspeed J38() {
        return new LocomotiveNoBackspeed("J38", "United Kingdom", "1947-1965", "Steam",
                "", "", type, " Shunting Locomotive",
                22515f, 0f, 56.2f, 72f, false, true, 0);
    }

    //todo j39
    public static LocomotiveNoBackspeed J39() {
        return new LocomotiveNoBackspeed("J39", "United Kingdom", "1947-1965", "Steam",
                "", "", type, " Shunting Locomotive",
                22515f, 0f, 56.2f, 72f, false, true, 0);
    }

    //GWR 5700
    public static LocomotiveNoBackspeed GWR57() {
        return new LocomotiveNoBackspeed("GWR57", "United Kingdom", "1947-1965", "Steam",
                "", "", type, " Shunting Locomotive",
                22515f, 0f, 56.2f, 72f, false, true, 0);
    }


    //GWR 9400
    public static LocomotiveNoBackspeed GWR9400() {
        return new LocomotiveNoBackspeed("GWR9400Class", "United Kingdom", "1947-1965", "Steam",
                "", "", type, " Shunting Locomotive",
                22515f, 0f, 56.2f, 72f, false, true, 0);
    }

    //KoF III 1
    public static LocomotiveNoBackspeed KoFIII1() {
        return new LocomotiveNoBackspeed("KoFIII1", "Germany", "1959-", "Diesel",
                nick, " Klein Lokomotive", type, " Shunting Locomotive",
                18726.58f, 240f, 22f, 30f, false, true, 0);
    }

    //KoF III 2
    public static LocomotiveNoBackspeed KoFIII2() {
        return new LocomotiveNoBackspeed("KoFIII2", "Germany", "1959-", "Diesel",
                nick, " Klein Lokomotive", type, " Shunting Locomotive",
                18726.58f, 240f, 22f, 30f, false, true, 0);
    }

    //todod FrichsKoef
    public static LocomotiveNoBackspeed FrichsKoef() {
        return new LocomotiveNoBackspeed("FrichsKoef", "Germany", "1959-", "Diesel",
                nick, " Klein Lokomotive", type, " Shunting Locomotive",
                18726.58f, 240f, 22f, 30f, false, true, 0);
    }

    //DSB FII todo fix this entry
    public static LocomotiveNoBackspeed DSBFII() {
        return new LocomotiveNoBackspeed("DSBFII", "Denmark", "1967-", "Diesel",
                nick, " Cake Tins", type, " Universal Locomotive",
                88000f, 3253f, 116.5f, 143f, false, true, 0);
    }

    //DSB FII todo fix this entry
    public static LocomotiveNoBackspeed DSBFIII() {
        return new LocomotiveNoBackspeed("DSBFIII", "Denmark", "1967-", "Diesel",
                nick, " Cake Tins", type, " Universal Locomotive",
                88000f, 3253f, 116.5f, 143f, false, true, 0);
    }

    //DSB FII todo fix this entry
    public static LocomotiveNoBackspeed DSBSII() {
        return new LocomotiveNoBackspeed("DSBSII", "Denmark", "1967-", "Diesel",
                nick, " Cake Tins", type, " Universal Locomotive",
                88000f, 3253f, 116.5f, 143f, false, true, 0);
    }

    //B&O Caboose
    public static Rollingstock BOCaboose() {
        return new Rollingstock("B&O Caboose", "America", "1965-1990", "",
                "", type, " Bay Window Caboose", 33.7f, 200f, false, true, 0);
    }
    //CP Metal Van
    public static Rollingstock CPMetalVan() {
        return new Rollingstock("CPMetalVan", "Canada", "1968-", "",
                "", type, " Van", 38f, 200f, false, true, 0);
    }

    //MZ Class I
    public static LocomotiveNoBackspeed MZI() {
        return new LocomotiveNoBackspeed("MZI", "Denmark", "1967-", "Diesel",
                nick, " Cake Tins", type, " Universal Locomotive",
                88000f, 3253f, 116.5f, 143f, false, true, 0);
    }

    public static LocomotiveNoBackspeed ClassMT() {
        return new LocomotiveNoBackspeed("ClassMT", "Denmark", "1967-", "Diesel",
                nick, " Cake Tins", type, " Universal Locomotive",
                88000f, 3253f, 116.5f, 143f, false, true, 0);
    }

    //MZ Class I 1967
    public static LocomotiveNoBackspeed MZI1967() {
        return new LocomotiveNoBackspeed("MZI1967", "Denmark", "1967-", "Diesel",
                nick, " Cake Tins", type, " Universal Locomotive",
                88000f, 3253f, 116.5f, 143f, false, true, 0);

    }

    //MZ Class II
    public static LocomotiveNoBackspeed MZII() {
        return new LocomotiveNoBackspeed("MZII", "Denmark", "1970-", "Diesel",
                nick, " Cake Tins", type, " Universal Locomotive",
                88000f, 3253f, 116.5f, 143f, false, true, 0);
    }

    //MZ Class II 1970
    public static LocomotiveNoBackspeed MZII1970() {
        return new LocomotiveNoBackspeed("MZII1970", "Denmark", "1970-", "Diesel",
                nick, " Cake Tins", type, " Universal Locomotive",
                88000f, 3253f, 116.5f, 143f, false, true, 0);
    }

    //MZ Class III
    public static LocomotiveNoBackspeed MZIII() {
        return new LocomotiveNoBackspeed("MZIII", "Denmark", "1972-", "Diesel",
                nick, " Cake Tins", type, " Universal Locomotive",
                88000f, 3854f, 121.2f, 165f, false, true, 0);
    }

    //MZ Class III 1972
    public static LocomotiveNoBackspeed MZIII1972() {
        return new LocomotiveNoBackspeed("MZIII1972", "Denmark", "1972-", "Diesel",
                nick, " Cake Tins", type, " Universal Locomotive",
                88000f, 3854f, 121.2f, 165f, false, true, 0);
    }

    //MZ Class IV
    public static LocomotiveNoBackspeed MZIV() {
        return new LocomotiveNoBackspeed("MZIV", "Denmark", "1977-", "Diesel",
                nick, " Cake Tins", type, " Universal Locomotive",
                88000f, 3854f, 123f, 165f, false, true, 0);
    }

    //MZ Class Australia
    public static LocomotiveNoBackspeed MZAustralia() {
        return new LocomotiveNoBackspeed("MZIII", "Australia", "1972-", "Diesel",
                nick, " Cake Tins", type, " Universal Locomotive",
                88000f, 3854f, 121.2f, 105f, false, true, 0);
    }

    //Class Me
    public static LocomotiveNoBackspeed ClassME() {
        return new LocomotiveNoBackspeed("ClassME", "Denmark", "1981-", "Diesel",
                nick, "", type, " Universal Locomotive",
                88000f, 3253f, 116.5f, 143f, false, true, 0);
    }

    //Class MK
    public static LocomotiveNoBackspeed ClassMK() {
        return new LocomotiveNoBackspeed("ClassMK", "Denmark", "1996-", "Diesel",
                nick, "Duplo Block", type, " Shunting Locomotive",
                130f, 530f, 40f, 60f, false, true, 0);
    }

    //Class MH
    public static LocomotiveNoBackspeed ClassMH() {
        return new LocomotiveNoBackspeed("ClassMH", "Denmark", "1960-2001", "Diesel",
                nick, "", type, " Shunting Locomotive",
                130f, 440f, 40.5f, 60f, false, true, 0);
    }

    //V160 215 - 218
    public static LocomotiveNoBackspeed V160() {
        return new LocomotiveNoBackspeed("V160", "Germany", "1968-2022", "Diesel",
                nick, "", type, " Universal Locomotive",
                40000f, 2470f, 79f, 140f, false, true, 0);
    }

    //NE 81 / BR626
    public static LocomotiveNoBackspeed BRClass121() {
        return new LocomotiveNoBackspeed("BRClass121", "Germany", "1981-1995", "Diesel",
                aditional, " BR 626", type, " Passenger Railbus",
                0f, 679.81f, 46.0f, 100f, false, true, 0);
    }


    //NE 81 / BR626
    public static LocomotiveNoBackspeed NE81() {
        return new LocomotiveNoBackspeed("BR626", "Germany", "1981-1995", "Diesel",
                aditional, " BR 626", type, " Passenger Railbus",
                0f, 679.81f, 46.0f, 100f, false, true, 0);
    }

    //HLD55
    public static LocomotiveNoBackspeed HLD55() {
        return new LocomotiveNoBackspeed("HLD55", "BelgiumLuxembourgDenmarkGermanySweden", "1961-", "Diesel",
                nick, "", type, " Universal Locomotive",
                77000f, 1951f, 110f, 120f, false, true, 0);
    }

    public static LocomotiveNoBackspeed FrichsArdelt() {
        return new LocomotiveNoBackspeed("FrichsArdelt", "BelgiumLuxembourgDenmarkGermanySweden", "1961-", "Diesel",
                nick, "", type, " Universal Locomotive",
                77000f, 1951f, 110f, 120f, false, true, 0);
    }

    //Sentinel 100 HP
    public static LocomotiveNoBackspeed Sentinel100HP() {
        return new LocomotiveNoBackspeed("Sentinel100HP", "United Kingdom", "1931-1955", "Steam",
                "", "", type, " Shunting Locomotive",
                8870f, 100f, 19.3f, 33.8f, false, true, 0);
    }

    //Sentinel 100 HP
    public static LocomotiveNoBackspeed Sentinel100HPChristmas() {
        return new LocomotiveNoBackspeed("Sentinel100HPChristmas", "United Kingdom", "1931-1955", "Steam",
                "", "", type, " Shunting Locomotive",
                8870f, 100f, 19.3f, 33.8f, false, true, 0);
    }

    //todo fix these stats
    public static LocomotiveNoBackspeed Modular_0_4_0() {
        return new LocomotiveNoBackspeed("Modular040", "United Kingdom", "1931-1955", "Steam",
                "", "", type, " Shunting Locomotive",
                8870f, 100f, 19.3f, 33.8f, false, true, 0);
    }

    //T32 Tender todo fix these stats
    public static Rollingstock KabinTenderT26() {
        return new Rollingstock("KabinTenderT26", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Tender todo fix these stats
    public static Rollingstock T26() {
        return new Rollingstock("T26", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Tender
    public static Rollingstock T32() {
        return new Rollingstock("T32", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Tender todo fix these stats
    public static Rollingstock T34() {
        return new Rollingstock("T34", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Tender todo fix these stats
    public static Rollingstock T34AditionalOil() {
        return new Rollingstock("T34 Aditional Oil", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Tender todo fix these stats
    public static Rollingstock T34Oil() {
        return new Rollingstock("T34 Oil", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Tender todo fix these stats
    public static Rollingstock T34Streamlined() {
        return new Rollingstock("T34 Streamline", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Tender todo fix these stats
    public static Rollingstock T34StreamlinedDRG() {
        return new Rollingstock("T34 StreamlineDRG", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Tender todo fix these stats
    public static Rollingstock T37() {
        return new Rollingstock("T37", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Tender todo fix these stats
    public static Rollingstock T37DRG() {
        return new Rollingstock("T37DRG", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Tender todo fix these stats
    public static Rollingstock T38() {
        return new Rollingstock("T38", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Tender todo fix these stats
    public static Rollingstock T38Oil() {
        return new Rollingstock("T38Oil", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Christmas Tender
    public static Rollingstock T32TenderChristmas() {
        return new Rollingstock("T322'2'Christmas", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 140f, false, true, 1);
    }

    /**
     * Traxx Program
     */
    //F140 MS2E
    public static LocomotiveNoBackspeed F140MS2E() {
        return new LocomotiveNoBackspeed("F140MS2E", "Europe", "2006-", "Electric",
                "", "", type, " Freight Locomotive",
                67442.68f, 7613.88f, 85.0f, 140f, false, true, 0);
    }

    public static LocomotiveNoBackspeed BR145() {
        return new LocomotiveNoBackspeed("BR145", "Europe", "1997-", "Electric",
                "", "", type, " Universal Locomotive",
                67442.68f, 5710.41f, 80.0f, 140f, false, true, 0);
    }

    public static LocomotiveNoBackspeed BR146() {
        return new LocomotiveNoBackspeed("BR146", "Europe", "1997-", "Electric",
                "", "", type, " Passenger Locomotive",
                67442.68f, 5710.41f, 82.0f, 160f, false, true, 0);
    }

    public static LocomotiveNoBackspeed F140AC1() {
        return new LocomotiveNoBackspeed("F140AC1", "Europe", "1999-", "Electric",
                "", "", type, " Freight Locomotive",
                67000f, 7500f, 84.0f, 140f, false, true, 0);
    }

    public static LocomotiveNoBackspeed P140AC1() {
        return new LocomotiveNoBackspeed("P140AC1", "Europe", "1999-", "Electric",
                "", "", type, " Passenger Locomotive",
                67000, 7500f, 84.0f, 140f, false, true, 0);
    }

    public static LocomotiveNoBackspeed P160AC1() {
        return new LocomotiveNoBackspeed("P160AC1", "Europe", "1999-", "Electric",
                "", "", type, " Passenger Locomotive",
                67000f, 7500f, 84.0f, 160f, false, true, 0);
    }

    public static LocomotiveNoBackspeed F140AC2() {
        return new LocomotiveNoBackspeed("F140AC2", "Europe", "2004-", "Electric",
                "", "", type, " Freight Locomotive",
                67000f, 7500f, 84.0f, 140f, false, true, 0);
    }

    //SSB Re 484 / F 140MS2
    public static LocomotiveNoBackspeed F140MS2() {
        return new LocomotiveNoBackspeed("F140MS2E", "Europe", "2004-", "Electric",
                aditional, "", type, " Freight Locomotive",
                67000f, 7500f, 85.0f, 140f, false, true, 0);
    }

    public static LocomotiveNoBackspeed F140DC2() {
        return new LocomotiveNoBackspeed("F140DC2", "Europe", "2006-", "Electric",
                "", "", type, " Freight Locomotive",
                67000f, 7500f, 81.0f, 140f, false, true, 0);
    }

    public static LocomotiveNoBackspeed F140DE() {
        return new LocomotiveNoBackspeed("F140DE", "Europe", "2006-", "Diesel",
                "", "", type, " Passenger Locomotive",
                61000f, 3000f, 80.0f, 140f, false, true, 0);
    }

    public static LocomotiveNoBackspeed P160DE() {
        return new LocomotiveNoBackspeed("P160DE", "Europe", "2006-", "Diesel",
                "", "", type, " Passenger Locomotive",
                61000f, 3000f, 80.0f, 160f, false, true, 0);
    }

    public static LocomotiveNoBackspeed P160DEME() {
        return new LocomotiveNoBackspeed("P160DEME", "Europe", "2012-", "Diesel-Multi-Engine",
                "", "", type, " Passenger Locomotive",
                6744.26f, 3061.86f, 81.0f, 160f, false, true, 0);
    }

    /**
     * end of traxx program.
     */

    //X10a
    public static LocomotiveNoBackspeed X10a() {
        return new LocomotiveNoBackspeed("X10A", "Europe", "2012-", "Diesel-Multi-Engine",
                "", "", type, " Passenger Locomotive",
                32452.73f, 3061.86f, 81.0f, 160f, false, true, 0);
    }

    //todo right stats
    public static LocomotiveNoBackspeed WWCPShopShunter() {
        return new LocomotiveNoBackspeed("WWCPShopShunter", "Europe", "2012-", "Diesel",
                "", "", type, " Shunter Locomotive",
                6744.26f, 75f, 15.0f, 30f, true, true, 0);
    }

    //todo right stats
    public static LocomotiveNoBackspeed WWCPStandard0_6_2T() {
        return new LocomotiveNoBackspeed("WWCPStandard0_6_2T", "Europe", "2012-", "Diesel",
                "", "", type, " Shunter Locomotive",
                6744.26f, 75f, 15.0f, 30f, true, true, 0);
    }

    //todo right stats
    public static LocomotiveNoBackspeed UnknownOne() {
        return new LocomotiveNoBackspeed("ClassMH", "Europe", "2012-", "Diesel-Multi-Engine",
                "", "", type, " Passenger Locomotive",
                6744.26f, 3061.86f, 81.0f, 160f, false, true, 0);
    }

    //Wehrmachtslokomotive WR 360 C 14 / V36
    public static LocomotiveNoBackspeed WR360C14() {
        return new LocomotiveNoBackspeed("WehrmachtslokomotiveWR360C14", "Germany", "1937-1950", "Diesel",
                aditional, " DB V36, DB BR236, DR BR103", type, " Shunting Locomotive",
                31473.3f, 360.3f, 43.0f, 60f, false, true, 0);
    }

    public static LocomotiveNoBackspeed WR360C14Kanzel() {
        return new LocomotiveNoBackspeed("WehrmachtslokomotiveWR360C14Kanzel", "Germany", "1937-1950", "Diesel",
                aditional, " DB V36, DB BR236, DR BR103", type, " Shunting Locomotive",
                31473.3f, 360.3f, 43.0f, 60f, false, true, 0);
    }

    public static LocomotiveNoBackspeed WR360C14Electric() {
        return new LocomotiveNoBackspeed("WehrmachtslokomotiveWR360C14Electric", "Germany", "1937-1950", "Electric",
                aditional, " DB V36, DB BR236, DR BR103", type, " Shunting Locomotive",
                31473.3f, 360.3f, 43.0f, 60f, false, true, 0);
    }

    //todo correct these values
    public static LocomotiveNoBackspeed Series4000() {
        return new LocomotiveNoBackspeed("Series4000", "Germany", "1937-1950", "Electric",
                aditional, " DB V36, DB BR236, DR BR103", type, " Shunting Locomotive",
                31473.3f, 360.3f, 43.0f, 60f, false, true, 0);
    }

    //ACF 60 Seat
    public static Rollingstock ACF_60Seat() {
        return new Rollingstock("ACF_60Seat", "Germany", "1997-", "",
                "", type, " Passenger", 47.5f, 140f, false, true, 0);
    }

    //SLRV C
    public static Rollingstock SLRVC() {
        return new Rollingstock("SLRVC", "US", "1996-Present", "",
                "", type, " Light Rail", 50f, 116f, false, true, 0);
    }

    //Budd Bilevel
    public static Rollingstock BuddBilevel() {
        return new Rollingstock("BuddBilevel", "America", "1950-Present", "",
                "", type, " Passenger", 47.5f, 140f, false, true, 0);
    }

    //Budd Bilevel Cab
    public static Rollingstock BuddBilevelCab() {
        return new Rollingstock("BuddBilevelCab", "America", "1950-Present", "",
                "", type, " Passenger", 47.5f, 140f, false, true, 0);
    }

    //GWR Toad 20
    public static Rollingstock GWR_Toad20() {
        return new Rollingstock("GWRToad20", "United Kingdom", "1997-", "",
                "", type, " Passenger", 60f, 140f, false, true, 0);
    }

    //DBpza
    public static Rollingstock DBpza() {
        return new Rollingstock("Dobbelstock 4th generation", "Germany", "1997-", "",
                "", type, " Passenger", 47.5f, 140f, false, true, 0);
    }

    //Donderbus 1st class todo unfinished
    public static Rollingstock Donderbus1() {
        return new Rollingstock("Donnerbüchse2ndclass", "Germany", "1921-1931", "",
                "", type, " Passenger", 19.6f, 120f, false, true, 0);
    }

    //Donderbus 2nd class todo unfinished
    public static Rollingstock Donderbus2() {
        return new Rollingstock("Donnerbüchse3rdclass", "Europe", "1921-1931", "",
                "", type, " Passenger", 19.6f, 120f, false, true, 0);
    }

    //Donderbus 3rd class todo unfinished
    public static Rollingstock Donderbus3() {
        return new Rollingstock("Donnerbüchse4thclass", "Europe", "1921-1931", "",
                "", type, " Passenger", 19.6f, 120f, false, true, 0);
    }

    //Ealos-x 053
    public static Rollingstock EalosX() {
        return new Rollingstock("Ealos-X", "Europe", "1996-", "",
                "", type, "Freight Loose", 24.3f, 120f, false, true, 0);
    }

    //Amfleet 1
    public static Rollingstock Amfleet1() {
        return new Rollingstock("Amfleet1", "Europe", "1977-", "",
                "", type, " Passenger", 45f, 200f, false, true, 0);
    }

    //Eurofima with Compartments
    public static Rollingstock EurofimaCompartment1() {
        return new Rollingstock("EurofimaCompartments1", "Europe", "1977-", "",
                "", type, " Passenger", 45f, 200f, false, true, 0);
    }

    //Eurofima with Compartments
    public static Rollingstock EurofimaCompartment1_2() {
        return new Rollingstock("EurofimaCompartments1_2", "Europe", "1977-", "",
                "", type, " Passenger", 45f, 200f, false, true, 0);
    }

    //Eurofima with Compartments
    public static Rollingstock EurofimaOpen1() {
        return new Rollingstock("Eurofima Open 1", "Europe", "1977-", "",
                "", type, " Passenger", 45f, 200f, false, true, 0);
    }

    //Eurofima with Compartments
    public static Rollingstock EurofimaPanorama() {
        return new Rollingstock("Eurofima Panorama", "Europe", "1977-", "",
                "", type, " Passenger", 45f, 200f, false, true, 0);
    }

    //Eurofima with Compartments
    public static Rollingstock EurofimaCompartment2() {
        return new Rollingstock("EurofimaCompartments2", "Europe", "1977-", "",
                "", type, " Passenger", 45f, 200f, false, true, 0);
    }

    //todo Eurofima
    public static Rollingstock EurofimaPresidentiale() {
        return new Rollingstock("EurofimaPresidentiale", "Europe", "1977-", "",
                "", type, " Passenger", 45f, 200f, false, true, 0);
    }

    //todo Eurofima
    public static Rollingstock EurofimaAssemblingBase() {
        return new Rollingstock("EurofimaAssemblingBase", "Europe", "1977-", "",
                "", type, " Passenger", 45f, 200f, false, true, 0);
    }

    //todo Eurofima
    public static Rollingstock EurofimaInteriorFitting() {
        return new Rollingstock("EurofimaInteriorFitting", "Europe", "1977-", "",
                "", type, " Passenger", 45f, 200f, false, true, 0);
    }

    //todo Eurofima
    public static Rollingstock EurofimaFlatConstruction() {
        return new Rollingstock("EurofimaFlatConstruction", "Europe", "1977-", "",
                "", type, " Passenger", 45f, 200f, false, true, 0);
    }

    //todo Eurofima
    public static Rollingstock EurofimaGettingPaint() {
        return new Rollingstock("EurofimaGettingPaint", "Europe", "1977-", "",
                "", type, " Passenger", 45f, 200f, false, true, 0);
    }

    //Eurofima with Rows
    public static Rollingstock EurofimaRows() {
        return new Rollingstock("EurofimaOpenSeating", "Europe", "1977-", "",
                "", type, " Passenger", 45f, 200f, false, true, 0);
    }

    //Eurofima with Sleeperbeds
    public static Rollingstock EurofimaSleeper() {
        return new Rollingstock("EurofimaSleeper", "Europe", "1977-", "",
                "", type, " Passenger", 45f, 200f, false, true, 0);
    }

    //Paintstand
    public static Rollingstock PaintStand() {
        return new Rollingstock("PaintStand", "Europe", "1977-", "",
                "", type, " Workshop Equipment", 0.2f, 10f, false, true, 0);
    }

    //APO_BFS
    public static Rollingstock APO_BFS() {
        return new Rollingstock("APO BFs", "Denmark", "1981-1995", "",
                "Control Coach", type, " Passenger", 54f, 160f, false, true, 0);
    }

    //APO_BFM todo unfinished
    public static Rollingstock APO_BFM() {
        return new Rollingstock("APO BFm", "Denmark", "1981-1995", "",
                "", type, " Passenger", 54f, 160f, false, true, 0);
    }

    //APO_AFM todo unfinished
    public static Rollingstock APO_AFM() {
        return new Rollingstock("APO AFm", "Denmark", "1981-1995", "",
                "", type, " Passenger", 54f, 160f, false, true, 0);
    }

    //APO_CFM todo unfinished
    public static Rollingstock APO_CFM() {
        return new Rollingstock("APO CFm", "Denmark", "1981-1995", "",
                "", type, " Passenger", 54f, 160f, false, true, 0);
    }

    //GWR Third
    public static Rollingstock GWRThirdOpen() {
        return new Rollingstock("GWRBrunel3rdClass", "United Kingdom", "1838-1854", "",
                "", type, " Passenger Carriage", 9.5f, 0f, false, true, 0);
    }

    //GWR Third
    public static Rollingstock GWRThirdOpenChristmas() {
        return new Rollingstock("GWRBrunel3rdClassChristmas", "United Kingdom", "1838-1854", "",
                "", type, " Passenger Carriage", 9.5f, 0f, false, true, 0);
    }

    //OFF52
    public static Rollingstock OFF52() {
        return new Rollingstock("OFF52withbeetles", "Germany", "1954-1980", aditional,
                " Laae 540", type, " Freight Cars", 25.4f, 0, false, true, 0);
    }

    //Rheingold 1st Kitchen
    public static Rollingstock RheingoldKitchen1Christmas() {
        return new Rollingstock("SA4uk28Christmas", "Germany", "1928-1939", aditional,
                " Rheingold 1st class dinnercar Christmas", type, " Passenger Dinner", 56.6f, 0f, false, true, 0);
    }

    //Rheingold 1st Salon
    public static Rollingstock RheingoldSalon1Christmas() {
        return new Rollingstock("SA4u28Christmas", "Germany", "1928-1939", aditional,
                " Rheingold 1st class saloncar Christmas", type, " Passenger", 51.9f, 0f, false, true, 0);
    }

    //Rheingold 2nd Kitchen
    public static Rollingstock RheingoldKitchen2Christmas() {
        return new Rollingstock("SB4uk28Christmas", "Germany", "1928-1939", aditional,
                " Rheingold 2nd class dinnercar Christmas", type, " Passenger Dinner", 55.5f, 0f, false, true, 0);
    }

    //Rheingold 2nd Salon
    public static Rollingstock RheingoldSalon2Christmas() {
        return new Rollingstock("SB4u28Christmas", "Germany", "1928-1939", aditional,
                " Rheingold 2nd class saloncar Christmas", type, " Passenger", 52.8f, 0f, false, true, 0);
    }

    //Rheingold 1st Kitchen
    public static Rollingstock RheingoldKitchen1() {
        return new Rollingstock("SA4uk28", "Germany", "1928-1939", aditional,
                " Rheingold 1st class dinnercar", type, " Passenger Dinner", 56.6f, 0f, false, true, 0);
    }

    //Rheingold 1st Salon
    public static Rollingstock RheingoldSalon1() {
        return new Rollingstock("SA4u28", "Germany", "1928-1939", aditional,
                " Rheingold 1st class saloncar", type, " Passenger", 51.9f, 0f, false, true, 0);
    }

    //Rheingold 2nd Kitchen
    public static Rollingstock RheingoldKitchen2() {
        return new Rollingstock("SB4uk28", "Germany", "1928-1939", aditional,
                " Rheingold 2nd class dinnercar", type, " Passenger Dinner", 55.5f, 0f, false, true, 0);
    }

    //Rheingold 2nd Salon
    public static Rollingstock RheingoldSalon2() {
        return new Rollingstock("SB4u28", "Germany", "1928-1939", aditional,
                " Rheingold 2nd class saloncar", type, " Passenger", 52.8f, 0f, false, true, 0);
    }

    //Rheingold Baggagef
    public static Rollingstock RheingoldBaggage() {
        return new Rollingstock("SPw4u28", "Germany", "1928-1939", aditional,
                " Rheingold baggagecar", type, " Passenger Baggage", 41.2f, 0f, false, true, 0);
    }

    //Sggnss 80 Load 1
    public static Rollingstock Sggnss80Load1() {
        return new Rollingstock("SGNSS 80 Load 1", "Europe", "2006-", "",
                "", type, " Freight Container", 21.5f, 120f, false, true, 0);
    }

    //Sggnss 80 Load 2
    public static Rollingstock Sggnss80Load2() {
        return new Rollingstock("SGNSS 80 Load 2", "Europe", "2006-", "",
                "", type, " Freight Container", 21.5f, 120f, false, true, 0);
    }

    //Sggnss 80 Load 3
    public static TankCars Sggnss80Load3() {
        return new TankCars("SGNSS 80 Load 3", "Europe", "2006-", "",
                "", type, " Freight Container", 21.5f, 120f, false, true, 0, 60000);
    }

    //Sggnss 80 Load 4
    public static TankCars Sggnss80Load4() {
        return new TankCars("SGNSS 80 Load 4", "Europe", "2006-", "",
                "", type, " Freight Container", 21.5f, 120f, false, true, 0, 60000);
    }

    //UK 6 Plank "6-Plankopenwagon"
    public static Rollingstock UKOpenWagon() {
        return new Rollingstock("UKOpenwagon", "United Kingdom", "1930-1959", "",
                "", type, " Freight Loose", 10f, 0f, false, true, 0);
    }

    //UK Windcutter
    public static Rollingstock UKOpenWagon2() {
        return new Rollingstock("UK Windcutter", "United Kingdom", "1930-1959", "",
                "", type, " Freight Loose", 10f, 0f, false, true, 0);
    }

    //UK Cattlewagen todo right stats
    public static Rollingstock UKCattlewagen() {
        return new Rollingstock("UK Cattlewagen", "United Kingdom", "1930-1959", "",
                "", type, " Freight Loose", 10f, 0f, false, true, 0);
    }

    //UK GasWagen todo right stats
    public static Rollingstock UKGasWagon() {
        return new Rollingstock("UKGasWagon", "United Kingdom", "1930-1959", "",
                "", type, " Freight Loose", 10f, 0f, false, true, 0);
    }

    //UK Van
    public static Rollingstock UKVan() {
        return new Rollingstock("UKVan", "United Kingdom", "1930-1959", "",
                "", type, " Freight Loose", 12f, 0f, false, true, 0);
    }

    //UK Flatbed
    public static Rollingstock UKFlatbed() {
        return new Rollingstock("UKFlatbed", "United Kingdom", "1930-1959", "",
                "", type, " Freight Loose", 10f, 0f, false, true, 0);
    }
    //Chaldron
    public static Rollingstock Chaldron() {
        return new Rollingstock("Chaldron", "United Kingdom", "1930-1959", "",
                "", type, " Freight Loose", 10f, 0f, false, true, 0);
    }

    //UK Tanker
    public static TankCars UKTanker() {
        return new TankCars("UKTanker", "United Kingdom", "1930-1959", "",
                "", type, " Tank wagon", 12f, 0f, false, true, 0,  9000);
    }

    //DSB ZE Tanker todo right stats
    public static Rollingstock DSBZETanker() {
        return new Rollingstock("DSBZETanker", "Denmark", "1930-1959", "",
                "", type, " Freight Loose", 10f, 0f, false, true, 0);
    }

    //DSB735Tanker todo right stats
    public static Rollingstock DSB735Tanker() {
        return new Rollingstock("DSB735Tanker", "Denmark", "1990-2000s", "",
                "", type, " Freight Loose", 10f, 0f, false, true, 0);
    }

    //Zacns 95
    public static TankCars Zacns95() {
        return new TankCars("Zacns 95", "Europe", "2006-", "",
                "", type, " Tank wagon", 24.4f, 120f, false, true, 0, 60000);
    }

    //60' Hi Cube Plate F Boxcar
    public static Rollingstock Hi_Cube_Plate_F_Boxcar() {
        return new Rollingstock("60' Hi Cube Plate F Boxcar", "America", "?", "",
                "", type, " Boxcar", 80.9f, 120f, false, true, 0);
    }

    //EP2 Center
    public static Rollingstock EP2_Center() {
        return new Rollingstock("EP2 Center", "US", "1919-1974", "",
                "", type, " Passenger Electric", 25f, 120f, false, true, 0);
    }

    //AAR 40ft Boxcar
    public static Rollingstock AAR40ft() {
        return new Rollingstock("40ft AAR Boxcar", "US", "1937-2000", "",
                "", type, " Boxcar", 20f, 120f, false, true, 0);
    }

    //40ft Boxcar old
    public static Rollingstock Fortyfoot_Boxcar() {
        return new Rollingstock("40ft Boxcar", "America", "?", "",
                "", type, " Boxcar", 20f, 120f, false, true, 0);
    }

    //2 Bay Concrete Hopper
    public static Rollingstock Bay2ConcreteHopper() {
        return new Rollingstock("Bay2ConcreteHopper", "America", "?", "",
                "", type, " Hopper", 20f, 120f, false, true, 0);
    }

    //PS2Early3Bay
    public static Rollingstock PS2Early3Bay() {
        return new Rollingstock("PS2Early3Bay", "US", "1965-2000~", "",
                "", type, " Hopper", 31.7f, 120f, false, true, 0);
    }

    //GN 40ft Homebuilt Boxcar
    public static Rollingstock GN40HomebuiltBoxcar() {
        return new Rollingstock("GN40HomebuiltBoxcar", "America", "?", "",
                "", type, " Boxcar", 20f, 120f, false, true, 0);
    }

    //XM4A
    public static Rollingstock XM4A() {
        return new Rollingstock("XM4A", "US", "1961-2000~", "",
                "", type, " Boxcar", 28.75f, 120f, false, true, 0);
    }

    //OpenTriLevelAutorack
    public static Rollingstock OpenTriLevelAutorack() {
        return new Rollingstock("OpenTriLevelAutorack", "US", "1963-2000~", "",
                "", type, " Tri Level Autorack", 55f, 120f, false, true, 0);
    }

    //VertAPacAutorack
    public static Rollingstock VertAPacAutorack() {
        return new Rollingstock("VertAPacAutorack", "US", "1971-1980~", "",
                "", type, " Vertical Autorack", 65f, 120f, false, true, 0);
    }

    //40ft CP Mechanical Plug Door Refrigerated Boxcar
    public static Rollingstock CP_Mechanical_Reefer_40ft() {
        return new Rollingstock("CP 40ft Mechanical Refrigerator", "Canada", "?", "",
                "", type, " Reefer", 20f, 120f, false, true, 0);
    }

    //40ft Boxcar - CP Plug Slide Boxcar
    public static Rollingstock CP_PlugSlide() {
        return new Rollingstock("40ft CP PlugSlide Boxcar", "Canada", "~1970-2000", "",
                "", type, " Boxcar", 48f, 120f, false, true, 0);
    }
    //40ft Boxcar - CP Plugdoor Boxcar
    public static Rollingstock CP_Plugdoor() {
        return new Rollingstock("40ft CP Plugdoor Boxcar", "Canada", "~1970-2000", "",
                "", type, " Boxcar", 48f, 120f, false, true, 0);
    }

    //40ft Boxcar - CP Minibox
    public static Rollingstock CP_Minibox() {
        return new Rollingstock("40ft CP Minibox", "Canada", "1929-1983", "",
                "", type, " Boxcar", 18f, 120f, false, true, 0);
    }

    //GCS Flatcar
    public static Rollingstock GSC_Flatcar() {
        return new Rollingstock("GSCFlatcar", "America", "1956", "",
                "", type, " Flatcar", 15f, 120f, false, true, 0);
    }

    //PRR Gla Hopper
    public static Rollingstock PRR_Gla_Hopper() {
        return new Rollingstock("PRR Gla Hopper", "America", "1956", "",
                "", type, " Hopper", 15f, 120f, false, true, 0);
    }

    //89ft Flatcar
    public static Rollingstock Flatcar_89ft() {
        return new Rollingstock("89ftFlatCar", "America", "1956", "",
                "", type, " Flatcar", 75f, 0f, false, true, 0);
    }

    //Roadrailer53Dryvan
    public static Rollingstock Roadrailer53Dryvan() {
        return new Rollingstock("Roadrailer53Dryvan", "America", "1986-Present", "",
                "", type, " Roadrailer", 3f, 120f, false, true, 0);
    }

    //Thrall 61'6 Bulkhead
    public static Rollingstock Thrall616Bulkhead() {
        return new Rollingstock("Thrall616Bulkhead", "America", "1986-Present", "",
                "", type, " Bulkhead Flatcar", 15f, 120f, false, true, 0);
    }

    //Thrall 61'6 Boeing Flatcar
    public static Rollingstock Thrall616BoeingFlatcar() {
        return new Rollingstock("Thrall616BoeingFlatcar", "America", "1986-Present", "",
                "", type, " Flatcar", 30f, 120f, false, true, 0);
    }

    //Gunderson 59'6 Woodchip
    public static Rollingstock Gunderson596Woodchip() {
        return new Rollingstock("Gunderson596Woodchip", "US", "1960~2000", "",
                "", type, " Woodchip Gondola", 25f, 120f, false, true, 0);
    }

    //Paccar 64' Woodchip
    public static Rollingstock Paccar64Woodchip() {
        return new Rollingstock("Paccar64Woodchip", "US", "1975-Present", "",
                "", type, " Woodchip Gondola", 30f, 120f, false, true, 0);
    }

    //NSC 53' Wellcar
    public static Rollingstock NSC53Wellcar() {
        return new Rollingstock("NSC53Wellcar", "America", "1990-Present", "",
                "", type, " Wellcar", 15f, 120f, false, true, 0);
    }

    //HiCube86QuadDoor
    public static Rollingstock HiCube86QuadDoor() {
        return new Rollingstock("HiCube86QuadDoor", "America", "1969-Present", "",
                "", type, " Boxcar", 38f, 0f, false, true, 0);
    }

    //89ft Autorack BiLvel
    public static Rollingstock Autorack_89ft_BiLevel() {
        return new Rollingstock("89ftBiLevelAutoRack", "America", "1956", "",
                "", type, " Autorack", 75f, 0f, false, true, 0);
    }

    //GCS Flatcar Bulkhead Early
    public static Rollingstock GSC_FlatcarBulkhead() {
        return new Rollingstock("GSCFlatcarBulkhead", "America", "1956", "",
                "", type, " Flatcar", 75f, 0f, false, true, 0);
    }

    //GCS Flatcar Bulkhead Late
    public static Rollingstock GSC_FlatcarBulkheadLate() {
        return new Rollingstock("GSCFlatcarBulkheadLate", "America", "1956", "",
                "", type, " Flatcar", 75f, 0f, false, true, 0);
    }

    //Habbiins_14
    public static Rollingstock Habbiins_14() {
        return new Rollingstock("Habbiins_14", "Europe", "1990s", "",
                "", type, " Boxcar", 26f, 120f, false, true, 0);
    }

    //Habbiins_17
    public static Rollingstock Habbiins_17() {
        return new Rollingstock("Habbiins_17", "Europe", "1990s", "",
                "", type, " Boxcar", 26f, 120f, false, true, 0);
    }

    //Habiins_12
    public static Rollingstock Habiins_12() {
        return new Rollingstock("Habiins_12", "Europe", "2000s", "",
                "", type, " Boxcar", 26f, 120f, false, true, 0);
    }

    //Hbbins
    public static Rollingstock Hbbins() {
        return new Rollingstock("Hbbins", "Europe", "1990s", "",
                "", type, " Boxcar", 15f, 120f, false, true, 0);
    }

    //Hbbillns
    public static Rollingstock Hbbillns() {
        return new Rollingstock("Hbbillns", "Europe", "1990s", "",
                "", type, " Boxcar", 15f, 120f, false, true, 0);
    }

    //Hbbillns
    public static Rollingstock SGNSS60() {
        return new Rollingstock("SGNSS60", "Europe", "1990s", "",
                "", type, " Freight container", 15f, 120f, false, true, 0);
    }

    //Sggnss 60 2 TATEU
    public static TankCars Sgnss60Load2() {
        return new TankCars("SGNSS 60 2 TATEU", "Europe", "2006-", "",
                "", type, " Freight Container", 21.5f, 120f, false, true, 0, 60000);
    }

    //ACF Single Dome Tankcar
    public static TankCars ACF_Single_Dome_Tankcar() {
        return new TankCars("ACF_Single_Dome", "America", "1930-1959", "",
                "", type, " Tank wagon", 12f, 0f, false, true, 0,  9000);
    }

    //DSB E Open Wagon
    public static TankCars DSBCarE() {
        return new TankCars("DSBE", "Denmark", "1960-1990", "",
                "", type, " Freight loose", 12f, 0f, false, true, 0,  9000);
    }

    //GS Van
    public static TankCars GSVan() {
        return new TankCars("GS", "Denmark", "1960-1990", "",
                "", type, " Freight loose", 12f, 0f, false, true, 0,  9000);
    }

    //Lgns
    public static Rollingstock Lgns() {
        return new Rollingstock("Lgns", "Europe", "1980s", "",
                "", type, " Flatcar", 15f, 120f, false, true, 0);
    }
}



