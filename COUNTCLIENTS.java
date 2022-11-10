
public class COUNTCLIENTS {

    private   int CLIENTe;

    public COUNTCLIENTS()
    {
        CLIENTe=0;
    }
    public void click()
    {
        CLIENTe=CLIENTe+1;
    }
    public void reset()
    {
        CLIENTe = 0;
    }
    public void undo()
    {if (CLIENTe>0)
        CLIENTe=CLIENTe-1;
    }
    public   int setLimit(int maximum)
    {
        return CLIENTe= Math.min(CLIENTe,maximum);
    }
    public int getValue()
    {
        return CLIENTe;
    }
}
