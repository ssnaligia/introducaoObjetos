package com.anali.sistema.view;

import java.util.ArrayList;

import com.anali.sistema.model.*;

public class Main {
  public static void main(String[] args) {
    ArrayList<Ingresso> ingressos = new ArrayList<>();
    Normal n = new Normal(85);
    ingressos.add(n);
    Vip v = new Vip(160, 75);
    ingressos.add(v);
    CamaroteSuperior cS = new CamaroteSuperior(240, 90);
    ingressos.add(cS);
    CamaroteInferior cI = new CamaroteInferior(190, "Mesa 16 - Zona A");
    ingressos.add(cI);

    for (Ingresso i: ingressos) {
        System.out.println(i.imprimeValor()+"\n");
    }
  }  
}
