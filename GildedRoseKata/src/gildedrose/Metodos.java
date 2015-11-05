package gildedrose;

public class Metodos {
	

	public void backstage(Item item){
		if (item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
			if (item.getSellIn() < 11) {
				menordeCincuenta(item);
			}
			if (item.getSellIn() < 6) {
				menordeCincuenta(item);
			}
		}
	}

	public void reducircalidad(Item item){
		if (item.getQuality() == 0 || item.getQuality() < 0 ){
			item.setQuality(0);
		}else if(item.getQuality() > 0 ){
			item.setQuality(item.getQuality()-1);
		}
	}
	
	public void subircantidad(Item item){
		item.setQuality(item.getQuality()+1);
	}
	
	public void menordeCincuenta(Item item){
		if(item.getQuality()<50){
			subircantidad(item);
		}
	}

}
