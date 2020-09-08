package ui;

import data.BibliographyDatabase;
import data.Journal;
import data.Article;
import data.Issue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BibliographyUI {
    public static void main(String[] args) {

        BibliographyDatabase bibliographyDB = new BibliographyDatabase(Journal.getSampleJournals());

        System.out.println("Welcome to the Bibliography Database!");

        Boolean running = true;
        Scanner in = new Scanner(System.in);
        int input;
        while (running) {
            System.out.print("You may perform the following operations: \n" + "1) Find articles from a given year \n"
                    + "2) Add an article to an issue \n" + "3) Find the most-published author \n" + "4) Exit\n"
                    + "Please enter your choice (1, 2, or 3): ");
            input = in.nextInt();

            switch (input) {
                case 1:
                    System.out.println("What year are you interested in?");
                    int year = in.nextInt();
                    String output = bibliographyDB.getArticlesInYear(year);
                    if (year < 2021 && year > 1700 && output != null) {
                        System.out.print(output);
                    } else {
                        System.out.println("I'm sorry there are no articles for that year.");
                    }
                    break;
                case 2:
                    System.out.println("Here are the available issues:");
                    ArrayList<Issue> issues = bibliographyDB.getIssues();
                    for (int i = 0; i < issues.size(); i++) {
                        System.out.println(Integer.toString(i) + ") " + issues.get(i).getJournalTitle() + ", volume: "
                                + Integer.toString(issues.get(i).getVolumeNumber()) + ", issue: "
                                + Integer.toString(issues.get(i).getIssueNumber()));
                    }
                    System.out.println("What issue would you like to add to?");
                    int articleNum = in.nextInt();
                    in.nextLine();
                    System.out.println("What is your title?");
                    String articleTitle = in.nextLine();
                    System.out.println("Who is your author?");
                    String articleAuthor = in.nextLine();
                    Article toAdd = new Article(articleTitle, articleAuthor, issues.get(articleNum));
                    issues.get(articleNum).addArticle(toAdd);
                    break;
                case 3:
                    // grab an array of all Authors
                    ArrayList<String> authors = bibliographyDB.getAuthors();
                    ArrayList<Integer> counts = new ArrayList<Integer>();
                    // this for loop creates a parallel array to authors with the number of
                    // occurrences of each author
                    for (int i = 0; i < authors.size(); i++) {
                        counts.add(Collections.frequency(authors, authors.get(i)));
                    }
                    // gets the index of the max count, then gets the corresponding author name
                    String mostPublished = authors.get(Collections.binarySearch(counts, Collections.max(counts)));
                    System.out.println("Most popular author: " + mostPublished);
                    break;
                case 4:
                    running = false;
                    in.close();
                    System.out.println("Bye!");
                    break;
            }
        }
    }
}
