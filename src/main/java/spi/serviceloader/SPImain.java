package spi.serviceloader;

import java.util.ServiceLoader;

public class SPImain {

    public static void main(String[] args) {

        ServiceLoader<IStudent> loadS = ServiceLoader.load(IStudent.class);

        for (IStudent load : loadS) {

            load.saySomething();

        }

    }


}
