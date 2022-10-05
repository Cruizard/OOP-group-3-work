public class silvercard extends cardtype
{

    public silvercard(String clientname)
    {
        super(1000000, 100, 10, clientname);
    }

    @Override
    public void info() {
        System.out.println("client info:\n" + "name:" + getClientname()+ "\n" + "cardtype:silver\n" +"limit:" + getTransferlimit()+ "\n" +"admin fee:" + getAdminfee()+ "\n" +"benefits: "+ getBenefits());
    }
}
