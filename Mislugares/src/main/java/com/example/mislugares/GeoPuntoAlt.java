package com.example.mislugares;

public class GeoPuntoAlt extends GeoPunto {

    protected double alt;

    public GeoPuntoAlt(double longitud, double latitud, double altura) {
        super(longitud, latitud);
        this.alt = altura;
    }

    public double distancia(GeoPunto punto, double alt) {
        double dist_ant = super.distancia(punto);
        double dif_alt = this.alt - alt;
        return Math.sqrt(Math.pow(dist_ant,2) + Math.pow(dif_alt,2));
    }
}
