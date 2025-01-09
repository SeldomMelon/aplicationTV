import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Channel {
    private String nameChannel;
    private List<Program> programs;

    public Channel(String nameChannel) {
        this.nameChannel = nameChannel;
        this.programs = new ArrayList<>();
    }

    public void addProgram(Program program){
        programs.add(program);

    }

    public Program getRandomProgram() {
        Random random = new Random();
        return programs.get(random.nextInt(programs.size()));

    }


    @Override
    public String toString() {
        return "Channel{" +
                "nameChannel='" + nameChannel + '\'' +
                ", programs=" + programs +
                '}';
    }
}