/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 * The number 6 is a truly great number. Given two int values, a and b, return 
 * true if either one is 6. Or if their sum or difference is 6. 
 * Note: the function Math.abs(num) computes the absolute value of a number. 
 * 
 * @author Daniel Ortiz Vallejo
 */
public class ClaseDaniel {
    /**
     * Este método recibe dos números, mira a ver si hay un 6 en cualquiera de las
     * dos entradas. Si está da Verdadero. Si no hace la suma y la diferencia, 
     * si en alguna de las dos, está el 6, devuelve Verdadero. 
     * Si no, devolverá Falso.
     * 
     * @param a Número 1
     * @param b Número 2
     * @return Da Verdadero si esta presente el 6 en la entrada, la suma o la diferencia entre ambos.
     */
    public boolean love6(int a, int b) {
	int c = a - b;			//Aquí se guardará una de las diferencias
	int d = b - a;			//Aquí se guardará otra de las diferencias
	if (a == 6 || b == 6) {		//Aquí mira si está ya presente 
	    return true;
	} else if (a + b == 6) {	//Aqui mira si esta en la suma
	    return true;
	} else if (Math.abs(c) == 6 || Math.abs(d) == 6) { //Ahora si está en la diferencia
	    return true;
	} else {
	    return false;
	}
    }

}
