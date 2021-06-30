//    create objects of type FCITfriend
//   make nodes of the linked list mentioned above (FCITfriends)
/*This is the class to make nodes of the linked-list of friends.
• Each FCITstudent has a variable called myFriends.*/
//ID : 1946122
//Name: تسون تينج فلان تشان
//Section: XXA CPCS-204

    public class FCITfriend {
        public FCITfriend() {  }
        private int ID;
        private FCITfriend next;

        public FCITfriend(int ID) {
            this.ID = ID;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        class Node {
            public Node(int value)
            {
                this.Value= value;
                this.Next= null;
            }
            public Node Next;
            public int Value;
        }

    }

