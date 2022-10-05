public class cardtype {
    private String clientname;
    private int transferlimit ;
    private int adminfee ;
    private int benefits ;

    public cardtype(int transferlimit, int adminfee, int benefits, String clientname)
    {
        this.transferlimit = transferlimit;
        this.adminfee = adminfee;
        this.benefits = benefits;
        this.clientname = clientname;
    }

    public int getTransferlimit() {
        return transferlimit;
    }

    public void setTransferlimit(int transferlimit) {
        this.transferlimit = transferlimit;
    }

    public int getAdminfee() {
        return adminfee;
    }

    public void setAdminfee(int adminfee) {
        this.adminfee = adminfee;
    }

    public int getBenefits() {
        return benefits;
    }

    public void setBenefits(int benefits) {
        this.benefits = benefits;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public void info()
    {

    }
}

