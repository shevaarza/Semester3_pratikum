package classrelation.experiment3;

public class Train {
    private String name;
    private String trainClass;
    // Relasi: Train memiliki dua Employee, masing-masing dengan peran berbeda
    private Employee trainDriver;
    private Employee assistant;

    // Constructor tanpa asisten (assistant tetap null)
    public Train(String name, String trainClass, Employee trainDriver) {
        this.name = name;
        this.trainClass = trainClass;
        this.trainDriver = trainDriver;
    }

    // Constructor dengan asisten
    public Train(String name, String trainClass, Employee trainDriver, Employee assistant) {
        this.name = name;
        this.trainClass = trainClass;
        this.trainDriver = trainDriver;
        this.assistant = assistant;
    }

    public void setTrainDriver(Employee trainDriver) {
        this.trainDriver = trainDriver;
    }

    public Employee getTrainDriver() {
        return trainDriver;
    }

    public void setAssistant(Employee assistant) {
        this.assistant = assistant;
    }

    public Employee getAssistant() {
        return assistant;
    }

    public String info() {
        String info = "";

        info += "Name: " + this.name + "\n";
        info += "Class: " + this.trainClass + "\n";
        info += "Train Driver: " + this.trainDriver.info() + "\n";

        // Asisten bersifat opsional, jadi dicek dulu agar tidak NullPointerException
        if (this.assistant != null) {
            info += "Assistant: " + this.assistant.info() + "\n";
        }

        return info;
    }
}
