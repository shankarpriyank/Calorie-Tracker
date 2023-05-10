package com.priyank.tracker_presentation.search

import com.priyank.onboarding_domain.model.TrackableFood

data class TrackableFoodUiState(
    val food: TrackableFood,
    val isExpanded: Boolean = false,
    val amount: String = ""
)
