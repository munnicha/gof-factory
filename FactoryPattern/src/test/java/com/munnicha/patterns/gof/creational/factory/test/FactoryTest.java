package com.munnicha.patterns.gof.creational.factory.test;

import com.munnicha.patterns.gof.creational.factory.OperatingSystemFactory;
import com.munnicha.patterns.gof.creational.factory.model.Android;
import com.munnicha.patterns.gof.creational.factory.model.IOS;
import com.munnicha.patterns.gof.creational.factory.model.OperatingSystem;
import com.munnicha.patterns.gof.creational.factory.model.Windows;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


/**
 *
 * @author munnicha
 */
public class FactoryTest {
    
    @Test
    public void testCreateOperatingSystems(){
        OperatingSystemFactory osFactory = new OperatingSystemFactory();
        OperatingSystem myOpenSourceOs=osFactory.createOS("open");
        OperatingSystem myExpensiveSourceOs=osFactory.createOS("expensive");
        OperatingSystem myFavouriteOs=osFactory.createOS("favourite");
            
        /*
        These asserts are just for the example, we may do not want
        to check the type of the created instance
        but focus more on functionality.
        */ 
        assertTrue((myOpenSourceOs instanceof Android));
        assertTrue((myExpensiveSourceOs instanceof IOS));
        assertTrue((myFavouriteOs instanceof Windows));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCreateOperatingSystemsException(){
        OperatingSystemFactory osFactory = new OperatingSystemFactory();
        osFactory.createOS("traditional");
    }
    
}
