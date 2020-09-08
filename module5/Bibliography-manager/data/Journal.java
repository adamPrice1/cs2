package data;

import java.util.ArrayList;
import java.util.Arrays;

public class Journal {
    private String title;
    private ArrayList<Issue> issues;

    public Journal(String newTitle, ArrayList<Issue> newIssues) {
        this.title = newTitle;
        this.issues = newIssues;
    }

    public Journal(String newTitle) {
        this.title = newTitle;
        this.issues = null;
    }

    public String getTitle() {
        return this.title;
    }

    public ArrayList<Issue> getIssues() {
        return this.issues;
    }

    public void addIssue(Issue newIssue) {
        if (this.issues == null) {
            this.issues = new ArrayList<Issue>();
        }
        newIssue.setJournal(this);
        this.issues.add(newIssue);
    }

    public void addIssues(Issue[] newIssues) {
        for (int i = 0; i < newIssues.length; i++) {
            this.addIssue(newIssues[i]);
        }
    }

    public ArrayList<Issue> getIssuesInYear(int year) {
        ArrayList<Issue> output = new ArrayList<Issue>();
        for (int i = 0; i < this.issues.size(); i++) {
            if (this.issues.get(i).getYear() == year) {
                output.add(this.issues.get(i));
            }
        }
        return output;
    }

    public String listArticlesInYear(int year) {
        String output = "";
        ArrayList<Issue> issuesInYear = this.getIssuesInYear(year);
        for (int i = 0; i < issuesInYear.size(); i++) {
            output += issuesInYear.get(i).listArticles() + "\n";
        }
        if (output != "") {
            return output;
        }
        return "";
    }

    public ArrayList<String> listIssues() {
        ArrayList<String> output = new ArrayList<String>();
        for (int i = 0; i < this.issues.size(); i++) {
            output.add(this.title);
        }
        return output;
    }

    public ArrayList<String> getAuthors() {
        ArrayList<String> output = new ArrayList<String>();
        for (int i = 0; i < this.issues.size(); i++) {
            output.addAll(this.issues.get(i).getAuthors());
        }
        return output;
    }

    public static ArrayList<Journal> getSampleJournals() {
        Journal journal1 = new Journal("The best Journal");

        Issue issue1 = new Issue(2019, 1, 1, journal1, null);
        Article article1 = new Article("Why OOP is better", "Adam Price");
        Article article2 = new Article("Why Functional is better", "Adam Price");
        issue1.addArticles(new Article[] { article1, article2 });

        Issue issue2 = new Issue(2020, 1, 2, journal1, null);
        Article article3 = new Article("Why programming is easy", "Adam Smice");
        Article article4 = new Article("Why programming is hard", "Adam Smice");
        issue2.addArticles(new Article[] { article3, article4 });

        journal1.addIssues(new Issue[] { issue1, issue2 });

        Journal journal2 = new Journal("The second best Journal");

        Issue issue3 = new Issue(1984, 1, 1, journal2, null);
        Article article5 = new Article("VScode is for cowards", "Adam Rice");
        Article article6 = new Article("Why I love atom", "Adam Rice");
        issue3.addArticles(new Article[] { article5, article6 });

        Issue issue4 = new Issue(1984, 1, 2, journal2, null);
        Article article7 = new Article("Why Vim is too hard", "Adam Brice");
        Article article8 = new Article("how to write a bibliography manager", "Adam Brice");
        issue4.addArticles(new Article[] { article7, article8 });

        journal2.addIssues(new Issue[] { issue3, issue4 });

        return new ArrayList<Journal>(Arrays.asList(journal1, journal2));
    }
}
