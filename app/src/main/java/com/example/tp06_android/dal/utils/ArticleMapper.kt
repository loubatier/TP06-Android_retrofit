package com.example.tp06_android.dal.utils

import com.example.tp06_android.dal.online.models.ArticleItem
import com.example.tp06_android.models.Article

fun ArticleItem.toArticle() = Article(
    author = author,
    content = content,
    description = description,
    publishedAt = publishedAt,
    source = source.toSource(),
    title = title,
    url = url,
    urlToImage = urlToImage
)

fun Article.toArticleItem() = ArticleItem(
    author = author,
    content = content,
    description = description,
    publishedAt = publishedAt,
    source = source.toSourceItem(),
    title = title,
    url = url,
    urlToImage = urlToImage
)
