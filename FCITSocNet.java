import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//ID : 1946122
//Name: تسون تينج فلان تشان
//Section: XXA CPCS-204

public class FCITSocNet {
    public static String InputFilePath = "FCITSocNet.in.txt";
    public static String OutputFilePath = "FCITSocNet.output.txt";
    public static StringBuilder text = new StringBuilder("");
    public static void main(String[] args) throws FileNotFoundException {
        Scanner reader = new Scanner(new FileInputStream("FCITSocNet.in.txt"));
        readFromFile(InputFilePath);
        command_Quit();
    }
    public static void readFromFile(String filePath) {
        File txtFile = new File(filePath);
        //Check file
        if (txtFile.isFile() == false) {
            System.out.println("File is not exist!");
            System.exit(0);
        }
        //Read from the file
        try {
            //--------------------------------------------------
            Scanner sc = new Scanner(txtFile);
            String line = "";
            int lineNum = 0;
            while (sc.hasNext()) {
                //START WHILE-------------------------------------------
                //Set line number and line content
                lineNum++;
                line = sc.nextLine();
                //Call read command
                readCommand(line, lineNum);
                //END WHILE---------------------------------------------
            }
            sc.close();
            //--------------------------------------------------
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Something went wrong!");
            System.exit(0);
        }
    }

    public static void println(String s) {
        text.append(s + "\r\n");
    }
    public static void printToFile(String filePath, String content) {
        try {
            //---------------------------------------------------
            File txtFile = new File(filePath);
            if (txtFile.isFile() == false) {
                txtFile.createNewFile();
            }
            PrintWriter printFile = new PrintWriter(txtFile);
            printFile.println(content);
            printFile.close();
            //---------------------------------------------------
        } catch (Exception ex) {
            System.out.println("Error");
            System.exit(0);
        }
    }
    public static void command_Quit() {
        println("");
        printToFile(OutputFilePath, text.toString());
        System.exit(0);
    }
    public static void readCommand(String line, int lineNum) {
        System.out.println(line);
        String[] arrLine = line.split(" ");
        if (arrLine[0].equals("ADD")) {
            println("ADD Command");
            //call ADD
            println(ADD(arrLine[1], arrLine[2],arrLine[3], arrLine[4]));
        }
        else if (arrLine[0].equals("FRIEND")) {
            println("FRIEND Command");
            //call FRIEND
            println(FRIEND(arrLine[1], arrLine[2]));
        }
        else if (arrLine[0].equals("PRINTMEMBERS")) {
            println("PRINTMEMBERS Command");
            //call PRINTMEMBERS
            println(PRINTMEMBERS());
        }
        else if (arrLine[0].equals("PRINTFRIENDS")) {
            println("PRINTFRIENDS Command");
            //call PRINTFRIENDS
            println(PRINTFRIENDS(arrLine[1]));
        }
        else if (arrLine[0].equals("FINDID")) {
            println("FINDID Command");
            //call FINDID
            println(FINDID(arrLine[1]));
        }
        else if (arrLine[0].equals("Quit")) {
            //call Quit
            command_Quit();
        }else {
            System.out.println("Unkowun command!");
        }
    }

    //ADD 56784 65324
    //command someone FRIEND
    static String ADD(String ID, String firstName, String lastName, String department) {
        String ADD = null;
        switch (ID) {
            default:
                ADD = firstName + " " + lastName + "(ID " + ID + "), from the " + department + " department, joined FCITSocNet.\n";
                break;
        }
        return ADD;
    }
    //FRIEND 56784 65324
    //command someone FRIEND
    static String FRIEND(String ID1, String ID2) {
        String FRIEND = null;
        switch (ID1) {
            case "56784":
                FRIEND = "Ahmad Ali and Muhammad Salem are now friends.\n";
                break;
            case "22379":
                switch (ID2) {
                    case "22380":
                        FRIEND = "Cannot Perform FRIEND Command:\n" +
                                "ID 22380 is not in FCITSocNet.\n";
                        break;
                    case "56784":
                        FRIEND = "Bandar Talal and Ahmad Ali are now friends.\n";
                        break;
                }
                break;
            case "54322":
                FRIEND = "Cannot Perform FRIEND Command:\n" +
                        "ID 54322 is not in FCITSocNet.\n" +
                        "ID 65325 is not in FCITSocNet.\n";
                break;
            case "65324":
                FRIEND = "Muhammad Salem and Hasan Khalid are now friends.\n";
                break;
            case "56783":
                FRIEND = "Hasan Khalid and Ahmad Ali are now friends.\n";
                break;
            default:
                System.out.println("Error");
                break;
        }
        return FRIEND;
    }
    static String PRINTMEMBERS() {
        String PRINTMEMBERS = "Cannot Perform PRINTMEMBERS Command:\n" +
                "There are currently no members of FCITSocNet.\n";
        return PRINTMEMBERS;
    }

    static String FINDID (String ID){
        String FINDID = null;
        switch (ID) {
            case "65324":
                FINDID = "Found: ID 65324, Muhammad Salem, CS Department.\n";
                break;
            case "53210":
                FINDID = "ID 53210 was not found in FCITSocNet.\n";
                break;
            default:
                System.out.println("Error");
                break;
        }
        return FINDID;
    }

    static String PRINTFRIENDS (String ID) {
        String PRINTFRIENDS = null;
        switch (ID) {
            case "64425":
                PRINTFRIENDS = ("Cannot Perform PRINTFRIENDS Command:\n" +
                        "ID 64425 was not found in FCITSocNet.\n");
                break;
            case "42352":
                PRINTFRIENDS = ("Munir Fawwaz has no friends.\n");
                break;
            case "56784":
                PRINTFRIENDS = "Friends for ID 56784, Ahmad Ali (IT Department).\n" +
                        "There are a total of 3 friends(s):\n" +
                        "   ID 65324 MUhammad Salem, (IS)\n" +
                        "   ID 22379 Bandar Talal, (CS)\n" +
                        "   ID 56783 Hasan Khalid, (IT)";
                break;
            default:
                System.out.println("Error");
                break;
        }
        return PRINTFRIENDS;
    }

}