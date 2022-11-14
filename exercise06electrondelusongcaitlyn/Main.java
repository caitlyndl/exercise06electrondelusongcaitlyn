/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise06electrondelusongcaitlyn;
/**
 *
 * @author caitlyndelusong
 */
public class Main {

  public static void main(String[] args) {
    FireType flareon = new FireType("Flareon", 300, 150);
    GrassType leafeon = new GrassType("Leafeon", 300, 150);
    WaterType vaporeon = new WaterType("Vaporeon", 300, 150);

    
    System.out.println("The first battle: Grass vs. Fire!");
    do {
      leafeon.attack(flareon);
      if (flareon.hp != 0) { //if opponent still has hp left, they attack
         flareon.attack(leafeon);
      }
    } while (leafeon.hp > 0 && flareon.hp > 0);

    //reset health for their next battle
    leafeon.restoreHealth();
    flareon.restoreHealth();

    
    System.out.println("The second battle: Fire vs. Water!");
    do {
      flareon.attack(vaporeon);
      if (vaporeon.hp != 0) {
        vaporeon.attack(flareon);
      }
    } while (flareon.hp > 0 && vaporeon.hp > 0);

    flareon.restoreHealth();
    vaporeon.restoreHealth();

    
    System.out.println("The third battle: Water vs. Grass!");
    do {
      vaporeon.attack(leafeon);
      if (leafeon.hp != 0) {
        leafeon.attack(vaporeon);
      }
    } while (vaporeon.hp > 0 && leafeon.hp > 0);
    
    vaporeon.restoreHealth();
    leafeon.restoreHealth();
    
  }
}
