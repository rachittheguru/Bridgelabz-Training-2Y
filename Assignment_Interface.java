public class Assignment_Interface {
    public static void main(String[] args) {
        SmartDevice light = new Light();
        SmartDevice ac = new AC();
        SmartDevice tv = new TV();

        light.turnOn();
        ac.turnOn();
        tv.turnOn();

        System.out.println("all light on ");

        light.turnOff();
        ac.turnOff();
        tv.turnOff();
    }
}


interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice {
    public void turnOn() {
        System.out.println("Light is turned ON.");
    }

    public void turnOff() {
        System.out.println("Light is turned OFF.");
    }
}

class AC implements SmartDevice {
    public void turnOn() {
        System.out.println("Air Conditioner is turned ON.");
    }

    public void turnOff() {
        System.out.println("Air Conditioner is turned OFF.");
    }
}

 class TV implements SmartDevice {
    public void turnOn() {
        System.out.println("Television is turned ON.");
    }

    public void turnOff() {
        System.out.println("Television is turned OFF.");
    }
}




