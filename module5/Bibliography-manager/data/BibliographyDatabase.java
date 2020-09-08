package data;

import java.util.ArrayList;

public class BibliographyDatabase {
    private ArrayList<Journal> journals;

    public BibliographyDatabase(ArrayList<Journal> newJournals) {
        this.journals = newJournals;
    }

    public ArrayList<Journal> getJournals() {
        return this.journals;
    }

    public void addArticle(Article newArticle, Issue issue) {
        issue.addArticle(newArticle);
    }

    public void addIssue(Issue newIssue, Journal journal) {
        journal.addIssue(newIssue);
    }

    public void addJournal(Journal newJournal) {
        this.journals.add(newJournal);
    }

    public void removeArticle(Article toRemove, Issue issue, Journal journal) {
        for (int i = 0; i < journal.getIssues().size(); i++) {
            if (journal.getIssues().get(i).equals(issue)) {
                for (int j = 0; j < journal.getIssues().get(i).articles.size(); i++) {
                    if (journal.getIssues().get(i).articles.get(j).equals(toRemove)) {
                        journal.getIssues().get(i).articles.remove(j);
                        return;
                    }
                }
            }
        }
    }

    public void removeIssue(Issue toRemove, Journal journal) {
        for (int i = 0; i < journal.getIssues().size(); i++) {
            if (journal.getIssues().get(i).equals(toRemove)) {
                journal.getIssues().remove(i);
                return;
            }
        }
    }

    public void removeJournal(Journal toRemove) {
        for (int i = 0; i < this.journals.size(); i++) {
            if (this.journals.get(i).equals(toRemove)) {
                this.journals.remove(i);
                return;
            }
        }
    }

    public String getArticlesInYear(int year) {
        String output = "";
        for (int i = 0; i < this.journals.size(); i++) {
            output += this.journals.get(i).listArticlesInYear(year) + "\n";
        }
        if (output != "") {
            return output;
        }
        return null;
    }

    public ArrayList<Issue> getIssues() {
        ArrayList<Issue> issues = new ArrayList<Issue>();
        for (int i = 0; i < this.journals.size(); i++) {
            issues.addAll(this.journals.get(i).getIssues());
        }
        return issues;
    }

    public ArrayList<String> getAuthors() {
        ArrayList<String> output = new ArrayList<String>();
        for (int i = 0; i < this.journals.size(); i++) {
            output.addAll(this.journals.get(i).getAuthors());
        }
        return output;
    }
}
