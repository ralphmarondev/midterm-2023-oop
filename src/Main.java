// 10:05am
// MIDTERM: hands on exam OOP
// Write a java program that uses the block cipher or transposition cipher.
// It is based on the permutation of the set [1,2,3,4] with f[0] = 3, f[2] = 1,
// f[3] = 4, and f[4] = 2, encrypt the plaintext computer engineering, and
// write the encrypted file in a file named 'Secret.txt' 100 pts.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String message, write_to_file;

        System.out.print("Enter message to be encrypted: ");
        message = sc.nextLine();

        // encrypting message
        EncryptFile encrypt = new EncryptFile(message);
        write_to_file  = encrypt.get_encrypted_message();
        System.out.println(write_to_file);
        System.out.println(write_to_file); // to print the message on the console

        // writing the encrypted file to a file
        CreatingFile create_file = new CreatingFile();
        create_file.create_file(write_to_file);
    }


}

