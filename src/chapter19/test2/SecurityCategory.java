package chapter19.test2;

import chapter19.test1.Enums;

enum SecurityCategory {
	STOCK(Security.Stock.class),Bond(Security.Bond.class);
	Security[] values;
	
	private SecurityCategory(Class<? extends Security> kind) {
		values = kind.getEnumConstants();
	}

	interface Security{
		enum Stock implements Security{
			SHORT,LONG,MARGIN
		}
		enum Bond implements Security{
			MUNICIPAL,JUNK
		}
	}
	public Security randomSelection(){
		return Enums.random(values);
	}
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			SecurityCategory category = Enums.random(SecurityCategory.class);
			System.out.println(category+":"+category.randomSelection());
		}
	}
}
