package application;

public class Donut extends MenuItem {
	
	enum DonutTypes { YEASTDONUT, CAKEDONUT, DONUTHOLES} 
	
	enum YeastFlavors { JELLYFILLED, BOSTONKREME, STRAWBERRYLEMONSWIRL }
	
	enum CakeFlavors {	MAPLEFROSTED, BLUEBERRYCAKE, ICECREAMCAKE}
	
	enum HoleFlavors { CHOCOLOCO, GLAZED, BERRYBEAUTIFUL}
	
	
	private static final int ONE = 1;
	private static final int TWO = 2;
	private static final int THREE = 3;
	private static final int YEAST = 1;
	private static final int CAKE = 2;
	private static final int HOLE = 3;
	private static final double YEASTPRICE= 1.39;
	private static final double CAKEPRICE= 1.59;
	private static final double HOLEPRICE= 0.33;

	private DonutTypes myType;
	private YeastFlavors myYFlav;
	private CakeFlavors myCFlav;
	private HoleFlavors myHFlav;
	
	public Donut(int number, int type, int flavor) {
		super();
		super.setQuantity(number);
		
		switch(type) 
		{
		case YEAST:
			super.setPrice(YEASTPRICE);
			this.myType = DonutTypes.YEASTDONUT;
			
			switch(flavor) 
			{
			case ONE:
				this.myYFlav = YeastFlavors.JELLYFILLED;
				break;
			case TWO:
				this.myYFlav = YeastFlavors.BOSTONKREME;
				break;
			case THREE:
				this.myYFlav = YeastFlavors.STRAWBERRYLEMONSWIRL;
				break;
			}
			
			break;
		case CAKE:
			super.setPrice(CAKEPRICE);
			this.myType = DonutTypes.CAKEDONUT;
			
			switch(flavor) 
			{
			case ONE:
				this.myCFlav = CakeFlavors.MAPLEFROSTED ;
				break;
			case TWO:
				this.myCFlav =CakeFlavors.BLUEBERRYCAKE;
				break;
			case THREE:
				this.myCFlav = CakeFlavors.ICECREAMCAKE;
				break;
			}
			
			break;
		case HOLE:
			super.setPrice(HOLEPRICE);
			this.myType = DonutTypes.DONUTHOLES;
			
			switch(flavor) 
			{
			case ONE:
				this.myHFlav = HoleFlavors.CHOCOLOCO;
				break;
			case TWO:
				this.myHFlav = HoleFlavors.GLAZED;
				break;
			case THREE:
				this.myHFlav = HoleFlavors.BERRYBEAUTIFUL;
				break;
			}
		
			break;
		}
	}
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		String myDonut = "";
		
		if (this.myType == DonutTypes.YEASTDONUT) {
			if (this.myYFlav == YeastFlavors.JELLYFILLED) {
				myDonut = myDonut + "jelly filled(";
			}
			else if (this.myYFlav == YeastFlavors.BOSTONKREME) {
				myDonut = myDonut + "boston kreme(";
			}
			else if (this.myYFlav == YeastFlavors.STRAWBERRYLEMONSWIRL) {
				myDonut = myDonut + "strawberry-lemon swirl(";
			}
		}
		else if (this.myType == DonutTypes.CAKEDONUT) {
			if (this.myCFlav == CakeFlavors.BLUEBERRYCAKE) {
				myDonut = myDonut + "blueberry cake(";
			}
			else if (this.myCFlav == CakeFlavors.ICECREAMCAKE) {
				myDonut = myDonut + "ice-creame cake(";
			}
			else if (this.myCFlav == CakeFlavors.MAPLEFROSTED) {
				myDonut = myDonut + "maple frosted(";
			}
		}
		else if (this.myType == DonutTypes.DONUTHOLES) {
			if (this.myHFlav == HoleFlavors.BERRYBEAUTIFUL) {
				myDonut = myDonut + "berry beautiful(";
			}
			else if (this.myHFlav == HoleFlavors.CHOCOLOCO) {
				myDonut = myDonut + "choco loco(";
			}
			else if (this.myHFlav == HoleFlavors.GLAZED) {
				myDonut = myDonut + "glazed(";
			}
		}
		
		myDonut = myDonut + super.quantity + ")";
		
		return myDonut;
	}
}