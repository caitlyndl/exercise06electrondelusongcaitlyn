/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise06electrondelusongcaitlyn;

/**
 *
 * @author caitlyndelusong
 */
public class GrassType extends Monster {
  
  public GrassType (String name, int hp, int base) {
    super(name, "grass", "water", "fire", hp, base);
    atk = base;
    def = base;
  
  }
}