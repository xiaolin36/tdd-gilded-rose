package cn.xpbootcamp.gilded_rose;

public class GildedRose {
  Item[] items;

  public GildedRose(Item[] items) {
    this.items = items;
  }

  public void updateQuality() {
    for (int i = 0; i < items.length; i++) {
      if (items[i].name != "Sulfures") {
        items[i].sellIn = items[i].sellIn - 1;

        if (items[i].name == "Aged Brie") {
          if (items[i].quality < 50) {
            items[i].quality = items[i].quality + 1;
          }
        } else if (items[i].name == "Backstage pass") {
          if (items[i].sellIn < 0) {
            items[i].quality = 0;
          } else {
            if (items[i].quality < 50) {
              if (items[i].sellIn > 10) {
                items[i].quality = items[i].quality + 1;
              } else if (items[i].sellIn <= 10 && items[i].sellIn > 5) {
                items[i].quality = items[i].quality + 2;
              } else {
                items[i].quality = items[i].quality + 3;
              }
            } else {
              items[i].quality = 50;
            }
          }

        } else {
          if (items[i].sellIn >= 0) {
            if (items[i].quality > 0) {
              items[i].quality = items[i].quality - 1;
            }
          } else {
            if (items[i].quality > 1) {
              items[i].quality = items[i].quality - 2;
            }
          }
        }
      }

    }
  }
}
