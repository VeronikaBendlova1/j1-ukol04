package cz.czechitas.ukol4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Třída pro losování Sportky.
 */
public class Sportka {
  private final List<Integer> osudi = new ArrayList<>();

  //private Random nahodnecislo = new Random();


  public Sportka() {
    //TODO naplnit osudí čísly 1 až 49.

    for (int pridejcislo =1;pridejcislo < 49; pridejcislo++)
      {
        osudi.add(pridejcislo);

      }

  }

  /**
   * Zamíchá osudí.
   *
   * @see Collections#shuffle(List)
   */
  public void zamichat() {
    //TODO zamíchat osudí
    Collections.shuffle(osudi); //Collections.shuffle(osudi, new Random(6));
    System.out.println(osudi);



  }

  /**
   * Vrátí seznam s 6 vylosovanými čísly.
   *
   * @return Seznam vylosovaných čísel.
   *
   * @see List#subList(int, int)
   */
  public List<Integer> vylosovanaCisla() {
    //TODO Vrátit seznam prvních 6 čísel z osudí.
    List <Integer> vylosovanaCisla = new ArrayList<>();
    for (int i = 0; i < 6; i ++)
    {
      vylosovanaCisla.add(osudi.get(i));
    }
    return vylosovanaCisla;
  }

  /**
   * Vrátí sedmé vylosované číslo (dodatkové číslo)
   *
   * @return Dodatkové číslo.
   */
  public Integer dodatkoveCislo() {
    //TODO Vrátit sedmé číslo z osudí.
    return osudi.get(6);
  }
}
