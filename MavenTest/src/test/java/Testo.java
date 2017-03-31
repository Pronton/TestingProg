/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mycompany.simpleconsolecalcmaven.Main;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author lenovo
 */

public class Testo {
    
    public void makeSum() {
       Main calculator = new Main(5, 2);
       int result = calculator.getResult();
       assertTrue("Результат(" + result + ") не равен 7", result == 7);
    }
    
}
