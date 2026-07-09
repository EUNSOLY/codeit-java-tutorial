package com.example.demo.temp;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public abstract class RemoteControlAbstract implements RemoteControlInterface {
    protected final String name;


    public void powerOn() {
        System.out.println("전원을 키다.");
    }

    public void powerOff() {
        System.out.println("전원을 끄다.");
    }
}



