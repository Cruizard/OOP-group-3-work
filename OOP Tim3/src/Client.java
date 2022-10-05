public class Client
{
    public String clientname;
    public cardtype card;

    public int clientamount = 0;


    public String getclientname()

    {
        return clientname;
    }

    public cardtype getcard()
    {
        return card;
    }

    public void addclient()
    {
        clientamount++;
    }

////    public Client(String askedName, String askedType ){
////        this.clientname = askedName;
////        this.cardtype = askedType;
//
//    }
}