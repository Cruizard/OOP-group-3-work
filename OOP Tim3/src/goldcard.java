public class goldcard extends cardtype {
    public goldcard(String clientname)
    {
        super(100000000, 10, 1000, clientname);
    }
    @Override
    public void info() {
        System.out.println("client info:\n" + "name:" + getClientname()+ "\n" + "cardtype:gold\n" +"limit:" + getTransferlimit()+ "\n" +"admin fee:" + getAdminfee()+ "\n" +"benefits: "+ getBenefits());
    }

}
