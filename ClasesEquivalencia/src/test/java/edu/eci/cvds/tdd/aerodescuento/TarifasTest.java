package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;
//Realice la implementación de las pruebas propuestas en la etapa de diseño de pruebas en esta 
//clase. Para sus pruebas debe usar el método "calculoTarifa" de la clase 
//edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos, 
//que se encuentran dentro del JAR de la librería personalizada.

public class TarifasTest {
    private CalculadorDescuentos c= new CalculadorDescuentos();
    private double valorTarifa;



    @Test
    public void validarEdadMenor(){
        @Test
        public void validarAntelacionNegativa(){
            // error dias antelación menor a 0
            try{
                valorTarifa = c.calculoTarifa(500000,-1,30);
                //debe lanzar error, si lanza error pasa la prueba por llegar a catch
            }
            catch (Exception e){
                Assert.assertTrue(true);
            }

        }
        @Test
        public void validarTarifaNegativa(){
            //  error por tarifa negativa
            try{
                valorTarifa = c.calculoTarifa(-500000,1,30);
                //debe lanzar error, si lanza error pasa la prueba por llegar a catch
            }
            catch (Exception e){
                Assert.assertTrue(true);
            }
        }
       //probar edades negativas
        try{
            valorTarifa = c.calculoTarifa(500000,15,-1);
            //debe lanzar error, si lanza error pasa la prueba por llegar a catch
        }
        catch ( Exception e){
            Assert.assertTrue(true);
        }
    }
    @Test
    public void validarEdad(){
        // error por edad  0
        try{
            valorTarifa = c.calculoTarifa(500000,15,0);
            //debe lanzar error, si lanza error pasa la prueba por llegar a catch
        }
        catch ( Exception e){
            Assert.assertTrue(true);
        }
    }
    @Test
    public void validarDescuento(){
        // descuento de 5% edad 17
        valorTarifa = c.calculoTarifa(500000,15,17);
        Assert.assertEquals( String.valueOf(valorTarifa), "475000.0");
    }
    @Test
    public void validarDescuentoNo(){
        //no se debe aplicar descuento
        valorTarifa = c.calculoTarifa(500000,15,65);
        Assert.assertEquals( String.valueOf(valorTarifa), "500000.0");

    }
    @Test
    public void validarDescuentoedadMayor65(){
        //deberia generar descuento de 8%
        valorTarifa = c.calculoTarifa(500000,15,130);
        Assert.assertEquals( String.valueOf(valorTarifa), "460000.0");
    }
    
   

    @Test
    public void descuentoAcum20(){
        // descuento 20%, edad menor a 18 y dias superiores a 20
        valorTarifa = c.calculoTarifa(500000,40,14);
        Assert.assertEquals( String.valueOf(valorTarifa), "400000.0");
    }

    @Test
    public void descuentoAcum23(){
        // descuento 23% por edad y dias agendacion       deberia generar un descuanto del 20%, por su edad y los dias de antelacion con los que se agendo
        valorTarifa = c.calculoTarifa(500000,70,66);
        Assert.assertEquals( String.valueOf(valorTarifa), "385000.0");
    }

    
}