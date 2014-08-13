import java.io.*;
import java.lang.Object;

public class Vdloader_decrypt
{
  private static byte a(char paramChar)
  {
    return (byte)"0123456789ABCDEF".indexOf(paramChar);
  }

  public static String a(String paramString)
  {
    String str;
    if ((paramString == null) || (paramString.length() == 0))
    {
      str = paramString;
      return str;
    }
    byte[] arrayOfByte = c(paramString);
    for (int i = 0; ; i++)
    {
      if (i >= arrayOfByte.length)
      {
        str = new String(arrayOfByte);
        break;
      }
      arrayOfByte[i] = (byte)(arrayOfByte[i] - i);
    }
    return str;
  }

  public static String b(String paramString)
  {
    return paramString;
  }

  public static byte[] c(String paramString)
  {
    Object localObject;
    if ((paramString == null) || (paramString.equals("")))
    {
      localObject = null;
      return null;
    }
    String str = paramString.toUpperCase();
    int i = str.length() / 2;
    char[] arrayOfChar = str.toCharArray();
    byte[] arrayOfByte = new byte[i];
    for (int j = 0; ; j++)
    {
      if (j >= i)
      {
        localObject = arrayOfByte;
        break;
      }
      int k = j * 2;
      arrayOfByte[j] = (byte)(a(arrayOfChar[k]) << 4 | a(arrayOfChar[(k + 1)]));
    }
    return arrayOfByte;
  }
  public static void main(String args[])
  {
	Vdloader_decrypt d = new Vdloader_decrypt();
	String str=d.a("7B237868263F283F36392C372E7B7183324B3443364138807B8D3C553E4D404B42849796465F8149909D9E9B665C5D909193949697999A9C9D679DAAA977766F787171B372AFB9B76AA6766DBFB6708972838284768178BAC17B947D8D7FDB");
	System.out.println ("Decryption result = "+str);
	System.out.println ("End");
  }
}
