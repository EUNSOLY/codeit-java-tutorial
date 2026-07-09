package com.example.demo.temp;


public class TvRemoteControl extends RemoteControlAbstract {
    public TvRemoteControl(String name) {
        super(name);
    }

    @Override
    public void leftClick() {
        System.out.println(name + "나는 leftClick 클릭인데 실제로도 왼쪽 클릭이 맞아!");
    }

    @Override
    public void rightClick() {
        System.out.println(name + "나는 rightClick 클릭인데 실제로도 오른쪽 클릭이 맞아!");
    }
}
