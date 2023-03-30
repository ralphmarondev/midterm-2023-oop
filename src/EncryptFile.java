public class EncryptFile
{
    private String message_to_be_encrypted;
    EncryptFile(String message)
    {
        this.message_to_be_encrypted = message;
    }
    public String get_encrypted_message()
    {
        return encrypt(this.message_to_be_encrypted);
    }

    public String encrypt(String raw_message)
    {
        String my_final_message = "";
        String rmessage = raw_message;
//        System.out.println(message);
        String message = rmessage.replace(" ", "");
//        System.out.println(message);

        // checking if the count of string is divisible by 4
        // if it is then we can perform the cipher, otherwise
        // we will fill the slot with 'x'
        int length = message.length();
        int count_lack = 0;
        if (length % 4 != 0)
        {
            count_lack++;
        }
        for (int i = 0; i < count_lack; i++)
        {
            message += "X";
        }
        // end of process

        String m1 = "", m2 = "", m3 = "", m4 = "", m5 = "", m6 = "", m7 = "", m8 = "", m9 = "";

        int j = 0, k = 1;
        for (int i = 0; i < message.length(); i++)
        {
            if(j < 4)
            {
                switch (k)
                {
                    case 1:
                        m1 += message.charAt(i);
                        System.out.println("m1: " + m1);

                        if (j == 3)
                        {
                            my_final_message += switch_chars(m1);
                        }
                        System.out.println(my_final_message);


                        break;
                    case 2:
                        m2 += message.charAt(i);
                        System.out.println("m2: " + m2);

                        if (j == 3)
                        {
                            my_final_message += switch_chars(m2);
                        }
                        System.out.println(my_final_message);
                        break;
                    case 3:
                        m3 += message.charAt(i);
                        System.out.println("m3: " + m3);

                        if (j == 3)
                        {
                            my_final_message += switch_chars(m3);
                        }
                        System.out.println(my_final_message);
                        break;
                    case 4:
                        m4 += message.charAt(i);
                        System.out.println("m4: " + m4);

                        if (j == 3)
                        {
                            my_final_message += switch_chars(m4);
                        }
                        System.out.println(my_final_message);
                        break;
                    case 5:
                        m5 += message.charAt(i);
                        System.out.println("m5: " + m5);

                        if (j == 3)
                        {
                            my_final_message += switch_chars(m5);
                        }
                        System.out.println(my_final_message);
                        break;
                    case 6:
                        m6 += message.charAt(i);
                        System.out.println("m6: " + m6);

                        if (j == 3)
                        {
                            my_final_message += switch_chars(m6);
                        }
                        System.out.println(my_final_message);
                        break;
                    case 7:
                        m7 += message.charAt(i);
                        System.out.println("m7: " + m7);

                        if (j == 3)
                        {
                            my_final_message += switch_chars(m7);
                        }
                        System.out.println(my_final_message);
                        break;
                    case 8:
                        m5 += message.charAt(i);
                        System.out.println("m8: " + m8);

                        if (j == 3)
                        {
                            my_final_message += switch_chars(m8);
                        }
                        System.out.println(my_final_message);
                        break;
                    case 9:
                        m9 += message.charAt(i);
                        System.out.println("m9: " + m9);

                        if (j == 3)
                        {
                            my_final_message += switch_chars(m9);
                        }
                        System.out.println(my_final_message);
                        break;
                }
                j++;
            }
            else
            {
                i -= 1;
                k++;
                j = 0;
            }
        }

        System.out.println(my_final_message);

        return my_final_message;

    }

    static String switch_chars(String message)
    {
        String new_message = "";

        new_message += message.charAt(1);
        new_message += message.charAt(3);
        new_message += message.charAt(0);
        new_message += message.charAt(2);

        return new_message;
    }
}
