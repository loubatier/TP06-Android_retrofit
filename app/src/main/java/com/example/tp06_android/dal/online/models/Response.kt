package com.example.tp06_android.dal.online.models

data class ArticleResponse(
    val status: String,
    val totalResults: Int,
    val articles: List<ArticleItem>
)

data class SourceItem(
    val id: String,
    val name: String
)

data class ArticleItem(
    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val source: SourceItem,
    val title: String,
    val url: String,
    val urlToImage: String
)
