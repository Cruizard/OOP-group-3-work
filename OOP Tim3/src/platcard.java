public class platcard extends cardtype {

    public platcard(String clientname)
    {
        super(1000000000, 1, 10000, clientname);
    }
    @Override
    public void info() {
        System.out.println("client info:\n" + "name:" + getClientname()+ "\n" + "cardtype:paltinum\n" +"limit:" + getTransferlimit()+ "\n" +"admin fee:" + getAdminfee()+ "\n" +"benefits: "+ getBenefits());
    }
}
