package spi.serviceloader.studentImpl;


import spi.serviceloader.IStudent;

public class SmallStudent implements IStudent {
    @Override
    public void saySomething() {
        System.out.println("我是小学生");
    }
}
