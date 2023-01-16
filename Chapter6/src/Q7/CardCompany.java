package Q7;
import Q6.Card;

public class CardCompany {
    private static CardCompany instance = new CardCompany();
    private CardCompany(){}
    public static CardCompany getInstance(){
        if(instance == null) instance = new CardCompany();
        return instance;
    }
    public Card creatCard(String name){
        Card card = new Card(name);
        return card;
    }
}
