package com.example.tp06_android.repositories

import androidx.lifecycle.LiveData
import com.example.tp06_android.dal.NewsDatasource
import com.example.tp06_android.dal.online.ArticleOnlineService
import com.example.tp06_android.models.Article

class ArticleRepository {
    private val datasource: NewsDatasource = ArticleOnlineService()

    fun getArticles(): LiveData<List<Article>> {
        return datasource.getArticles()
    }

    companion object {
        private var instance: ArticleRepository? = null
        fun getInstance(): ArticleRepository {
            if (instance == null) {
                instance = ArticleRepository()
            }

            return instance!!
        }
    }
}
