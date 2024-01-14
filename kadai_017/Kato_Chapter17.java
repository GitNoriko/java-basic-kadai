package kadai_017;
// 親クラス　抽象クラス
abstract public class Kato_Chapter17 {
	// 姓名と住所を表すフィールドを持つ
	final public String familyName = "加藤"; //姓を表す
	public String givenName = ""; // 名を表す
	final public String address = "東京都中野区○×"; //住所を表す
	
	// 共通の紹介を出力する
	public void commonIntroduce() {
		System.out.println(familyName);
	}
	// 抽象メソッド 個別の紹介をする、子クラス側でオーバーライドさせる
	abstract protected String eachIntroduce();
	
	// 紹介を実行する
	public void execIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です"); 
		System.out.println(eachIntroduce());
		
	}

}
