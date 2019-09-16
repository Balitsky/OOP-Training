package L1.Pirate.logic;

public class Act {
    public static class Scena_1 {
        private static final Pirate DEAD_PIRATE = new Pirate("DEAD","");

        public static void go(Ship ship) {
            doFight(ship);
            getGold(ship);
        }

        private static void getGold(Ship ship) {
            if (!ship.getCap().equals(DEAD_PIRATE)) {
                ship.setGold((int) (Math.random() * 1000));
                System.out.println("you found " + ship.getGold() + " gold");
            } else {
                System.out.println("your cap dead, you lose fight");
            }
        }

        private static void doFight(Ship ship) {
            int punch = (int) (Math.random() * 10);

            for (int i = 0; i < punch; i++) {
                int target = ((int) (Math.random() * (ship.getPirates().length + 1)));

                if (target == ship.getPirates().length) {
                    printInfo(ship.getCap());
                    ship.setCap(DEAD_PIRATE);
                } else {
                    printInfo(ship.getPirates()[target]);
                    ship.getPirates()[target] = DEAD_PIRATE;
                }
            }
        }

        private static void printInfo(Pirate pirate) {
            if (!pirate.equals(DEAD_PIRATE)) {
                System.out.println(pirate.toString() + " was killed");
            } else {
                System.out.println("enemy missed");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
