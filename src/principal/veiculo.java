/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import javax.swing.JOptionPane;
import model.Model;

/**
 *
 * @author Lorenzo
 */
class veiculo {
public static void main(String[] args) {
        Model v1 = new Model();
    
        v1.setKm(Double.parseDouble(JOptionPane.showInputDialog("Digite os km percorridos:")));
        v1.setLitro(Double.parseDouble(JOptionPane.showInputDialog("Digite os litros pecorridos:")));

        JOptionPane.showMessageDialog(null,"O consumo de " + v1.getConsumo()+ " km/l");
}
}
