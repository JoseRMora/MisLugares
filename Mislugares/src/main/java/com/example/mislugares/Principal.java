package com.example.mislugares;

class Principal {
    public static void main(String[] main) {
        Object lista[] = new Object[4];
        lista[0] = new GeoPunto(23.0, 20);
        lista[1] = new GeoPunto(27.1, 34.9);
        lista[2] = new GeoPuntoAlt(34.8,23.9, 12.4);
        lista[3] = new GeoPuntoAlt(24.8,12.9, 1000.4);

        Lugar lugar = new Lugar("Escuela Politécnica Superior de Gandía",
                "C/ Paranimf, 1 46730 Gandia (SPAIN)",-0.166093,
                38.995656, 31.74, TipoLugar.EDUCACION, 962849300, "http://www.epsg.upv.es",
                "Uno de los mejores lugares para formarse.", 3);
        System.out.println("Lugar " + lugar.toString());

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Elemento " + i + " : " + lista[i]);
            if(lista[i] instanceof GeoPuntoAlt) {
                if (((GeoPuntoAlt) lista[i]).alt> 1000)
                    System.out.println("Punto Elevado!!");
            }
        }

    }
}