package com.example.newsapiclient_mvvmproj2.domain.usecase

import com.example.newsapiclient_mvvmproj2.data.model.APIResponse
import com.example.newsapiclient_mvvmproj2.data.util.Resource
import com.example.newsapiclient_mvvmproj2.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(country: String, searchQuery: String, page: Int): Resource<APIResponse> {
        return newsRepository.getSearchedNews(country, searchQuery, page)
    }
}
