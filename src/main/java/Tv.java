import java.util.ArrayList;
import java.util.List;

public class Tv {
    private String model;
    private List<Channel> channels;


    public Tv(String model) {
        this.model = model;
        this.channels = new ArrayList<>();
    }


    public void addChannel(Channel channel){
        channels.add(channel);
    }

//    Тестовый вариант
//    public Program getChannel() {
//        Random random = new Random();
//        Channel randomChannel = channels.get(random.nextInt(channels.size()));
//        return randomChannel.getRandomProgram();
//    }

    //Включение телевизора, и показ случайной программы в канале
    public Program onChannel (){
        return channels.get(channels.size()-1).getRandomProgram();
    }

    //Включение телевизора по определённому каналу, и показ случайной программы в канале
//    public void numberChannel (int num){
//        System.out.println(channels.get(channels.size()-1).getRandomProgram());
//        }
}