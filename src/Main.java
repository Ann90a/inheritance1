import transport.Bus;
import transport.Train;
import transport.Transport;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {



        Train lastochka = new Train(
                "Ласточка",
                "В-901",
                2011,
                "Россия",
                null,
                301,
                3500,
                3,
                "Белорусский вокзал",
                "Минск-Пассажирский",
                11
        );




        Train leningrad = new Train(
                "Ленинград",
                "Д-125",
                2019,
                "Россия",
                null,
                270,
                1700,
                5,
                "Ленинградский вокзал",
                "Ленинград-Пассажирский",
                8
        );

        System.out.println(lastochka);
        System.out.println(leningrad);

        Bus b1 = new Bus(
                "ПАЗ",
                "Вектор",
                2012,
                "Россия",
                "белый",
                100
        );
        Bus b2 = new Bus(
                "ЛАЗ",
                "AeroLAZ",
                2015,
                "Украина",
                "красный",
                150
        );
        Bus b3 = new Bus(
                "MАЗ",
                "1034",
                2017,
                "Белорусь",
                "зеленый",
                110
        );

        for (int i = 1; i <= 3; i++) {
            Bus bus = new Bus(
                    "Bus brand #" + i,
                    "Bus model #" + i,
                    LocalDate.now().minusYears(i).getYear(),
                    "Россия",
                    "белый",
                    100 + i
            );
            System.out.println(bus);
        }
    }

}

