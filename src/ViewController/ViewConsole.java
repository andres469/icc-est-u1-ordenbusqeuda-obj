package ViewController;

import Models.Persona;

public class ViewConsole {
    public void printArray(Persona[] personas){
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas.toString());
        }
    }
    public void printMessage(String message){
        System.out.println(message);
    }
}
