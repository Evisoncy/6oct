/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesar.arzapalo
 */
public class HelpConstructor {
    
    public static Class<?>[] getTypeParameter(Class<?> ...classParameters){

        return classParameters;
    }

    public static Object objectCreator(Object instanciable, Class classInstance, Class<?>[]typeParametter, Object... parametros){
        System.out.println(instanciable);
        if(instanciable == null){
            try {
                instanciable = classInstance.getConstructor(typeParametter).newInstance(parametros);
            } catch (IllegalArgumentException ex) {
                Logger.getLogger(HelpConstructor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvocationTargetException ex) {
                Logger.getLogger(HelpConstructor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(HelpConstructor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(HelpConstructor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchMethodException ex) {
                Logger.getLogger(HelpConstructor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SecurityException ex) {
                Logger.getLogger(HelpConstructor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return instanciable;
    }
    
 
}
