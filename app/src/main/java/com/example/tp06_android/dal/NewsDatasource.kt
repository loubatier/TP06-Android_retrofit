package com.example.tp06_android.dal

import androidx.lifecycle.LiveData
import com.example.tp06_android.models.Article

interface NewsDatasource {
    fun getArticles(): LiveData<List<Article>>
}
