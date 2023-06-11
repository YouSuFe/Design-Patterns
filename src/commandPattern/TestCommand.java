package commandPattern;

import commandPattern.commands.*;

public class TestCommand {
    public static void main(String[] args) {
        System.out.println("**************Command Pattern Demo*****************");
        SimpleRemoteController remoteControl = new SimpleRemoteController();
        Light livingRoomLight = new Light("Living Room Light");
        Light kitchenLight = new Light("Kitchen Light");
        CeilingFan ceilingFan = new CeilingFan("Kitchen Ceiling Fan");
        CeilingFan ceilingFan2 = new CeilingFan("Living Room Ceiling Fan");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);

        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand livingRoomCeilingFanOn = new CeilingFanOnCommand(ceilingFan2);
        CeilingFanOnCommand kitchenCeilingFanOn = new CeilingFanOnCommand(ceilingFan);

        CeilingFanOffCommand livingRoomCeilingFanOff = new CeilingFanOffCommand(ceilingFan2);
        CeilingFanOffCommand kitchenCeilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, livingRoomCeilingFanOn, livingRoomCeilingFanOff);
        remoteControl.setCommand(3, kitchenCeilingFanOn, kitchenCeilingFanOff);

        System.out.println(remoteControl);

        for (int i = 0; i < remoteControl.onCommands.length; i++) {
            if(remoteControl.onCommands[i] instanceof NoCommand){
                continue;
            }
            else {
                remoteControl.onButtonWasPushed(i);
                remoteControl.offButtonWasPushed(i);
            }
        }
    }
}
