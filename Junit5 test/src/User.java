public class User {

    String studentID;
    String name;

    public User(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public boolean createPost(String content){
        return true;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
