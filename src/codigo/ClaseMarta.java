/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author Thomas
 */
public class ClaseMarta {
    
    public ClaseMarta(){
        
    }
    
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if(isBirthday==true){
           speed-=5;
        }
        if(speed<=60){
           return 0;
        }
        if(speed>=61 && speed<=80){
           return 1;
       }
        if(speed>=81){
           return 2;
       }
       return 0;
     }    
}
