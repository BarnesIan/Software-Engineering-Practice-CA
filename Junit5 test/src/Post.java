public class Post {

    String userID;
    String postContent;

    public Post(String userID, String postContent) {
        this.userID = userID;
        this.postContent = postContent;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }
}
