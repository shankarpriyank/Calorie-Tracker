package com.priyank.tracker_domain.di

import com.priyank.core.domain.Preferences
import com.priyank.tracker_domain.repository.TrackerRepository
import com.priyank.tracker_domain.use_case.CalculateMealNutrients
import com.priyank.tracker_domain.use_case.DeleteTrackedFood
import com.priyank.tracker_domain.use_case.GetFoodsForDate
import com.priyank.tracker_domain.use_case.SearchFood
import com.priyank.tracker_domain.use_case.TrackFood
import com.priyank.tracker_domain.use_case.TrackerUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object TrackerDomainModule {

    @ViewModelScoped
    @Provides
    fun provideTrackerUseCases(
        repository: TrackerRepository,
        preferences: Preferences
    ): TrackerUseCases {
        return TrackerUseCases(
            trackFood = TrackFood(repository),
            searchFood = SearchFood(repository),
            getFoodsForDate = GetFoodsForDate(repository),
            deleteTrackedFood = DeleteTrackedFood(repository),
            calculateMealNutrients = CalculateMealNutrients(preferences)
        )
    }
}
