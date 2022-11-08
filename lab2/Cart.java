
import java.util.*;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED= 20;
	private int qtyOrdered=0;
	private DigitalVideoDisc itemsOdered[]= new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered==MAX_NUMBERS_ORDERED-1) {
			System.out.println("The cart is almost full");
		}
		else {
			itemsOdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc has been added");
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for(int i=0;i<qtyOrdered;i++) {
			if(itemsOdered[i]==disc) {
				if(i==qtyOrdered-1) {
					qtyOrdered--;
				}
				else {
					for(int j=i+1;j<qtyOrdered;j++) {
						itemsOdered[j]=itemsOdered[j-1];
					}
					qtyOrdered--;
				}
			}
		}
		
	}
	public float totalCost() {
		float sumCost=0;
		for(int i=0;i<qtyOrdered;i++) {
			sumCost+=itemsOdered[i].getCost();
		}
		return sumCost;
	}
	
}
