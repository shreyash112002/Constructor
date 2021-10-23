class Teacher
{
    private String sub;
    private String name;
    private double salary;
    public Teacher(String sub,String name,double salary)
    {
        this.sub=sub;
        this.name=name;
        this.salary=salary;

    }
    public void showData()
    {
        System.out.println(sub+","+name+","+salary);
    }

}
