package kr.co.ch02.sub2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    @Autowired // 필드 주입
    private CPU cpu;

    // 생성자 주입(final속성)
    private final RAM ram;

    @Autowired
    public Computer(RAM ram) {
        this.ram = ram;
    }

    // 세터 주입
    private HDD hdd;

    @Autowired
    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public void show(){
        cpu.show();
        ram.show();
        hdd.show();
    }
}
