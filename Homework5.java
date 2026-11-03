class PersonalComputer{
    private Computer computer = new Computer();
    private Monitor monitor = new Monitor();

    public void turnOn() {
        computer.turnOn();
        monitor.turnOn();
    }
    public void printInfo() {
        computer.printInfo();
        monitor.printInfo();
    }
}

class Monitor{
    private String monitorSize = "24 inch";
    private String color = "Black";
    private String power = "45W";

    public void turnOn(){
        System.out.println("Turning on the monitor.");
    }
    public void printInfo(){
        System.out.println("The spec of the monitor");
        System.out.printf(" Size: %s\n", monitorSize);
        System.out.printf(" Color: %s\n", color);
        System.out.printf(" Power: %s\n", power);
    }
}

class Computer{
    private String cpu = "Core i7";
    private String memory = "16GB";
    private String hd = "2TB";
    private String color = "White";
    private String power = "500W";

    public void turnOn(){
        System.out.println("Turning on the computer.");
    }
    public void printInfo(){
        System.out.println("The spec of the computer");
        System.out.printf(" CPU: %s\n", cpu);
        System.out.printf(" Memory: %s\n", memory);
        System.out.printf(" HDD: %s\n", hd);
        System.out.printf(" Color: %s\n", color);
        System.out.printf(" Power: %s\n", power);
    }
}


public class Homework5 {
    public static void main(String[] args){
        PersonalComputer com = new PersonalComputer();
        com.turnOn();
        com.printInfo();
    }
}
