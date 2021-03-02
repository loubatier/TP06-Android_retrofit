package com.example.tp06_android.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tp06_android.models.Article
import com.example.tp06_android.repositories.ArticleRepository
import java.util.concurrent.Executors

class HomeViewModel : ViewModel() {

    private val repository: ArticleRepository = ArticleRepository.getInstance()
    private val _articles = MutableLiveData<List<Article>>()
    val articles: LiveData<List<Article>>
        get() = _articles

    init {
        loadArticles()
    }

    private fun loadArticles() {
        Executors.newSingleThreadExecutor().execute {
            val result = repository.getArticles()
            _articles.postValue(result.value)
        }
    }

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text
}
