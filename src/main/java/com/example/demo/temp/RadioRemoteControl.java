package com.example.demo.temp;

public class RadioRemoteControl extends RemoteControlAbstract {

    public RadioRemoteControl(String name) {
        super(name);
    }

    @Override
    public void leftClick() {
        System.out.println(name + "나는 leftClick 클릭인데 실제론 오른쪽 클릭이 맞아!");
    }

    @Override
    public void rightClick() {
        System.out.println(name + "나는 rightClick 클릭인데 실제론 왼쪽 클릭이 맞아!");
    }
}
