package com.example.newsapiclient_mvvmproj2.domain.usecase

import com.example.newsapiclient_mvvmproj2.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
}
