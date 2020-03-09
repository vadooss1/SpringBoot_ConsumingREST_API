package com.vz.apiDTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.vz.domain.Article;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseObjectDTO {
    private String status;
    private int totalResults;
    private Article[] articles;
    public static int count = 0;

    public ResponseObjectDTO() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public Article[] getArticles() {
        return articles;
    }

    public void setArticles(Article[] articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return String.format("--------------- \n%-17s%s\n%-17s%s\n%-17s%s\n%-17s%s\n%-17s%s\n%-17s%d\n--------------- Article %d\n",
                "News title: ", articles[count].getTitle(),
                "Author: ", articles[count].getAuthor(),
                "PublishedAt: ", articles[count].getPublishedAt(),
                "Content: ", articles[count].getContent(),
                "Url :", articles[count].getUrl(),
                "Total results: ", totalResults, ++count);
    }

    public String toStringByArticleIndex(int articleIndex) {
        return String.format("--------------- Article %d\n%-17s%s\n%-17s%s\n%-17s%s\n%-17s%s\n%-17s%s\n--------------- Article %d\n",
                articleIndex,
                "News title: ", articles[articleIndex].getTitle(),
                "Author: ", articles[articleIndex].getAuthor(),
                "PublishedAt: ", articles[articleIndex].getPublishedAt(),
                "Content: ", articles[articleIndex].getContent(),
                "Url :", articles[articleIndex].getUrl(),
                articleIndex);
    }
}
