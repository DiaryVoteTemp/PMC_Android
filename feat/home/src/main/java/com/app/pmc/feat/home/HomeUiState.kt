package com.app.pmc.feat.home

import com.app.pmc.core.model.Diary

data class HomeUiState(
    val month: String = "",
    val diaryList: List<Diary> = emptyList(),
    val monthlyDiaryList: List<Diary> = emptyList()
)
