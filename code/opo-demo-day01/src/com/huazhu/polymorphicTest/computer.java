package com.huazhu.polymorphicTest;

public class computer {
    private String name;

    public String getName() {
        return name;
    }

    public computer(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void installUSB2(USB2 usb2){
        if(usb2 instanceof  keyboard){
            keyboard k =(com.huazhu.polymorphicTest.keyboard)usb2;
            k.keyDown();
        }else if(usb2 instanceof  mouse) {
            mouse m = (mouse) usb2;
            m.click();
        }
    }
    public void start(){
        System.out.println(this.getName()+"¿ª»ú");
    }
}
