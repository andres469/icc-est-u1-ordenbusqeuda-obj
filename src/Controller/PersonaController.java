package Controller;

import Models.Persona;

public class PersonaController {
    public void sortDireccionCodigo(Persona[] personas){
        for (int i = 0; i < personas.length; i++) {
            int indexMayor=i;
            for (int j = i+1; j < personas.length; j++) {
                if (personas[j].compareCodigoDireccion(personas[i])) {
                    indexMayor=j;
                }
            }
            if (i!=indexMayor){
                Persona aux=personas[indexMayor];
                personas[indexMayor]=personas[i];
                personas[i]=aux;
            }

        }

    }
    public Persona findByCodigo(Persona[] personas, int codigo){
        int inicio=0;
        int fin= personas.length-1;
        while (inicio<=fin){
            int medio=(inicio+fin)/2;
            if (personas[medio].equalsByCodigoDireccion(codigo)){
                return personas[medio];
            }
            if (personas[medio].getCodigoDireccion()>codigo){
            inicio=medio+1;
            }else {
                fin=medio-1;
            }
        }
        return null;

    }


}
