package com.example.newsapp;

/**
 * An {@link Article} object contains information related to a single artilce.
 */
public class Article {

    /** The name of the pillar*/
    private String nPillarName;

    /** The name of the section*/
    private String nSection;

    /** The web title of the article*/
    private String nWebTitle;

    /** Website URL of the article*/
    private String nUrl;


    /**
     * Constructs a new {@link Article} object.
     *
     * @param nPillarName is the name of the pillar in which the article is on the website
     * @param nSection is the name of the section to which the article belongs
     * @param nWebTitle is the title of the article that is showed at the website
     * @param nUrl is the website URL allowing to read the article
     *
     * */
    public Article(String nPillarName, String nSection, String nWebTitle, String nUrl) {
        this.nPillarName = nPillarName;
        this.nSection = nSection;
        this.nWebTitle = nWebTitle;
        this.nUrl = nUrl;
    }

    /**
     * Returns the pillar name of the article.
     */
    public String getnPillarName() {
        return nPillarName;
    }

    /**
     * Returns the section name of the article.
     */
    public String getnSection() {
        return nSection;
    }

    /**
     * Returns the web title of the article.
     */
    public String getnWebTitle() {
        return nWebTitle;
    }

    /**
     * Returns the website URL allowing to read the article.
     */
    public String getnUrl() {
        return nUrl;
    }
}
