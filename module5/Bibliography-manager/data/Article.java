package data;

public class Article {
    private String title;
    private String author;
    private Issue issue;

    public Article(String newTitle, String newAuthor, Issue newIssue) {
        this.title = newTitle;
        this.author = newAuthor;
        this.issue = newIssue;
    }

    public Article(String newTitle, String newAuthor) {
        this(newTitle, newAuthor, null);
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public Issue getIssue() {
        return this.issue;
    }

    public void setIssue(Issue newIssue) {
        this.issue = newIssue;
    }

    public String toString() {
        return this.author + "." + this.title + "." + this.issue.getJournal().getTitle() + ","
                + this.issue.getVolumeNumber() + "( " + this.issue.getIssueNumber() + " )," + this.issue.getYear();
    }
}
