/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lorenzo
 */
public class Model {
  private double Km;
  private double Litro;
  private double Consumo;

    public Model() {
    }

    public double getKm() {
        return Km;
    }

    public void setKm(double Km) {
        this.Km = Km;
    }

    public double getLitro() {
        return Litro;
    }

    public void setLitro(double Litro) {
        this.Litro = Litro;
    }

    public double getConsumo() {
        return Km/Litro;
    }

    public void setConsumo(double Consumo) {
        this.Consumo = Consumo;
    }

  
}
