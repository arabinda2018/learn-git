package pac5;
/*converting Bigger data type into smaller data type
 * is called as explicit down casting.
 * 2.During conversion if there is any loss of data
 * then regard less of memory size we need to perform
 * explicity downcasting.
 * 
 
 */

public class B1 {
int i =1;
//byte j =i;
byte j =(byte)i;
}
class C1{
	long i =30;
	int j =(int)i;
	
}
class D1{
	float  i =10.3f;
	long j=(long)i;
	
}
class E
{
	float i =123.f;
	int j =(int)i;
}
class E1{
	long i =100;
	byte j =(byte)(int)i;
}
class F{
	int i =100;
	long j =(long)i;
}
