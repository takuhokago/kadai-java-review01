public class Review01 {

    public static void main(String[] args) {
        // 金額を定義
        int money = 1500;
        
        // 税率を定義
        int taxRate = 10;
        
        // 消費税額を求める
        int tax = tax(money, taxRate);
        
        // 税込み価格を求める
        int moneySum = money + tax;
        
        // 「○○円の商品の税込価格は○○円（消費税は○○円）です。」を表示
        System.out.println(money + "円の商品の税込み価格は" + moneySum + "円(消費税は" + tax + "円)です。");

    }
    
    public static int tax(int money, int taxRate) {
        int tax = Math.round(money * taxRate / 100);
        return tax;
    }

}
