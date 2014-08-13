import java.io.*;
import java.lang.*;

class Tascudap_decrypt
{
  public static int a=0;

  public String c()
  {
    String str1 = new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf("")).append((char)46).toString())).append((char)99).toString())).append((char)111).toString() + (char)109;
    int i = 0;
    String str2;
    for (Object localObject = str1; ; localObject = str2)
    {
      if (i >= 23)
      {
        this.a = (1 + this.a);
        System.out.println((String)localObject);
        return (String)localObject;
      }
      int j = ((1 + this.a) * (2 + (i + this.a)) ^ (3 + this.a) * (4 + (i + this.a))) & (5 + this.a) * (6 + (i + this.a)) | (7 + this.a) * (8 + (i + this.a));
      if (j < 0)
        j *= -1;
      str2 = (char)(97 + j % 26) + (String)localObject;
      i++;
    }
  }
  public static void main (String args[])
  {
	Tascudap_decrypt d=new Tascudap_decrypt();
	String str = d.c();
	System.out.println ("\nDecyrpted String = "+str);
  }
}
