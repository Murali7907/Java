public class information
{
    public static void main(String args[])
    {
        cpu c1=new cpu();
        cpu.processor p1=c1.new processor();
        cpu.RAM ram=c1.new RAM();
        System.out.println("processor_cache="+p1.getcache());
        System.out.println("Ram_Clock_Speed="+ram.getclockspeed());
    }
}
public class cpu
{
    double price;
    
    class processor
    {
        double cores;
        String manufacture;
        double getcache()
        {
            return 4.3;
        }
    }
    protected class RAM
    {
        double memory;
        String manufacture;
        double getclockspeed()
        {
            return 5.5;
        }
    }
}
