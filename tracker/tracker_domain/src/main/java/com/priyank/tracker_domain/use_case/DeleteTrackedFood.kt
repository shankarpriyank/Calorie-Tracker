package com.priyank.tracker_domain.use_case

import com.priyank.onboarding_domain.model.TrackedFood
import com.priyank.tracker_domain.repository.TrackerRepository

class DeleteTrackedFood(
    private val repository: TrackerRepository
) {

    suspend operator fun invoke(trackedFood: TrackedFood) {
        repository.deleteTrackedFood(trackedFood)
    }
}
