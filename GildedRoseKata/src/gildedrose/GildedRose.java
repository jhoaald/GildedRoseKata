package gildedrose;

import java.util.List;

public class GildedRose {
	int numeros;
	public void reducircalidad(Item item){
		item.setQuality(item.getQuality()-1);
	}
	public void subircantidad(Item item){
		item.setQuality(item.getQuality()+1);
	}
	public void menordeCincuenta(Item item){
		if(item.getQuality()<50){
			subircantidad(item);
		}
	}
	
	public void updateQuality(List<Item> items) {
		for (Item item : items) {

if (!item.getName().equals("Aged Brie") && !item.getName().equals("Backstage passes to a TAFKAL80ETC concert") && item.getQuality() > 0 && !item.getName().equals("Sulfuras, Hand of Ragnaros")) {
			
						reducircalidad(item);
				
			} else {
				menordeCincuenta(item);
				

					if (item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
						if (item.getSellIn() < 11) {
							menordeCincuenta(item);
						}

						if (item.getSellIn() < 6) {
							menordeCincuenta(item);
						}
					}
				
			}

			if (item.getName() != "Sulfuras, Hand of Ragnaros") {
				item.setSellIn(item.getSellIn() - 1);
			}

			if (item.getSellIn() < 0) {
				if (item.getName() != "Aged Brie") {
					if (item.getName() != "Backstage passes to a TAFKAL80ETC concert") {
						if (item.getQuality() > 0) {
							if (item.getName() != "Sulfuras, Hand of Ragnaros") {
								reducircalidad(item);
							}
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
