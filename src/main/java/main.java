public class main {
    public static void main(String[] args) {
        Tv tv = new Tv("Samsung");
        Channel channel1 = new Channel("anilibria");

        Program p1 = new Program("Demon Slayer");
        Program p2 = new Program("Naruto");

        Program p3 = new Program("Jujutsu Kaisen");
        Program p4 = new Program("One Punch Man");

        RemoteControllerImpl controller = new RemoteControllerImpl(tv);

        tv.addChannel(channel1);

        channel1.addProgram(p1);
        channel1.addProgram(p2);
        channel1.addProgram(p3);
        channel1.addProgram(p4);

//      channel.getRandomProgram();
//      tv.onChannel();

        controller.switchToRandomProgram();







    }
}
