import org.apache.ofbiz.base.crypto.HashCrypt;

public class MyCryptExample {

  public static void main(String[] args) {
    String pass = "s3cret-pa$$word";
    if (args.length == 1) {
      pass = args[0];
    }
    System.out.println("Encrypt password " + pass );
    var encrypted = HashCrypt.pbkdf2HashCrypt("PBKDF2WithHmacSHA256", "", pass);
    System.out.println("Encrypted password is" + encrypted);
  }
}
