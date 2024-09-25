package MyPackage;

public class Age extends Exception
{
    public int details;

    public Age(int a)
    {
        details = a;
    }
    public String toString()
    {
        return "We Will Not Be Responsible For Any Mishaps Occuring At [" + details + "] This specific age";
    }
}