/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum4.tugas;

/**
 *
 * @author iwana
 */
public class bangunRuangMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bangunRuang kubus = new bangunRuang(4);
        bangunRuang balok= new bangunRuang(1,2,5);
        
        System.out.println("Vol balok: "+balok.volumeBalok());
        System.out.println("Vol kubus: "+kubus.volumeKubus());
        System.out.println("luas balok: "+balok.luasBalok());
        System.out.println("luas kubus: "+kubus.luasKubus());
    }
    
}
