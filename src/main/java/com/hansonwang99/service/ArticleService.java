package com.hansonwang99.service;

import com.hansonwang99.domain.Article;
import com.hansonwang99.domain.enums.ArticleType;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Administrator on 2017/6/28.
 */
public interface ArticleService {

    public List<Article> getArticles( String type, Long userId, Pageable pageable );

    public List<Article> getArticlesByType( String type, ArticleType articleType, Long userId, Pageable pageable );

    public List<Article> getArticlesOfCategory(Long userId, ArticleType type, Pageable pageable, Long categoryId );

    public Article getOneArticle( Long articleId );

    public List<Article> searchMy(Long userId,String key,Pageable pageable);

    public List<Article> searchOther(Long userId,String key,Pageable pageable);

    public Long getTotalArticleNum();
}
