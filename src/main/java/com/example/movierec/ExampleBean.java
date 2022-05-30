package com.example.movierec;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Initialization callbacks for beans
 */

public class ExampleBean implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        //Do some init work, from the InitBean interface
    }

    @Override
    public void destroy() throws Exception {
        //do destruction work, from DisposableBean interface
    }
}
