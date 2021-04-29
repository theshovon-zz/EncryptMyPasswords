package saha.shovon.the.encryptpasswords;
//ceaser
public class encrypter {





    public String encrypt(String msg, int shift){


        char temp;
        for (int i=0; i <= msg.length(); i++) {


                if (islower(msg[i])) {
                    temp = ((msg[i] - 'a') + key) % 26 + 'a';
                    printf("%c", temp);
                }
                else{
                    temp = ((msg[i] - 'A') + key) % 26 + 'A';

                }
            }else{
                printf("%c", msg[i]);
            }





        return
    }



}
