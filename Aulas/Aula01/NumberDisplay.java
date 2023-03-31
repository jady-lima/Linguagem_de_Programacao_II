public class NumberDisplay
{    
    //CAMPOS
    private int limit;
    private int value;

    //CONSTRUTOR
    public NumberDisplay()
    {
        limit = 0;
        value = 0;
    }

    //MÉTODOS DE ACESSO DO LIMIT (GET)
    public int getLimit()
    {
        return limit;
    }

    //MÉTODO DE EDIÇÃO DO LIMIT (SET)
    public void setLimit(int l) 
    {
        limit = l;
    }

    //MÉTODO DE ACESSO DO VALUE (GET)
    public int getValue()
    {
        return value;
    }

    //MÉTODO DE EDIÇÃO DO VALUE (SET)
    public void setValue(int v)
    {
        value = v;
    }

}