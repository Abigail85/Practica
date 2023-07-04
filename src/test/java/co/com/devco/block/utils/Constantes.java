package co.com.devco.block.utils;

public enum Constantes {
    TITULO("Mi primera nota"),
    TEXTO_1("Buenas tardes, como estas?"),
    TEXTO_2("Espero se encuentren bien"),
    DEFAULT("N/A");

    private final  String constante;

    Constantes(String constante){
        this.constante =constante;
    }
     public String getConstante(){return constante; }
    }

