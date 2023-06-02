package lab5_oop;

import java.util.TreeMap;

public class App {

    public static void main(String[] args) {
        // ne mijenjati
        String filepath = "UsersFile.bin";
        // prvi User -> "Name_01", "mail_01@company.org"
        User user1 = new User("Name_01", "mail_01@company.org");
        // drugi User -> "Name_02", "mail_02@network.net"
        User user2 = new User("Name_02", "mail_02@network.net");
        // treći User -> "Name_03", "mail_03@organization.com"
        User user3 = new User("Name_03", "mail_03@organization.com");
        // TreeMap users
        TreeMap<Integer, User> users = new TreeMap<>();
        // staviti sve korisnike u tu mapu
        users.put(1, user1);
        users.put(2, user2);
        users.put(3,user3);
        // spremi mapu u datoteku -> filepath
        SerDeserial.saveUsr2File(filepath, users);
        // rekonstruiraj podatke iz datoteke
        SerDeserial.readUsr4File(filepath);
    }
}
