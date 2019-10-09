/* 
 * Copyright 2019 Elísabet Palomino .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

/**
 *
 * @author Elísabet Palomino
 */
public class Main {
    
    public static void main(String[] args) {
        
        //Manera 1
        
        final int LlegadaLuna= 1969;
        System.out.println ("El hombre llegó a la Luna en " + LlegadaLuna);    //System es una clase,out es un recurso de la clase System. el punto indica el recurso.  
           
        //Manera 2
        
        System.out.printf("El hombre llegó a la luna en %d.%n", LlegadaLuna);
        
        
    }//main
    
}//class
