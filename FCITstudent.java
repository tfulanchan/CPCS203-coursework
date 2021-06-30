//create object of type FCITstudent
/*FCITstudent is used to make objects of the BST.*/
/*• ID, firstName, lastName, and department should be obvious
• numFriends is the number of friends that this student has.
• myFriends is a reference to an object of type FCITfriends (a linked-list).
This linked-list will store all the friends of this student.
• left and right are the left and right pointers of this node (for the BST).*/
//    addfriend student studentFriend
//            search friend list of student
//                add studentFriend
//                        assign studentFriend to list
//                            numFriends +1;

//ID : 1946122
//Name: تسون تينج فلان تشان
//Section: XXA CPCS-204

public class FCITstudent {
    private int ID;
    private String firstName;
    private String lastName;
    private String department;
    private int numFriends;

    private FCITfriends myFriends;
    private FCITstudent right;
    private FCITstudent left;

    private int friends;
    private int totalFriends;

    public FCITstudent() {  }

    public FCITstudent(int ID) {
        this.ID = ID;
    }

    public void add1Friend(int friends) {
        System.out.println("executing add1Friend(int friends)");
        if (hasFriend()) {
            totalFriends += friends;
        }
    }
//        FRIEND – This will be followed by two IDs. This means that the two people are now Friends,
//         thus you should add both people's IDs to each others' Friend-lists.
//         If either person in the FRIEND command is not in the database, or if they are already Friends,
//         an error message should be displayed.

    static void FRIEND(){
        System.out.println("FRIEND Command");
        //FRIEND 56784 65324
        //command someone FRIEND
    }

    public void addFriends(FCITfriend... list) {
        System.out.println("executing addPassengers(Passenger... list)");

        for (FCITfriend friend : list) {
            System.out.println("Adding " + getNumFriends() + " checked bags");

        }
    }

    private boolean hasFriend() { return numFriends != 0; }

    private boolean hasFriend(int count) {
        return numFriends + count <= 0;
    }

    public FCITstudent(int ID, String firstName, String lastName,
                        String department, int numFriends) {
        this(ID);
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.numFriends = numFriends;
    }

    public  int getNumFriends() {return numFriends; }
    public void setNumFriends(int numFriends) {
        this.numFriends = numFriends;
    }

    public  String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public  String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public  int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    public  String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

}