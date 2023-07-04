package co.com.devco.block.utils;

public enum Constantes {
    TITULO_NOTA_SIN_FORMATO("Mi nota sin formato"),
    TITULO_NOTA_CON_FORMATO("Mi nota con formato"),
    TEXTO_1(" Buenas tardes, como estas?"),
    TEXTO_2("Espero se encuentren bien"),
    DEFAULT("N/A");

    private final  String constante;

    Constantes(String constante){
        this.constante =constante;
    }
     public String getConstante(){return constante; }
    }

