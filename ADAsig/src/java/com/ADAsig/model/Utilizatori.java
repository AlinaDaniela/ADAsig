package com.ADAsig.model;

import com.ADAsig.util.PasswordHash;
import java.io.Serializable;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class Utilizatori implements Serializable {

    public Persoane persoana;
    private int idUtilizator;
    private String tipUtilizator;
    private String Email;
    private String Telefon;
    private String Parola;
    private String CodConfirmare;
    private int Status;
    private Map<String, Object> exceptieUtilizator;
    private Map<String, Object> valoriCorecte;
    private static final String EMAIL_PATTERN
            = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    // The following constants may be changed without breaking existing hashes.
    private static final String PBKDF2_ALGORITHM = "PBKDF2WithHmacSHA1";
    private static final int SALT_BYTE_SIZE = 24;
    private static final int HASH_BYTE_SIZE = 24;
    private static final int PBKDF2_ITERATIONS = 1000;
    private static final int ITERATION_INDEX = 0;
    private static final int SALT_INDEX = 1;
    private static final int PBKDF2_INDEX = 2;

    public Utilizatori(Persoane persoana, String tipUtilizator, String Email, String Telefon, String Parola, int Status) throws ExceptieUtilizator {

        exceptieUtilizator = new HashMap<>();
        valoriCorecte = new HashMap<>();

        Pattern EmailPattern;
        Matcher EmailMatcher;
        EmailPattern = Pattern.compile(EMAIL_PATTERN);
        EmailMatcher = EmailPattern.matcher(Email);

        Matcher PhoneMatcher;
        String PHONE_PATTERN = "^\\d{3})\\d{3})\\d{4}$";

        Pattern pattern = Pattern.compile(PHONE_PATTERN);
        PhoneMatcher = pattern.matcher(Telefon);

        if (!EmailMatcher.matches()) {
            exceptieUtilizator.put("eroareEmail", "Email-ul nu are formatul potrivit!");
        } else {
            this.Email = Email;
            valoriCorecte.put("email", Email);
        }

        if (!PhoneMatcher.matches()) {
            exceptieUtilizator.put("eroareTelefon", "Telefonul nu are formatul potrivit!");
        } else {
            this.Telefon = Telefon;
            valoriCorecte.put("telefon", Telefon);
        }

        if (Parola.length() < 6) {
            exceptieUtilizator.put("eroareParola", "Parola trebuie sa aiba minim 6 caracter!");
        } else {
            this.Parola = Parola;
        }

        this.persoana = persoana;
        //this.idUtilizator = idUtilizator;
        this.tipUtilizator = tipUtilizator;
        this.Status = Status;

        if (!exceptieUtilizator.isEmpty()) {
            throw new ExceptieUtilizator(exceptieUtilizator, valoriCorecte);
        }
    }

    public Utilizatori(String Nume, String Prenume, String tipUtilizator, String Email, String Telefon, String Parola, String reParola, int Status) throws ExceptieUtilizator {

        exceptieUtilizator = new HashMap<>();
        valoriCorecte = new HashMap<>();
        Map<String, Object> exceptiePersoana = new HashMap<>();
        Map<String, Object> valoriCorectePersoana = new HashMap<>();

        Pattern EmailPattern;
        Matcher EmailMatcher;
        EmailPattern = Pattern.compile(EMAIL_PATTERN);
        EmailMatcher = EmailPattern.matcher(Email);

        Matcher PhoneMatcher;
        String PHONE_PATTERN = "^\\d{3}\\d{3}\\d{4}$";

        Pattern pattern = Pattern.compile(PHONE_PATTERN);
        PhoneMatcher = pattern.matcher(Telefon);

        Persoane pers;

        try {
            pers = new Persoane(Nume, Prenume);
            this.persoana = pers;
            valoriCorecte.put("nume", Nume);
            valoriCorecte.put("prenume", Prenume);
        } catch (ExceptiePersoana exPersoana) {
            exceptiePersoana = exPersoana.getMesajHash();
            valoriCorectePersoana = exPersoana.getValoriCorecte();
        }

        if (exceptiePersoana != null) {
            for (Map.Entry<String, Object> entry : exceptiePersoana.entrySet()) {
                exceptieUtilizator.put(entry.getKey(), entry.getValue());
            }
        }

        if (valoriCorectePersoana != null) {
            for (Map.Entry<String, Object> entry : valoriCorectePersoana.entrySet()) {
                valoriCorecte.put(entry.getKey(), entry.getValue());
            }
        }

        if (!EmailMatcher.matches()) {
            exceptieUtilizator.put("eroareEmail", "Email-ul nu are formatul potrivit!");
        } else {
            this.Email = Email;
            valoriCorecte.put("email", Email);
        }

        if (!PhoneMatcher.matches()) {
            exceptieUtilizator.put("eroareTelefon", "Telefonul nu are formatul potrivit!");
        } else {
            this.Telefon = Telefon;
            valoriCorecte.put("telefon", Telefon);
        }

        if (Parola.length() < 6) {
            exceptieUtilizator.put("eroareParola", "Parola trebuie sa aiba minim 6 caracter!");
        } else if (!Parola.equals(reParola)) {
            exceptieUtilizator.put("eroareReParola", "Parolele trebuie sa fie identice!");
        } else {
            this.Parola = Parola;
        }

        //this.idUtilizator = idUtilizator;
        this.tipUtilizator = tipUtilizator;
        this.Status = Status;

        if (!exceptieUtilizator.isEmpty()) {
            throw new ExceptieUtilizator(exceptieUtilizator, valoriCorecte);
        }
    }

    public Utilizatori(String Email, String Parola) throws ExceptieUtilizator {

        exceptieUtilizator = new HashMap<>();
        valoriCorecte = new HashMap<>();

        Pattern EmailPattern;
        Matcher EmailMatcher;
        EmailPattern = Pattern.compile(EMAIL_PATTERN);
        EmailMatcher = EmailPattern.matcher(Email);

        if (!EmailMatcher.matches()) {
            exceptieUtilizator.put("eroareEmail", "Email-ul nu are formatul potrivit!");
        } else {
            this.Email = Email;
            valoriCorecte.put("email", Email);
        }

        if (Parola.length() < 6) {
            exceptieUtilizator.put("eroareParola", "Parola trebuie sa aiba minim 6 caracter!");
        } else {
            this.Parola = Parola;
        }

        if (!exceptieUtilizator.isEmpty()) {
            throw new ExceptieUtilizator(exceptieUtilizator, valoriCorecte);
        }
    }

    public Persoane getPersoana() {
        return persoana;
    }

    public void setPersoana(Persoane persoana) {
        this.persoana = persoana;
    }

    public int getIdUtilizator() {
        return idUtilizator;
    }

    public void setIdUtilizator(int idUtilizator) {
        this.idUtilizator = idUtilizator;
    }

    public String getTipUtilizator() {
        return tipUtilizator;
    }

    public void setTipUtilizator(String tipUtilizator) {
        this.tipUtilizator = tipUtilizator;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefon() {
        return Telefon;
    }

    public void setTelefon(String Telefon) {
        this.Telefon = Telefon;
    }

    public String getParola() {
        return Parola;
    }

    public void setParola(String Parola) {
        this.Parola = Parola;
    }

    public String getCodConfirmare() {
        return CodConfirmare;
    }

    public void setCodConfirmare(String CodConfirmare) {
        this.CodConfirmare = CodConfirmare;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }

    @Override
    public String toString() {
        return "Utilizatori{" + "idUtilizator=" + idUtilizator
                + ", Nume=" + persoana.getNume() + ", Prenume=" + persoana.getPrenume()
                + ", Email=" + Email + ", Telefon=" + Telefon + ", Parola=" + Parola + ", CodConfirmare="
                + CodConfirmare + ", Status=" + Status + ", DataInregistrare=" + persoana.getDataInregistrare() + '}';
    }

    public void usingCreateHash() {
        try {
            // Print out 10 hashes
            for (int i = 0; i < 10; i++) {
                System.out.println(PasswordHash.createHash("p\r\nassw0Rd!"));
            }

            // Test password validation
            boolean failure = false;
            System.out.println("Running tests...");
            for (int i = 0; i < 100; i++) {
                String password = "" + i;
                String hash = createHash(password);
                String secondHash = createHash(password);
                if (hash.equals(secondHash)) {
                    System.out.println("FAILURE: TWO HASHES ARE EQUAL!");
                    failure = true;
                }
                String wrongPassword = "" + (i + 1);
                if (validatePassword(wrongPassword, hash)) {
                    System.out.println("FAILURE: WRONG PASSWORD ACCEPTED!");
                    failure = true;
                }
                if (!validatePassword(password, hash)) {
                    System.out.println("FAILURE: GOOD PASSWORD NOT ACCEPTED!");
                    failure = true;
                }
            }
            if (failure) {
                System.out.println("TESTS FAILED!");
            } else {
                System.out.println("TESTS PASSED!");
            }
        } catch (Exception ex) {
            System.out.println("ERROR: " + ex);
        }
    }

    public static String createHash(String password)
            throws NoSuchAlgorithmException, InvalidKeySpecException {

        return createHash(password.toCharArray());
    }

    public static String createHash(char[] password)
            throws NoSuchAlgorithmException, InvalidKeySpecException {
        // Generate a random salt
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[SALT_BYTE_SIZE];
        random.nextBytes(salt);

        // Hash the password
        byte[] hash = pbkdf2(password, salt, PBKDF2_ITERATIONS, HASH_BYTE_SIZE);
        // format iterations:salt:hash
        return PBKDF2_ITERATIONS + ":" + toHex(salt) + ":" + toHex(hash);
    }

    /**
     * Validates a password using a hash.
     *
     * @param password the password to check
     * @param correctHash the hash of the valid password
     * @return true if the password is correct, false if not
     */
    public boolean validatePassword(String password, String correctHash)
            throws NoSuchAlgorithmException, InvalidKeySpecException {
        return validatePassword(password.toCharArray(), correctHash);
    }

    /**
     * Validates a password using a hash.
     *
     * @param password the password to check
     * @param correctHash the hash of the valid password
     * @return true if the password is correct, false if not
     */
    public static boolean validatePassword(char[] password, String correctHash)
            throws NoSuchAlgorithmException, InvalidKeySpecException {
        // Decode the hash into its parameters
        String[] params = correctHash.split(":");
        int iterations = Integer.parseInt(params[ITERATION_INDEX]);
        byte[] salt = fromHex(params[SALT_INDEX]);
        byte[] hash = fromHex(params[PBKDF2_INDEX]);
        // Compute the hash of the provided password, using the same salt, 
        // iteration count, and hash length
        byte[] testHash = pbkdf2(password, salt, iterations, hash.length);
        // Compare the hashes in constant time. The password is correct if
        // both hashes match.
        return slowEquals(hash, testHash);
    }

    /**
     * Compares two byte arrays in length-constant time. This comparison method
     * is used so that password hashes cannot be extracted from an on-line
     * system using a timing attack and then attacked off-line.
     *
     * @param a the first byte array
     * @param b the second byte array
     * @return true if both byte arrays are the same, false if not
     */
    private static boolean slowEquals(byte[] a, byte[] b) {
        int diff = a.length ^ b.length;
        for (int i = 0; i < a.length && i < b.length; i++) {
            diff |= a[i] ^ b[i];
        }
        return diff == 0;
    }

    /**
     * Computes the PBKDF2 hash of a password.
     *
     * @param password the password to hash.
     * @param salt the salt
     * @param iterations the iteration count (slowness factor)
     * @param bytes the length of the hash to compute in bytes
     * @return the PBDKF2 hash of the password
     */
    private static byte[] pbkdf2(char[] password, byte[] salt, int iterations, int bytes)
            throws NoSuchAlgorithmException, InvalidKeySpecException {
        PBEKeySpec spec = new PBEKeySpec(password, salt, iterations, bytes * 8);
        SecretKeyFactory skf = SecretKeyFactory.getInstance(PBKDF2_ALGORITHM);
        return skf.generateSecret(spec).getEncoded();
    }

    /**
     * Converts a string of hexadecimal characters into a byte array.
     *
     * @param hex the hex string
     * @return the hex string decoded into a byte array
     */
    private static byte[] fromHex(String hex) {
        byte[] binary = new byte[hex.length() / 2];
        for (int i = 0; i < binary.length; i++) {
            binary[i] = (byte) Integer.parseInt(hex.substring(2 * i, 2 * i + 2), 16);
        }
        return binary;
    }

    /**
     * Converts a byte array into a hexadecimal string.
     *
     * @param array the byte array to convert
     * @return a length*2 character string encoding the byte array
     */
    private static String toHex(byte[] array) {
        BigInteger bi = new BigInteger(1, array);
        String hex = bi.toString(16);
        int paddingLength = (array.length * 2) - hex.length();
        if (paddingLength > 0) {
            return String.format("%0" + paddingLength + "d", 0) + hex;
        } else {
            return hex;
        }
    }

}
