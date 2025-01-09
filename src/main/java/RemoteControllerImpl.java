public class RemoteControllerImpl  implements RemoteController {
    Tv tv;
    Channel channel;

    public RemoteControllerImpl(Tv tv) {
        this.tv = tv;
    }


    public void switchToRandomProgram() {
        Program program = tv.onChannel();
        System.out.println("Телевизор включен");
        System.out.println("Сейчас показывают: " + program.getNameProgram());
    }

    @Override
    public void SwitchChannelByNumber(int number) {
    }

    @Override
    public void SwitchChannelForward() {
    }

    @Override
    public void SwitchChannelBack() {
    }
}