 class Account2
{
    private int accid;
    private String name;
    private double bal;

    public Account2()
    {
        accid=1234;
        name="sam";
        bal=56.00;

    }
    void showData()
    {
        System.out.println(accid+","+name+","+bal);
    }
}
