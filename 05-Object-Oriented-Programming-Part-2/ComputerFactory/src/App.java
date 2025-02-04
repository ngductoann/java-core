public class App {
    public static void main(String[] args) throws Exception {
        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27 inch beast", "Acer", 27, "2540x1440");
        MotherBoard theMotherboard = new MotherBoard("BJ-200", "Asus", 4, 6, "v2.44");
        PersonalComputer thePC =
                new PersonalComputer("2208", "Dell", theCase, theMonitor, theMotherboard);

        // thePC.getComputerCase().pressPowerButton();
        // thePC.getMotherBoard().loadProgram("Windows OS");
        // thePC.getMonitor().drawPixelAt(10, 10, "red");

        thePC.powerUp();
    }
}
