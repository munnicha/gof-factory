package com.munnicha.patterns.gof.creational.factory.model;

/**
 *
 * @author munnicha
 */
public class Windows implements OperatingSystem{

    @Override
    public void spec() {
        System.out.println("Hello! I am Windows.");
    }
    
}
