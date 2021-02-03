package com.munnicha.patterns.gof.creational.factory;

import com.munnicha.patterns.gof.creational.factory.model.Android;
import com.munnicha.patterns.gof.creational.factory.model.IOS;
import com.munnicha.patterns.gof.creational.factory.model.OperatingSystem;
import com.munnicha.patterns.gof.creational.factory.model.Windows;

/**
 *
 * @author munnicha
 */
public class OperatingSystemFactory {
    
    /**
     * Creates an operating system based on the given type.
     * @param type Open|Expensive|Favourite
     * @return a proper OperatingSystem
     */
    public OperatingSystem createOS(String type){
        if("open".equalsIgnoreCase(type)){
            return new Android();
        }else if("expensive".equalsIgnoreCase(type)){
            return new IOS();
        }else if("favourite".equalsIgnoreCase(type)){
            return new Windows();
        }else{
            throw new IllegalArgumentException("No such operating system.");
        }
    }
}
