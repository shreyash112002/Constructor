 class Account3
{
    private int accid;
    private String name;
    private double bal;
    public Account3(int accid, String name, double bal)
    {
        this.accid=accid;
        this.name=name;
        this.bal=bal;
    }
        public void showData()
        {
            System.out.println(accid+","+bal+","+name);
        }
}
