/** Copyright ESPE-DECC
*/

package ec.edu.espe.tax;

/**
 *
 * @author Edison Lascano Hypertech ESPE-DCCO
 */
public class BasicTax {
    
    public static float computeIva(float basePrice, float percentageValue){
        float iva;
        iva = basePrice * percentageValue / 100;
        return iva;
    }

}
