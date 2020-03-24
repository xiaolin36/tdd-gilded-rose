package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {
  @Test
  void normalProductQualityOneDayLater() {
    Item[] items = new Item[] { new Item("toto", 2, 10) };
    GildedRose app = new GildedRose(items);

    int days = 1;
    for (int i = 0; i < days; i++) {
      app.updateQuality();
    }

    assertEquals("toto", app.items[0].name);
    assertEquals(1, app.items[0].sellIn);
    assertEquals(9, app.items[0].quality);

  }

  @Test
  void normalProductQualityTwoDaysLater() {
    Item[] items = new Item[] { new Item("toto", 2, 10) };
    GildedRose app = new GildedRose(items);

    int days = 2;
    for (int i = 0; i < days; i++) {
      app.updateQuality();
    }

    assertEquals("toto", app.items[0].name);
    assertEquals(0, app.items[0].sellIn);
    assertEquals(8, app.items[0].quality);
  }

  @Test
  void normalProductQualityThreeDaysLater() {
    Item[] items = new Item[] { new Item("toto", 2, 10) };
    GildedRose app = new GildedRose(items);

    int days = 3;
    for (int i = 0; i < days; i++) {
      app.updateQuality();
    }

    assertEquals("toto", app.items[0].name);
    assertEquals(-1, app.items[0].sellIn);
    assertEquals(6, app.items[0].quality);
  }

  @Test
  void agedBrieQualityTenDaysLater(){
    Item[] items = new Item[] { new Item("Aged Brie", 2, 40) };
    GildedRose app = new GildedRose(items);

    int days = 10;
    for (int i = 0; i < days; i++) {
      app.updateQuality();
    }

    assertEquals("Aged Brie", app.items[0].name);
    assertEquals(-8, app.items[0].sellIn);
    assertEquals(50, app.items[0].quality);
  }

  @Test
  void agedBrieQualityElevenDaysLater(){
    Item[] items = new Item[] { new Item("Aged Brie", 2, 40) };
    GildedRose app = new GildedRose(items);

    int days = 11;
    for (int i = 0; i < days; i++) {
      app.updateQuality();
    }

    assertEquals("Aged Brie", app.items[0].name);
    assertEquals(-9, app.items[0].sellIn);
    assertEquals(50, app.items[0].quality);
  }

  @Test
  void sulfuresQualityTenDaysLater(){
    Item[] items = new Item[] { new Item("Sulfures", 2, 40) };
    GildedRose app = new GildedRose(items);

    int days = 10;
    for (int i = 0; i < days; i++) {
      app.updateQuality();
    }

    assertEquals("Sulfures", app.items[0].name);
    assertEquals(2, app.items[0].sellIn);
    assertEquals(40, app.items[0].quality);
  }
}
