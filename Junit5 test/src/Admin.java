public class Admin {

    String name;

    public Admin(String name) {
        this.name = name;
    }

    public boolean deletePost(Post post){
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
