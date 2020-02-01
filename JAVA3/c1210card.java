import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Card{         //牌类
    public String suit;
    public int rank;

    public Card(String suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return String.format("[%s %d]",suit,rank);
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}




public class c1210card {
    public static final String[] suits = {"♥","♦","♣","♠"};

    public List<Card> buypook(){        //牌组
        List<Card> a1 = new ArrayList<>();

        for(int i =0;i<4;i++){
            for(int j =1;j<=13;j++){
                String suit = suits[i];
                //int rank = j;
                Card card = new Card(suit,j);
                a1.add(card);
            }
        }
        return a1;

    }


    private void swap(List<Card> a, int start,int end){
        Card j=a.get(end);
         a.set(end,a.get(start));
         a.set(start,j);
    }


    public void shuffle(List<Card>  a){
        Random random = new Random();
        for (int i = a.size()-1;i>0;i--){
            int index = random.nextInt(i); //在0到i范围内产生随机数   左闭右开
            swap(a,i,index);
        }
    }


}
