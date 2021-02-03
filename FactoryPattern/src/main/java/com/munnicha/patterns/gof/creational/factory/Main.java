package com.munnicha.patterns.gof.creational.factory;

import com.munnicha.patterns.gof.creational.factory.model.OperatingSystem;

/**
 *
 * @author munnicha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperatingSystemFactory osFactory = new OperatingSystemFactory();
        OperatingSystem myOpenSourceOs=osFactory.createOS("open");
        OperatingSystem myExpensiveSourceOs=osFactory.createOS("expensive");
        OperatingSystem myFavouriteOs=osFactory.createOS("favourite");
        
        myOpenSourceOs.spec();
        myExpensiveSourceOs.spec();
        myFavouriteOs.spec();
    }
    
}
