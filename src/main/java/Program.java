public class Program {
    private String nameProgram;



    public Program(String nameProgram) {
        this.nameProgram = nameProgram;
    }



    public String getNameProgram() {
        return nameProgram;
    }

    public void setNameProgram(String nameProgram) {
        this.nameProgram = nameProgram;
    }


    @Override
    public String toString() {
        return "Program{" +
                "nameProgram='" + nameProgram + '\'' +
                '}';
    }
}
