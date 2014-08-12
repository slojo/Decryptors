import java.io.File;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class DesUtils
{
	public static final String KEY="gjaoun";
	public byte[] decrypt(byte[] paramArrayOfByte)
    throws Exception
  {
    return this.decryptCipher.doFinal(paramArrayOfByte);
	}
	private Cipher decryptCipher = null;

  public DesUtils()
    throws Exception
  {
    this("gjaoun");
  }

  public DesUtils(String paramString)
    throws Exception
  {
    Key localKey = getKey(paramString.getBytes());
    this.decryptCipher = Cipher.getInstance("DES");
    this.decryptCipher.init(2, localKey);
  }
  private Key getKey(byte[] paramArrayOfByte)
    throws Exception
  {
    byte[] arrayOfByte = new byte[8];
    for (int i = 0; ; i++)
    {
      if ((i >= paramArrayOfByte.length) || (i >= arrayOfByte.length))
        return new SecretKeySpec(arrayOfByte, "DES");
      arrayOfByte[i] = paramArrayOfByte[i];
    }
  }
	private void decryptResource()
    throws Exception
	{
	      InputStream localInputStream = new FileInputStream("ds");
	      int i = localInputStream.available();
	      byte[] arrayOfByte1 = new byte[i];
	      localInputStream.read(arrayOfByte1, 0, i);
	      byte[] arrayOfByte2 = new DesUtils("gjaoun").decrypt(arrayOfByte1);
	      FileOutputStream localFileOutputStream = new FileOutputStream("Decrypted");
	     localFileOutputStream.write(arrayOfByte2);
	     localFileOutputStream.close();
	}
  public static void main (String args[])
    throws Exception
  {
    DesUtils d = new DesUtils();
    d.decryptResource();
  }
}


