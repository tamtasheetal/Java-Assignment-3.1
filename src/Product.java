
public class Product {
	public int Barcode;

	// INSTANCE VARIABLE
	public static class Main {

	    public static void main(String[] args) {

	        Product prod1 = new Product();
	        prod1.Barcode = 123456;

	        Product prod2 = new Product();
	        prod2.Barcode = 987654;

	        System.out.println(prod1.Barcode);
	        System.out.println(prod2.Barcode);
	    }
	}

	 {
	    int Barcode;
	}
// CLASS VARIABLE
        public static void main(String[] args) {

            Product prod1 = new Product();
            prod1.setBarcode1(123456);
            Product prod2 = new Product();
            prod2.setBarcode2(987654);

            System.out.println(prod1.getBarcode1());
            System.out.println(prod2.getBarcode2());
        }

        private char[] getBarcode1() {
	// TODO Auto-generated method stub
	return null;
}

		public int getBarcode2() {
			// TODO Auto-generated method stub
			return Barcode;
		}

		public void setBarcode2(int i) {
			// TODO Auto-generated method stub
			
		}

		public void setBarcode1(int value){
            Barcode = value;
        }
	public void setBarcode(int i) {
		// TODO Auto-generated method stub
		
	}

	public char[] getBarcode() {
		// TODO Auto-generated method stub
		return null;
	}
}


	