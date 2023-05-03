package com.priyank.calorietracker.navigation

import androidx.navigation.NavController
import com.priyank.core.util.UiEvent

fun NavController.cnavigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}
