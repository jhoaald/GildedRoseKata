package gildedrose;

import java.util.List;

public class GildedRose extends Metodos{
	int numeros;

	public void updateQuality(List<Item> items) {
		for (Item item : items) {

if (!item.getName().equals("Aged Brie") && !item.getName().equals("Backstage passes to a TAFKAL80ETC concert")
		&& item.getQuality() > 0 && !item.getName().equals("Sulfuras, Hand of Ragnaros")) {
						reducircalidad(item);
			} else {
				menordeCincuenta(item);
			    backstage(item);
				
			}

			if (item.getName() != "Sulfuras, Hand of Ragnaros") {
				item.setSellIn(item.getSellIn() - 1);
			}

			if (item.getSellIn() < 0) {
				if (item.getName() != "Aged Brie") {
					if (item.getName() != "Backstage passes to a TAFKAL80ETC concert") {
						if (item.getQuality() > 0 && item.getName() != "Sulfuras, Hand of Ragnaros") {
								reducircalidad(item);
							
						}
					} else {
						item.setQuality(item.getQuality() - item.getQuality());
					}
				} else {
					menordeCincuenta(item);
				}
			}
		}
	}

}
