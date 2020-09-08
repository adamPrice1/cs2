package data;

import java.util.ArrayList;

public class Issue {
    int publishYear;
    int volumeNumber;
    int issueNumber;
    ArrayList<Article> articles;
    Journal journal;

    public Issue(int newPublishYear, int newVolumeNumber, int newIssueNumber, Journal newJournal,
            ArrayList<Article> newArticles) {
        this.publishYear = newPublishYear;
        this.volumeNumber = newVolumeNumber;
        this.issueNumber = newIssueNumber;
        this.articles = newArticles;
        this.journal = newJournal;
    }

    public Issue(int newPublishYear, int newVolumeNumber, int newIssueNumber, Journal newJournal) {
        this(newPublishYear, newVolumeNumber, newIssueNumber, newJournal, null);
    }

    public Journal getJournal() {
        return this.journal;
    }

    public int getYear() {
        return this.publishYear;
    }

    public int getVolumeNumber() {
        return this.volumeNumber;
    }

    public int getIssueNumber() {
        return this.issueNumber;
    }

    public ArrayList<Article> getArticles() {
        return this.articles;
    }

    public void setJournal(Journal newJournal) {
        this.journal = newJournal;
    }

    public void addArticle(Article newArticle) {
        if (this.articles == null) {
            this.articles = new ArrayList<Article>();
        }
        newArticle.setIssue(this);
        this.articles.add(newArticle);
    }

    public void addArticles(Article[] newArticles) {
        for (int i = 0; i < newArticles.length; i++) {
            this.addArticle(newArticles[i]);
        }
    }

    public String listArticles() {
        String output = "";
        for (int i = 0; i < this.articles.size(); i++) {
            output += this.articles.get(i).toString() + "\n";
        }
        if (output != "") {
            return output;
        }
        return null;
    }

    public ArrayList<String> getAuthors() {
        ArrayList<String> output = new ArrayList<String>();
        for (int i = 0; i < this.articles.size(); i++) {
            output.add(this.articles.get(i).getAuthor());
        }
        return output;
    }

    public String getJournalTitle() {
        return this.getJournal().getTitle();
    }

}