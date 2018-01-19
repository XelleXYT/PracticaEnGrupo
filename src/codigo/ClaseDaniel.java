/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author Daniel Ortiz Vallejo
 */
public class ClaseDaniel {
  public boolean love6(int a, int b) {
  int c = a-b;
  int d = b-a;
  if(a == 6 || b == 6){
    return true;
  }
  else if(a+b == 6){
    return true;
  }
  else if( Math.abs(c)==6 || Math.abs(d)==6){
    return true;
  }
  else{
    return false;
  }
}

}
