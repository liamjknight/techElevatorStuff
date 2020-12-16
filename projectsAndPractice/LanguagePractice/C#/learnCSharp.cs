public sealed class FirstClass : SuperClass, Iface
//sealed stops this from being able to have subclasses/be a superclass : moves to superclass/interface calls
{
private readonly int value; //readonly->needs setter
static int value;//
}