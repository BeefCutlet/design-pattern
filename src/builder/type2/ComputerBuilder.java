package builder.type2;

public class ComputerBuilder {

    private Computer computer;

    private ComputerBuilder() {
        this.computer = new Computer("default", "default", "default");
    }

    public static ComputerBuilder start() {
        return new ComputerBuilder();
    }

    public ComputerBuilder setCpu(String cpu) {
        this.computer.setCpu(cpu);
        return this;
    }

    public ComputerBuilder setRam(String ram) {
        this.computer.setRam(ram);
        return this;
    }

    public ComputerBuilder setStorage(String storage) {
        this.computer.setStorage(storage);
        return this;
    }

    public Computer build() {
        return this.computer;
    }
}
