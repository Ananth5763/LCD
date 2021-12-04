public class Bookdemo{
	public static void main(String[] args) {
		BookShop b1=new BookShop(2,3);
		BookShop b2=new BookShop("harsha");
		//System.out.println(b1.bookprice(2));
		System.out.println(b1.bookprice());
		System.out.println(b2.book());
		

	}
}